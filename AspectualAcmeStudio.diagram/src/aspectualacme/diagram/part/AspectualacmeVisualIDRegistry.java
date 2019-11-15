package aspectualacme.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import aspectualacme.AspectualacmePackage;
import aspectualacme.System;
import aspectualacme.diagram.edit.parts.Attachment2EditPart;
import aspectualacme.diagram.edit.parts.Attachment3EditPart;
import aspectualacme.diagram.edit.parts.Attachment4EditPart;
import aspectualacme.diagram.edit.parts.Attachment5EditPart;
import aspectualacme.diagram.edit.parts.Attachment6EditPart;
import aspectualacme.diagram.edit.parts.AttachmentEditPart;
import aspectualacme.diagram.edit.parts.BaseRoleEditPart;
import aspectualacme.diagram.edit.parts.ComponentEditPart;
import aspectualacme.diagram.edit.parts.ComponentNameEditPart;
import aspectualacme.diagram.edit.parts.ConnectorCompartmentGlueEditPart;
import aspectualacme.diagram.edit.parts.ConnectorEditPart;
import aspectualacme.diagram.edit.parts.ConnectorNameEditPart;
import aspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart;
import aspectualacme.diagram.edit.parts.GlueEditPart;
import aspectualacme.diagram.edit.parts.PortEditPart;
import aspectualacme.diagram.edit.parts.RepresentationEditPart;
import aspectualacme.diagram.edit.parts.RoleEditPart;
import aspectualacme.diagram.edit.parts.SystemEditPart;
import aspectualacme.diagram.edit.parts.WildCardEditPart;
import aspectualacme.diagram.edit.parts.WildCardNameEditPart;
import aspectualacme.diagram.edit.parts.WildCardNameExpressionEditPart;
import aspectualacme.impl.AttachmentImpl;
import aspectualacme.impl.BaseRoleImpl;
import aspectualacme.impl.CrosscuttingRoleImpl;
import aspectualacme.impl.PortImpl;
import aspectualacme.impl.RoleImpl;
import aspectualacme.impl.WildCardImpl;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented by
 * a domain model object.
 * 
 * @generated
 */
public class AspectualacmeVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "AspectualAcmeStudio.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (SystemEditPart.MODEL_ID.equals(view.getType())) {
				return SystemEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return aspectualacme.diagram.part.AspectualacmeVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				AspectualacmeDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (AspectualacmePackage.eINSTANCE.getSystem().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((System) domainElement)) {
			return SystemEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = aspectualacme.diagram.part.AspectualacmeVisualIDRegistry
				.getModelID(containerView);
		if (!SystemEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (SystemEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = aspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SystemEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SystemEditPart.VISUAL_ID:
			if (AspectualacmePackage.eINSTANCE.getConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return ConnectorEditPart.VISUAL_ID;
			}
			if (AspectualacmePackage.eINSTANCE.getComponent().isSuperTypeOf(
					domainElement.eClass())) {
				return ComponentEditPart.VISUAL_ID;
			}
			if (AspectualacmePackage.eINSTANCE.getWildCard().isSuperTypeOf(
					domainElement.eClass())) {
				return WildCardEditPart.VISUAL_ID;
			}
			break;
		case ConnectorEditPart.VISUAL_ID:
			if (AspectualacmePackage.eINSTANCE.getBaseRole().isSuperTypeOf(
					domainElement.eClass())) {
				return BaseRoleEditPart.VISUAL_ID;
			}
			if (AspectualacmePackage.eINSTANCE.getCrosscuttingRole()
					.isSuperTypeOf(domainElement.eClass())) {
				return CrosscuttingRoleEditPart.VISUAL_ID;
			}
			if (AspectualacmePackage.eINSTANCE.getRole().isSuperTypeOf(
					domainElement.eClass())) {
				return RoleEditPart.VISUAL_ID;
			}
			break;
		case ComponentEditPart.VISUAL_ID:
			if (AspectualacmePackage.eINSTANCE.getPort().isSuperTypeOf(
					domainElement.eClass())) {
				return PortEditPart.VISUAL_ID;
			}
			if (AspectualacmePackage.eINSTANCE.getRepresentation()
					.isSuperTypeOf(domainElement.eClass())) {
				return RepresentationEditPart.VISUAL_ID;
			}
			break;
		case ConnectorCompartmentGlueEditPart.VISUAL_ID:
			if (AspectualacmePackage.eINSTANCE.getGlue().isSuperTypeOf(
					domainElement.eClass())) {
				return GlueEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = aspectualacme.diagram.part.AspectualacmeVisualIDRegistry
				.getModelID(containerView);
		if (!SystemEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (SystemEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = aspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SystemEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SystemEditPart.VISUAL_ID:
			if (ConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WildCardEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConnectorEditPart.VISUAL_ID:
			if (ConnectorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConnectorCompartmentGlueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BaseRoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CrosscuttingRoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentEditPart.VISUAL_ID:
			if (ComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepresentationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WildCardEditPart.VISUAL_ID:
			if (WildCardNameExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConnectorCompartmentGlueEditPart.VISUAL_ID:
			if (GlueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated NOT
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (AspectualacmePackage.eINSTANCE.getAttachment().isSuperTypeOf(
				domainElement.eClass())) {
			AttachmentImpl att = (AttachmentImpl) domainElement;
			if (att.basicGetFirstElement() instanceof PortImpl
					&& att.basicGetSecondElement() instanceof CrosscuttingRoleImpl) {
				return AttachmentEditPart.VISUAL_ID;
			} else if (att.basicGetFirstElement() instanceof CrosscuttingRoleImpl
					&& att.basicGetSecondElement() instanceof PortImpl) {
				return Attachment2EditPart.VISUAL_ID;
			} else if ((att.basicGetFirstElement() instanceof PortImpl || att
					.basicGetFirstElement() instanceof WildCardImpl)
					&& att.basicGetSecondElement() instanceof BaseRoleImpl) {
				return Attachment3EditPart.VISUAL_ID;
			} else if (att.basicGetFirstElement() instanceof BaseRoleImpl
					&& (att.basicGetSecondElement() instanceof PortImpl || att
							.basicGetSecondElement() instanceof WildCardImpl)) {
				return Attachment4EditPart.VISUAL_ID;
			} else if (att.basicGetFirstElement() instanceof PortImpl
					&& att.basicGetSecondElement() instanceof RoleImpl) {
				return Attachment5EditPart.VISUAL_ID;

			} else if (att.basicGetFirstElement() instanceof RoleImpl
					&& att.basicGetSecondElement() instanceof PortImpl) {
				return Attachment6EditPart.VISUAL_ID;
			}
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(System element) {
		return true;
	}

}
