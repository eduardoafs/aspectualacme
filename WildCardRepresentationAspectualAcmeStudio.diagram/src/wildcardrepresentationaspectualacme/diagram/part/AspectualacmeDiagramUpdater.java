package wildcardrepresentationaspectualacme.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.notation.View;

import wildcardrepresentationaspectualacme.diagram.edit.parts.ComponentEditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.PortEditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.WildCard2EditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.WildCardEditPart;
import aspectualacme.Component;
import aspectualacme.Port;
import aspectualacme.WildCard;

/**
 * @generated
 */
public class AspectualacmeDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<AspectualacmeNodeDescriptor> getSemanticChildren(
			View view) {
		switch (AspectualacmeVisualIDRegistry.getVisualID(view)) {
		case WildCardEditPart.VISUAL_ID:
			return getWildCard_1000SemanticChildren(view);
		case ComponentEditPart.VISUAL_ID:
			return getComponent_2002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeNodeDescriptor> getWildCard_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		WildCard modelElement = (WildCard) view.getElement();
		LinkedList<AspectualacmeNodeDescriptor> result = new LinkedList<AspectualacmeNodeDescriptor>();
		Resource resource = modelElement.eResource();
		for (Iterator<EObject> it = getPhantomNodesIterator(resource); it
				.hasNext();) {
			EObject childElement = it.next();
			if (childElement == modelElement) {
				continue;
			}
			if (AspectualacmeVisualIDRegistry.getNodeVisualID(view,
					childElement) == ComponentEditPart.VISUAL_ID) {
				result.add(new AspectualacmeNodeDescriptor(childElement,
						ComponentEditPart.VISUAL_ID));
				continue;
			}
			if (AspectualacmeVisualIDRegistry.getNodeVisualID(view,
					childElement) == WildCard2EditPart.VISUAL_ID) {
				result.add(new AspectualacmeNodeDescriptor(childElement,
						WildCard2EditPart.VISUAL_ID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeNodeDescriptor> getComponent_2002SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Component modelElement = (Component) view.getElement();
		LinkedList<AspectualacmeNodeDescriptor> result = new LinkedList<AspectualacmeNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPort().iterator(); it.hasNext();) {
			Port childElement = (Port) it.next();
			int visualID = AspectualacmeVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PortEditPart.VISUAL_ID) {
				result.add(new AspectualacmeNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Iterator<EObject> getPhantomNodesIterator(Resource resource) {
		return resource.getAllContents();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getContainedLinks(View view) {
		switch (AspectualacmeVisualIDRegistry.getVisualID(view)) {
		case WildCardEditPart.VISUAL_ID:
			return getWildCard_1000ContainedLinks(view);
		case ComponentEditPart.VISUAL_ID:
			return getComponent_2002ContainedLinks(view);
		case WildCard2EditPart.VISUAL_ID:
			return getWildCard_2003ContainedLinks(view);
		case PortEditPart.VISUAL_ID:
			return getPort_3001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getIncomingLinks(View view) {
		switch (AspectualacmeVisualIDRegistry.getVisualID(view)) {
		case ComponentEditPart.VISUAL_ID:
			return getComponent_2002IncomingLinks(view);
		case WildCard2EditPart.VISUAL_ID:
			return getWildCard_2003IncomingLinks(view);
		case PortEditPart.VISUAL_ID:
			return getPort_3001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getOutgoingLinks(View view) {
		switch (AspectualacmeVisualIDRegistry.getVisualID(view)) {
		case ComponentEditPart.VISUAL_ID:
			return getComponent_2002OutgoingLinks(view);
		case WildCard2EditPart.VISUAL_ID:
			return getWildCard_2003OutgoingLinks(view);
		case PortEditPart.VISUAL_ID:
			return getPort_3001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getWildCard_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getComponent_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getWildCard_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getPort_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getComponent_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getWildCard_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getPort_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getComponent_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getWildCard_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getPort_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

}
