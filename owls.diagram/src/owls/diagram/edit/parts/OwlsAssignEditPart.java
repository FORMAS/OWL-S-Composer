package owls.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.RoutingStyle;
import org.eclipse.gmf.runtime.notation.View;

import owls.diagram.edit.policies.OwlsAssignItemSemanticEditPolicy;
import owls.diagram.figures.ConnectionLayerExEx;

/**
 * @generated
 */
public class OwlsAssignEditPart extends ConnectionNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3001;

	/**
	 * @generated NOT
	 */
	private ConnectionRouter rectilinearRouter = null;

	/**
	 * @generated
	 */
	public OwlsAssignEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new OwlsAssignItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new OwlsAssignFigure();
	}

	/**
	 * @generated
	 */
	public OwlsAssignFigure getPrimaryShape() {
		return (OwlsAssignFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class OwlsAssignFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public OwlsAssignFigure() {

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(-1));
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(1));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));
			return df;
		}

	}

	/**
	 * if the style is rectilinear, use our own borderRectilinear router
	 * ortherwise call super.
	 * @generated NOT
	 */
	@Override
	protected void installRouter() {
		ConnectionLayer cLayer = (ConnectionLayer) getLayer(LayerConstants.CONNECTION_LAYER);

		RoutingStyle style = (RoutingStyle) ((View) getModel())
				.getStyle(NotationPackage.eINSTANCE.getRoutingStyle());

		if (style != null && cLayer instanceof ConnectionLayerExEx) {
			ConnectionLayerExEx cLayerEx = (ConnectionLayerExEx) cLayer;
			if (Routing.RECTILINEAR_LITERAL == style.getRouting()) {
				if (rectilinearRouter == null) {
					rectilinearRouter = cLayerEx
							.getBorderItemRectilinearRouter();
				}
				getConnectionFigure().setConnectionRouter(rectilinearRouter);
				refreshRouterChange();
				return;
			}
		} else {
			throw new IllegalArgumentException("Invalid layer: " + cLayer); //$NON-NLS-1$
		}
		super.installRouter();
	}

}
