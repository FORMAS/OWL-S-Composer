package owls.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import owls.diagram.part.OwlsVisualIDRegistry;

/**
 * @generated
 */
public class OwlsNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 3005;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof OwlsNavigatorItem) {
			OwlsNavigatorItem item = (OwlsNavigatorItem) element;
			return OwlsVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
