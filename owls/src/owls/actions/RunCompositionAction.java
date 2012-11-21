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

package owls.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import owls.plugin.Activator;
import owls.wizards.RunCompositionWizard;

/**
 * 
 * @author Vanessa Aline
 *
 */
public class RunCompositionAction implements IObjectActionDelegate {
	
	public RunCompositionAction() {
		super();
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {

	}

	@Override
	public void run(IAction action) {
//		Activator.getDefault().init();
		
		RunCompositionWizard wizard = new RunCompositionWizard();
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		
		WizardDialog dialog= new WizardDialog(shell, wizard);
		dialog.create();
		dialog.open();

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		Activator.getListener().setCurrentSelection(selection);
	}

}
