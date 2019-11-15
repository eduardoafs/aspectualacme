package aspectualacme.figures;

import org.eclipse.draw2d.ImageFigure;

import aspectualacme.diagram.part.AspectualacmeDiagramEditorPlugin;

public class RepresentationFigure extends ImageFigure {

	public RepresentationFigure() { 
		super(aspectualacme.diagram.part.AspectualacmeDiagramEditorPlugin.imageDescriptorFromPlugin(AspectualacmeDiagramEditorPlugin.ID,
				"/images/representation1.png").createImage(), 0);
	}
}