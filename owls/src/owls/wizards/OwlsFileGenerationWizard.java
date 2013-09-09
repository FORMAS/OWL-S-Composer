/*******************************************************************************
 * Copyright (c) 2008 OWL-S Composer.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Andr� Fonseca - initial API and implementation
 *******************************************************************************/

package owls.wizards;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import owls.OwlsCompositeProcess;
import owls.generator.Model2Owl;
import owls.plugin.Activator;
import owls.plugin.EMFModelLoad;

/**
 * @author Andre Fonseca
 *
 */
public class OwlsFileGenerationWizard extends Wizard implements INewWizard{
	
	private OwlsFileGenerationWizardPage page;
	
	public OwlsFileGenerationWizard(){
		super();
		setNeedsProgressMonitor(true);
	}
	
	public void addPages() {
		page = new OwlsFileGenerationWizardPage();
		addPage(page);
	}

	public boolean performFinish() {
		final String diagramName = page.getDiagramText();

		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(diagramName, monitor);
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
			System.err.println("ERRO ENCONTRADO NA CRIACAO DO CONTAINER - OwlsFileGenerationWizard");
			e.printStackTrace(System.err);
			MessageDialog.openError(getShell(), "Error", "One or more connections on the composition have properties which do not have a value set.");
			return false;
		}
		return true;
	}

	private void doFinish(
			String diagramName,
			IProgressMonitor monitor)
			throws CoreException {

			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(Activator.getCurrentProject().getName());

			IResource resource = project.findMember("WebContent/owls");
			if (resource == null || !(resource instanceof IContainer)) {
				IFolder folder = Activator.getCurrentProject().getFolder("WebContent/owls");
				folder.create(false,true,monitor);
			}
			
			//New Folder System - Fabricio Alves
			
			// load EMF model
			monitor.beginTask("Loading Model", 2);
			
			EMFModelLoad loader = new EMFModelLoad();
			OwlsCompositeProcess owlsComposite = loader.load(diagramName);
			createOwlsFile(owlsComposite,monitor);
	}
	
	private static void createOwlsFile(OwlsCompositeProcess owlsComposite, IProgressMonitor monitor) {
		Model2Owl owlFile = new Model2Owl();
		
		FileWriter output;
		BufferedWriter writer;
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(Activator.getCurrentProject().getName());
		String baseName = owlsComposite.getDescribes().getID();
		int charLoc = baseName.lastIndexOf("Service");
		String fileName = baseName.substring(0, charLoc);
		
		// create the owl file from the given owls_diagram
		monitor.beginTask("Creating " + fileName + ".owl", 3);

		try {
			output = new FileWriter(project.findMember("WebContent/owls").getRawLocation().toOSString()+"/"+fileName+".owl");
			writer = new BufferedWriter(output);
			writer.write(owlFile.generate(owlsComposite));
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Finish
		monitor.beginTask("Done", 4);
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		
	}

}
