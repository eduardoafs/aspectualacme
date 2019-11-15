package aspectualacme.figures;

import org.eclipse.draw2d.ImageFigure;

import aspectualacme.diagram.part.AspectualacmeDiagramEditorPlugin;

public class SemiCircleFigure extends ImageFigure {
	 public SemiCircleFigure() {
		super(aspectualacme.diagram.part.AspectualacmeDiagramEditorPlugin
				.imageDescriptorFromPlugin(AspectualacmeDiagramEditorPlugin.ID,
						"/images/crescentmoon1.png").createImage(), 0);
	}

}
