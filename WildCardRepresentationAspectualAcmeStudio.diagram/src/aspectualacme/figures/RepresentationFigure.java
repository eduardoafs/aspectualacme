package aspectualacme.figures;

import org.eclipse.draw2d.ImageFigure;

import wildcardrepresentationaspectualacme.diagram.part.WildCardRepresentationAspectualacmeDiagramEditorPlugin;

public class RepresentationFigure extends ImageFigure {

	public RepresentationFigure() { 
		super(wildcardrepresentationaspectualacme.diagram.part.WildCardRepresentationAspectualacmeDiagramEditorPlugin.imageDescriptorFromPlugin(WildCardRepresentationAspectualacmeDiagramEditorPlugin.ID,
				"/images/representation.png").createImage(), 0);
	}
}