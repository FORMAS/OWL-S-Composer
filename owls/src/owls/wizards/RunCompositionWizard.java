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

import impl.owls.sh.CloudKnowledgeBase;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.mindswap.owl.OWLDataValue;
import org.mindswap.owls.OWLSFactory;
import org.mindswap.owls.process.execution.ProcessExecutionEngine;
import org.mindswap.query.ValueMap;

import owls.cloud.DescriptorKB;
import owls.plugin.Activator;

/**
 * 
 * @author Vanessa Aline
 *
 */
public class RunCompositionWizard extends Wizard implements INewWizard{

	CompositionNamespaceWizardPage pageNamespace;
	CompositionInputsWizardPage pageInput;

	public RunCompositionWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	@Override
	public void addPages() {
		pageNamespace = new CompositionNamespaceWizardPage();
		addPage(pageNamespace);
		pageInput = new CompositionInputsWizardPage();
		addPage(pageInput);
	}

	@Override
	public void createPageControls(Composite pageContainer) {
		//Not create the page controls before the wizard is opened
	}

	@Override
	public boolean performFinish() {
		// TODO Add Progress Monitor
		
		// create an execution engine
		ProcessExecutionEngine exec = OWLSFactory.createExecutionEngine();
		org.mindswap.owls.process.Process aProcess = pageInput.getAProcess();

		// get the input values from the page input
		ValueMap aInputValueMap = pageInput.getAInputValueMap();

		try {
			CloudKnowledgeBase cb = new CloudKnowledgeBase();
			cb.setOwlsFolder(Activator.getCurrentProject().getName()+"/WebContent/owls/");
			cb.setCloudFolder(DescriptorKB.createCompositionPath(aProcess));
			// run the process
			System.out.println("Executando process");
			ValueMap aOutputValueMap = exec.execute(aProcess, aInputValueMap, cb);
			System.out.println("debug: " + aOutputValueMap.debugString());
			System.out.println("depois da execucao");
			
			String output = "";
			System.out.println("tam: " + aProcess.getOutputs().size());
			for (int i = 0; i < aProcess.getOutputs().size(); i++) {
				System.out.println("Output: " + aProcess.getOutput(i).getLocalName());
				if (aProcess.getOutput(i).isDataValue()) {
					System.out.println("isdataValue");
					OWLDataValue outDV = (OWLDataValue) aOutputValueMap.getValue(aProcess.getOutput(i));
					output = output + aProcess.getName() + ": " + outDV.getValue() + "\n";
				} else if (aProcess.getOutput(i).isIndividual()) {
					System.out.println("isIndividual");
					OWLDataValue outDV = (OWLDataValue) aOutputValueMap.getValue(aProcess.getOutput(i));
					output = output + aProcess.getLabel() + ": " + outDV.getValue() + "\n";
				} else {
					System.out.println("else");
					String outString = aOutputValueMap.getStringValue(aProcess.getOutput(i));
					output = output + aProcess.getName() + ": " + outString + "\n";
				}
			}
			
			// display the value
			MessageDialog.openInformation(getShell(), "Output", output);

		} catch (Exception e) {
			// TODO Fix error message
			ErrorDialog.openError(getShell(), "Error", "Error while trying to run the service.",
					new Status(IStatus.ERROR, Activator.PLUGIN_ID, IStatus.ERROR, "", e));
		}  

		return true;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {

	}



}
