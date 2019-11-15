package aspectualacme.diagram.providers;

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
import aspectualacme.diagram.edit.parts.Attachment2EditPart;
import aspectualacme.diagram.edit.parts.Attachment3EditPart;
import aspectualacme.diagram.edit.parts.Attachment4EditPart;
import aspectualacme.diagram.edit.parts.Attachment5EditPart;
import aspectualacme.diagram.edit.parts.Attachment6EditPart;
import aspectualacme.diagram.edit.parts.AttachmentEditPart;
import aspectualacme.diagram.edit.parts.BaseRoleEditPart;
import aspectualacme.diagram.edit.parts.ComponentEditPart;
import aspectualacme.diagram.edit.parts.ConnectorEditPart;
import aspectualacme.diagram.edit.parts.CrosscuttingRoleEditPart;
import aspectualacme.diagram.edit.parts.GlueEditPart;
import aspectualacme.diagram.edit.parts.PortEditPart;
import aspectualacme.diagram.edit.parts.RepresentationEditPart;
import aspectualacme.diagram.edit.parts.RoleEditPart;
import aspectualacme.diagram.edit.parts.SystemEditPart;
import aspectualacme.diagram.edit.parts.WildCardEditPart;
import aspectualacme.diagram.part.AspectualacmeDiagramEditorPlugin;

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
	public static final IElementType System_1000 = getElementType("AspectualAcmeStudio.diagram.System_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Connector_2001 = getElementType("AspectualAcmeStudio.diagram.Connector_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Component_2002 = getElementType("AspectualAcmeStudio.diagram.Component_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType WildCard_2003 = getElementType("AspectualAcmeStudio.diagram.WildCard_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType BaseRole_3001 = getElementType("AspectualAcmeStudio.diagram.BaseRole_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CrosscuttingRole_3002 = getElementType("AspectualAcmeStudio.diagram.CrosscuttingRole_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Glue_3004 = getElementType("AspectualAcmeStudio.diagram.Glue_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Role_3011 = getElementType("AspectualAcmeStudio.diagram.Role_3011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Port_3005 = getElementType("AspectualAcmeStudio.diagram.Port_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Representation_3010 = getElementType("AspectualAcmeStudio.diagram.Representation_3010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Attachment_4001 = getElementType("AspectualAcmeStudio.diagram.Attachment_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Attachment_4002 = getElementType("AspectualAcmeStudio.diagram.Attachment_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Attachment_4003 = getElementType("AspectualAcmeStudio.diagram.Attachment_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Attachment_4004 = getElementType("AspectualAcmeStudio.diagram.Attachment_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Attachment_4005 = getElementType("AspectualAcmeStudio.diagram.Attachment_4005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Attachment_4006 = getElementType("AspectualAcmeStudio.diagram.Attachment_4006"); //$NON-NLS-1$

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
				return AspectualacmeDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
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

			elements.put(System_1000,
					AspectualacmePackage.eINSTANCE.getSystem());

			elements.put(Connector_2001,
					AspectualacmePackage.eINSTANCE.getConnector());

			elements.put(Component_2002,
					AspectualacmePackage.eINSTANCE.getComponent());

			elements.put(WildCard_2003,
					AspectualacmePackage.eINSTANCE.getWildCard());

			elements.put(BaseRole_3001,
					AspectualacmePackage.eINSTANCE.getBaseRole());

			elements.put(CrosscuttingRole_3002,
					AspectualacmePackage.eINSTANCE.getCrosscuttingRole());

			elements.put(Glue_3004, AspectualacmePackage.eINSTANCE.getGlue());

			elements.put(Role_3011, AspectualacmePackage.eINSTANCE.getRole());

			elements.put(Port_3005, AspectualacmePackage.eINSTANCE.getPort());

			elements.put(Representation_3010,
					AspectualacmePackage.eINSTANCE.getRepresentation());

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
			KNOWN_ELEMENT_TYPES.add(System_1000);
			KNOWN_ELEMENT_TYPES.add(Connector_2001);
			KNOWN_ELEMENT_TYPES.add(Component_2002);
			KNOWN_ELEMENT_TYPES.add(WildCard_2003);
			KNOWN_ELEMENT_TYPES.add(BaseRole_3001);
			KNOWN_ELEMENT_TYPES.add(CrosscuttingRole_3002);
			KNOWN_ELEMENT_TYPES.add(Glue_3004);
			KNOWN_ELEMENT_TYPES.add(Role_3011);
			KNOWN_ELEMENT_TYPES.add(Port_3005);
			KNOWN_ELEMENT_TYPES.add(Representation_3010);
			KNOWN_ELEMENT_TYPES.add(Attachment_4001);
			KNOWN_ELEMENT_TYPES.add(Attachment_4002);
			KNOWN_ELEMENT_TYPES.add(Attachment_4003);
			KNOWN_ELEMENT_TYPES.add(Attachment_4004);
			KNOWN_ELEMENT_TYPES.add(Attachment_4005);
			KNOWN_ELEMENT_TYPES.add(Attachment_4006);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SystemEditPart.VISUAL_ID:
			return System_1000;
		case ConnectorEditPart.VISUAL_ID:
			return Connector_2001;
		case ComponentEditPart.VISUAL_ID:
			return Component_2002;
		case WildCardEditPart.VISUAL_ID:
			return WildCard_2003;
		case BaseRoleEditPart.VISUAL_ID:
			return BaseRole_3001;
		case CrosscuttingRoleEditPart.VISUAL_ID:
			return CrosscuttingRole_3002;
		case GlueEditPart.VISUAL_ID:
			return Glue_3004;
		case RoleEditPart.VISUAL_ID:
			return Role_3011;
		case PortEditPart.VISUAL_ID:
			return Port_3005;
		case RepresentationEditPart.VISUAL_ID:
			return Representation_3010;
		case Attachment5EditPart.VISUAL_ID:
			return Attachment_4001;
		case Attachment6EditPart.VISUAL_ID:
			return Attachment_4002;
		case AttachmentEditPart.VISUAL_ID:
			return Attachment_4003;
		case Attachment2EditPart.VISUAL_ID:
			return Attachment_4004;
		case Attachment3EditPart.VISUAL_ID:
			return Attachment_4005;
		case Attachment4EditPart.VISUAL_ID:
			return Attachment_4006;
		}
		return null;
	}

}
