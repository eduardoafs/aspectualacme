package componentRepresentationaspectualacme.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class AspectualacmePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createAspectualACMESystem1Group());
	}

	/**
	 * Creates "AspectualACME System" palette tool group
	 * @generated
	 */
	private PaletteContainer createAspectualACMESystem1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				componentRepresentationaspectualacme.diagram.part.Messages.AspectualACMESystem1Group_title);
		paletteContainer.setId("createAspectualACMESystem1Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(componentRepresentationaspectualacme.diagram.part.Messages.AspectualACMESystem1Group_desc);
		paletteContainer.add(createComponent1CreationTool());
		paletteContainer.add(createConnector2CreationTool());
		paletteContainer.add(createPort3CreationTool());
		paletteContainer.add(createRole4CreationTool());
		paletteContainer.add(createBaseRole5CreationTool());
		paletteContainer.add(createCrosscuttingRole6CreationTool());
		paletteContainer.add(createGlue7CreationTool());
		paletteContainer.add(createWildCard8CreationTool());
		paletteContainer.add(createAttachment9CreationTool());
		paletteContainer.add(createProperty10CreationTool());
		paletteContainer.add(createRepresentation11CreationTool());
		paletteContainer.add(createBinding12CreationTool());
		paletteContainer.add(createSystem13CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponent1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				componentRepresentationaspectualacme.diagram.part.Messages.Component1CreationTool_title,
				componentRepresentationaspectualacme.diagram.part.Messages.Component1CreationTool_desc,
				Collections
						.singletonList(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Component_3001));
		entry.setId("createComponent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes
				.getImageDescriptor(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Component_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnector2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				componentRepresentationaspectualacme.diagram.part.Messages.Connector2CreationTool_title,
				componentRepresentationaspectualacme.diagram.part.Messages.Connector2CreationTool_desc,
				Collections
						.singletonList(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Connector_3004));
		entry.setId("createConnector2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes
				.getImageDescriptor(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Connector_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPort3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				componentRepresentationaspectualacme.diagram.part.Messages.Port3CreationTool_title,
				componentRepresentationaspectualacme.diagram.part.Messages.Port3CreationTool_desc,
				Collections
						.singletonList(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Port_3002));
		entry.setId("createPort3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes
				.getImageDescriptor(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Port_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRole4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				componentRepresentationaspectualacme.diagram.part.Messages.Role4CreationTool_title,
				componentRepresentationaspectualacme.diagram.part.Messages.Role4CreationTool_desc,
				Collections
						.singletonList(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Role_3008));
		entry.setId("createRole4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes
				.getImageDescriptor(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Role_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBaseRole5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				componentRepresentationaspectualacme.diagram.part.Messages.BaseRole5CreationTool_title,
				componentRepresentationaspectualacme.diagram.part.Messages.BaseRole5CreationTool_desc,
				Collections
						.singletonList(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.BaseRole_3005));
		entry.setId("createBaseRole5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes
				.getImageDescriptor(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.BaseRole_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCrosscuttingRole6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				componentRepresentationaspectualacme.diagram.part.Messages.CrosscuttingRole6CreationTool_title,
				componentRepresentationaspectualacme.diagram.part.Messages.CrosscuttingRole6CreationTool_desc,
				Collections
						.singletonList(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.CrosscuttingRole_3006));
		entry.setId("createCrosscuttingRole6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes
				.getImageDescriptor(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.CrosscuttingRole_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGlue7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				componentRepresentationaspectualacme.diagram.part.Messages.Glue7CreationTool_title,
				componentRepresentationaspectualacme.diagram.part.Messages.Glue7CreationTool_desc,
				Collections
						.singletonList(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Glue_3007));
		entry.setId("createGlue7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes
				.getImageDescriptor(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Glue_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWildCard8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				componentRepresentationaspectualacme.diagram.part.Messages.WildCard8CreationTool_title,
				componentRepresentationaspectualacme.diagram.part.Messages.WildCard8CreationTool_desc,
				Collections
						.singletonList(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.WildCard_3009));
		entry.setId("createWildCard8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes
				.getImageDescriptor(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.WildCard_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttachment9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4001);
		types.add(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4002);
		types.add(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4003);
		types.add(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4004);
		types.add(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4005);
		types.add(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4006);
		LinkToolEntry entry = new LinkToolEntry(
				componentRepresentationaspectualacme.diagram.part.Messages.Attachment9CreationTool_title,
				componentRepresentationaspectualacme.diagram.part.Messages.Attachment9CreationTool_desc,
				types);
		entry.setId("createAttachment9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes
				.getImageDescriptor(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProperty10CreationTool() {
		ToolEntry entry = new ToolEntry(
				componentRepresentationaspectualacme.diagram.part.Messages.Property10CreationTool_title,
				componentRepresentationaspectualacme.diagram.part.Messages.Property10CreationTool_desc,
				null, null) {
		};
		entry.setId("createProperty10CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRepresentation11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				componentRepresentationaspectualacme.diagram.part.Messages.Representation11CreationTool_title,
				componentRepresentationaspectualacme.diagram.part.Messages.Representation11CreationTool_desc,
				Collections
						.singletonList(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Representation_3003));
		entry.setId("createRepresentation11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes
				.getImageDescriptor(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Representation_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBinding12CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				componentRepresentationaspectualacme.diagram.part.Messages.Binding12CreationTool_title,
				componentRepresentationaspectualacme.diagram.part.Messages.Binding12CreationTool_desc,
				Collections
						.singletonList(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Binding_4007));
		entry.setId("createBinding12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes
				.getImageDescriptor(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Binding_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSystem13CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				componentRepresentationaspectualacme.diagram.part.Messages.System13CreationTool_title,
				componentRepresentationaspectualacme.diagram.part.Messages.System13CreationTool_desc,
				Collections
						.singletonList(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.System_2001));
		entry.setId("createSystem13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes
				.getImageDescriptor(componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.System_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
