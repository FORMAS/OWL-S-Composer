package owls.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.emf.commands.core.commands.RepositionEObjectCommand;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import owls.OwlsControlConstruct;

public class CompartmentRepositionEObjectCommand extends RepositionEObjectCommand {

	EditPart childToMove = null;
	int newIndex = 0;
	
	public CompartmentRepositionEObjectCommand(
			TransactionalEditingDomain editingDomain, String label,
			EList elements, EObject element, int displacement) {
		super(editingDomain, label, elements, element, displacement);
	}
	
	public CompartmentRepositionEObjectCommand(EditPart childToMove,
			TransactionalEditingDomain editingDomain, String label,
			EList elements, EObject element, int displacement, int newIndex) {
		super(editingDomain, label, elements, element, displacement);
		
		this.childToMove = childToMove;
		this.newIndex = newIndex;
	}
	
	/**
	 * Reorder elements in the container's EObject list to do the correct generation of the composition.
	 * @param childToMove
	 * @param newIndex
	 */
	public void moveInParentList(EditPart childToMove,int newIndex){
		Node object = (Node) childToMove.getModel();
		EObject element = object.getElement();
		OwlsControlConstruct container = (OwlsControlConstruct)element.eContainer();
		EList<EObject> list = container.getElements();
		int oldIndex = list.indexOf(element);
		EObject aux = list.get(newIndex);
		list.move(newIndex, element);
		list.move(oldIndex, aux);
	}
	
	public CommandResult doExecuteWithResult(
			IProgressMonitor progressMonitor, IAdaptable info)
			throws ExecutionException {
		CommandResult rs = super.doExecuteWithResult(progressMonitor, info);
				
		EditPart compartment = childToMove.getParent(); 
		
		ViewUtil.repositionChildAt((View)compartment.getModel(), (View)childToMove.getModel(), newIndex);
		moveInParentList(this.childToMove, this.newIndex);
		compartment.refresh();		
		
		return rs;
	}
}
