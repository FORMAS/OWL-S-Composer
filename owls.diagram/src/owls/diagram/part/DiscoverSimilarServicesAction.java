package owls.diagram.part;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import owls.plugin.Activator;
import owls.wizards.WSDL2OWLwizard;

/**
 * 
 * @author Vanessa
 *
 */
public class DiscoverSimilarServicesAction implements IObjectActionDelegate{
	
	public DiscoverSimilarServicesAction() {
		super();
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {

	}

	@Override
	public void run(IAction action) {	
		Activator.getDefault().init();
		
		DiscoverSimilarServicesWizard wizard = new DiscoverSimilarServicesWizard();
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
