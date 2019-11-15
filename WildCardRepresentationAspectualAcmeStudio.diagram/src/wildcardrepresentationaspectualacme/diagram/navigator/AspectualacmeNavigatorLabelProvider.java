package wildcardrepresentationaspectualacme.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import wildcardrepresentationaspectualacme.diagram.edit.parts.ComponentEditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.ComponentNameEditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.PortEditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.WildCard2EditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.WildCardEditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.WildCardNameEditPart;
import wildcardrepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry;
import wildcardrepresentationaspectualacme.diagram.part.WildCardRepresentationAspectualacmeDiagramEditorPlugin;
import wildcardrepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes;
import wildcardrepresentationaspectualacme.diagram.providers.AspectualacmeParserProvider;
import aspectualacme.Port;
import aspectualacme.WildCard;

/**
 * @generated
 */
public class AspectualacmeNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		WildCardRepresentationAspectualacmeDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		WildCardRepresentationAspectualacmeDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof AspectualacmeNavigatorItem
				&& !isOwnView(((AspectualacmeNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof AspectualacmeNavigatorGroup) {
			AspectualacmeNavigatorGroup group = (AspectualacmeNavigatorGroup) element;
			return WildCardRepresentationAspectualacmeDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof AspectualacmeNavigatorItem) {
			AspectualacmeNavigatorItem navigatorItem = (AspectualacmeNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (AspectualacmeVisualIDRegistry.getVisualID(view)) {
		case WildCardEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?aspectualacmev0.2?WildCard", AspectualacmeElementTypes.WildCard_1000); //$NON-NLS-1$
		case ComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?aspectualacmev0.2?Component", AspectualacmeElementTypes.Component_2002); //$NON-NLS-1$
		case WildCard2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?aspectualacmev0.2?WildCard", AspectualacmeElementTypes.WildCard_2003); //$NON-NLS-1$
		case PortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?aspectualacmev0.2?Port", AspectualacmeElementTypes.Port_3001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = WildCardRepresentationAspectualacmeDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& AspectualacmeElementTypes.isKnownElementType(elementType)) {
			image = AspectualacmeElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof AspectualacmeNavigatorGroup) {
			AspectualacmeNavigatorGroup group = (AspectualacmeNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof AspectualacmeNavigatorItem) {
			AspectualacmeNavigatorItem navigatorItem = (AspectualacmeNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (AspectualacmeVisualIDRegistry.getVisualID(view)) {
		case WildCardEditPart.VISUAL_ID:
			return getWildCard_1000Text(view);
		case ComponentEditPart.VISUAL_ID:
			return getComponent_2002Text(view);
		case WildCard2EditPart.VISUAL_ID:
			return getWildCard_2003Text(view);
		case PortEditPart.VISUAL_ID:
			return getPort_3001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getWildCard_1000Text(View view) {
		WildCard domainModelElement = (WildCard) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			WildCardRepresentationAspectualacmeDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComponent_2002Text(View view) {
		IParser parser = AspectualacmeParserProvider.getParser(
				AspectualacmeElementTypes.Component_2002,
				view.getElement() != null ? view.getElement() : view,
				AspectualacmeVisualIDRegistry
						.getType(ComponentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WildCardRepresentationAspectualacmeDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWildCard_2003Text(View view) {
		IParser parser = AspectualacmeParserProvider.getParser(
				AspectualacmeElementTypes.WildCard_2003,
				view.getElement() != null ? view.getElement() : view,
				AspectualacmeVisualIDRegistry
						.getType(WildCardNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WildCardRepresentationAspectualacmeDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPort_3001Text(View view) {
		Port domainModelElement = (Port) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			WildCardRepresentationAspectualacmeDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return WildCardEditPart.MODEL_ID.equals(AspectualacmeVisualIDRegistry
				.getModelID(view));
	}

}
