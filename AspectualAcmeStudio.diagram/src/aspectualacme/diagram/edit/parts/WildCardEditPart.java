package aspectualacme.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import aspectualacme.custom.layout.ScaleInnerFigureLayout;
import aspectualacme.diagram.edit.policies.OpenDiagramEditPolicy;
import aspectualacme.diagram.edit.policies.WildCardItemSemanticEditPolicy;
import aspectualacme.diagram.part.AspectualacmeVisualIDRegistry;
import aspectualacme.diagram.providers.AspectualacmeElementTypes;
import aspectualacme.figures.StarFigure;

/**
 * @generated
 */
public class WildCardEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2003;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public WildCardEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new WildCardItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new OpenDiagramEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new WildCardFigure();
	}

	/**
	 * @generated
	 */
	public WildCardFigure getPrimaryShape() {
		return (WildCardFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WildCardNameExpressionEditPart) {
			((WildCardNameExpressionEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureWildCardName());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WildCardNameExpressionEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		EditPolicy result = super.getPrimaryDragEditPolicy();
		if (result instanceof ResizableEditPolicy) {
			ResizableEditPolicy ep = (ResizableEditPolicy) result;
			ep.setResizeDirections(PositionConstants.WEST
					| PositionConstants.EAST);
		}
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(AspectualacmeVisualIDRegistry
				.getType(WildCardNameExpressionEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(AspectualacmeElementTypes.Attachment_4001);
		types.add(AspectualacmeElementTypes.Attachment_4002);
		types.add(AspectualacmeElementTypes.Attachment_4003);
		types.add(AspectualacmeElementTypes.Attachment_4004);
		types.add(AspectualacmeElementTypes.Attachment_4005);
		types.add(AspectualacmeElementTypes.Attachment_4006);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof aspectualacme.diagram.edit.parts.WildCardEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4001);
		}
		if (targetEditPart instanceof BaseRoleEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4001);
		}
		if (targetEditPart instanceof CrosscuttingRoleEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4001);
		}
		if (targetEditPart instanceof RoleEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4001);
		}
		if (targetEditPart instanceof PortEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4001);
		}
		if (targetEditPart instanceof aspectualacme.diagram.edit.parts.WildCardEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4002);
		}
		if (targetEditPart instanceof BaseRoleEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4002);
		}
		if (targetEditPart instanceof CrosscuttingRoleEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4002);
		}
		if (targetEditPart instanceof RoleEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4002);
		}
		if (targetEditPart instanceof PortEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4002);
		}
		if (targetEditPart instanceof aspectualacme.diagram.edit.parts.WildCardEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4003);
		}
		if (targetEditPart instanceof BaseRoleEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4003);
		}
		if (targetEditPart instanceof CrosscuttingRoleEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4003);
		}
		if (targetEditPart instanceof RoleEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4003);
		}
		if (targetEditPart instanceof PortEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4003);
		}
		if (targetEditPart instanceof aspectualacme.diagram.edit.parts.WildCardEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4004);
		}
		if (targetEditPart instanceof BaseRoleEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4004);
		}
		if (targetEditPart instanceof CrosscuttingRoleEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4004);
		}
		if (targetEditPart instanceof RoleEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4004);
		}
		if (targetEditPart instanceof PortEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4004);
		}
		if (targetEditPart instanceof aspectualacme.diagram.edit.parts.WildCardEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4005);
		}
		if (targetEditPart instanceof BaseRoleEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4005);
		}
		if (targetEditPart instanceof CrosscuttingRoleEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4005);
		}
		if (targetEditPart instanceof RoleEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4005);
		}
		if (targetEditPart instanceof PortEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4005);
		}
		if (targetEditPart instanceof aspectualacme.diagram.edit.parts.WildCardEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4006);
		}
		if (targetEditPart instanceof BaseRoleEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4006);
		}
		if (targetEditPart instanceof CrosscuttingRoleEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4006);
		}
		if (targetEditPart instanceof RoleEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4006);
		}
		if (targetEditPart instanceof PortEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4006);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == AspectualacmeElementTypes.Attachment_4001) {
			types.add(AspectualacmeElementTypes.WildCard_2003);
			types.add(AspectualacmeElementTypes.BaseRole_3001);
			types.add(AspectualacmeElementTypes.CrosscuttingRole_3002);
			types.add(AspectualacmeElementTypes.Role_3011);
			types.add(AspectualacmeElementTypes.Port_3005);
		} else if (relationshipType == AspectualacmeElementTypes.Attachment_4002) {
			types.add(AspectualacmeElementTypes.WildCard_2003);
			types.add(AspectualacmeElementTypes.BaseRole_3001);
			types.add(AspectualacmeElementTypes.CrosscuttingRole_3002);
			types.add(AspectualacmeElementTypes.Role_3011);
			types.add(AspectualacmeElementTypes.Port_3005);
		} else if (relationshipType == AspectualacmeElementTypes.Attachment_4003) {
			types.add(AspectualacmeElementTypes.WildCard_2003);
			types.add(AspectualacmeElementTypes.BaseRole_3001);
			types.add(AspectualacmeElementTypes.CrosscuttingRole_3002);
			types.add(AspectualacmeElementTypes.Role_3011);
			types.add(AspectualacmeElementTypes.Port_3005);
		} else if (relationshipType == AspectualacmeElementTypes.Attachment_4004) {
			types.add(AspectualacmeElementTypes.WildCard_2003);
			types.add(AspectualacmeElementTypes.BaseRole_3001);
			types.add(AspectualacmeElementTypes.CrosscuttingRole_3002);
			types.add(AspectualacmeElementTypes.Role_3011);
			types.add(AspectualacmeElementTypes.Port_3005);
		} else if (relationshipType == AspectualacmeElementTypes.Attachment_4005) {
			types.add(AspectualacmeElementTypes.WildCard_2003);
			types.add(AspectualacmeElementTypes.BaseRole_3001);
			types.add(AspectualacmeElementTypes.CrosscuttingRole_3002);
			types.add(AspectualacmeElementTypes.Role_3011);
			types.add(AspectualacmeElementTypes.Port_3005);
		} else if (relationshipType == AspectualacmeElementTypes.Attachment_4006) {
			types.add(AspectualacmeElementTypes.WildCard_2003);
			types.add(AspectualacmeElementTypes.BaseRole_3001);
			types.add(AspectualacmeElementTypes.CrosscuttingRole_3002);
			types.add(AspectualacmeElementTypes.Role_3011);
			types.add(AspectualacmeElementTypes.Port_3005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(6);
		types.add(AspectualacmeElementTypes.Attachment_4001);
		types.add(AspectualacmeElementTypes.Attachment_4002);
		types.add(AspectualacmeElementTypes.Attachment_4003);
		types.add(AspectualacmeElementTypes.Attachment_4004);
		types.add(AspectualacmeElementTypes.Attachment_4005);
		types.add(AspectualacmeElementTypes.Attachment_4006);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == AspectualacmeElementTypes.Attachment_4001) {
			types.add(AspectualacmeElementTypes.WildCard_2003);
			types.add(AspectualacmeElementTypes.BaseRole_3001);
			types.add(AspectualacmeElementTypes.CrosscuttingRole_3002);
			types.add(AspectualacmeElementTypes.Role_3011);
			types.add(AspectualacmeElementTypes.Port_3005);
		} else if (relationshipType == AspectualacmeElementTypes.Attachment_4002) {
			types.add(AspectualacmeElementTypes.WildCard_2003);
			types.add(AspectualacmeElementTypes.BaseRole_3001);
			types.add(AspectualacmeElementTypes.CrosscuttingRole_3002);
			types.add(AspectualacmeElementTypes.Role_3011);
			types.add(AspectualacmeElementTypes.Port_3005);
		} else if (relationshipType == AspectualacmeElementTypes.Attachment_4003) {
			types.add(AspectualacmeElementTypes.WildCard_2003);
			types.add(AspectualacmeElementTypes.BaseRole_3001);
			types.add(AspectualacmeElementTypes.CrosscuttingRole_3002);
			types.add(AspectualacmeElementTypes.Role_3011);
			types.add(AspectualacmeElementTypes.Port_3005);
		} else if (relationshipType == AspectualacmeElementTypes.Attachment_4004) {
			types.add(AspectualacmeElementTypes.WildCard_2003);
			types.add(AspectualacmeElementTypes.BaseRole_3001);
			types.add(AspectualacmeElementTypes.CrosscuttingRole_3002);
			types.add(AspectualacmeElementTypes.Role_3011);
			types.add(AspectualacmeElementTypes.Port_3005);
		} else if (relationshipType == AspectualacmeElementTypes.Attachment_4005) {
			types.add(AspectualacmeElementTypes.WildCard_2003);
			types.add(AspectualacmeElementTypes.BaseRole_3001);
			types.add(AspectualacmeElementTypes.CrosscuttingRole_3002);
			types.add(AspectualacmeElementTypes.Role_3011);
			types.add(AspectualacmeElementTypes.Port_3005);
		} else if (relationshipType == AspectualacmeElementTypes.Attachment_4006) {
			types.add(AspectualacmeElementTypes.WildCard_2003);
			types.add(AspectualacmeElementTypes.BaseRole_3001);
			types.add(AspectualacmeElementTypes.CrosscuttingRole_3002);
			types.add(AspectualacmeElementTypes.Role_3011);
			types.add(AspectualacmeElementTypes.Port_3005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class WildCardFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureWildCardName;

		/**
		 * @generated
		 */
		public WildCardFigure() {

			ScaleInnerFigureLayout layoutThis = new ScaleInnerFigureLayout();

			this.setLayoutManager(layoutThis);

			this.setLineWidth(0);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			StarFigure wildCard0 = new StarFigure();

			this.add(wildCard0);

			fFigureWildCardName = new WrappingLabel();
			fFigureWildCardName.setText("......");

			this.add(fFigureWildCardName);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWildCardName() {
			return fFigureWildCardName;
		}

	}

}
