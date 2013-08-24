package owls.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import owls.plugin.Activator;
import owls.wizards.CloudPrePublishWizard;

public class CloudPrePublishAction implements IObjectActionDelegate {
	private IWorkbenchPart part;
	private IStructuredSelection selection;

	public void run(IAction action) {
		CloudPrePublishWizard wizard = new CloudPrePublishWizard();
		wizard.init(part.getSite().getWorkbenchWindow().getWorkbench(), selection);
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		
		WizardDialog dialog = new WizardDialog(shell, wizard);
		dialog.create();
		dialog.open();
	}

	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = (IStructuredSelection) selection;
		Activator.getListener().setCurrentSelection(selection);	
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.part = targetPart;
	}

}
