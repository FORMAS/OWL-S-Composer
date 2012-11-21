package owls.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import owls.diagram.edit.commands.OwlsAssignCreateCommand;
import owls.diagram.edit.commands.OwlsAssignInputClientCreateCommand;
import owls.diagram.edit.commands.OwlsAssignInputClientReorientCommand;
import owls.diagram.edit.commands.OwlsAssignOutputClientCreateCommand;
import owls.diagram.edit.commands.OwlsAssignOutputClientReorientCommand;
import owls.diagram.edit.commands.OwlsAssignReorientCommand;
import owls.diagram.edit.parts.OwlsAssignEditPart;
import owls.diagram.edit.parts.OwlsAssignInputClientEditPart;
import owls.diagram.edit.parts.OwlsAssignOutputClientEditPart;
import owls.diagram.providers.OwlsElementTypes;

/**
 * @generated
 */
public class OwlsCompositeProcess2ItemSemanticEditPolicy extends
		OwlsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyShortcutsCommand(cc);
		cc.add(getGEFWrapper(new DestroyElementCommand(req)));
		return cc.unwrap();
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (OwlsElementTypes.OwlsAssign_3001 == req.getElementType()) {
			return getGEFWrapper(new OwlsAssignCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (OwlsElementTypes.OwlsAssignInputClient_3002 == req.getElementType()) {
			return null;
		}
		if (OwlsElementTypes.OwlsAssignOutputClient_3003 == req
				.getElementType()) {
			return getGEFWrapper(new OwlsAssignOutputClientCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (OwlsElementTypes.OwlsAssign_3001 == req.getElementType()) {
			return getGEFWrapper(new OwlsAssignCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (OwlsElementTypes.OwlsAssignInputClient_3002 == req.getElementType()) {
			return getGEFWrapper(new OwlsAssignInputClientCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (OwlsElementTypes.OwlsAssignOutputClient_3003 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case OwlsAssignEditPart.VISUAL_ID:
			return getGEFWrapper(new OwlsAssignReorientCommand(req));
		case OwlsAssignInputClientEditPart.VISUAL_ID:
			return getGEFWrapper(new OwlsAssignInputClientReorientCommand(req));
		case OwlsAssignOutputClientEditPart.VISUAL_ID:
			return getGEFWrapper(new OwlsAssignOutputClientReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
