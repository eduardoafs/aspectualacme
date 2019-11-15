package wildcardrepresentationaspectualacme.diagram.providers;

import wildcardrepresentationaspectualacme.diagram.part.WildCardRepresentationAspectualacmeDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = WildCardRepresentationAspectualacmeDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			WildCardRepresentationAspectualacmeDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
