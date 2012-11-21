package owls.diagram.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;

import owls.diagram.edit.policies.OwlsCompositeCreationEditPolicy;
import owls.diagram.edit.policies.OwlsCompositeProcessCanonicalEditPolicy;
import owls.diagram.edit.policies.OwlsCompositeProcessItemSemanticEditPolicy;

/**
 * @generated
 */
public class OwlsCompositeProcessEditPart extends DiagramEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "Owls"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 79;

	/**
	 * @generated
	 */
	public OwlsCompositeProcessEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new OwlsCompositeCreationEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new OwlsCompositeProcessItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new OwlsCompositeProcessCanonicalEditPolicy());
		removeEditPolicy(EditPolicyRoles.POPUPBAR_ROLE);
	}

}
