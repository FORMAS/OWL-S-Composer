package owls.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.util.Assert;

import owls.OwlsControlConstruct;

public class CompartmentChildCreateCommand extends CreateCommand {

	int index;
	
	public CompartmentChildCreateCommand (TransactionalEditingDomain editingDomain, ViewDescriptor viewDescriptor,
			View containerView, int index) {
		super(editingDomain, viewDescriptor, containerView);
		this.index = index;
	}
	
	/**
	 * Reorder elements in the container's EObject list to do the correct generation of the composition.
	 * @param childToMove
	 * @param newIndex
	 */
	public void moveInParentList(EObject object,int newIndex){
		if (newIndex != -1){
			OwlsControlConstruct container = (OwlsControlConstruct)object.eContainer();
			EList<EObject> list = container.getElements();
			int oldIndex = list.indexOf(object);
			EObject aux = list.get(newIndex);
			list.move(newIndex, object);
			list.move(oldIndex, aux);
		}
	}
	
	@Override
    protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
    throws ExecutionException {

		View view =
			ViewService.getInstance().createView(
				viewDescriptor.getViewKind(),
				viewDescriptor.getElementAdapter(),
				containerView,
				viewDescriptor.getSemanticHint(),
				index,
				viewDescriptor.isPersisted(),
				viewDescriptor.getPreferencesHint());
		Assert.isNotNull(view, "failed to create a view"); //$NON-NLS-1$
		
		EObject object = (EObject)view.getElement();
		moveInParentList(object, this.index);
		
		viewDescriptor.setView(view);
	    
	    return CommandResult.newOKCommandResult(viewDescriptor);
	}
	
}

