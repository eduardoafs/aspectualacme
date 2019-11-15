package aspectualacme.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import aspectualacme.diagram.edit.policies.PortItemSemanticEditPolicy;
import aspectualacme.diagram.providers.AspectualacmeElementTypes;

/**
 * @generated
 */
public class PortEditPart extends AbstractBorderItemEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3005;

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
	public PortEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				getPrimaryDragEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PortItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
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
		return primaryShape = new PortFigure();
	}

	/**
	 * @generated
	 */
	public PortFigure getPrimaryShape() {
		return (PortFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(15, 15);

		//FIXME: workaround for #154536
		result.getBounds().setSize(result.getPreferredSize());
		return result;
	}

	/**
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		EditPolicy result = super.getPrimaryDragEditPolicy();
		if (result instanceof ResizableEditPolicy) {
			ResizableEditPolicy ep = (ResizableEditPolicy) result;
			ep.setResizeDirections(PositionConstants.NONE);
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
		if (targetEditPart instanceof WildCardEditPart) {
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
		if (targetEditPart instanceof aspectualacme.diagram.edit.parts.PortEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4001);
		}
		if (targetEditPart instanceof WildCardEditPart) {
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
		if (targetEditPart instanceof aspectualacme.diagram.edit.parts.PortEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4002);
		}
		if (targetEditPart instanceof WildCardEditPart) {
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
		if (targetEditPart instanceof aspectualacme.diagram.edit.parts.PortEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4003);
		}
		if (targetEditPart instanceof WildCardEditPart) {
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
		if (targetEditPart instanceof aspectualacme.diagram.edit.parts.PortEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4004);
		}
		if (targetEditPart instanceof WildCardEditPart) {
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
		if (targetEditPart instanceof aspectualacme.diagram.edit.parts.PortEditPart) {
			types.add(AspectualacmeElementTypes.Attachment_4005);
		}
		if (targetEditPart instanceof WildCardEditPart) {
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
		if (targetEditPart instanceof aspectualacme.diagram.edit.parts.PortEditPart) {
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
	public class PortFigure extends Ellipse {

		/**
		 * @generated
		 */
		public PortFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(true);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(0);
			layoutThis.setMinorSpacing(0);
			layoutThis.setHorizontal(false);

			this.setLayoutManager(layoutThis);

			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.black);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(15),
					getMapMode().DPtoLP(15)));
			this.setMaximumSize(new Dimension(getMapMode().DPtoLP(15),
					getMapMode().DPtoLP(15)));
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(15),
					getMapMode().DPtoLP(15)));
		}

	}

}
