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
		final String fileName = page.getFileText();
		final String namespaceName = page.getNamespaceText();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(fileName, namespaceName, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}

	private void doFinish(
			String fileName,
			String namespaceName,
			IProgressMonitor monitor)
			throws CoreException {
			IPath filePath = Activator.getCurrentFilePath();
			String wsdlFileName = "";
			System.out.println("AQUI 0");
			if(filePath != null){
				wsdlFileName = filePath.lastSegment();
			}
			// create the owl file from the given wsdl
			monitor.beginTask("Creating " + wsdlFileName + ".owl", 2);
			System.out.println("AQUI 1");
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(Activator.getCurrentProject().getName());
			System.out.println("AQUI 2");
			// calling the JAXSA project to make this job (see at http://sourceforge.net/projects/jax-sa/)
			try {
				System.out.println("DEBUG<Owls>: Chamada ao JAXSA");
				String folder = project.getFolder("WebContent/owls").getRawLocation().toOSString();
				System.out.println("folder: "+folder);
				String[] args = { "-i", fileName, "-ns", namespaceName, "-o", folder};
				JAXSA.main(args);
				monitor.worked(1);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		
	}

}
