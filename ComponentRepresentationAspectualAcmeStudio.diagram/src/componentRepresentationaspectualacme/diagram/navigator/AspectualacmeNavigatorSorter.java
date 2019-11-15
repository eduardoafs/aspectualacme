package componentRepresentationaspectualacme.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class AspectualacmeNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorItem) {
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorItem item = (componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorItem) element;
			return componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
