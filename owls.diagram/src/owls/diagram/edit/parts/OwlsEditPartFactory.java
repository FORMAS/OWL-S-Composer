package owls.diagram.edit.parts;

import org.eclipse.draw2d.DelegatingLayout;
import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.LayeredPane;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramRootEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import owls.diagram.figures.ConnectionLayerExEx;
import owls.diagram.part.OwlsVisualIDRegistry;

/**
 * @generated
 */
public class OwlsEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (OwlsVisualIDRegistry.getVisualID(view)) {

			case OwlsCompositeProcessEditPart.VISUAL_ID:
				return new OwlsCompositeProcessEditPart(view);

			case OwlsSequenceEditPart.VISUAL_ID:
				return new OwlsSequenceEditPart(view);

			case OwlsSplitEditPart.VISUAL_ID:
				return new OwlsSplitEditPart(view);

			case OwlsAnyOrderEditPart.VISUAL_ID:
				return new OwlsAnyOrderEditPart(view);

			case OwlsAtomicProcessEditPart.VISUAL_ID:
				return new OwlsAtomicProcessEditPart(view);

			case OwlsAtomicProcessIDEditPart.VISUAL_ID:
				return new OwlsAtomicProcessIDEditPart(view);

			case OwlsCompositeProcess2EditPart.VISUAL_ID:
				return new OwlsCompositeProcess2EditPart(view);

			case OwlsCompositeProcessIDEditPart.VISUAL_ID:
				return new OwlsCompositeProcessIDEditPart(view);

			case OwlsSplit2EditPart.VISUAL_ID:
				return new OwlsSplit2EditPart(view);

			case OwlsSequence2EditPart.VISUAL_ID:
				return new OwlsSequence2EditPart(view);

			case OwlsAnyOrder2EditPart.VISUAL_ID:
				return new OwlsAnyOrder2EditPart(view);

			case OwlsInputClientMessageEditPart.VISUAL_ID:
				return new OwlsInputClientMessageEditPart(view);

			case OwlsOutputClientMessageEditPart.VISUAL_ID:
				return new OwlsOutputClientMessageEditPart(view);

			case OwlsAssignEditPart.VISUAL_ID:
				return new OwlsAssignEditPart(view);

			case OwlsAssignInputClientEditPart.VISUAL_ID:
				return new OwlsAssignInputClientEditPart(view);

			case OwlsAssignOutputClientEditPart.VISUAL_ID:
				return new OwlsAssignOutputClientEditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrapLabel)
			return new TextCellEditorLocator((WrapLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * Makes sure the custom ConnectionLayerExEx is set
	 * so the the custom connection routers can be used.
	 * 
	 * @param root The root editpart on which the printable layers are registered
	 * @generated NOT
	 */
	public static void setupConnectionLayerExEx(DiagramRootEditPart root) {
		LayeredPane printableLayers = (LayeredPane) root
				.getLayer(LayerConstants.PRINTABLE_LAYERS);
		Layer connlayer = printableLayers
				.getLayer(LayerConstants.CONNECTION_LAYER);
		if (connlayer == null || connlayer instanceof ConnectionLayerExEx) {
			return;
		}
		printableLayers.removeLayer(LayerConstants.CONNECTION_LAYER);
		Layer decorationLayer = printableLayers
				.getLayer(DiagramRootEditPart.DECORATION_PRINTABLE_LAYER);
		printableLayers
				.removeLayer(DiagramRootEditPart.DECORATION_PRINTABLE_LAYER);
		printableLayers.addLayerBefore(new ConnectionLayerExEx(),
				LayerConstants.CONNECTION_LAYER, printableLayers
						.getLayer(LayerConstants.PRIMARY_LAYER));
		printableLayers.addLayerBefore(decorationLayer,
				DiagramRootEditPart.DECORATION_PRINTABLE_LAYER, printableLayers
						.getLayer(LayerConstants.CONNECTION_LAYER));

		FreeformLayer extLabelsLayer = new FreeformLayer();
		extLabelsLayer.setLayoutManager(new DelegatingLayout());
		LayeredPane scalableLayers = (LayeredPane) root
				.getLayer(LayerConstants.SCALABLE_LAYERS);
		FreeformLayer scaledFeedbackLayer = new FreeformLayer();
		scaledFeedbackLayer.setEnabled(false);
		scalableLayers.addLayerAfter(scaledFeedbackLayer,
				LayerConstants.SCALED_FEEDBACK_LAYER,
				DiagramRootEditPart.DECORATION_UNPRINTABLE_LAYER);

	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrapLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrapLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrapLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (getWrapLabel().isTextWrapped()
					&& getWrapLabel().getText().length() > 0) {
				rect.setSize(new Dimension(text.computeSize(rect.width,
						SWT.DEFAULT)));
			} else {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			int avr = FigureUtilities.getFontMetrics(text.getFont())
					.getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
					SWT.DEFAULT)).expand(avr * 2, 0));
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
