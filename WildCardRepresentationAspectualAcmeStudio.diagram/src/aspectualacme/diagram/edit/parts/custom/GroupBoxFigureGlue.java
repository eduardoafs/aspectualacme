package aspectualacme.diagram.edit.parts.custom;

import org.eclipse.draw2d.AbstractLabeledBorder;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Insets;

public class GroupBoxFigureGlue extends AbstractLabeledBorder {

	public GroupBoxFigureGlue() {
	}

	
	public GroupBoxFigureGlue(String s) {
		super(s);
	}
	@Override
	public void paint(IFigure figure, Graphics graphics, Insets insets) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Insets calculateInsets(IFigure figure) {
		int height = getTextExtents(figure).height;
		return new Insets(height);
	}

}
