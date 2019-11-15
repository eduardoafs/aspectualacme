package aspectualacme.diagram.part;

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
import aspectualacme.Component;
import aspectualacme.Connector;
import aspectualacme.CrosscuttingRole;
import aspectualacme.Glue;
import aspectualacme.Port;
import aspectualacme.Representation;
import aspectualacme.Role;
import aspectualacme.System;
import aspectualacme.WildCard;
import aspectualacme.diagram.edit.parts.Attachment2EditPart;
import aspectualacme.diagram.edit.parts.Attachment3EditPart;
import aspectualacme.diagram.edit.parts.Attachment4EditPart;
import aspectualacme.diagram.edit.parts.Attachment5EditPart;
import aspectualacme.diagram.edit.parts.Attachment6EditPart;
import aspectualacme.diagram.edit.parts.AttachmentEditPart;
import aspectualacme.diagram.edit.parts.BaseRoleEditPart;
import aspectualacme.diagram.edit.parts.ComponentEditPart;
import aspectualacme.diagram.edit.parts.ConnectorCompartmentGlueEditPart;
import aspectualacme.diagram.edit.parts.ConnectorEditPart;
import aspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart;
import aspectualacme.diagram.edit.parts.GlueEditPart;
import aspectualacme.diagram.edit.parts.PortEditPart;
import aspectualacme.diagram.edit.parts.RepresentationEditPart;
import aspectualacme.diagram.edit.parts.RoleEditPart;
import aspectualacme.diagram.edit.parts.SystemEditPart;
import aspectualacme.diagram.edit.parts.WildCardEditPart;
import aspectualacme.diagram.providers.AspectualacmeElementTypes;

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
		case SystemEditPart.VISUAL_ID:
			return getSystem_1000SemanticChildren(view);
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_2001SemanticChildren(view);
		case ComponentEditPart.VISUAL_ID:
			return getComponent_2002SemanticChildren(view);
		case ConnectorCompartmentGlueEditPart.VISUAL_ID:
			return getConnectorCompartmentGlue_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeNodeDescriptor> getSystem_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		System modelElement = (System) view.getElement();
		LinkedList<AspectualacmeNodeDescriptor> result = new LinkedList<AspectualacmeNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConnectors().iterator(); it
				.hasNext();) {
			Connector childElement = (Connector) it.next();
			int visualID = AspectualacmeVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConnectorEditPart.VISUAL_ID) {
				result.add(new AspectualacmeNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			Component childElement = (Component) it.next();
			int visualID = AspectualacmeVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ComponentEditPart.VISUAL_ID) {
				result.add(new AspectualacmeNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getWildCard().iterator(); it
				.hasNext();) {
			WildCard childElement = (WildCard) it.next();
			int visualID = AspectualacmeVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WildCardEditPart.VISUAL_ID) {
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
	public static List<AspectualacmeNodeDescriptor> getConnector_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Connector modelElement = (Connector) view.getElement();
		LinkedList<AspectualacmeNodeDescriptor> result = new LinkedList<AspectualacmeNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRole().iterator(); it.hasNext();) {
			Role childElement = (Role) it.next();
			int visualID = AspectualacmeVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == BaseRoleEditPart.VISUAL_ID) {
				result.add(new AspectualacmeNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == CrosscuttingRoleEditPart.VISUAL_ID) {
				result.add(new AspectualacmeNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == RoleEditPart.VISUAL_ID) {
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
		for (Iterator<?> it = modelElement.getRepresentations().iterator(); it
				.hasNext();) {
			Representation childElement = (Representation) it.next();
			int visualID = AspectualacmeVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RepresentationEditPart.VISUAL_ID) {
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
	public static List<AspectualacmeNodeDescriptor> getConnectorCompartmentGlue_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Connector modelElement = (Connector) containerView.getElement();
		LinkedList<AspectualacmeNodeDescriptor> result = new LinkedList<AspectualacmeNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGlue().iterator(); it.hasNext();) {
			Glue childElement = (Glue) it.next();
			int visualID = AspectualacmeVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == GlueEditPart.VISUAL_ID) {
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
	public static List<AspectualacmeLinkDescriptor> getContainedLinks(View view) {
		switch (AspectualacmeVisualIDRegistry.getVisualID(view)) {
		case SystemEditPart.VISUAL_ID:
			return getSystem_1000ContainedLinks(view);
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_2001ContainedLinks(view);
		case ComponentEditPart.VISUAL_ID:
			return getComponent_2002ContainedLinks(view);
		case WildCardEditPart.VISUAL_ID:
			return getWildCard_2003ContainedLinks(view);
		case BaseRoleEditPart.VISUAL_ID:
			return getBaseRole_3001ContainedLinks(view);
		case CrosscuttingRoleEditPart.VISUAL_ID:
			return getCrosscuttingRole_3002ContainedLinks(view);
		case GlueEditPart.VISUAL_ID:
			return getGlue_3004ContainedLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_3011ContainedLinks(view);
		case PortEditPart.VISUAL_ID:
			return getPort_3005ContainedLinks(view);
		case RepresentationEditPart.VISUAL_ID:
			return getRepresentation_3010ContainedLinks(view);
		case Attachment5EditPart.VISUAL_ID:
			return getAttachment_4001ContainedLinks(view);
		case Attachment6EditPart.VISUAL_ID:
			return getAttachment_4002ContainedLinks(view);
		case AttachmentEditPart.VISUAL_ID:
			return getAttachment_4003ContainedLinks(view);
		case Attachment2EditPart.VISUAL_ID:
			return getAttachment_4004ContainedLinks(view);
		case Attachment3EditPart.VISUAL_ID:
			return getAttachment_4005ContainedLinks(view);
		case Attachment4EditPart.VISUAL_ID:
			return getAttachment_4006ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getIncomingLinks(View view) {
		switch (AspectualacmeVisualIDRegistry.getVisualID(view)) {
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_2001IncomingLinks(view);
		case ComponentEditPart.VISUAL_ID:
			return getComponent_2002IncomingLinks(view);
		case WildCardEditPart.VISUAL_ID:
			return getWildCard_2003IncomingLinks(view);
		case BaseRoleEditPart.VISUAL_ID:
			return getBaseRole_3001IncomingLinks(view);
		case CrosscuttingRoleEditPart.VISUAL_ID:
			return getCrosscuttingRole_3002IncomingLinks(view);
		case GlueEditPart.VISUAL_ID:
			return getGlue_3004IncomingLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_3011IncomingLinks(view);
		case PortEditPart.VISUAL_ID:
			return getPort_3005IncomingLinks(view);
		case RepresentationEditPart.VISUAL_ID:
			return getRepresentation_3010IncomingLinks(view);
		case Attachment5EditPart.VISUAL_ID:
			return getAttachment_4001IncomingLinks(view);
		case Attachment6EditPart.VISUAL_ID:
			return getAttachment_4002IncomingLinks(view);
		case AttachmentEditPart.VISUAL_ID:
			return getAttachment_4003IncomingLinks(view);
		case Attachment2EditPart.VISUAL_ID:
			return getAttachment_4004IncomingLinks(view);
		case Attachment3EditPart.VISUAL_ID:
			return getAttachment_4005IncomingLinks(view);
		case Attachment4EditPart.VISUAL_ID:
			return getAttachment_4006IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getOutgoingLinks(View view) {
		switch (AspectualacmeVisualIDRegistry.getVisualID(view)) {
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_2001OutgoingLinks(view);
		case ComponentEditPart.VISUAL_ID:
			return getComponent_2002OutgoingLinks(view);
		case WildCardEditPart.VISUAL_ID:
			return getWildCard_2003OutgoingLinks(view);
		case BaseRoleEditPart.VISUAL_ID:
			return getBaseRole_3001OutgoingLinks(view);
		case CrosscuttingRoleEditPart.VISUAL_ID:
			return getCrosscuttingRole_3002OutgoingLinks(view);
		case GlueEditPart.VISUAL_ID:
			return getGlue_3004OutgoingLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_3011OutgoingLinks(view);
		case PortEditPart.VISUAL_ID:
			return getPort_3005OutgoingLinks(view);
		case RepresentationEditPart.VISUAL_ID:
			return getRepresentation_3010OutgoingLinks(view);
		case Attachment5EditPart.VISUAL_ID:
			return getAttachment_4001OutgoingLinks(view);
		case Attachment6EditPart.VISUAL_ID:
			return getAttachment_4002OutgoingLinks(view);
		case AttachmentEditPart.VISUAL_ID:
			return getAttachment_4003OutgoingLinks(view);
		case Attachment2EditPart.VISUAL_ID:
			return getAttachment_4004OutgoingLinks(view);
		case Attachment3EditPart.VISUAL_ID:
			return getAttachment_4005OutgoingLinks(view);
		case Attachment4EditPart.VISUAL_ID:
			return getAttachment_4006OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getSystem_1000ContainedLinks(
			View view) {
		System modelElement = (System) view.getElement();
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
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
	public static List<AspectualacmeLinkDescriptor> getConnector_2001ContainedLinks(
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
	public static List<AspectualacmeLinkDescriptor> getBaseRole_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getCrosscuttingRole_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getGlue_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getRole_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getPort_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getRepresentation_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getAttachment_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getAttachment_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getAttachment_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getAttachment_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getAttachment_4005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getAttachment_4006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getConnector_2001IncomingLinks(
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
		WildCard modelElement = (WildCard) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
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
	public static List<AspectualacmeLinkDescriptor> getBaseRole_3001IncomingLinks(
			View view) {
		BaseRole modelElement = (BaseRole) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
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
	public static List<AspectualacmeLinkDescriptor> getCrosscuttingRole_3002IncomingLinks(
			View view) {
		CrosscuttingRole modelElement = (CrosscuttingRole) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
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
	public static List<AspectualacmeLinkDescriptor> getGlue_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getRole_3011IncomingLinks(
			View view) {
		Role modelElement = (Role) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
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
	public static List<AspectualacmeLinkDescriptor> getPort_3005IncomingLinks(
			View view) {
		Port modelElement = (Port) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
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
	public static List<AspectualacmeLinkDescriptor> getRepresentation_3010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getAttachment_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getAttachment_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getAttachment_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getAttachment_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getAttachment_4005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getAttachment_4006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getConnector_2001OutgoingLinks(
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
		WildCard modelElement = (WildCard) view.getElement();
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
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
	public static List<AspectualacmeLinkDescriptor> getBaseRole_3001OutgoingLinks(
			View view) {
		BaseRole modelElement = (BaseRole) view.getElement();
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
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
	public static List<AspectualacmeLinkDescriptor> getCrosscuttingRole_3002OutgoingLinks(
			View view) {
		CrosscuttingRole modelElement = (CrosscuttingRole) view.getElement();
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
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
	public static List<AspectualacmeLinkDescriptor> getGlue_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getRole_3011OutgoingLinks(
			View view) {
		Role modelElement = (Role) view.getElement();
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
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
	public static List<AspectualacmeLinkDescriptor> getPort_3005OutgoingLinks(
			View view) {
		Port modelElement = (Port) view.getElement();
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
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
	public static List<AspectualacmeLinkDescriptor> getRepresentation_3010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getAttachment_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getAttachment_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getAttachment_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getAttachment_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getAttachment_4005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AspectualacmeLinkDescriptor> getAttachment_4006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<AspectualacmeLinkDescriptor> getContainedTypeModelFacetLinks_Attachment_4001(
			System container) {
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
		for (Iterator<?> links = container.getAttachments().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) linkObject;
			if (Attachment5EditPart.VISUAL_ID != AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement dst = link.getSecondElement();
			aspectualacme.attachableElement src = link.getFirstElement();
			result.add(new AspectualacmeLinkDescriptor(src, dst, link,
					AspectualacmeElementTypes.Attachment_4001,
					Attachment5EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AspectualacmeLinkDescriptor> getContainedTypeModelFacetLinks_Attachment_4002(
			System container) {
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
		for (Iterator<?> links = container.getAttachments().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) linkObject;
			if (Attachment6EditPart.VISUAL_ID != AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement dst = link.getSecondElement();
			aspectualacme.attachableElement src = link.getFirstElement();
			result.add(new AspectualacmeLinkDescriptor(src, dst, link,
					AspectualacmeElementTypes.Attachment_4002,
					Attachment6EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AspectualacmeLinkDescriptor> getContainedTypeModelFacetLinks_Attachment_4003(
			System container) {
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
		for (Iterator<?> links = container.getAttachments().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) linkObject;
			if (AttachmentEditPart.VISUAL_ID != AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement dst = link.getSecondElement();
			aspectualacme.attachableElement src = link.getFirstElement();
			result.add(new AspectualacmeLinkDescriptor(src, dst, link,
					AspectualacmeElementTypes.Attachment_4003,
					AttachmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AspectualacmeLinkDescriptor> getContainedTypeModelFacetLinks_Attachment_4004(
			System container) {
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
		for (Iterator<?> links = container.getAttachments().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) linkObject;
			if (Attachment2EditPart.VISUAL_ID != AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement dst = link.getSecondElement();
			aspectualacme.attachableElement src = link.getFirstElement();
			result.add(new AspectualacmeLinkDescriptor(src, dst, link,
					AspectualacmeElementTypes.Attachment_4004,
					Attachment2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AspectualacmeLinkDescriptor> getContainedTypeModelFacetLinks_Attachment_4005(
			System container) {
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
		for (Iterator<?> links = container.getAttachments().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) linkObject;
			if (Attachment3EditPart.VISUAL_ID != AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement dst = link.getSecondElement();
			aspectualacme.attachableElement src = link.getFirstElement();
			result.add(new AspectualacmeLinkDescriptor(src, dst, link,
					AspectualacmeElementTypes.Attachment_4005,
					Attachment3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AspectualacmeLinkDescriptor> getContainedTypeModelFacetLinks_Attachment_4006(
			System container) {
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
		for (Iterator<?> links = container.getAttachments().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) linkObject;
			if (Attachment4EditPart.VISUAL_ID != AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement dst = link.getSecondElement();
			aspectualacme.attachableElement src = link.getFirstElement();
			result.add(new AspectualacmeLinkDescriptor(src, dst, link,
					AspectualacmeElementTypes.Attachment_4006,
					Attachment4EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AspectualacmeLinkDescriptor> getIncomingTypeModelFacetLinks_Attachment_4001(
			aspectualacme.attachableElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AspectualacmePackage.eINSTANCE
					.getAttachment_SecondElement()
					|| false == setting.getEObject() instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) setting.getEObject();
			if (Attachment5EditPart.VISUAL_ID != AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement src = link.getFirstElement();
			result.add(new AspectualacmeLinkDescriptor(src, target, link,
					AspectualacmeElementTypes.Attachment_4001,
					Attachment5EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AspectualacmeLinkDescriptor> getIncomingTypeModelFacetLinks_Attachment_4002(
			aspectualacme.attachableElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AspectualacmePackage.eINSTANCE
					.getAttachment_SecondElement()
					|| false == setting.getEObject() instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) setting.getEObject();
			if (Attachment6EditPart.VISUAL_ID != AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement src = link.getFirstElement();
			result.add(new AspectualacmeLinkDescriptor(src, target, link,
					AspectualacmeElementTypes.Attachment_4002,
					Attachment6EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AspectualacmeLinkDescriptor> getIncomingTypeModelFacetLinks_Attachment_4003(
			aspectualacme.attachableElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AspectualacmePackage.eINSTANCE
					.getAttachment_SecondElement()
					|| false == setting.getEObject() instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) setting.getEObject();
			if (AttachmentEditPart.VISUAL_ID != AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement src = link.getFirstElement();
			result.add(new AspectualacmeLinkDescriptor(src, target, link,
					AspectualacmeElementTypes.Attachment_4003,
					AttachmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AspectualacmeLinkDescriptor> getIncomingTypeModelFacetLinks_Attachment_4004(
			aspectualacme.attachableElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AspectualacmePackage.eINSTANCE
					.getAttachment_SecondElement()
					|| false == setting.getEObject() instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) setting.getEObject();
			if (Attachment2EditPart.VISUAL_ID != AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement src = link.getFirstElement();
			result.add(new AspectualacmeLinkDescriptor(src, target, link,
					AspectualacmeElementTypes.Attachment_4004,
					Attachment2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AspectualacmeLinkDescriptor> getIncomingTypeModelFacetLinks_Attachment_4005(
			aspectualacme.attachableElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AspectualacmePackage.eINSTANCE
					.getAttachment_SecondElement()
					|| false == setting.getEObject() instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) setting.getEObject();
			if (Attachment3EditPart.VISUAL_ID != AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement src = link.getFirstElement();
			result.add(new AspectualacmeLinkDescriptor(src, target, link,
					AspectualacmeElementTypes.Attachment_4005,
					Attachment3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AspectualacmeLinkDescriptor> getIncomingTypeModelFacetLinks_Attachment_4006(
			aspectualacme.attachableElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AspectualacmePackage.eINSTANCE
					.getAttachment_SecondElement()
					|| false == setting.getEObject() instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) setting.getEObject();
			if (Attachment4EditPart.VISUAL_ID != AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement src = link.getFirstElement();
			result.add(new AspectualacmeLinkDescriptor(src, target, link,
					AspectualacmeElementTypes.Attachment_4006,
					Attachment4EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AspectualacmeLinkDescriptor> getOutgoingTypeModelFacetLinks_Attachment_4001(
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
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
		for (Iterator<?> links = container.getAttachments().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) linkObject;
			if (Attachment5EditPart.VISUAL_ID != AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement dst = link.getSecondElement();
			aspectualacme.attachableElement src = link.getFirstElement();
			if (src != source) {
				continue;
			}
			result.add(new AspectualacmeLinkDescriptor(src, dst, link,
					AspectualacmeElementTypes.Attachment_4001,
					Attachment5EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AspectualacmeLinkDescriptor> getOutgoingTypeModelFacetLinks_Attachment_4002(
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
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
		for (Iterator<?> links = container.getAttachments().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) linkObject;
			if (Attachment6EditPart.VISUAL_ID != AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement dst = link.getSecondElement();
			aspectualacme.attachableElement src = link.getFirstElement();
			if (src != source) {
				continue;
			}
			result.add(new AspectualacmeLinkDescriptor(src, dst, link,
					AspectualacmeElementTypes.Attachment_4002,
					Attachment6EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AspectualacmeLinkDescriptor> getOutgoingTypeModelFacetLinks_Attachment_4003(
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
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
		for (Iterator<?> links = container.getAttachments().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) linkObject;
			if (AttachmentEditPart.VISUAL_ID != AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement dst = link.getSecondElement();
			aspectualacme.attachableElement src = link.getFirstElement();
			if (src != source) {
				continue;
			}
			result.add(new AspectualacmeLinkDescriptor(src, dst, link,
					AspectualacmeElementTypes.Attachment_4003,
					AttachmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AspectualacmeLinkDescriptor> getOutgoingTypeModelFacetLinks_Attachment_4004(
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
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
		for (Iterator<?> links = container.getAttachments().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) linkObject;
			if (Attachment2EditPart.VISUAL_ID != AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement dst = link.getSecondElement();
			aspectualacme.attachableElement src = link.getFirstElement();
			if (src != source) {
				continue;
			}
			result.add(new AspectualacmeLinkDescriptor(src, dst, link,
					AspectualacmeElementTypes.Attachment_4004,
					Attachment2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AspectualacmeLinkDescriptor> getOutgoingTypeModelFacetLinks_Attachment_4005(
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
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
		for (Iterator<?> links = container.getAttachments().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) linkObject;
			if (Attachment3EditPart.VISUAL_ID != AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement dst = link.getSecondElement();
			aspectualacme.attachableElement src = link.getFirstElement();
			if (src != source) {
				continue;
			}
			result.add(new AspectualacmeLinkDescriptor(src, dst, link,
					AspectualacmeElementTypes.Attachment_4005,
					Attachment3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AspectualacmeLinkDescriptor> getOutgoingTypeModelFacetLinks_Attachment_4006(
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
		LinkedList<AspectualacmeLinkDescriptor> result = new LinkedList<AspectualacmeLinkDescriptor>();
		for (Iterator<?> links = container.getAttachments().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Attachment) {
				continue;
			}
			Attachment link = (Attachment) linkObject;
			if (Attachment4EditPart.VISUAL_ID != AspectualacmeVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			aspectualacme.attachableElement dst = link.getSecondElement();
			aspectualacme.attachableElement src = link.getFirstElement();
			if (src != source) {
				continue;
			}
			result.add(new AspectualacmeLinkDescriptor(src, dst, link,
					AspectualacmeElementTypes.Attachment_4006,
					Attachment4EditPart.VISUAL_ID));
		}
		return result;
	}

}
