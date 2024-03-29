package aspectualacme.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import aspectualacme.diagram.part.AspectualacmeVisualIDRegistry;

/**
 * @generated
 */
public class AspectualacmeNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof AspectualacmeNavigatorItem) {
			AspectualacmeNavigatorItem item = (AspectualacmeNavigatorItem) element;
			return AspectualacmeVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
