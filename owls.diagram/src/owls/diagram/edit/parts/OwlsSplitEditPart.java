package owls.diagram.edit.parts;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest.ViewAndElementDescriptor;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import owls.OwlsCompositeProcess;
import owls.OwlsControlConstruct;
import owls.OwlsPackage;
import owls.diagram.edit.policies.CompartmentChildCreationEditPolicy;
import owls.diagram.edit.policies.CompartmentEditPolicy;
import owls.diagram.edit.policies.OpenDiagramEditPolicy;
import owls.diagram.edit.policies.OwlsSplitCanonicalEditPolicy;
import owls.diagram.edit.policies.OwlsSplitItemSemanticEditPolicy;
import owls.diagram.figures.BorderItemLocatorEx;
import owls.diagram.part.OwlsVisualIDRegistry;
import owls.diagram.providers.OwlsElementTypes;
import owls.impl.OwlsAnyOrderImpl;
import owls.impl.OwlsSequenceImpl;
import owls.impl.OwlsSplitImpl;

/**
 * @generated
 */
public class OwlsSplitEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1002;

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
	public OwlsSplitEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CompartmentChildCreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new OwlsSplitItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new OwlsSplitCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new OpenDiagramEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new CompartmentEditPolicy(
				OwlsPackage.Literals.OWLS_CONTROL_CONSTRUCT__CONSTRUCTS));
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		removeEditPolicy(EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				if (child instanceof IBorderItemEditPart) {
					return new BorderItemSelectionEditPolicy();
				}
				return super.createChildEditPolicy(child);
			}

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
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
		OwlsSplitFigure figure = new OwlsSplitFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public OwlsSplitFigure getPrimaryShape() {
		return (OwlsSplitFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode()
				.DPtoLP(260), getMapMode().DPtoLP(140));
		return result;
	}

	/**
	 * @generated NOT
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, index);
	}

	/**
	 * @generated NOT
	 */
	private boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof OwlsInputClientMessageEditPart) {
			BorderItemLocatorEx locator = new BorderItemLocatorEx(
					getMainFigure(), PositionConstants.TOP);
			getBorderedFigure().getBorderItemContainer().add(
					((OwlsInputClientMessageEditPart) childEditPart)
							.getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof OwlsOutputClientMessageEditPart) {
			BorderItemLocatorEx locator = new BorderItemLocatorEx(
					getMainFigure(), PositionConstants.BOTTOM);
			getBorderedFigure().getBorderItemContainer().add(
					((OwlsOutputClientMessageEditPart) childEditPart)
							.getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated NOT
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated NOT
	 */
	private boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof OwlsInputClientMessageEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((OwlsInputClientMessageEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof OwlsOutputClientMessageEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((OwlsOutputClientMessageEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createMainFigure() {
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
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(getMapMode().DPtoLP(5));
			nodeShape.setLayoutManager(layout);
		}
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
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		} else {
			return getContentPane();
		}
	}

	/**
	 * @generated NOT
	 */
	@Override
	protected void handleNotificationEvent(Notification event) {
		if (event.getEventType() == 3) {
			this.getPrimaryShape().resizeHost();
		}
		OwlsCompositeProcess rootElement = (OwlsCompositeProcess) getDiagramView()
				.getDiagram().getElement();
		if ((event.getEventType() == 1)
				&& (rootElement.getComposedOf().getMessages().isEmpty())) {
			createInputMessages();
			createOutputMessages();
		}
		super.handleNotificationEvent(event);
	}

	/**
	 * @generated NOT
	 */
	protected void createInputMessages() {

		IElementType type = OwlsElementTypes.OwlsInputClientMessage_2006;

		ViewAndElementDescriptor viewDescriptor = new ViewAndElementDescriptor(
				new CreateElementRequestAdapter(new CreateElementRequest(type)),
				Node.class, ((IHintedType) type).getSemanticHint(),
				getDiagramPreferencesHint());

		CreateViewAndElementRequest request = new CreateViewAndElementRequest(
				viewDescriptor);

		CompoundCommand cmd = new CompoundCommand();
		EditPart firstConstruct = (EditPart) getRoot().getContents()
				.getChildren().get(0);
		cmd.add(firstConstruct.getCommand(request));
		getDiagramEditDomain().getDiagramCommandStack().execute(cmd);
	}

	/**
	 * @generated NOT
	 */
	protected void createOutputMessages() {

		IElementType type = OwlsElementTypes.OwlsOutputClientMessage_2007;

		ViewAndElementDescriptor viewDescriptor = new ViewAndElementDescriptor(
				new CreateElementRequestAdapter(new CreateElementRequest(type)),
				Node.class, ((IHintedType) type).getSemanticHint(),
				getDiagramPreferencesHint());

		CreateViewAndElementRequest request = new CreateViewAndElementRequest(
				viewDescriptor);

		CompoundCommand cmd = new CompoundCommand();
		EditPart firstConstruct = (EditPart) getRoot().getContents()
				.getChildren().get(0);
		cmd.add(firstConstruct.getCommand(request));
		getDiagramEditDomain().getDiagramCommandStack().execute(cmd);
	}

	/**
	 * @generated
	 */
	public class OwlsSplitFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrapLabel fFigureSplitName;

		/**
		 * @generated
		 */
		public OwlsSplitFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_CENTER);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(20);
			layoutThis.setMinorSpacing(20);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(20),
					getMapMode().DPtoLP(20)));
			this.setFill(false);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(260),
					getMapMode().DPtoLP(140)));
			this.setSize(getMapMode().DPtoLP(260), getMapMode().DPtoLP(140));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(30),
					getMapMode().DPtoLP(45), getMapMode().DPtoLP(20),
					getMapMode().DPtoLP(45)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureSplitName = new WrapLabel();
			fFigureSplitName.setText("Split");

			fFigureSplitName.setFont(FFIGURESPLITNAME_FONT);

			this.add(fFigureSplitName);

		}

		/**
		 * @generated NOT
		 */
		private void resizeHost() {
			EObject host = resolveSemanticElement();
			recursiveResize(host);
		}

		/**
		 * @generated NOT
		 */
		private void recursiveResize(EObject host) {
			if (host instanceof OwlsSequenceImpl) {
				OwlsControlConstruct sequence = (OwlsControlConstruct) host;
				if (sequence.getConstructs().size() != 0) {
					for (int i = 0; i < sequence.getConstructs().size(); i++) {
						OwlsControlConstruct newProcessType = sequence
								.getConstructs().get(i);

						recursiveResize(newProcessType);
					}
				} else {
					int processQuantity = sequence.getProcesses().size();

					int newHeight = (processQuantity * 200);

					if (newHeight >= this.getSize().height) {
						this.setPreferredSize(getMapMode().DPtoLP(
								this.getSize().width), getMapMode().DPtoLP(
								newHeight));
					}
				}
			}
			if ((host instanceof OwlsSplitImpl)
					|| (host instanceof OwlsAnyOrderImpl)) {
				OwlsControlConstruct process = (OwlsControlConstruct) host;
				if (process.getConstructs().size() != 0) {
					for (int i = 0; i < process.getConstructs().size(); i++) {
						OwlsControlConstruct newProcessType = process
								.getConstructs().get(i);

						recursiveResize(newProcessType);
					}
				} else {
					int processQuantity = process.getProcesses().size();

					int newWidth = (processQuantity * 150);

					if (newWidth >= this.getSize().width) {
						this.setPreferredSize(getMapMode().DPtoLP(newWidth),
								getMapMode().DPtoLP(this.getSize().height));
					}
				}
			}
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
		public WrapLabel getFigureSplitName() {
			return fFigureSplitName;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGURESPLITNAME_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 8,
			SWT.BOLD);

}
