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

import aspectualacme.diagram.edit.policies.Attachment3ItemSemanticEditPolicy;

/**
 * @generated
 */
public class Attachment3EditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4005;

	/**
	 * @generated
	 */
	public Attachment3EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Attachment3ItemSemanticEditPolicy());
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
		return new RegularAttachmentFigure();
	}

	/**
	 * @generated
	 */
	public RegularAttachmentFigure getPrimaryShape() {
		return (RegularAttachmentFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class RegularAttachmentFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public RegularAttachmentFigure() {
			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.black);

			setSourceDecoration(createSourceDecoration());
		}

		/**
		 * @generated NOT
		 */
		private RotatableDecoration createSourceDecoration() {
			PolygonDecoration df = new PolygonDecoration();
			df.setLineWidth(2);
			df.setForegroundColor(ColorConstants.black);
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(1), getMapMode().DPtoLP(4));
			pl.addPoint(getMapMode().DPtoLP(3), getMapMode().DPtoLP(6));
			pl.addPoint(getMapMode().DPtoLP(1), getMapMode().DPtoLP(4));
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(1), getMapMode().DPtoLP(-4));
			pl.addPoint(getMapMode().DPtoLP(3), getMapMode().DPtoLP(-6));
			pl.addPoint(getMapMode().DPtoLP(1), getMapMode().DPtoLP(-4));
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(3), getMapMode().DPtoLP(2));
			return df;
		}

	}

}
