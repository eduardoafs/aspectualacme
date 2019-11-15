/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.AspectualacmePackage;
import aspectualacme.Binding;
import aspectualacme.Element;
import aspectualacme.Property;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aspectualacme.impl.BindingImpl#getExternalElement <em>External Element</em>}</li>
 *   <li>{@link aspectualacme.impl.BindingImpl#getInternalElement <em>Internal Element</em>}</li>
 *   <li>{@link aspectualacme.impl.BindingImpl#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingImpl extends EObjectImpl implements Binding {
	/**
	 * The cached value of the '{@link #getExternalElement() <em>External Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalElement()
	 * @generated
	 * @ordered
	 */
	protected Element externalElement;

	/**
	 * The cached value of the '{@link #getInternalElement() <em>Internal Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> internalElement;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectualacmePackage.Literals.BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getExternalElement() {
		if (externalElement != null && externalElement.eIsProxy()) {
			InternalEObject oldExternalElement = (InternalEObject)externalElement;
			externalElement = (Element)eResolveProxy(oldExternalElement);
			if (externalElement != oldExternalElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectualacmePackage.BINDING__EXTERNAL_ELEMENT, oldExternalElement, externalElement));
			}
		}
		return externalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetExternalElement() {
		return externalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalElement(Element newExternalElement) {
		Element oldExternalElement = externalElement;
		externalElement = newExternalElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.BINDING__EXTERNAL_ELEMENT, oldExternalElement, externalElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getInternalElement() {
		if (internalElement == null) {
			internalElement = new EObjectResolvingEList<Element>(Element.class, this, AspectualacmePackage.BINDING__INTERNAL_ELEMENT);
		}
		return internalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectResolvingEList<Property>(Property.class, this, AspectualacmePackage.BINDING__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AspectualacmePackage.BINDING__EXTERNAL_ELEMENT:
				if (resolve) return getExternalElement();
				return basicGetExternalElement();
			case AspectualacmePackage.BINDING__INTERNAL_ELEMENT:
				return getInternalElement();
			case AspectualacmePackage.BINDING__PROPERTY:
				return getProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AspectualacmePackage.BINDING__EXTERNAL_ELEMENT:
				setExternalElement((Element)newValue);
				return;
			case AspectualacmePackage.BINDING__INTERNAL_ELEMENT:
				getInternalElement().clear();
				getInternalElement().addAll((Collection<? extends Element>)newValue);
				return;
			case AspectualacmePackage.BINDING__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AspectualacmePackage.BINDING__EXTERNAL_ELEMENT:
				setExternalElement((Element)null);
				return;
			case AspectualacmePackage.BINDING__INTERNAL_ELEMENT:
				getInternalElement().clear();
				return;
			case AspectualacmePackage.BINDING__PROPERTY:
				getProperty().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AspectualacmePackage.BINDING__EXTERNAL_ELEMENT:
				return externalElement != null;
			case AspectualacmePackage.BINDING__INTERNAL_ELEMENT:
				return internalElement != null && !internalElement.isEmpty();
			case AspectualacmePackage.BINDING__PROPERTY:
				return property != null && !property.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BindingImpl
