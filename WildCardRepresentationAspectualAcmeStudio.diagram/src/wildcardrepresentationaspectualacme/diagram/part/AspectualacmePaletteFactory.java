package wildcardrepresentationaspectualacme.diagram.part;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;

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
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponent1CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Component1CreationTool_title,
				Messages.Component1CreationTool_desc, null, null) {
		};
		entry.setId("createComponent1CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnector2CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Connector2CreationTool_title,
				Messages.Connector2CreationTool_desc, null, null) {
		};
		entry.setId("createConnector2CreationTool"); //$NON-NLS-1$
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
	private ToolEntry createRole4CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Role4CreationTool_title,
				Messages.Role4CreationTool_desc, null, null) {
		};
		entry.setId("createRole4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBaseRole5CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.BaseRole5CreationTool_title,
				Messages.BaseRole5CreationTool_desc, null, null) {
		};
		entry.setId("createBaseRole5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCrosscuttingRole6CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.CrosscuttingRole6CreationTool_title,
				Messages.CrosscuttingRole6CreationTool_desc, null, null) {
		};
		entry.setId("createCrosscuttingRole6CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGlue7CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Glue7CreationTool_title,
				Messages.Glue7CreationTool_desc, null, null) {
		};
		entry.setId("createGlue7CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWildCard8CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.WildCard8CreationTool_title,
				Messages.WildCard8CreationTool_desc, null, null) {
		};
		entry.setId("createWildCard8CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttachment9CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Attachment9CreationTool_title,
				Messages.Attachment9CreationTool_desc, null, null) {
		};
		entry.setId("createAttachment9CreationTool"); //$NON-NLS-1$
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
		ToolEntry entry = new ToolEntry(
				Messages.Representation11CreationTool_title,
				Messages.Representation11CreationTool_desc, null, null) {
		};
		entry.setId("createRepresentation11CreationTool"); //$NON-NLS-1$
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

}
