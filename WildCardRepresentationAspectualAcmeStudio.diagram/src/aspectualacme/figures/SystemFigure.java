package aspectualacme.figures;

import org.eclipse.draw2d.ImageFigure;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import wildcardrepresentationaspectualacme.diagram.part.WildCardRepresentationAspectualacmeDiagramEditorPlugin;

public class SystemFigure extends ImageFigure {

	public SystemFigure() {
		super(
				AbstractUIPlugin
						.imageDescriptorFromPlugin(
								WildCardRepresentationAspectualacmeDiagramEditorPlugin.ID,

								"/images/system.png").createImage(), 0);
	}
}
