package aspectualacme.figures;

import org.eclipse.draw2d.ImageFigure;

import componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin;

public class SystemFigure extends ImageFigure {

	public SystemFigure() {
		super(
				componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
						.imageDescriptorFromPlugin(
								ComponentRepresentationAspectualacmeDiagramEditorPlugin.ID,

								"/images/system.png").createImage(), 0);
	}
}
