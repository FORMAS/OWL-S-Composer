/*******************************************************************************
 * Copyright (c) 2008 OWL-S Composer.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     André Fonseca - initial API and implementation
 *******************************************************************************/

package owls.wizards;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import net.jaxsa.JAXSA;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import owls.plugin.Activator;

/**
 * @author Andre Fonseca
 *
 */
public class WSDL2OWLwizard extends Wizard implements INewWizard{
	
	private WSDL2OWLwizardPage page;
	
	public WSDL2OWLwizard(){
		super();
		Activator.getDefault().init();
		setNeedsProgressMonitor(true);
	}
	
	public void addPages() {
		page = new WSDL2OWLwizardPage();
		addPage(page);
	}

	public boolean performFinish() {
		try {
			final String fileName = page.getFileText();
			final String namespaceName = page.getNamespaceText();
			
			// Parameters validation.
			if (fileName.isEmpty())
				throw new Exception("WSDL file must be specified");
				
			if (namespaceName.isEmpty())
				throw new Exception("Namespace must be specified");
			
			int dotLoc = fileName.lastIndexOf('.');
			int questionLoc = fileName.indexOf("?wsdl");

			String ext;
			if (dotLoc != -1) {
				ext = fileName.substring(dotLoc + 1);
				if (ext.equalsIgnoreCase("wsdl") == false)
					throw new Exception("File extension must be \"wsdl\"");
			} 
			else if(questionLoc != -1)
			{
				ext = fileName.substring(questionLoc + 1);
				if (ext.equalsIgnoreCase("wsdl") == false)
					throw new Exception("File extension must be \"wsdl\"");
			}
			else
				throw new Exception("File extension must be \"wsdl\"");
						
			// Convertion thread.
			IRunnableWithProgress op = new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) throws InvocationTargetException {
					try {
						doFinish(fileName, namespaceName, monitor);
					} catch (Exception e) {
						throw new InvocationTargetException(e);
					} finally {
						monitor.done();
					}
				}
			};
		
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			MessageDialog.openError(getShell(), "Error", "InterruptedException: "  + e.getMessage());
			return false;
		} catch (InvocationTargetException e) {

			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());			
			return false;
		}
		catch (Exception e)
		{
			MessageDialog.openError(getShell(), "Error", e.getMessage());
			return false;
		}
		return true;
	}
	
	private void doFinish(
			String fileName,
			String namespaceName,
			IProgressMonitor monitor)
			throws Exception {
		
			monitor.beginTask("Creating OWL file...", 2);
		
			IProject project = Activator.getCurrentProject();//ResourcesPlugin.getWorkspace().getRoot().getProject(Activator.getCurrentProject().getName());
			if (project == null)
				throw new Exception("Can't identify the project.");		
			
			String folder = project.getFolder("WebContent/owls").getRawLocation().toOSString();
			String[] args = { "-i", fileName, "-ns", namespaceName, "-o", folder};
			try
			{
				JAXSA.main(args);
			}
			catch (Exception e)
			{
				throw new Exception("JAXSA error. Make sure the WSDL path is right and the server is started.");
			}
			monitor.worked(1);
		}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		
	}
	
	// ----------------------------------------------
	
	/****
	 * Just for debug.
	 */
	
	public String printStackTrace(Throwable e)
	{
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);
		return sw.toString(); // stack trace as a string
	}
	
	public String printStackTrace(Exception e)
	{
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);
		return sw.toString(); // stack trace as a string
	}
}
