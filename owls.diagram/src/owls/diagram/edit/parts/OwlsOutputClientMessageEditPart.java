package owls.diagram.edit.parts;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.RootComponentEditPolicy;
import org.eclipse.gef.requests.AlignmentRequest;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import owls.diagram.connectionanchors.FixedConnectionAnchor;
import owls.diagram.edit.policies.OpenDiagramEditPolicy;
import owls.diagram.edit.policies.OwlsOutputClientMessageItemSemanticEditPolicy;
import owls.diagram.edit.policies.OwlsTextSelectionEditPolicy;

/**
 * @generated
 */
public class OwlsOutputClientMessageEditPart extends AbstractBorderItemEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2007;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated NOT
	 */
	private BorderItemLocator locator;

	/**
	 * @generated
	 */
	public OwlsOutputClientMessageEditPart(View view) {
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
				new OwlsOutputClientMessageItemSemanticEditPolicy());
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

		ConstrainedToolbarLayoutEditPolicy lep = new ConstrainedToolbarLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				if (child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE) == null) {
					if (child instanceof ITextAwareEditPart) {
						return new OwlsTextSelectionEditPolicy();
					}
				}
				return super.createChildEditPolicy(child);
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		OwlsOutputClientMessagesFigure figure = new OwlsOutputClientMessagesFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public OwlsOutputClientMessagesFigure getPrimaryShape() {
		return (OwlsOutputClientMessagesFigure) primaryShape;
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

	public void relocate(IFigure figure) {
		GraphicalEditPart editPart = (GraphicalEditPart) this;
		Rectangle r = figure.getBounds().getCopy();

		AlignmentRequest vertical = new AlignmentRequest(
				RequestConstants.REQ_ALIGN);
		vertical.setAlignmentRectangle(r);
		vertical.setAlignment(PositionConstants.BOTTOM);

		Command cmdv = editPart.getCommand(vertical);
		if (cmdv == null || !cmdv.canExecute()) {
			throw new IllegalArgumentException("Command is not executable.");
		}
		((DiagramEditPart) (editPart.getParent())).getDiagramEditDomain()
				.getDiagramCommandStack().execute(cmdv);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart#getLocator()
	 */
	public IBorderItemLocator getLocator() {
		return locator;
	}

	/**
	 * Sets the locator.
	 * @param locator The locator to set.
	 */
	public void setLocator(BorderItemLocator locator) {
		this.locator = locator;
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
	public class OwlsOutputClientMessagesFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrapLabel fFigureOutputMessageName;

		/**
		 * @generated
		 */
		public OwlsOutputClientMessagesFigure() {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutThis.setSpacing(5);
			layoutThis.setVertical(true);

			this.setLayoutManager(layoutThis);

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

			fFigureOutputMessageName = new WrapLabel();
			fFigureOutputMessageName.setText("Output");

			fFigureOutputMessageName.setFont(FFIGUREOUTPUTMESSAGENAME_FONT);

			this.add(fFigureOutputMessageName);

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
		public WrapLabel getFigureOutputMessageName() {
			return fFigureOutputMessageName;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREOUTPUTMESSAGENAME_FONT = new Font(Display
			.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 8,
			SWT.BOLD);

}
