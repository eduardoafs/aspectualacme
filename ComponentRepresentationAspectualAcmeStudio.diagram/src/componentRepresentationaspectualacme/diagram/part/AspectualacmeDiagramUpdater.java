package componentRepresentationaspectualacme.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import aspectualacme.AspectualacmePackage;
import aspectualacme.Attachment;
import aspectualacme.BaseRole;
import aspectualacme.Binding;
import aspectualacme.Component;
import aspectualacme.Connector;
import aspectualacme.CrosscuttingRole;
import aspectualacme.Element;
import aspectualacme.Glue;
import aspectualacme.Port;
import aspectualacme.Representation;
import aspectualacme.Role;
import aspectualacme.System;
import aspectualacme.WildCard;

/**
 * @generated
 */
public class AspectualacmeDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor> getSemanticChildren(
			View view) {
		switch (componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
				.getVisualID(view)) {
		case componentRepresentationaspectualacme.diagram.edit.parts.FreeformLayerEditPart.VISUAL_ID:
			return getRepresentation_1000SemanticChildren(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Component2EditPart.VISUAL_ID:
			return getComponent_2010SemanticChildren(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getComponent_3001SemanticChildren(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.ConnectorEditPart.VISUAL_ID:
			return getConnector_3004SemanticChildren(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.SystemRepSystemCompEditPart.VISUAL_ID:
			return getSystemRepSystemComp_7001SemanticChildren(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.ConnectorCompartmentGlueEditPart.VISUAL_ID:
			return getConnectorCompartmentGlue_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor> getRepresentation_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Representation modelElement = (Representation) view.getElement();
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor>();
		{
			System childElement = modelElement.getSystem();
			int visualID = componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == componentRepresentationaspectualacme.diagram.edit.parts.SystemEditPart.VISUAL_ID) {
				result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor(
						childElement, visualID));
			}
		}
		{
			Element childElement = modelElement.getElement();
			int visualID = componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == componentRepresentationaspectualacme.diagram.edit.parts.Component2EditPart.VISUAL_ID) {
				result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor(
						childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor> getComponent_2010SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Component modelElement = (Component) view.getElement();
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPort().iterator(); it.hasNext();) {
			Port childElement = (Port) it.next();
			int visualID = componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart.VISUAL_ID) {
				result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor> getComponent_3001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Component modelElement = (Component) view.getElement();
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPort().iterator(); it.hasNext();) {
			Port childElement = (Port) it.next();
			int visualID = componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart.VISUAL_ID) {
				result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRepresentations().iterator(); it
				.hasNext();) {
			Representation childElement = (Representation) it.next();
			int visualID = componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == componentRepresentationaspectualacme.diagram.edit.parts.RepresentationEditPart.VISUAL_ID) {
				result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor> getConnector_3004SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Connector modelElement = (Connector) view.getElement();
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRole().iterator(); it.hasNext();) {
			Role childElement = (Role) it.next();
			int visualID = componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart.VISUAL_ID) {
				result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart.VISUAL_ID) {
				result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart.VISUAL_ID) {
				result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor> getSystemRepSystemComp_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		System modelElement = (System) containerView.getElement();
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			Component childElement = (Component) it.next();
			int visualID = componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == componentRepresentationaspectualacme.diagram.edit.parts.ComponentEditPart.VISUAL_ID) {
				result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getConnectors().iterator(); it
				.hasNext();) {
			Connector childElement = (Connector) it.next();
			int visualID = componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == componentRepresentationaspectualacme.diagram.edit.parts.ConnectorEditPart.VISUAL_ID) {
				result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getWildCard().iterator(); it
				.hasNext();) {
			WildCard childElement = (WildCard) it.next();
			int visualID = componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart.VISUAL_ID) {
				result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor> getConnectorCompartmentGlue_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Connector modelElement = (Connector) containerView.getElement();
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGlue().iterator(); it.hasNext();) {
			Glue childElement = (Glue) it.next();
			int visualID = componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == componentRepresentationaspectualacme.diagram.edit.parts.GlueEditPart.VISUAL_ID) {
				result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getContainedLinks(
			View view) {
		switch (componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
				.getVisualID(view)) {
		case componentRepresentationaspectualacme.diagram.edit.parts.FreeformLayerEditPart.VISUAL_ID:
			return getRepresentation_1000ContainedLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return getSystem_2009ContainedLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Component2EditPart.VISUAL_ID:
			return getComponent_2010ContainedLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getComponent_3001ContainedLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return getPort_3002ContainedLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.RepresentationEditPart.VISUAL_ID:
			return getRepresentation_3003ContainedLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.ConnectorEditPart.VISUAL_ID:
			return getConnector_3004ContainedLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart.VISUAL_ID:
			return getBaseRole_3005ContainedLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart.VISUAL_ID:
			return getCrosscuttingRole_3006ContainedLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.GlueEditPart.VISUAL_ID:
			return getGlue_3008ContainedLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_3012ContainedLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart.VISUAL_ID:
			return getWildCard_3009ContainedLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart.VISUAL_ID:
			return getPort_3011ContainedLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID:
			return getAttachment_4001ContainedLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID:
			return getAttachment_4002ContainedLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID:
			return getAttachment_4003ContainedLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID:
			return getAttachment_4004ContainedLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID:
			return getAttachment_4005ContainedLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID:
			return getAttachment_4006ContainedLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.BindingEditPart.VISUAL_ID:
			return getBinding_4007ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getIncomingLinks(
			View view) {
		switch (componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
				.getVisualID(view)) {
		case componentRepresentationaspectualacme.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return getSystem_2009IncomingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Component2EditPart.VISUAL_ID:
			return getComponent_2010IncomingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getComponent_3001IncomingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return getPort_3002IncomingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.RepresentationEditPart.VISUAL_ID:
			return getRepresentation_3003IncomingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.ConnectorEditPart.VISUAL_ID:
			return getConnector_3004IncomingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart.VISUAL_ID:
			return getBaseRole_3005IncomingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart.VISUAL_ID:
			return getCrosscuttingRole_3006IncomingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.GlueEditPart.VISUAL_ID:
			return getGlue_3008IncomingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_3012IncomingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart.VISUAL_ID:
			return getWildCard_3009IncomingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart.VISUAL_ID:
			return getPort_3011IncomingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID:
			return getAttachment_4001IncomingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID:
			return getAttachment_4002IncomingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID:
			return getAttachment_4003IncomingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID:
			return getAttachment_4004IncomingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID:
			return getAttachment_4005IncomingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID:
			return getAttachment_4006IncomingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.BindingEditPart.VISUAL_ID:
			return getBinding_4007IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
				.getVisualID(view)) {
		case componentRepresentationaspectualacme.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return getSystem_2009OutgoingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Component2EditPart.VISUAL_ID:
			return getComponent_2010OutgoingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return getComponent_3001OutgoingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return getPort_3002OutgoingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.RepresentationEditPart.VISUAL_ID:
			return getRepresentation_3003OutgoingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.ConnectorEditPart.VISUAL_ID:
			return getConnector_3004OutgoingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart.VISUAL_ID:
			return getBaseRole_3005OutgoingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart.VISUAL_ID:
			return getCrosscuttingRole_3006OutgoingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.GlueEditPart.VISUAL_ID:
			return getGlue_3008OutgoingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_3012OutgoingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart.VISUAL_ID:
			return getWildCard_3009OutgoingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart.VISUAL_ID:
			return getPort_3011OutgoingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID:
			return getAttachment_4001OutgoingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID:
			return getAttachment_4002OutgoingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID:
			return getAttachment_4003OutgoingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID:
			return getAttachment_4004OutgoingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID:
			return getAttachment_4005OutgoingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID:
			return getAttachment_4006OutgoingLinks(view);
		case componentRepresentationaspectualacme.diagram.edit.parts.BindingEditPart.VISUAL_ID:
			return getBinding_4007OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getRepresentation_1000ContainedLinks(
			View view) {
		Representation modelElement = (Representation) view.getElement();
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Binding_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getSystem_2009ContainedLinks(
			View view) {
		System modelElement = (System) view.getElement();
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Attachment_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Attachment_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Attachment_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Attachment_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Attachment_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Attachment_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getComponent_2010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getComponent_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getPort_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getRepresentation_3003ContainedLinks(
			View view) {
		Representation modelElement = (Representation) view.getElement();
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Binding_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getConnector_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getBaseRole_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getCrosscuttingRole_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getGlue_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getRole_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getWildCard_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getPort_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getAttachment_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getAttachment_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getAttachment_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getAttachment_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getAttachment_4005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getAttachment_4006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getBinding_4007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getSystem_2009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getComponent_2010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getComponent_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getPort_3002IncomingLinks(
			View view) {
		Port modelElement = (Port) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Binding_4007(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getRepresentation_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getConnector_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getBaseRole_3005IncomingLinks(
			View view) {
		BaseRole modelElement = (BaseRole) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getCrosscuttingRole_3006IncomingLinks(
			View view) {
		CrosscuttingRole modelElement = (CrosscuttingRole) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getGlue_3008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getRole_3012IncomingLinks(
			View view) {
		Role modelElement = (Role) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getWildCard_3009IncomingLinks(
			View view) {
		WildCard modelElement = (WildCard) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getPort_3011IncomingLinks(
			View view) {
		Port modelElement = (Port) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Attachment_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Binding_4007(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getAttachment_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getAttachment_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getAttachment_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getAttachment_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getAttachment_4005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getAttachment_4006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getBinding_4007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getSystem_2009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getComponent_2010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getComponent_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getPort_3002OutgoingLinks(
			View view) {
		Port modelElement = (Port) view.getElement();
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Binding_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getRepresentation_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getConnector_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getBaseRole_3005OutgoingLinks(
			View view) {
		BaseRole modelElement = (BaseRole) view.getElement();
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getCrosscuttingRole_3006OutgoingLinks(
			View view) {
		CrosscuttingRole modelElement = (CrosscuttingRole) view.getElement();
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getGlue_3008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getRole_3012OutgoingLinks(
			View view) {
		Role modelElement = (Role) view.getElement();
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getWildCard_3009OutgoingLinks(
			View view) {
		WildCard modelElement = (WildCard) view.getElement();
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getPort_3011OutgoingLinks(
			View view) {
		Port modelElement = (Port) view.getElement();
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Attachment_4006(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Binding_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getAttachment_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getAttachment_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getAttachment_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getAttachment_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getAttachment_4005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getAttachment_4006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getBinding_4007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getContainedTypeModelFacetLinks_Attachment_4001(
			System container) {
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		for (Iterator<?> links = container.getAttachments().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) linkObject;
			if (componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID != componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement dst = link.getSecondElement();
			aspectualacme.attachableElement src = link.getFirstElement();
			result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor(
					src,
					dst,
					link,
					componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4001,
					componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getContainedTypeModelFacetLinks_Attachment_4002(
			System container) {
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		for (Iterator<?> links = container.getAttachments().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) linkObject;
			if (componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID != componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement dst = link.getSecondElement();
			aspectualacme.attachableElement src = link.getFirstElement();
			result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor(
					src,
					dst,
					link,
					componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4002,
					componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getContainedTypeModelFacetLinks_Attachment_4003(
			System container) {
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		for (Iterator<?> links = container.getAttachments().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) linkObject;
			if (componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID != componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement dst = link.getSecondElement();
			aspectualacme.attachableElement src = link.getFirstElement();
			result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor(
					src,
					dst,
					link,
					componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4003,
					componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getContainedTypeModelFacetLinks_Attachment_4004(
			System container) {
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		for (Iterator<?> links = container.getAttachments().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) linkObject;
			if (componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID != componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement dst = link.getSecondElement();
			aspectualacme.attachableElement src = link.getFirstElement();
			result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor(
					src,
					dst,
					link,
					componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4004,
					componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getContainedTypeModelFacetLinks_Attachment_4005(
			System container) {
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		for (Iterator<?> links = container.getAttachments().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) linkObject;
			if (componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID != componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement dst = link.getSecondElement();
			aspectualacme.attachableElement src = link.getFirstElement();
			result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor(
					src,
					dst,
					link,
					componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4005,
					componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getContainedTypeModelFacetLinks_Attachment_4006(
			System container) {
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		for (Iterator<?> links = container.getAttachments().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) linkObject;
			if (componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID != componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement dst = link.getSecondElement();
			aspectualacme.attachableElement src = link.getFirstElement();
			result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor(
					src,
					dst,
					link,
					componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4006,
					componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getContainedTypeModelFacetLinks_Binding_4007(
			Representation container) {
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		for (Iterator<?> links = container.getBindings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Binding) {
				continue;
			}
			Binding link = (Binding) linkObject;
			if (componentRepresentationaspectualacme.diagram.edit.parts.BindingEditPart.VISUAL_ID != componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Port dst = link.getSecondPort();
			Port src = link.getFirstPort();
			result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor(
					src,
					dst,
					link,
					componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Binding_4007,
					componentRepresentationaspectualacme.diagram.edit.parts.BindingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getIncomingTypeModelFacetLinks_Attachment_4001(
			aspectualacme.attachableElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AspectualacmePackage.eINSTANCE
					.getAttachment_SecondElement()
					|| false == setting.getEObject() instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) setting.getEObject();
			if (componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID != componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement src = link.getFirstElement();
			result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor(
					src,
					target,
					link,
					componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4001,
					componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getIncomingTypeModelFacetLinks_Attachment_4002(
			aspectualacme.attachableElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AspectualacmePackage.eINSTANCE
					.getAttachment_SecondElement()
					|| false == setting.getEObject() instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) setting.getEObject();
			if (componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID != componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement src = link.getFirstElement();
			result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor(
					src,
					target,
					link,
					componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4002,
					componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getIncomingTypeModelFacetLinks_Attachment_4003(
			aspectualacme.attachableElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AspectualacmePackage.eINSTANCE
					.getAttachment_SecondElement()
					|| false == setting.getEObject() instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) setting.getEObject();
			if (componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID != componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement src = link.getFirstElement();
			result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor(
					src,
					target,
					link,
					componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4003,
					componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getIncomingTypeModelFacetLinks_Attachment_4004(
			aspectualacme.attachableElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AspectualacmePackage.eINSTANCE
					.getAttachment_SecondElement()
					|| false == setting.getEObject() instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) setting.getEObject();
			if (componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID != componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement src = link.getFirstElement();
			result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor(
					src,
					target,
					link,
					componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4004,
					componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getIncomingTypeModelFacetLinks_Attachment_4005(
			aspectualacme.attachableElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AspectualacmePackage.eINSTANCE
					.getAttachment_SecondElement()
					|| false == setting.getEObject() instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) setting.getEObject();
			if (componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID != componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement src = link.getFirstElement();
			result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor(
					src,
					target,
					link,
					componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4005,
					componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getIncomingTypeModelFacetLinks_Attachment_4006(
			aspectualacme.attachableElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AspectualacmePackage.eINSTANCE
					.getAttachment_SecondElement()
					|| false == setting.getEObject() instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) setting.getEObject();
			if (componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID != componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement src = link.getFirstElement();
			result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor(
					src,
					target,
					link,
					componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4006,
					componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getIncomingTypeModelFacetLinks_Binding_4007(
			Port target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AspectualacmePackage.eINSTANCE
					.getBinding_SecondPort()
					|| false == setting.getEObject() instanceof Binding) {
				continue;
			}
			Binding link = (Binding) setting.getEObject();
			if (componentRepresentationaspectualacme.diagram.edit.parts.BindingEditPart.VISUAL_ID != componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Port src = link.getFirstPort();
			result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor(
					src,
					target,
					link,
					componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Binding_4007,
					componentRepresentationaspectualacme.diagram.edit.parts.BindingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getOutgoingTypeModelFacetLinks_Attachment_4001(
			aspectualacme.attachableElement source) {
		System container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof System) {
				container = (System) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		for (Iterator<?> links = container.getAttachments().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) linkObject;
			if (componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID != componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement dst = link.getSecondElement();
			aspectualacme.attachableElement src = link.getFirstElement();
			if (src != source) {
				continue;
			}
			result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor(
					src,
					dst,
					link,
					componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4001,
					componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getOutgoingTypeModelFacetLinks_Attachment_4002(
			aspectualacme.attachableElement source) {
		System container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof System) {
				container = (System) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		for (Iterator<?> links = container.getAttachments().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) linkObject;
			if (componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID != componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement dst = link.getSecondElement();
			aspectualacme.attachableElement src = link.getFirstElement();
			if (src != source) {
				continue;
			}
			result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor(
					src,
					dst,
					link,
					componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4002,
					componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getOutgoingTypeModelFacetLinks_Attachment_4003(
			aspectualacme.attachableElement source) {
		System container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof System) {
				container = (System) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		for (Iterator<?> links = container.getAttachments().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) linkObject;
			if (componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID != componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement dst = link.getSecondElement();
			aspectualacme.attachableElement src = link.getFirstElement();
			if (src != source) {
				continue;
			}
			result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor(
					src,
					dst,
					link,
					componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4003,
					componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getOutgoingTypeModelFacetLinks_Attachment_4004(
			aspectualacme.attachableElement source) {
		System container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof System) {
				container = (System) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		for (Iterator<?> links = container.getAttachments().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) linkObject;
			if (componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID != componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement dst = link.getSecondElement();
			aspectualacme.attachableElement src = link.getFirstElement();
			if (src != source) {
				continue;
			}
			result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor(
					src,
					dst,
					link,
					componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4004,
					componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getOutgoingTypeModelFacetLinks_Attachment_4005(
			aspectualacme.attachableElement source) {
		System container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof System) {
				container = (System) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		for (Iterator<?> links = container.getAttachments().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) linkObject;
			if (componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID != componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement dst = link.getSecondElement();
			aspectualacme.attachableElement src = link.getFirstElement();
			if (src != source) {
				continue;
			}
			result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor(
					src,
					dst,
					link,
					componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4005,
					componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getOutgoingTypeModelFacetLinks_Attachment_4006(
			aspectualacme.attachableElement source) {
		System container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof System) {
				container = (System) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		for (Iterator<?> links = container.getAttachments().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) linkObject;
			if (componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID != componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement dst = link.getSecondElement();
			aspectualacme.attachableElement src = link.getFirstElement();
			if (src != source) {
				continue;
			}
			result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor(
					src,
					dst,
					link,
					componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Attachment_4006,
					componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> getOutgoingTypeModelFacetLinks_Binding_4007(
			Port source) {
		Representation container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Representation) {
				container = (Representation) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor> result = new LinkedList<componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor>();
		for (Iterator<?> links = container.getBindings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Binding) {
				continue;
			}
			Binding link = (Binding) linkObject;
			if (componentRepresentationaspectualacme.diagram.edit.parts.BindingEditPart.VISUAL_ID != componentRepresentationaspectualacme.diagram.part.AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Port dst = link.getSecondPort();
			Port src = link.getFirstPort();
			if (src != source) {
				continue;
			}
			result.add(new componentRepresentationaspectualacme.diagram.part.AspectualacmeLinkDescriptor(
					src,
					dst,
					link,
					componentRepresentationaspectualacme.diagram.providers.AspectualacmeElementTypes.Binding_4007,
					componentRepresentationaspectualacme.diagram.edit.parts.BindingEditPart.VISUAL_ID));
		}
		return result;
	}

}
