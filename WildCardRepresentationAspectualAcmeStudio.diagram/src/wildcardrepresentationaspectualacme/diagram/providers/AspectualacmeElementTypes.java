package wildcardrepresentationaspectualacme.diagram.providers;

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

import wildcardrepresentationaspectualacme.diagram.edit.parts.Component2EditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.ComponentEditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.PortEditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.RepresentationEditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.SystemEditPart;
import wildcardrepresentationaspectualacme.diagram.edit.parts.WildCardEditPart;
import wildcardrepresentationaspectualacme.diagram.part.WildCardRepresentationAspectualacmeDiagramEditorPlugin;
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
	public static final IElementType WildCard_1000 = getElementType("WildCardRepresentationAspectualAcmeStudio.diagram.WildCard_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Component_2002 = getElementType("WildCardRepresentationAspectualAcmeStudio.diagram.Component_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Port_3001 = getElementType("WildCardRepresentationAspectualAcmeStudio.diagram.Port_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Representation_3004 = getElementType("WildCardRepresentationAspectualAcmeStudio.diagram.Representation_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType System_3003 = getElementType("WildCardRepresentationAspectualAcmeStudio.diagram.System_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Component_3005 = getElementType("WildCardRepresentationAspectualAcmeStudio.diagram.Component_3005"); //$NON-NLS-1$

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
				return WildCardRepresentationAspectualacmeDiagramEditorPlugin
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

			elements.put(WildCard_1000,
					AspectualacmePackage.eINSTANCE.getWildCard());

			elements.put(Component_2002,
					AspectualacmePackage.eINSTANCE.getComponent());

			elements.put(Port_3001, AspectualacmePackage.eINSTANCE.getPort());

			elements.put(Representation_3004,
					AspectualacmePackage.eINSTANCE.getRepresentation());

			elements.put(System_3003,
					AspectualacmePackage.eINSTANCE.getSystem());

			elements.put(Component_3005,
					AspectualacmePackage.eINSTANCE.getComponent());
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
			KNOWN_ELEMENT_TYPES.add(WildCard_1000);
			KNOWN_ELEMENT_TYPES.add(Component_2002);
			KNOWN_ELEMENT_TYPES.add(Port_3001);
			KNOWN_ELEMENT_TYPES.add(Representation_3004);
			KNOWN_ELEMENT_TYPES.add(System_3003);
			KNOWN_ELEMENT_TYPES.add(Component_3005);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case WildCardEditPart.VISUAL_ID:
			return WildCard_1000;
		case ComponentEditPart.VISUAL_ID:
			return Component_2002;
		case PortEditPart.VISUAL_ID:
			return Port_3001;
		case RepresentationEditPart.VISUAL_ID:
			return Representation_3004;
		case SystemEditPart.VISUAL_ID:
			return System_3003;
		case Component2EditPart.VISUAL_ID:
			return Component_3005;
		}
		return null;
	}

}
