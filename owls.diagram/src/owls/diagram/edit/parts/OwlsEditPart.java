package owls.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramRootEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;


/**
 * @generated
 */
public class OwlsEditPart extends DiagramEditPart {

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
	public OwlsEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		removeEditPolicy(EditPolicyRoles.POPUPBAR_ROLE);
	}
	
	/**
	 * Makes sure the ConnectionLayerExEx that registers the
     * special routers is well set.
     * If we do this only for the configureGraphicalEditViewer, when 
     * the diagram is printed it does not install it correctly
     * @generated  NOT 
     */
    @Override
    public void setParent(EditPart parent) {
    	if (parent != null) {
    		EditPart root = parent instanceof DiagramRootEditPart ?
    				((DiagramRootEditPart)parent) : parent.getRoot();
    				if (root != null && root instanceof DiagramRootEditPart) {
    					OwlsEditPartFactory.setupConnectionLayerExEx(
    							(DiagramRootEditPart)root);
    				}
    	}
    	super.setParent(parent);
    }

}
