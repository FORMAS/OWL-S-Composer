package owls.diagram.edit.parts;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.RootComponentEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import owls.diagram.connectionanchors.FixedConnectionAnchor;
import owls.diagram.edit.policies.OpenDiagramEditPolicy;
import owls.diagram.edit.policies.OwlsInputClientMessageItemSemanticEditPolicy;

/**
 * @generated
 */
public class OwlsInputClientMessageEditPart extends AbstractBorderItemEditPart {
	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2006;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public OwlsInputClientMessageEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.COMPONENT_ROLE,
				new RootComponentEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new OwlsInputClientMessageItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new OwlsInputClientMessageItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new OpenDiagramEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		OwlsInputClientMessagesFigure figure = new OwlsInputClientMessagesFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public OwlsInputClientMessagesFigure getPrimaryShape() {
		return (OwlsInputClientMessagesFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode()
				.DPtoLP(90), getMapMode().DPtoLP(50));

		//FIXME: workaround for #154536
		result.getBounds().setSize(result.getPreferredSize());
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated NOT
	 */
	@Override
	public ConnectionAnchor getSourceConnectionAnchor(
			ConnectionEditPart connEditPart) {
		FixedConnectionAnchor fixedAnchor = new FixedConnectionAnchor(
				getFigure());
		fixedAnchor.offsetH = 45;
		fixedAnchor.offsetV = 50;

		return fixedAnchor;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public ConnectionAnchor getTargetConnectionAnchor(
			ConnectionEditPart connEditPart) {
		FixedConnectionAnchor fixedAnchor = new FixedConnectionAnchor(
				getFigure());
		fixedAnchor.offsetH = 45;
		fixedAnchor.offsetV = 0;

		return fixedAnchor;
	}

	/**
	 * @generated
	 */
	public class OwlsInputClientMessagesFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrapLabel fFigureInputMessageName;

		/**
		 * @generated
		 */
		public OwlsInputClientMessagesFigure() {

			this.setLayoutManager(new StackLayout());
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setLineWidth(2);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(90),
					getMapMode().DPtoLP(50)));
			this.setSize(getMapMode().DPtoLP(90), getMapMode().DPtoLP(50));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(30),
					getMapMode().DPtoLP(30), getMapMode().DPtoLP(30),
					getMapMode().DPtoLP(30)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureInputMessageName = new WrapLabel();
			fFigureInputMessageName.setText("Input");

			fFigureInputMessageName.setFont(FFIGUREINPUTMESSAGENAME_FONT);

			this.add(fFigureInputMessageName);

		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

		/**
		 * @generated
		 */
		public WrapLabel getFigureInputMessageName() {
			return fFigureInputMessageName;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREINPUTMESSAGENAME_FONT = new Font(Display
			.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 8,
			SWT.BOLD);

}
