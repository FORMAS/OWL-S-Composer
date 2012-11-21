package owls.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import owls.OwlsPackage;
import owls.diagram.edit.commands.OwlsAtomicProcessCreateCommand;
import owls.diagram.edit.commands.OwlsCompositeProcessCreateCommand;
import owls.diagram.edit.commands.OwlsInputClientMessageCreateCommand;
import owls.diagram.edit.commands.OwlsOutputClientMessageCreateCommand;
import owls.diagram.edit.commands.OwlsSequence2CreateCommand;
import owls.diagram.edit.commands.OwlsSplit2CreateCommand;
import owls.diagram.edit.parts.OwlsAtomicProcessEditPart;
import owls.diagram.edit.parts.OwlsCompositeProcess2EditPart;
import owls.diagram.edit.parts.OwlsInputClientMessageEditPart;
import owls.diagram.edit.parts.OwlsOutputClientMessageEditPart;
import owls.diagram.edit.parts.OwlsSequence2EditPart;
import owls.diagram.edit.parts.OwlsSplit2EditPart;
import owls.diagram.part.OwlsVisualIDRegistry;
import owls.diagram.providers.OwlsElementTypes;

/**
 * @generated
 */
public class OwlsAnyOrderItemSemanticEditPolicy extends
		OwlsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (OwlsElementTypes.OwlsAtomicProcess_2001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OwlsPackage.eINSTANCE
						.getOwlsControlConstruct_Processes());
			}
			return getGEFWrapper(new OwlsAtomicProcessCreateCommand(req));
		}
		if (OwlsElementTypes.OwlsCompositeProcess_2002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OwlsPackage.eINSTANCE
						.getOwlsControlConstruct_Processes());
			}
			return getGEFWrapper(new OwlsCompositeProcessCreateCommand(req));
		}
		if (OwlsElementTypes.OwlsSplit_2003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OwlsPackage.eINSTANCE
						.getOwlsControlConstruct_Constructs());
			}
			return getGEFWrapper(new OwlsSplit2CreateCommand(req));
		}
		if (OwlsElementTypes.OwlsSequence_2004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OwlsPackage.eINSTANCE
						.getOwlsControlConstruct_Constructs());
			}
			return getGEFWrapper(new OwlsSequence2CreateCommand(req));
		}
		if (OwlsElementTypes.OwlsInputClientMessage_2006 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OwlsPackage.eINSTANCE
						.getOwlsControlConstruct_Messages());
			}
			return getGEFWrapper(new OwlsInputClientMessageCreateCommand(req));
		}
		if (OwlsElementTypes.OwlsOutputClientMessage_2007 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(OwlsPackage.eINSTANCE
						.getOwlsControlConstruct_Messages());
			}
			return getGEFWrapper(new OwlsOutputClientMessageCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated NOT
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyChildNodesCommand(cc);
		addDestroyShortcutsCommand(cc);
		addDestroyDependentsCommand(cc);
		View view = (View) getHost().getModel();
		if (view.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
			req.setElementToDestroy(view);
		}
		cc.add(getGEFWrapper(new DestroyElementCommand(req)));
		return cc.unwrap();
	}

	/**
	 * @generated NOT
	 */
	private void addDestroyDependentsCommand(CompoundCommand cmd) {
		View view = (View) getHost().getModel();
		View rootView = (View) view.eContainer();
		for (Iterator it = rootView.getChildren().iterator(); it.hasNext();) {
			Node node = (Node) it.next();
			switch (OwlsVisualIDRegistry.getVisualID(node)) {
			case OwlsInputClientMessageEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case OwlsOutputClientMessageEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected void addDestroyChildNodesCommand(CompoundCommand cmd) {
		View view = (View) getHost().getModel();
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation != null) {
			return;
		}
		for (Iterator it = view.getChildren().iterator(); it.hasNext();) {
			Node node = (Node) it.next();
			switch (OwlsVisualIDRegistry.getVisualID(node)) {
			case OwlsAtomicProcessEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case OwlsCompositeProcess2EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case OwlsSplit2EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case OwlsSequence2EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case OwlsInputClientMessageEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case OwlsOutputClientMessageEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			}
		}
	}

}
