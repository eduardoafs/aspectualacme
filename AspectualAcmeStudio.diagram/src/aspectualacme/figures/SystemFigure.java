package aspectualacme.figures;

import org.eclipse.draw2d.ImageFigure;

import aspectualacme.diagram.part.AspectualacmeDiagramEditorPlugin;

public class SystemFigure extends ImageFigure {

	public SystemFigure() {
		super(aspectualacme.diagram.part.AspectualacmeDiagramEditorPlugin
				.imageDescriptorFromPlugin(AspectualacmeDiagramEditorPlugin.ID,
						"/images/system.png").createImage(), 0);
	}
}
