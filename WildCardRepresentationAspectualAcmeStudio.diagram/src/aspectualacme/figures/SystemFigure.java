package aspectualacme.figures;

import org.eclipse.draw2d.ImageFigure;

import wildcardrepresentationaspectualacme.diagram.part.WildCardRepresentationAspectualacmeDiagramEditorPlugin;

public class SystemFigure extends ImageFigure {

	public SystemFigure() {
		super(
				wildcardrepresentationaspectualacme.diagram.part.WildCardRepresentationAspectualacmeDiagramEditorPlugin
						.imageDescriptorFromPlugin(
								WildCardRepresentationAspectualacmeDiagramEditorPlugin.ID,

								"/images/system.png").createImage(), 0);
	}
}
