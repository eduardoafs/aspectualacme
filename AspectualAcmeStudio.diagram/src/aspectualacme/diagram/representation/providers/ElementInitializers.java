package aspectualacme.diagram.representation.providers;

import aspectualacme.diagram.representation.part.AspectualacmeDiagramEditorPlugin;

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
		ElementInitializers cached = AspectualacmeDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			AspectualacmeDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
