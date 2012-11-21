package owls.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;

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
import owls.diagram.part.OwlsVisualIDRegistry;
import owls.diagram.view.factories.OwlsAnyOrder2ViewFactory;
import owls.diagram.view.factories.OwlsAnyOrderViewFactory;
import owls.diagram.view.factories.OwlsAssignInputClientViewFactory;
import owls.diagram.view.factories.OwlsAssignOutputClientViewFactory;
import owls.diagram.view.factories.OwlsAssignViewFactory;
import owls.diagram.view.factories.OwlsAtomicProcessIDViewFactory;
import owls.diagram.view.factories.OwlsAtomicProcessViewFactory;
import owls.diagram.view.factories.OwlsCompositeProcess2ViewFactory;
import owls.diagram.view.factories.OwlsCompositeProcessIDViewFactory;
import owls.diagram.view.factories.OwlsCompositeProcessViewFactory;
import owls.diagram.view.factories.OwlsInputClientMessageViewFactory;
import owls.diagram.view.factories.OwlsOutputClientMessageViewFactory;
import owls.diagram.view.factories.OwlsSequence2ViewFactory;
import owls.diagram.view.factories.OwlsSequenceViewFactory;
import owls.diagram.view.factories.OwlsSplit2ViewFactory;
import owls.diagram.view.factories.OwlsSplitViewFactory;
import owls.diagram.view.factories.WrapLabel2ViewFactory;
import owls.diagram.view.factories.WrapLabel3ViewFactory;
import owls.diagram.view.factories.WrapLabel4ViewFactory;
import owls.diagram.view.factories.WrapLabelViewFactory;

/**
 * @generated
 */
public class OwlsViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter,
			String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (OwlsCompositeProcessEditPart.MODEL_ID.equals(diagramKind)
				&& OwlsVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return OwlsCompositeProcessViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		if (containerView == null) {
			return null;
		}
		IElementType elementType = getSemanticElementType(semanticAdapter);
		EObject domainElement = getSemanticElement(semanticAdapter);
		int visualID;
		if (semanticHint == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return null;
			}
			visualID = OwlsVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		} else {
			visualID = OwlsVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!OwlsElementTypes.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != OwlsVisualIDRegistry.getNodeVisualID(
								containerView, domainElement)) {
					return null; // visual id for node EClass should match visual id from element type
				}
			} else {
				// Element type is not specified. Domain element should be present (except pure design elements).
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!OwlsCompositeProcessEditPart.MODEL_ID
						.equals(OwlsVisualIDRegistry.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case OwlsSequenceEditPart.VISUAL_ID:
				case OwlsAtomicProcessEditPart.VISUAL_ID:
				case OwlsSplit2EditPart.VISUAL_ID:
				case OwlsAnyOrder2EditPart.VISUAL_ID:
				case OwlsInputClientMessageEditPart.VISUAL_ID:
				case OwlsOutputClientMessageEditPart.VISUAL_ID:
				case OwlsSplitEditPart.VISUAL_ID:
				case OwlsAnyOrderEditPart.VISUAL_ID:
				case OwlsCompositeProcess2EditPart.VISUAL_ID:
				case OwlsSequence2EditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != OwlsVisualIDRegistry
									.getNodeVisualID(containerView,
											domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case OwlsAtomicProcessIDEditPart.VISUAL_ID:
					if (OwlsAtomicProcessEditPart.VISUAL_ID != OwlsVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OwlsCompositeProcessIDEditPart.VISUAL_ID:
					if (OwlsCompositeProcess2EditPart.VISUAL_ID != OwlsVisualIDRegistry
							.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				default:
					return null;
				}
			}
		}
		return getNodeViewClass(containerView, visualID);
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(View containerView, int visualID) {
		if (containerView == null
				|| !OwlsVisualIDRegistry.canCreateNode(containerView, visualID)) {
			return null;
		}
		switch (visualID) {
		case OwlsSequenceEditPart.VISUAL_ID:
			return OwlsSequenceViewFactory.class;
		case OwlsSplitEditPart.VISUAL_ID:
			return OwlsSplitViewFactory.class;
		case OwlsAnyOrderEditPart.VISUAL_ID:
			return OwlsAnyOrderViewFactory.class;
		case OwlsAtomicProcessEditPart.VISUAL_ID:
			return OwlsAtomicProcessViewFactory.class;
		case OwlsAtomicProcessIDEditPart.VISUAL_ID:
			return OwlsAtomicProcessIDViewFactory.class;
		case OwlsCompositeProcess2EditPart.VISUAL_ID:
			return OwlsCompositeProcess2ViewFactory.class;
		case OwlsCompositeProcessIDEditPart.VISUAL_ID:
			return OwlsCompositeProcessIDViewFactory.class;
		case OwlsSplit2EditPart.VISUAL_ID:
			return OwlsSplit2ViewFactory.class;
		case OwlsSequence2EditPart.VISUAL_ID:
			return OwlsSequence2ViewFactory.class;
		case OwlsAnyOrder2EditPart.VISUAL_ID:
			return OwlsAnyOrder2ViewFactory.class;
		case OwlsInputClientMessageEditPart.VISUAL_ID:
			return OwlsInputClientMessageViewFactory.class;
		case OwlsOutputClientMessageEditPart.VISUAL_ID:
			return OwlsOutputClientMessageViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter,
			View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!OwlsElementTypes.isKnownElementType(elementType)
				|| (!(elementType instanceof IHintedType))) {
			return null; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null) {
			return null; // our hint is visual id and must be specified
		}
		if (semanticHint != null && !semanticHint.equals(elementTypeHint)) {
			return null; // if semantic hint is specified it should be the same as in element type
		}
		int visualID = OwlsVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null
				&& visualID != OwlsVisualIDRegistry
						.getLinkWithClassVisualID(domainElement)) {
			return null; // visual id for link EClass should match visual id from element type
		}
		return getEdgeViewClass(visualID);
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(int visualID) {
		switch (visualID) {
		case OwlsAssignEditPart.VISUAL_ID:
			return OwlsAssignViewFactory.class;
		case OwlsAssignInputClientEditPart.VISUAL_ID:
			return OwlsAssignInputClientViewFactory.class;
		case OwlsAssignOutputClientEditPart.VISUAL_ID:
			return OwlsAssignOutputClientViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}
}
