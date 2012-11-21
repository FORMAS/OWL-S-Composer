package owls.diagram.view.factories;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.view.factories.AbstractShapeViewFactory;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.HintedDiagramLinkStyle;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.RGB;

import owls.diagram.edit.parts.OwlsAtomicProcessEditPart;
import owls.diagram.edit.parts.OwlsAtomicProcessIDEditPart;
import owls.diagram.part.OwlsVisualIDRegistry;

/**
 * @generated
 */
public class OwlsAtomicProcessViewFactory extends AbstractShapeViewFactory {

	/**
	 * @generated
	 */
	protected List createStyles(View view) {
		List styles = new ArrayList();
		styles.add(NotationFactory.eINSTANCE.createShapeStyle());
		{
			HintedDiagramLinkStyle diagramFacet = NotationFactory.eINSTANCE
					.createHintedDiagramLinkStyle();
			styles.add(diagramFacet);
		}
		return styles;
	}

	/**
	 * @generated NOT
	 */
	protected void decorateView(View containerView, View view,
			IAdaptable semanticAdapter, String semanticHint, int index,
			boolean persisted) {
		if (semanticHint == null) {
			semanticHint = OwlsVisualIDRegistry
					.getType(OwlsAtomicProcessEditPart.VISUAL_ID);
			view.setType(semanticHint);
		}
		super.decorateView(containerView, view, semanticAdapter, semanticHint,
				index, persisted);
		IAdaptable eObjectAdapter = null;
		EObject eObject = (EObject) semanticAdapter.getAdapter(EObject.class);
		if (eObject != null) {
			eObjectAdapter = new EObjectAdapter(eObject);
		}
		getViewService().createNode(
				eObjectAdapter,
				view,
				OwlsVisualIDRegistry
						.getType(OwlsAtomicProcessIDEditPart.VISUAL_ID),
				ViewUtil.APPEND, true, getPreferencesHint());

		LineStyle lineStyle = (LineStyle) view
				.getStyle(NotationPackage.Literals.LINE_STYLE);
		if (lineStyle != null) {
			lineStyle.setLineColor(FigureUtilities.RGBToInteger(
					new RGB(154, 50, 205)).intValue());
		}
	}
}
