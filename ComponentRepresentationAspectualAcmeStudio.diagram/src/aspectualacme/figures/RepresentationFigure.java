package aspectualacme.figures;

import org.eclipse.draw2d.ImageFigure;

import componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin;

public class RepresentationFigure extends ImageFigure {

	public RepresentationFigure() { 
		super(componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin.imageDescriptorFromPlugin(ComponentRepresentationAspectualacmeDiagramEditorPlugin.ID,
				"/images/representation.png").createImage(), 0);
	}
}