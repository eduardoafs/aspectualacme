package aspectualacme.figures;

import org.eclipse.draw2d.ImageFigure;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import wildcardrepresentationaspectualacme.diagram.part.WildCardRepresentationAspectualacmeDiagramEditorPlugin;

public class RepresentationFigure extends ImageFigure {

	public RepresentationFigure() { 
		super(AbstractUIPlugin.imageDescriptorFromPlugin(WildCardRepresentationAspectualacmeDiagramEditorPlugin.ID,
				"/images/representation.png").createImage(), 0);
	}
}