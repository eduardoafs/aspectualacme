package componentRepresentationaspectualacme.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import aspectualacme.AspectualacmePackage;

/**
 * @generated
 */
public class AspectualacmeElementTypes {

	/**
	 * @generated
	 */
	private AspectualacmeElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Representation_1000 = getElementType("ComponentRepresentationAspectualAcmeStudio.diagram.Representation_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType System_2009 = getElementType("ComponentRepresentationAspectualAcmeStudio.diagram.System_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Component_2010 = getElementType("ComponentRepresentationAspectualAcmeStudio.diagram.Component_2010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Component_3001 = getElementType("ComponentRepresentationAspectualAcmeStudio.diagram.Component_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Port_3002 = getElementType("ComponentRepresentationAspectualAcmeStudio.diagram.Port_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Representation_3003 = getElementType("ComponentRepresentationAspectualAcmeStudio.diagram.Representation_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Connector_3004 = getElementType("ComponentRepresentationAspectualAcmeStudio.diagram.Connector_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BaseRole_3005 = getElementType("ComponentRepresentationAspectualAcmeStudio.diagram.BaseRole_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CrosscuttingRole_3006 = getElementType("ComponentRepresentationAspectualAcmeStudio.diagram.CrosscuttingRole_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Glue_3008 = getElementType("ComponentRepresentationAspectualAcmeStudio.diagram.Glue_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Role_3012 = getElementType("ComponentRepresentationAspectualAcmeStudio.diagram.Role_3012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType WildCard_3009 = getElementType("ComponentRepresentationAspectualAcmeStudio.diagram.WildCard_3009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Port_3011 = getElementType("ComponentRepresentationAspectualAcmeStudio.diagram.Port_3011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Attachment_4001 = getElementType("ComponentRepresentationAspectualAcmeStudio.diagram.Attachment_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Attachment_4002 = getElementType("ComponentRepresentationAspectualAcmeStudio.diagram.Attachment_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Attachment_4003 = getElementType("ComponentRepresentationAspectualAcmeStudio.diagram.Attachment_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Attachment_4004 = getElementType("ComponentRepresentationAspectualAcmeStudio.diagram.Attachment_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Attachment_4005 = getElementType("ComponentRepresentationAspectualAcmeStudio.diagram.Attachment_4005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Attachment_4006 = getElementType("ComponentRepresentationAspectualAcmeStudio.diagram.Attachment_4006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Binding_4007 = getElementType("ComponentRepresentationAspectualAcmeStudio.diagram.Binding_4007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return componentRepresentationaspectualacme.diagram.part.ComponentRepresentationAspectualacmeDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Representation_1000,
					AspectualacmePackage.eINSTANCE.getRepresentation());

			elements.put(System_2009,
					AspectualacmePackage.eINSTANCE.getSystem());

			elements.put(Component_2010,
					AspectualacmePackage.eINSTANCE.getComponent());

			elements.put(Component_3001,
					AspectualacmePackage.eINSTANCE.getComponent());

			elements.put(Port_3002, AspectualacmePackage.eINSTANCE.getPort());

			elements.put(Representation_3003,
					AspectualacmePackage.eINSTANCE.getRepresentation());

			elements.put(Connector_3004,
					AspectualacmePackage.eINSTANCE.getConnector());

			elements.put(BaseRole_3005,
					AspectualacmePackage.eINSTANCE.getBaseRole());

			elements.put(CrosscuttingRole_3006,
					AspectualacmePackage.eINSTANCE.getCrosscuttingRole());

			elements.put(Glue_3008, AspectualacmePackage.eINSTANCE.getGlue());

			elements.put(Role_3012, AspectualacmePackage.eINSTANCE.getRole());

			elements.put(WildCard_3009,
					AspectualacmePackage.eINSTANCE.getWildCard());

			elements.put(Port_3011, AspectualacmePackage.eINSTANCE.getPort());

			elements.put(Attachment_4001,
					AspectualacmePackage.eINSTANCE.getAttachment());

			elements.put(Attachment_4002,
					AspectualacmePackage.eINSTANCE.getAttachment());

			elements.put(Attachment_4003,
					AspectualacmePackage.eINSTANCE.getAttachment());

			elements.put(Attachment_4004,
					AspectualacmePackage.eINSTANCE.getAttachment());

			elements.put(Attachment_4005,
					AspectualacmePackage.eINSTANCE.getAttachment());

			elements.put(Attachment_4006,
					AspectualacmePackage.eINSTANCE.getAttachment());

			elements.put(Binding_4007,
					AspectualacmePackage.eINSTANCE.getBinding());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Representation_1000);
			KNOWN_ELEMENT_TYPES.add(System_2009);
			KNOWN_ELEMENT_TYPES.add(Component_2010);
			KNOWN_ELEMENT_TYPES.add(Component_3001);
			KNOWN_ELEMENT_TYPES.add(Port_3002);
			KNOWN_ELEMENT_TYPES.add(Representation_3003);
			KNOWN_ELEMENT_TYPES.add(Connector_3004);
			KNOWN_ELEMENT_TYPES.add(BaseRole_3005);
			KNOWN_ELEMENT_TYPES.add(CrosscuttingRole_3006);
			KNOWN_ELEMENT_TYPES.add(Glue_3008);
			KNOWN_ELEMENT_TYPES.add(Role_3012);
			KNOWN_ELEMENT_TYPES.add(WildCard_3009);
			KNOWN_ELEMENT_TYPES.add(Port_3011);
			KNOWN_ELEMENT_TYPES.add(Attachment_4001);
			KNOWN_ELEMENT_TYPES.add(Attachment_4002);
			KNOWN_ELEMENT_TYPES.add(Attachment_4003);
			KNOWN_ELEMENT_TYPES.add(Attachment_4004);
			KNOWN_ELEMENT_TYPES.add(Attachment_4005);
			KNOWN_ELEMENT_TYPES.add(Attachment_4006);
			KNOWN_ELEMENT_TYPES.add(Binding_4007);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case componentRepresentationaspectualacme.diagram.edit.parts.FreeformLayerEditPart.VISUAL_ID:
			return Representation_1000;
		case componentRepresentationaspectualacme.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return System_2009;
		case componentRepresentationaspectualacme.diagram.edit.parts.Component2EditPart.VISUAL_ID:
			return Component_2010;
		case componentRepresentationaspectualacme.diagram.edit.parts.ComponentEditPart.VISUAL_ID:
			return Component_3001;
		case componentRepresentationaspectualacme.diagram.edit.parts.PortEditPart.VISUAL_ID:
			return Port_3002;
		case componentRepresentationaspectualacme.diagram.edit.parts.RepresentationEditPart.VISUAL_ID:
			return Representation_3003;
		case componentRepresentationaspectualacme.diagram.edit.parts.ConnectorEditPart.VISUAL_ID:
			return Connector_3004;
		case componentRepresentationaspectualacme.diagram.edit.parts.BaseRoleEditPart.VISUAL_ID:
			return BaseRole_3005;
		case componentRepresentationaspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart.VISUAL_ID:
			return CrosscuttingRole_3006;
		case componentRepresentationaspectualacme.diagram.edit.parts.GlueEditPart.VISUAL_ID:
			return Glue_3008;
		case componentRepresentationaspectualacme.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return Role_3012;
		case componentRepresentationaspectualacme.diagram.edit.parts.WildCardEditPart.VISUAL_ID:
			return WildCard_3009;
		case componentRepresentationaspectualacme.diagram.edit.parts.Port2EditPart.VISUAL_ID:
			return Port_3011;
		case componentRepresentationaspectualacme.diagram.edit.parts.AttachmentEditPart.VISUAL_ID:
			return Attachment_4001;
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment2EditPart.VISUAL_ID:
			return Attachment_4002;
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment3EditPart.VISUAL_ID:
			return Attachment_4003;
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment4EditPart.VISUAL_ID:
			return Attachment_4004;
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment5EditPart.VISUAL_ID:
			return Attachment_4005;
		case componentRepresentationaspectualacme.diagram.edit.parts.Attachment6EditPart.VISUAL_ID:
			return Attachment_4006;
		case componentRepresentationaspectualacme.diagram.edit.parts.BindingEditPart.VISUAL_ID:
			return Binding_4007;
		}
		return null;
	}

}
