package aspectualacme.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import aspectualacme.diagram.edit.policies.Attachment4ItemSemanticEditPolicy;

/**
 * @generated
 */
public class Attachment4EditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4006;

	/**
	 * @generated
	 */
	public Attachment4EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Attachment4ItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new RegularAttachmentIFigure();
	}

	/**
	 * @generated
	 */
	public RegularAttachmentIFigure getPrimaryShape() {
		return (RegularAttachmentIFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class RegularAttachmentIFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public RegularAttachmentIFigure() {
			this.setLineWidth(1);
			this.setForegroundColor(ColorConstants.black);

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated NOT
		 */
		private RotatableDecoration createTargetDecoration() {
			PolygonDecoration df = new PolygonDecoration();
			df.setLineWidth(1);
			df.setForegroundColor(ColorConstants.black);
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(4));
			pl.addPoint(getMapMode().DPtoLP(1), getMapMode().DPtoLP(6));
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(4));
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(-4));
			pl.addPoint(getMapMode().DPtoLP(1), getMapMode().DPtoLP(-6));
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(-4));
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(0));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(3), getMapMode().DPtoLP(2));
			return df;
		}

	}

}
