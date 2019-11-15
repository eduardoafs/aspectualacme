package wildcardrepresentationaspectualacme.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class AspectualacmeNavigatorItem extends
		AspectualacmeAbstractNavigatorItem {

	/**
	 * @generated
	 */
	static {
		final Class[] supportedTypes = new Class[] { View.class, EObject.class };
		Platform.getAdapterManager().registerAdapters(
				new IAdapterFactory() {

					public Object getAdapter(Object adaptableObject,
							Class adapterType) {
						if (adaptableObject instanceof wildcardrepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorItem
								&& (adapterType == View.class || adapterType == EObject.class)) {
							return ((wildcardrepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorItem) adaptableObject)
									.getView();
						}
						return null;
					}

					public Class[] getAdapterList() {
						return supportedTypes;
					}
				},
				wildcardrepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorItem.class);
	}

	/**
	 * @generated
	 */
	private View myView;

	/**
	 * @generated
	 */
	private boolean myLeaf = false;

	/**
	 * @generated
	 */
	public AspectualacmeNavigatorItem(View view, Object parent, boolean isLeaf) {
		super(parent);
		myView = view;
		myLeaf = isLeaf;
	}

	/**
	 * @generated
	 */
	public View getView() {
		return myView;
	}

	/**
	 * @generated
	 */
	public boolean isLeaf() {
		return myLeaf;
	}

	/**
	 * @generated
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof wildcardrepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorItem) {
			return EcoreUtil
					.getURI(getView())
					.equals(EcoreUtil
							.getURI(((wildcardrepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorItem) obj)
									.getView()));
		}
		return super.equals(obj);
	}

	/**
	 * @generated
	 */
	@Override
	public int hashCode() {
		return EcoreUtil.getURI(getView()).hashCode();
	}

}
