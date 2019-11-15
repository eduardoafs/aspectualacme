package aspectualacme.diagram.representation.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import aspectualacme.diagram.representation.providers.AspectualacmeElementTypes;

/**
 * @generated
 */
public class AspectualacmePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createAspectualacme1Group());
	}

	/**
	 * Creates "aspectualacme" palette tool group
	 * @generated
	 */
	private PaletteContainer createAspectualacme1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Aspectualacme1Group_title);
		paletteContainer.setId("createAspectualacme1Group"); //$NON-NLS-1$
		paletteContainer.add(createSystem1CreationTool());
		paletteContainer.add(createRole2CreationTool());
		paletteContainer.add(createPort3CreationTool());
		paletteContainer.add(createComponent4CreationTool());
		paletteContainer.add(createConnector5CreationTool());
		paletteContainer.add(createAttachment6CreationTool());
		paletteContainer.add(createProperty7CreationTool());
		paletteContainer.add(createGlue8CreationTool());
		paletteContainer.add(createRepresentation9CreationTool());
		paletteContainer.add(createBinding10CreationTool());
		paletteContainer.add(createWildCard11CreationTool());
		paletteContainer.add(createBaseRole12CreationTool());
		paletteContainer.add(createCrosscuttingRole13CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSystem1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.System1CreationTool_title,
				Messages.System1CreationTool_desc,
				Collections
						.singletonList(AspectualacmeElementTypes.System_2001));
		entry.setId("createSystem1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AspectualacmeElementTypes
				.getImageDescriptor(AspectualacmeElementTypes.System_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRole2CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Role2CreationTool_title,
				Messages.Role2CreationTool_desc, null, null) {
		};
		entry.setId("createRole2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPort3CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Port3CreationTool_title,
				Messages.Port3CreationTool_desc, null, null) {
		};
		entry.setId("createPort3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponent4CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Component4CreationTool_title,
				Messages.Component4CreationTool_desc, null, null) {
		};
		entry.setId("createComponent4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnector5CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Connector5CreationTool_title,
				Messages.Connector5CreationTool_desc, null, null) {
		};
		entry.setId("createConnector5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttachment6CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Attachment6CreationTool_title,
				Messages.Attachment6CreationTool_desc, null, null) {
		};
		entry.setId("createAttachment6CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProperty7CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Property7CreationTool_title,
				Messages.Property7CreationTool_desc, null, null) {
		};
		entry.setId("createProperty7CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGlue8CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Glue8CreationTool_title,
				Messages.Glue8CreationTool_desc, null, null) {
		};
		entry.setId("createGlue8CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRepresentation9CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.Representation9CreationTool_title,
				Messages.Representation9CreationTool_desc, null, null) {
		};
		entry.setId("createRepresentation9CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBinding10CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Binding10CreationTool_title,
				Messages.Binding10CreationTool_desc, null, null) {
		};
		entry.setId("createBinding10CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWildCard11CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.WildCard11CreationTool_title,
				Messages.WildCard11CreationTool_desc, null, null) {
		};
		entry.setId("createWildCard11CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBaseRole12CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.BaseRole12CreationTool_title,
				Messages.BaseRole12CreationTool_desc, null, null) {
		};
		entry.setId("createBaseRole12CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCrosscuttingRole13CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.CrosscuttingRole13CreationTool_title,
				Messages.CrosscuttingRole13CreationTool_desc, null, null) {
		};
		entry.setId("createCrosscuttingRole13CreationTool"); //$NON-NLS-1$
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
}
