package componentRepresentationaspectualacme.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import aspectualacme.AspectualacmePackage;
import aspectualacme.Representation;
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
	private static final String DEBUG_KEY = "ComponentRepresentationAspectualAcmeStudio.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (componentRepresentationaspectualacme.diagram.edit.parts.RepresentationEditPart.MODEL_ID
					.equals(view.getType())) {
				return componentRepresentationaspectualacme.diagram.edit.parts.RepresentationEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
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
				componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
						.getInstance().logError(
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
		if (AspectualacmePackage.eINSTANCE.getRepresentation().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Representation) domainElement)) {
			return componentRepresentationaspectualacme.diagram.edit.parts.RepresentationEditPart.VISUAL_ID;
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
		String containerModelID = componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
				.getModelID(containerView);
		if (!componentRepresentationaspectualacme.diagram.edit.parts.RepresentationEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (componentRepresentationaspectualacme.diagram.edit.parts.RepresentationEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = componentRepresentationaspectualacme.diagram.edit.parts.RepresentationEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case componentRepresentationaspectualacme.diagram.edit.parts.RepresentationEditPart.VISUAL_ID:
			if (AspectualacmePackage.eINSTANCE.getSystem().isSuperTypeOf(
					domainElement.eClass())) {
				return componentRepresentationaspectualacme.diagram.edit.parts.SystemEditPart.VISUAL_ID;
			}
			if (AspectualacmePackage.eINSTANCE.getComponent().isSuperTypeOf(
					domainElement.eClass())) {
				return componentRepresentationaspectualacme.diagram.edit.parts.ComponentEditPart.VISUAL_ID;
			}
			break;
		case componentRepresentationaspectualacme.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			if (AspectualacmePackage.eINSTANCE.getPort().isSuperTypeOf(
					domainElement.eClass())) {
				return componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart.VISUAL_ID;
			}
			break;
		case componentRepresentationaspectualacme.diagram.edit.parts.Component2EditPart.VISUAL_ID:
			if (AspectualacmePackage.eINSTANCE.getPort().isSuperTypeOf(
					domainElement.eClass())) {
				return componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart.VISUAL_ID;
			}
			if (AspectualacmePackage.eINSTANCE.getRepresentation()
					.isSuperTypeOf(domainElement.eClass())) {
				return componentRepresentationaspectualacme.diagram.edit.parts.Representation2EditPart.VISUAL_ID;
			}
			break;
		case componentRepresentationaspectualacme.diagram.edit.parts.ConnectorEditPart.VISUAL_ID:
			if (AspectualacmePackage.eINSTANCE.getBaseRole().isSuperTypeOf(
					domainElement.eClass())) {
				return componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart.VISUAL_ID;
			}
			if (AspectualacmePackage.eINSTANCE.getCrosscuttingRole()
					.isSuperTypeOf(domainElement.eClass())) {
				return componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart.VISUAL_ID;
			}
			if (AspectualacmePackage.eINSTANCE.getRole().isSuperTypeOf(
					domainElement.eClass())) {
				return componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart.VISUAL_ID;
			}
			break;
		case componentRepresentationaspectualacme.diagram.edit.parts.SystemCompartmentRSystemEditPart.VISUAL_ID:
			if (AspectualacmePackage.eINSTANCE.getComponent().isSuperTypeOf(
					domainElement.eClass())) {
				return componentRepresentationaspectualacme.diagram.edit.parts.Component2EditPart.VISUAL_ID;
			}
			if (AspectualacmePackage.eINSTANCE.getConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return componentRepresentationaspectualacme.diagram.edit.parts.ConnectorEditPart.VISUAL_ID;
			}
			if (AspectualacmePackage.eINSTANCE.getWildCard().isSuperTypeOf(
					domainElement.eClass())) {
				return componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart.VISUAL_ID;
			}
			break;
		case componentRepresentationaspectualacme.diagram.edit.parts.ConnectorCompartmentGlueEditPart.VISUAL_ID:
			if (AspectualacmePackage.eINSTANCE.getGlue().isSuperTypeOf(
					domainElement.eClass())) {
				return componentRepresentationaspectualacme.diagram.edit.parts.GlueEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
				.getModelID(containerView);
		if (!componentRepresentationaspectualacme.diagram.edit.parts.RepresentationEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (componentRepresentationaspectualacme.diagram.edit.parts.RepresentationEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = componentRepresentationaspectualacme.diagram.edit.parts.RepresentationEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case componentRepresentationaspectualacme.diagram.edit.parts.RepresentationEditPart.VISUAL_ID:
			if (componentRepresentationaspectualacme.diagram.edit.parts.SystemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (componentRepresentationaspectualacme.diagram.edit.parts.ComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case componentRepresentationaspectualacme.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			if (componentRepresentationaspectualacme.diagram.edit.parts.SystemNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (componentRepresentationaspectualacme.diagram.edit.parts.SystemCompartmentRSystemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case componentRepresentationaspectualacme.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			if (componentRepresentationaspectualacme.diagram.edit.parts.ComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case componentRepresentationaspectualacme.diagram.edit.parts.Component2EditPart.VISUAL_ID:
			if (componentRepresentationaspectualacme.diagram.edit.parts.ComponentName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (componentRepresentationaspectualacme.diagram.edit.parts.Representation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case componentRepresentationaspectualacme.diagram.edit.parts.ConnectorEditPart.VISUAL_ID:
			if (componentRepresentationaspectualacme.diagram.edit.parts.ConnectorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (componentRepresentationaspectualacme.diagram.edit.parts.ConnectorCompartmentGlueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart.VISUAL_ID:
			if (componentRepresentationaspectualacme.diagram.edit.parts.WildCardNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case componentRepresentationaspectualacme.diagram.edit.parts.SystemCompartmentRSystemEditPart.VISUAL_ID:
			if (componentRepresentationaspectualacme.diagram.edit.parts.Component2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (componentRepresentationaspectualacme.diagram.edit.parts.ConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case componentRepresentationaspectualacme.diagram.edit.parts.ConnectorCompartmentGlueEditPart.VISUAL_ID:
			if (componentRepresentationaspectualacme.diagram.edit.parts.GlueEditPart.VISUAL_ID == nodeVisualID) {
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
				return componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID;
			} else if (att.basicGetFirstElement() instanceof CrosscuttingRoleImpl
					&& att.basicGetSecondElement() instanceof PortImpl) {
				return componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID;
			} else if ((att.basicGetFirstElement() instanceof PortImpl || att
					.basicGetFirstElement() instanceof WildCardImpl)
					&& att.basicGetSecondElement() instanceof BaseRoleImpl) {
				return componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID;
			} else if (att.basicGetFirstElement() instanceof BaseRoleImpl
					&& (att.basicGetSecondElement() instanceof PortImpl || att
							.basicGetSecondElement() instanceof WildCardImpl)) {
				return componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID;
			} else if (att.basicGetFirstElement() instanceof PortImpl
					&& att.basicGetSecondElement() instanceof RoleImpl) {
				return componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID;
			} else if (att.basicGetFirstElement() instanceof RoleImpl
					&& att.basicGetSecondElement() instanceof PortImpl) {
				return componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID;
			}
		}else if(AspectualacmePackage.eINSTANCE.getBinding().isSuperTypeOf(domainElement.eClass())){
			return componentRepresentationaspectualacme.diagram.edit.parts.BindingEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Representation element) {
		return true;
	}

}
