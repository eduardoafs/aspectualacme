package aspectualacme.diagram.part;

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

import aspectualacme.diagram.providers.AspectualacmeElementTypes;

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
				Messages.AspectualACMESystem1Group_title);
		paletteContainer.setId("createAspectualACMESystem1Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(Messages.AspectualACMESystem1Group_desc);
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
				Messages.Component1CreationTool_title,
				Messages.Component1CreationTool_desc,
				Collections
						.singletonList(AspectualacmeElementTypes.Component_2002));
		entry.setId("createComponent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AspectualacmeElementTypes
				.getImageDescriptor(AspectualacmeElementTypes.Component_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnector2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Connector2CreationTool_title,
				Messages.Connector2CreationTool_desc,
				Collections
						.singletonList(AspectualacmeElementTypes.Connector_2001));
		entry.setId("createConnector2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AspectualacmeElementTypes
				.getImageDescriptor(AspectualacmeElementTypes.Connector_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPort3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Port3CreationTool_title,
				Messages.Port3CreationTool_desc,
				Collections.singletonList(AspectualacmeElementTypes.Port_3005));
		entry.setId("createPort3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AspectualacmeElementTypes
				.getImageDescriptor(AspectualacmeElementTypes.Port_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRole4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Role4CreationTool_title,
				Messages.Role4CreationTool_desc,
				Collections.singletonList(AspectualacmeElementTypes.Role_3011));
		entry.setId("createRole4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AspectualacmeElementTypes
				.getImageDescriptor(AspectualacmeElementTypes.Role_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBaseRole5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.BaseRole5CreationTool_title,
				Messages.BaseRole5CreationTool_desc,
				Collections
						.singletonList(AspectualacmeElementTypes.BaseRole_3001));
		entry.setId("createBaseRole5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AspectualacmeElementTypes
				.getImageDescriptor(AspectualacmeElementTypes.BaseRole_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCrosscuttingRole6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CrosscuttingRole6CreationTool_title,
				Messages.CrosscuttingRole6CreationTool_desc,
				Collections
						.singletonList(AspectualacmeElementTypes.CrosscuttingRole_3002));
		entry.setId("createCrosscuttingRole6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AspectualacmeElementTypes
				.getImageDescriptor(AspectualacmeElementTypes.CrosscuttingRole_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGlue7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Glue7CreationTool_title,
				Messages.Glue7CreationTool_desc,
				Collections.singletonList(AspectualacmeElementTypes.Glue_3004));
		entry.setId("createGlue7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AspectualacmeElementTypes
				.getImageDescriptor(AspectualacmeElementTypes.Glue_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWildCard8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.WildCard8CreationTool_title,
				Messages.WildCard8CreationTool_desc,
				Collections
						.singletonList(AspectualacmeElementTypes.WildCard_2003));
		entry.setId("createWildCard8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AspectualacmeElementTypes
				.getImageDescriptor(AspectualacmeElementTypes.WildCard_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttachment9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(AspectualacmeElementTypes.Attachment_4001);
		types.add(AspectualacmeElementTypes.Attachment_4002);
		types.add(AspectualacmeElementTypes.Attachment_4003);
		types.add(AspectualacmeElementTypes.Attachment_4004);
		types.add(AspectualacmeElementTypes.Attachment_4005);
		types.add(AspectualacmeElementTypes.Attachment_4006);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Attachment9CreationTool_title,
				Messages.Attachment9CreationTool_desc, types);
		entry.setId("createAttachment9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AspectualacmeElementTypes
				.getImageDescriptor(AspectualacmeElementTypes.Attachment_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProperty10CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Property10CreationTool_title,
				Messages.Property10CreationTool_desc, null, null) {
		};
		entry.setId("createProperty10CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRepresentation11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Representation11CreationTool_title,
				Messages.Representation11CreationTool_desc,
				Collections
						.singletonList(AspectualacmeElementTypes.Representation_3010));
		entry.setId("createRepresentation11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AspectualacmeElementTypes
				.getImageDescriptor(AspectualacmeElementTypes.Representation_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBinding12CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Binding12CreationTool_title,
				Messages.Binding12CreationTool_desc, null, null) {
		};
		entry.setId("createBinding12CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSystem13CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.System13CreationTool_title,
				Messages.System13CreationTool_desc, null, null) {
		};
		entry.setId("createSystem13CreationTool"); //$NON-NLS-1$
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
