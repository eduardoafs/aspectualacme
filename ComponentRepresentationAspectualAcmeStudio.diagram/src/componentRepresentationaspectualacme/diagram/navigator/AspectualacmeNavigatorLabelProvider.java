package componentRepresentationaspectualacme.diagram.navigator;

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

/**
 * @generated
 */
public class AspectualacmeNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorItem
				&& !isOwnView(((componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup) {
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup group = (componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup) element;
			return componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorItem) {
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorItem navigatorItem = (componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorItem) element;
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
		switch (componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
				.getVisualID(view)) {
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?aspectualacmev0.2?Attachment", componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4006); //$NON-NLS-1$
		case componentRepresentationaspectualacme.diagram.edit.parts.ConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?aspectualacmev0.2?Connector", componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Connector_3004); //$NON-NLS-1$
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?aspectualacmev0.2?Attachment", componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4005); //$NON-NLS-1$
		case componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?aspectualacmev0.2?WildCard", componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.WildCard_3009); //$NON-NLS-1$
		case componentRepresentationaspectualacme.diagram.edit.parts.RepresentationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?aspectualacmev0.2?Representation", componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Representation_3003); //$NON-NLS-1$
		case componentRepresentationaspectualacme.diagram.edit.parts.GlueEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?aspectualacmev0.2?Glue", componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Glue_3008); //$NON-NLS-1$
		case componentRepresentationaspectualacme.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?aspectualacmev0.2?System", componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.System_2009); //$NON-NLS-1$
		case componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?aspectualacmev0.2?Port", componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Port_3002); //$NON-NLS-1$
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?aspectualacmev0.2?Attachment", componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4004); //$NON-NLS-1$
		case componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?aspectualacmev0.2?BaseRole", componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.BaseRole_3005); //$NON-NLS-1$
		case componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?aspectualacmev0.2?Port", componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Port_3011); //$NON-NLS-1$
		case componentRepresentationaspectualacme.diagram.edit.parts.BindingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?aspectualacmev0.2?Binding", componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Binding_4007); //$NON-NLS-1$
		case componentRepresentationaspectualacme.diagram.edit.parts.FreeformLayerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?aspectualacmev0.2?Representation", componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Representation_1000); //$NON-NLS-1$
		case componentRepresentationaspectualacme.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?aspectualacmev0.2?Component", componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Component_3001); //$NON-NLS-1$
		case componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?aspectualacmev0.2?Attachment", componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4001); //$NON-NLS-1$
		case componentRepresentationaspectualacme.diagram.edit.parts.Component2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?aspectualacmev0.2?Component", componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Component_2010); //$NON-NLS-1$
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?aspectualacmev0.2?Attachment", componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4002); //$NON-NLS-1$
		case componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?aspectualacmev0.2?CrosscuttingRole", componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.CrosscuttingRole_3006); //$NON-NLS-1$
		case componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?aspectualacmev0.2?Role", componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Role_3012); //$NON-NLS-1$
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?aspectualacmev0.2?Attachment", componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes
						.isKnownElementType(elementType)) {
			image = componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes
					.getImage(elementType);
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
		if (element instanceof componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup) {
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup group = (componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorItem) {
			componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorItem navigatorItem = (componentRepresentationaspectualacme.diagram.navigator.AspectualacmeNavigatorItem) element;
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
		switch (componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
				.getVisualID(view)) {
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID:
			return getAttachment_4006Text(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.ConnectorEditPart.VISUAL_ID:
			return getConnector_3004Text(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID:
			return getAttachment_4005Text(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart.VISUAL_ID:
			return getWildCard_3009Text(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.RepresentationEditPart.VISUAL_ID:
			return getRepresentation_3003Text(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.GlueEditPart.VISUAL_ID:
			return getGlue_3008Text(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return getSystem_2009Text(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return getPort_3002Text(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID:
			return getAttachment_4004Text(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart.VISUAL_ID:
			return getBaseRole_3005Text(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart.VISUAL_ID:
			return getPort_3011Text(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.BindingEditPart.VISUAL_ID:
			return getBinding_4007Text(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.FreeformLayerEditPart.VISUAL_ID:
			return getRepresentation_1000Text(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getComponent_3001Text(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID:
			return getAttachment_4001Text(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Component2EditPart.VISUAL_ID:
			return getComponent_2010Text(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID:
			return getAttachment_4002Text(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart.VISUAL_ID:
			return getCrosscuttingRole_3006Text(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_3012Text(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID:
			return getAttachment_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getPort_3011Text(View view) {
		Port domainModelElement = (Port) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRole_3012Text(View view) {
		Role domainModelElement = (Role) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRepresentation_1000Text(View view) {
		Representation domainModelElement = (Representation) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
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
	private String getAttachment_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getBinding_4007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSystem_2009Text(View view) {
		IParser parser = componentRepresentationaspectualacme.diagram.providers.AspectualacmeParserProvider
				.getParser(
						componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.System_2009,
						view.getElement() != null ? view.getElement() : view,
						componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
								.getType(componentRepresentationaspectualacme.diagram.edit.parts.SystemNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComponent_3001Text(View view) {
		IParser parser = componentRepresentationaspectualacme.diagram.providers.AspectualacmeParserProvider
				.getParser(
						componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Component_3001,
						view.getElement() != null ? view.getElement() : view,
						componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
								.getType(componentRepresentationaspectualacme.diagram.edit.parts.ComponentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPort_3002Text(View view) {
		Port domainModelElement = (Port) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getAttachment_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRepresentation_3003Text(View view) {
		Representation domainModelElement = (Representation) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnector_3004Text(View view) {
		IParser parser = componentRepresentationaspectualacme.diagram.providers.AspectualacmeParserProvider
				.getParser(
						componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Connector_3004,
						view.getElement() != null ? view.getElement() : view,
						componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
								.getType(componentRepresentationaspectualacme.diagram.edit.parts.ConnectorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBaseRole_3005Text(View view) {
		BaseRole domainModelElement = (BaseRole) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getCrosscuttingRole_3006Text(View view) {
		CrosscuttingRole domainModelElement = (CrosscuttingRole) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 3006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGlue_3008Text(View view) {
		IParser parser = componentRepresentationaspectualacme.diagram.providers.AspectualacmeParserProvider
				.getParser(
						componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Glue_3008,
						view.getElement() != null ? view.getElement() : view,
						componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
								.getType(componentRepresentationaspectualacme.diagram.edit.parts.GlueEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 3008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getWildCard_3009Text(View view) {
		IParser parser = componentRepresentationaspectualacme.diagram.providers.AspectualacmeParserProvider
				.getParser(
						componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.WildCard_3009,
						view.getElement() != null ? view.getElement() : view,
						componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
								.getType(componentRepresentationaspectualacme.diagram.edit.parts.WildCardNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComponent_2010Text(View view) {
		IParser parser = componentRepresentationaspectualacme.diagram.providers.AspectualacmeParserProvider
				.getParser(
						componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Component_2010,
						view.getElement() != null ? view.getElement() : view,
						componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
								.getType(componentRepresentationaspectualacme.diagram.edit.parts.ComponentName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5004); //$NON-NLS-1$
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
		return componentRepresentationaspectualacme.diagram.edit.parts.FreeformLayerEditPart.MODEL_ID
				.equals(componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
						.getModelID(view));
	}

}
