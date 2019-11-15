package aspectualacme.diagram.navigator;

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

import aspectualacme.BaseRole;
import aspectualacme.CrosscuttingRole;
import aspectualacme.Port;
import aspectualacme.Representation;
import aspectualacme.Role;
import aspectualacme.System;
import aspectualacme.diagram.edit.parts.Attachment2EditPart;
import aspectualacme.diagram.edit.parts.Attachment3EditPart;
import aspectualacme.diagram.edit.parts.Attachment4EditPart;
import aspectualacme.diagram.edit.parts.Attachment5EditPart;
import aspectualacme.diagram.edit.parts.Attachment6EditPart;
import aspectualacme.diagram.edit.parts.AttachmentEditPart;
import aspectualacme.diagram.edit.parts.BaseRoleEditPart;
import aspectualacme.diagram.edit.parts.ComponentEditPart;
import aspectualacme.diagram.edit.parts.ComponentNameEditPart;
import aspectualacme.diagram.edit.parts.ConnectorEditPart;
import aspectualacme.diagram.edit.parts.ConnectorNameEditPart;
import aspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart;
import aspectualacme.diagram.edit.parts.GlueEditPart;
import aspectualacme.diagram.edit.parts.PortEditPart;
import aspectualacme.diagram.edit.parts.RepresentationEditPart;
import aspectualacme.diagram.edit.parts.RoleEditPart;
import aspectualacme.diagram.edit.parts.SystemEditPart;
import aspectualacme.diagram.edit.parts.WildCardEditPart;
import aspectualacme.diagram.edit.parts.WildCardNameEditPart;
import aspectualacme.diagram.edit.parts.WildCardNameExpressionEditPart;
import aspectualacme.diagram.part.AspectualacmeDiagramEditorPlugin;
import aspectualacme.diagram.part.AspectualacmeVisualIDRegistry;
import aspectualacme.diagram.providers.AspectualacmeElementTypes;
import aspectualacme.diagram.providers.AspectualacmeParserProvider;

/**
 * @generated
 */
public class AspectualacmeNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		AspectualacmeDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		AspectualacmeDiagramEditorPlugin
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
			return AspectualacmeDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
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
		case Attachment5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?aspectualacmev0.2?Attachment", AspectualacmeElementTypes.Attachment_4001); //$NON-NLS-1$
		case PortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?aspectualacmev0.2?Port", AspectualacmeElementTypes.Port_3005); //$NON-NLS-1$
		case SystemEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?aspectualacmev0.2?System", AspectualacmeElementTypes.System_1000); //$NON-NLS-1$
		case Attachment3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?aspectualacmev0.2?Attachment", AspectualacmeElementTypes.Attachment_4005); //$NON-NLS-1$
		case Attachment2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?aspectualacmev0.2?Attachment", AspectualacmeElementTypes.Attachment_4004); //$NON-NLS-1$
		case ConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?aspectualacmev0.2?Connector", AspectualacmeElementTypes.Connector_2001); //$NON-NLS-1$
		case CrosscuttingRoleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?aspectualacmev0.2?CrosscuttingRole", AspectualacmeElementTypes.CrosscuttingRole_3002); //$NON-NLS-1$
		case Attachment4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?aspectualacmev0.2?Attachment", AspectualacmeElementTypes.Attachment_4006); //$NON-NLS-1$
		case ComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?aspectualacmev0.2?Component", AspectualacmeElementTypes.Component_2002); //$NON-NLS-1$
		case BaseRoleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?aspectualacmev0.2?BaseRole", AspectualacmeElementTypes.BaseRole_3001); //$NON-NLS-1$
		case RepresentationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?aspectualacmev0.2?Representation", AspectualacmeElementTypes.Representation_3010); //$NON-NLS-1$
		case WildCardEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?aspectualacmev0.2?WildCard", AspectualacmeElementTypes.WildCard_2003); //$NON-NLS-1$
		case GlueEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?aspectualacmev0.2?Glue", AspectualacmeElementTypes.Glue_3004); //$NON-NLS-1$
		case AttachmentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?aspectualacmev0.2?Attachment", AspectualacmeElementTypes.Attachment_4003); //$NON-NLS-1$
		case Attachment6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?aspectualacmev0.2?Attachment", AspectualacmeElementTypes.Attachment_4002); //$NON-NLS-1$
		case RoleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?aspectualacmev0.2?Role", AspectualacmeElementTypes.Role_3011); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = AspectualacmeDiagramEditorPlugin
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
		case Attachment5EditPart.VISUAL_ID:
			return getAttachment_4001Text(view);
		case PortEditPart.VISUAL_ID:
			return getPort_3005Text(view);
		case SystemEditPart.VISUAL_ID:
			return getSystem_1000Text(view);
		case Attachment3EditPart.VISUAL_ID:
			return getAttachment_4005Text(view);
		case Attachment2EditPart.VISUAL_ID:
			return getAttachment_4004Text(view);
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_2001Text(view);
		case CrosscuttingRoleEditPart.VISUAL_ID:
			return getCrosscuttingRole_3002Text(view);
		case Attachment4EditPart.VISUAL_ID:
			return getAttachment_4006Text(view);
		case ComponentEditPart.VISUAL_ID:
			return getComponent_2002Text(view);
		case BaseRoleEditPart.VISUAL_ID:
			return getBaseRole_3001Text(view);
		case RepresentationEditPart.VISUAL_ID:
			return getRepresentation_3010Text(view);
		case WildCardEditPart.VISUAL_ID:
			return getWildCard_2003Text(view);
		case GlueEditPart.VISUAL_ID:
			return getGlue_3004Text(view);
		case AttachmentEditPart.VISUAL_ID:
			return getAttachment_4003Text(view);
		case Attachment6EditPart.VISUAL_ID:
			return getAttachment_4002Text(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_3011Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getAttachment_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getWildCard_2003Text(View view) {
		IParser parser = AspectualacmeParserProvider.getParser(
				AspectualacmeElementTypes.WildCard_2003,
				view.getElement() != null ? view.getElement() : view,
				AspectualacmeVisualIDRegistry
						.getType(WildCardNameExpressionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AspectualacmeDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBaseRole_3001Text(View view) {
		BaseRole domainModelElement = (BaseRole) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			AspectualacmeDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttachment_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRole_3011Text(View view) {
		Role domainModelElement = (Role) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			AspectualacmeDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCrosscuttingRole_3002Text(View view) {
		CrosscuttingRole domainModelElement = (CrosscuttingRole) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			AspectualacmeDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttachment_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnector_2001Text(View view) {
		IParser parser = AspectualacmeParserProvider.getParser(
				AspectualacmeElementTypes.Connector_2001,
				view.getElement() != null ? view.getElement() : view,
				AspectualacmeVisualIDRegistry
						.getType(ConnectorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AspectualacmeDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSystem_1000Text(View view) {
		System domainModelElement = (System) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			AspectualacmeDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepresentation_3010Text(View view) {
		Representation domainModelElement = (Representation) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			AspectualacmeDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGlue_3004Text(View view) {
		IParser parser = AspectualacmeParserProvider.getParser(
				AspectualacmeElementTypes.Glue_3004,
				view.getElement() != null ? view.getElement() : view,
				AspectualacmeVisualIDRegistry.getType(GlueEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AspectualacmeDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPort_3005Text(View view) {
		Port domainModelElement = (Port) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			AspectualacmeDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttachment_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAttachment_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAttachment_4006Text(View view) {
		return ""; //$NON-NLS-1$
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
			AspectualacmeDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
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
		return SystemEditPart.MODEL_ID.equals(AspectualacmeVisualIDRegistry
				.getModelID(view));
	}

}
