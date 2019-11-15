package aspectualacme.diagram.representation.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import aspectualacme.AspectualacmePackage;
import aspectualacme.Representation;
import aspectualacme.diagram.representation.edit.parts.RepresentationEditPart;
import aspectualacme.diagram.representation.edit.parts.SystemEditPart;
import aspectualacme.diagram.representation.edit.parts.WrappingLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
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
			if (RepresentationEditPart.MODEL_ID.equals(view.getType())) {
				return RepresentationEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return aspectualacme.diagram.representation.part.AspectualacmeVisualIDRegistry
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
		if (AspectualacmePackage.eINSTANCE.getRepresentation().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Representation) domainElement)) {
			return RepresentationEditPart.VISUAL_ID;
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
		String containerModelID = aspectualacme.diagram.representation.part.AspectualacmeVisualIDRegistry
				.getModelID(containerView);
		if (!RepresentationEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (RepresentationEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = aspectualacme.diagram.representation.part.AspectualacmeVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = RepresentationEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case RepresentationEditPart.VISUAL_ID:
			if (AspectualacmePackage.eINSTANCE.getSystem().isSuperTypeOf(
					domainElement.eClass())) {
				return SystemEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = aspectualacme.diagram.representation.part.AspectualacmeVisualIDRegistry
				.getModelID(containerView);
		if (!RepresentationEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (RepresentationEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = aspectualacme.diagram.representation.part.AspectualacmeVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = RepresentationEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case RepresentationEditPart.VISUAL_ID:
			if (SystemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SystemEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(Representation element) {
		return true;
	}

}
