package aspectualacme.diagram.representation.part;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;

import aspectualacme.Representation;
import aspectualacme.System;
import aspectualacme.diagram.representation.edit.parts.RepresentationEditPart;
import aspectualacme.diagram.representation.edit.parts.SystemEditPart;

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
		case RepresentationEditPart.VISUAL_ID:
			return getRepresentation_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeNodeDescriptor> getRepresentation_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Representation modelElement = (Representation) view.getElement();
		LinkedList<AspectualacmeNodeDescriptor> result = new LinkedList<AspectualacmeNodeDescriptor>();
		{
			System childElement = modelElement.getSystem();
			int visualID = AspectualacmeVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SystemEditPart.VISUAL_ID) {
				result.add(new AspectualacmeNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getContainedLinks(View view) {
		switch (AspectualacmeVisualIDRegistry.getVisualID(view)) {
		case RepresentationEditPart.VISUAL_ID:
			return getRepresentation_1000ContainedLinks(view);
		case SystemEditPart.VISUAL_ID:
			return getSystem_2001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getIncomingLinks(View view) {
		switch (AspectualacmeVisualIDRegistry.getVisualID(view)) {
		case SystemEditPart.VISUAL_ID:
			return getSystem_2001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getOutgoingLinks(View view) {
		switch (AspectualacmeVisualIDRegistry.getVisualID(view)) {
		case SystemEditPart.VISUAL_ID:
			return getSystem_2001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getRepresentation_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getSystem_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getSystem_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getSystem_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

}
