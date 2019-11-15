package componentRepresentationaspectualacme.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		componentRepresentationaspectualacme.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		componentRepresentationaspectualacme.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		componentRepresentationaspectualacme.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		componentRepresentationaspectualacme.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		componentRepresentationaspectualacme.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
