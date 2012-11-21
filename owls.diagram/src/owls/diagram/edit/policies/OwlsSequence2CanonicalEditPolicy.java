package owls.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

import owls.OwlsPackage;
import owls.diagram.edit.parts.OwlsAnyOrder2EditPart;
import owls.diagram.edit.parts.OwlsAtomicProcessEditPart;
import owls.diagram.edit.parts.OwlsCompositeProcess2EditPart;
import owls.diagram.edit.parts.OwlsInputClientMessageEditPart;
import owls.diagram.edit.parts.OwlsOutputClientMessageEditPart;
import owls.diagram.edit.parts.OwlsSplit2EditPart;
import owls.diagram.part.OwlsDiagramUpdater;
import owls.diagram.part.OwlsNodeDescriptor;
import owls.diagram.part.OwlsVisualIDRegistry;

/**
 * @generated
 */
public class OwlsSequence2CanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = OwlsDiagramUpdater
				.getOwlsSequence_2004SemanticChildren(viewObject).iterator(); it
				.hasNext();) {
			result.add(((OwlsNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = OwlsVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case OwlsAtomicProcessEditPart.VISUAL_ID:
		case OwlsCompositeProcess2EditPart.VISUAL_ID:
		case OwlsSplit2EditPart.VISUAL_ID:
		case OwlsAnyOrder2EditPart.VISUAL_ID:
		case OwlsInputClientMessageEditPart.VISUAL_ID:
		case OwlsOutputClientMessageEditPart.VISUAL_ID:
			return !semanticChildren.contains(view.getElement())
					|| visualID != OwlsVisualIDRegistry.getNodeVisualID(
							(View) getHost().getModel(), view.getElement());
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(OwlsPackage.eINSTANCE
					.getOwlsControlConstruct_Processes());
			myFeaturesToSynchronize.add(OwlsPackage.eINSTANCE
					.getOwlsControlConstruct_Constructs());
			myFeaturesToSynchronize.add(OwlsPackage.eINSTANCE
					.getOwlsControlConstruct_Messages());
		}
		return myFeaturesToSynchronize;
	}

}
