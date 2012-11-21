package owls.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import owls.OwlsCompositeProcess;
import owls.OwlsPackage;
import owls.diagram.edit.parts.OwlsAnyOrder2EditPart;
import owls.diagram.edit.parts.OwlsAnyOrderEditPart;
import owls.diagram.edit.parts.OwlsAssignEditPart;
import owls.diagram.edit.parts.OwlsAssignInputClientEditPart;
import owls.diagram.edit.parts.OwlsAssignOutputClientEditPart;
import owls.diagram.edit.parts.OwlsAtomicProcessEditPart;
import owls.diagram.edit.parts.OwlsAtomicProcessIDEditPart;
import owls.diagram.edit.parts.OwlsCompositeProcess2EditPart;
import owls.diagram.edit.parts.OwlsCompositeProcessEditPart;
import owls.diagram.edit.parts.OwlsCompositeProcessIDEditPart;
import owls.diagram.edit.parts.OwlsInputClientMessageEditPart;
import owls.diagram.edit.parts.OwlsOutputClientMessageEditPart;
import owls.diagram.edit.parts.OwlsSequence2EditPart;
import owls.diagram.edit.parts.OwlsSequenceEditPart;
import owls.diagram.edit.parts.OwlsSplit2EditPart;
import owls.diagram.edit.parts.OwlsSplitEditPart;
import owls.diagram.edit.parts.WrapLabel2EditPart;
import owls.diagram.edit.parts.WrapLabel3EditPart;
import owls.diagram.edit.parts.WrapLabel4EditPart;
import owls.diagram.edit.parts.WrapLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class OwlsVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = OwlsDiagramEditorPlugin
			.getInstance().getBundle().getSymbolicName()
			+ "/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (OwlsCompositeProcessEditPart.MODEL_ID.equals(view.getType())) {
				return OwlsCompositeProcessEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return owls.diagram.part.OwlsVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				OwlsDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (OwlsPackage.eINSTANCE.getOwlsCompositeProcess().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((OwlsCompositeProcess) domainElement)) {
			return OwlsCompositeProcessEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = owls.diagram.part.OwlsVisualIDRegistry
				.getModelID(containerView);
		if (!OwlsCompositeProcessEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (OwlsCompositeProcessEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = owls.diagram.part.OwlsVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = OwlsCompositeProcessEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case OwlsSequenceEditPart.VISUAL_ID:
			if (OwlsPackage.eINSTANCE.getOwlsAtomicProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return OwlsAtomicProcessEditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsCompositeProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return OwlsCompositeProcess2EditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return OwlsSplit2EditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return OwlsAnyOrder2EditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsInputClientMessage()
					.isSuperTypeOf(domainElement.eClass())) {
				return OwlsInputClientMessageEditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsOutputClientMessage()
					.isSuperTypeOf(domainElement.eClass())) {
				return OwlsOutputClientMessageEditPart.VISUAL_ID;
			}
			break;
		case OwlsSplitEditPart.VISUAL_ID:
			if (OwlsPackage.eINSTANCE.getOwlsAtomicProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return OwlsAtomicProcessEditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsCompositeProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return OwlsCompositeProcess2EditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return OwlsSequence2EditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return OwlsAnyOrder2EditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsInputClientMessage()
					.isSuperTypeOf(domainElement.eClass())) {
				return OwlsInputClientMessageEditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsOutputClientMessage()
					.isSuperTypeOf(domainElement.eClass())) {
				return OwlsOutputClientMessageEditPart.VISUAL_ID;
			}
			break;
		case OwlsAnyOrderEditPart.VISUAL_ID:
			if (OwlsPackage.eINSTANCE.getOwlsAtomicProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return OwlsAtomicProcessEditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsCompositeProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return OwlsCompositeProcess2EditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return OwlsSplit2EditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return OwlsSequence2EditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsInputClientMessage()
					.isSuperTypeOf(domainElement.eClass())) {
				return OwlsInputClientMessageEditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsOutputClientMessage()
					.isSuperTypeOf(domainElement.eClass())) {
				return OwlsOutputClientMessageEditPart.VISUAL_ID;
			}
			break;
		case OwlsSplit2EditPart.VISUAL_ID:
			if (OwlsPackage.eINSTANCE.getOwlsAtomicProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return OwlsAtomicProcessEditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsCompositeProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return OwlsCompositeProcess2EditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return OwlsSequence2EditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return OwlsAnyOrder2EditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsInputClientMessage()
					.isSuperTypeOf(domainElement.eClass())) {
				return OwlsInputClientMessageEditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsOutputClientMessage()
					.isSuperTypeOf(domainElement.eClass())) {
				return OwlsOutputClientMessageEditPart.VISUAL_ID;
			}
			break;
		case OwlsSequence2EditPart.VISUAL_ID:
			if (OwlsPackage.eINSTANCE.getOwlsAtomicProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return OwlsAtomicProcessEditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsCompositeProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return OwlsCompositeProcess2EditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return OwlsSplit2EditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return OwlsAnyOrder2EditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsInputClientMessage()
					.isSuperTypeOf(domainElement.eClass())) {
				return OwlsInputClientMessageEditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsOutputClientMessage()
					.isSuperTypeOf(domainElement.eClass())) {
				return OwlsOutputClientMessageEditPart.VISUAL_ID;
			}
			break;
		case OwlsAnyOrder2EditPart.VISUAL_ID:
			if (OwlsPackage.eINSTANCE.getOwlsAtomicProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return OwlsAtomicProcessEditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsCompositeProcess().isSuperTypeOf(
					domainElement.eClass())) {
				return OwlsCompositeProcess2EditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return OwlsSplit2EditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return OwlsSequence2EditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsInputClientMessage()
					.isSuperTypeOf(domainElement.eClass())) {
				return OwlsInputClientMessageEditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsOutputClientMessage()
					.isSuperTypeOf(domainElement.eClass())) {
				return OwlsOutputClientMessageEditPart.VISUAL_ID;
			}
			break;
		case OwlsCompositeProcessEditPart.VISUAL_ID:
			if (OwlsPackage.eINSTANCE.getOwlsSequence().isSuperTypeOf(
					domainElement.eClass())) {
				return OwlsSequenceEditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsSplit().isSuperTypeOf(
					domainElement.eClass())) {
				return OwlsSplitEditPart.VISUAL_ID;
			}
			if (OwlsPackage.eINSTANCE.getOwlsAnyOrder().isSuperTypeOf(
					domainElement.eClass())) {
				return OwlsAnyOrderEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = owls.diagram.part.OwlsVisualIDRegistry
				.getModelID(containerView);
		if (!OwlsCompositeProcessEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (OwlsCompositeProcessEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = owls.diagram.part.OwlsVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = OwlsCompositeProcessEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case OwlsSequenceEditPart.VISUAL_ID:
			if (OwlsAtomicProcessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsCompositeProcess2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsSplit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsAnyOrder2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsInputClientMessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsOutputClientMessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OwlsSplitEditPart.VISUAL_ID:
			if (OwlsAtomicProcessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsCompositeProcess2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsSequence2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsAnyOrder2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsInputClientMessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsOutputClientMessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OwlsAnyOrderEditPart.VISUAL_ID:
			if (OwlsAtomicProcessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsCompositeProcess2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsSplit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsSequence2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsInputClientMessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsOutputClientMessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OwlsAtomicProcessEditPart.VISUAL_ID:
			if (OwlsAtomicProcessIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OwlsCompositeProcess2EditPart.VISUAL_ID:
			if (OwlsCompositeProcessIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OwlsSplit2EditPart.VISUAL_ID:
			if (OwlsAtomicProcessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsCompositeProcess2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsSequence2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsAnyOrder2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsInputClientMessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsOutputClientMessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OwlsSequence2EditPart.VISUAL_ID:
			if (OwlsAtomicProcessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsCompositeProcess2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsSplit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsAnyOrder2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsInputClientMessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsOutputClientMessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OwlsAnyOrder2EditPart.VISUAL_ID:
			if (OwlsAtomicProcessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsCompositeProcess2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsSplit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsSequence2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsInputClientMessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsOutputClientMessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OwlsCompositeProcessEditPart.VISUAL_ID:
			if (OwlsSequenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsSplitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OwlsAnyOrderEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (OwlsPackage.eINSTANCE.getOwlsAssign().isSuperTypeOf(
				domainElement.eClass())) {
			return OwlsAssignEditPart.VISUAL_ID;
		}
		if (OwlsPackage.eINSTANCE.getOwlsAssignInputClient().isSuperTypeOf(
				domainElement.eClass())) {
			return OwlsAssignInputClientEditPart.VISUAL_ID;
		}
		if (OwlsPackage.eINSTANCE.getOwlsAssignOutputClient().isSuperTypeOf(
				domainElement.eClass())) {
			return OwlsAssignOutputClientEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(OwlsCompositeProcess element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static class JavaConstraints {

	}

}
