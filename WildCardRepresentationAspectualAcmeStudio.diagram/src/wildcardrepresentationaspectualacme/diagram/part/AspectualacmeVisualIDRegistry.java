package wildcardrepresentationaspectualacme.diagram.part;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import wildcardrepresentationaspectualacme.diagram.edit.parts.Component2EditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.ComponentCompartmentWComponent2EditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.ComponentCompartmentWComponentEditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.ComponentEditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.ComponentName2EditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.ComponentNameEditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.PortEditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.RepresentationCompartmentWRepresentationEditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.RepresentationEditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.RepresentationNameEditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.SystemCompartmentWSystemEditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.SystemEditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.SystemNameEditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.WildCardEditPart;
import aspectualacme.AspectualacmePackage;
import aspectualacme.Component;
import aspectualacme.WildCard;
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
	private static final String DEBUG_KEY = "WildCardRepresentationAspectualAcmeStudio.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (WildCardEditPart.MODEL_ID.equals(view.getType())) {
				return WildCardEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return wildcardrepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
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
				WildCardRepresentationAspectualacmeDiagramEditorPlugin
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
		if (AspectualacmePackage.eINSTANCE.getWildCard().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((WildCard) domainElement)) {
			return WildCardEditPart.VISUAL_ID;
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
		String containerModelID = wildcardrepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
				.getModelID(containerView);
		if (!WildCardEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (WildCardEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = wildcardrepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WildCardEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case WildCardEditPart.VISUAL_ID:
			if (AspectualacmePackage.eINSTANCE.getComponent().isSuperTypeOf(
					domainElement.eClass())) {
				return ComponentEditPart.VISUAL_ID;
			}
			break;
		case ComponentEditPart.VISUAL_ID:
			if (AspectualacmePackage.eINSTANCE.getPort().isSuperTypeOf(
					domainElement.eClass())) {
				return PortEditPart.VISUAL_ID;
			}
			break;
		case Component2EditPart.VISUAL_ID:
			if (AspectualacmePackage.eINSTANCE.getPort().isSuperTypeOf(
					domainElement.eClass())) {
				return PortEditPart.VISUAL_ID;
			}
			break;
		case ComponentCompartmentWComponentEditPart.VISUAL_ID:
			if (AspectualacmePackage.eINSTANCE.getRepresentation()
					.isSuperTypeOf(domainElement.eClass())) {
				return RepresentationEditPart.VISUAL_ID;
			}
			break;
		case RepresentationCompartmentWRepresentationEditPart.VISUAL_ID:
			if (AspectualacmePackage.eINSTANCE.getSystem().isSuperTypeOf(
					domainElement.eClass())) {
				return SystemEditPart.VISUAL_ID;
			}
			break;
		case SystemCompartmentWSystemEditPart.VISUAL_ID:
			if (AspectualacmePackage.eINSTANCE.getComponent().isSuperTypeOf(
					domainElement.eClass())) {
				return Component2EditPart.VISUAL_ID;
			}
			break;
		case ComponentCompartmentWComponent2EditPart.VISUAL_ID:
			if (AspectualacmePackage.eINSTANCE.getRepresentation()
					.isSuperTypeOf(domainElement.eClass())) {
				return RepresentationEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = wildcardrepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
				.getModelID(containerView);
		if (!WildCardEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (WildCardEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = wildcardrepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WildCardEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case WildCardEditPart.VISUAL_ID:
			if (ComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentEditPart.VISUAL_ID:
			if (ComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentCompartmentWComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepresentationEditPart.VISUAL_ID:
			if (RepresentationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RepresentationCompartmentWRepresentationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SystemEditPart.VISUAL_ID:
			if (SystemNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SystemCompartmentWSystemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Component2EditPart.VISUAL_ID:
			if (ComponentName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentCompartmentWComponent2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentCompartmentWComponentEditPart.VISUAL_ID:
			if (RepresentationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RepresentationCompartmentWRepresentationEditPart.VISUAL_ID:
			if (SystemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SystemCompartmentWSystemEditPart.VISUAL_ID:
			if (Component2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentCompartmentWComponent2EditPart.VISUAL_ID:
			if (RepresentationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(WildCard element) {
		return true;
	}

	/**
	 * @generated NOT
	 */
	private static boolean isComponent_2002(Component domainElement) {

		return true;
	}

	/**
	 * @generated NOT
	 */
	private static boolean isComponent_2002(
			aspectualacme.Component domainElement, WildCardImpl container) {
		// domainElement.getName();

		Pattern p = Pattern.compile(container.getName());
		Matcher m = p.matcher(domainElement.getName());
		return m.matches();

	}

}
