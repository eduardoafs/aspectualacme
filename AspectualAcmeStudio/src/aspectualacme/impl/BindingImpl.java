/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.AspectualacmePackage;
import aspectualacme.Binding;
import aspectualacme.Port;
import aspectualacme.Property;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aspectualacme.impl.BindingImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link aspectualacme.impl.BindingImpl#getFirstPort <em>First Port</em>}</li>
 *   <li>{@link aspectualacme.impl.BindingImpl#getSecondPort <em>Second Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingImpl extends EObjectImpl implements Binding {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> property;

	/**
	 * The cached value of the '{@link #getFirstPort() <em>First Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPort()
	 * @generated
	 * @ordered
	 */
	protected Port firstPort;

	/**
	 * The cached value of the '{@link #getSecondPort() <em>Second Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondPort()
	 * @generated
	 * @ordered
	 */
	protected Port secondPort;

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
	public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<Property>(Property.class, this, AspectualacmePackage.BINDING__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getFirstPort() {
		if (firstPort != null && firstPort.eIsProxy()) {
			InternalEObject oldFirstPort = (InternalEObject)firstPort;
			firstPort = (Port)eResolveProxy(oldFirstPort);
			if (firstPort != oldFirstPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectualacmePackage.BINDING__FIRST_PORT, oldFirstPort, firstPort));
			}
		}
		return firstPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetFirstPort() {
		return firstPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstPort(Port newFirstPort) {
		Port oldFirstPort = firstPort;
		firstPort = newFirstPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.BINDING__FIRST_PORT, oldFirstPort, firstPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getSecondPort() {
		if (secondPort != null && secondPort.eIsProxy()) {
			InternalEObject oldSecondPort = (InternalEObject)secondPort;
			secondPort = (Port)eResolveProxy(oldSecondPort);
			if (secondPort != oldSecondPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectualacmePackage.BINDING__SECOND_PORT, oldSecondPort, secondPort));
			}
		}
		return secondPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetSecondPort() {
		return secondPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondPort(Port newSecondPort) {
		Port oldSecondPort = secondPort;
		secondPort = newSecondPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.BINDING__SECOND_PORT, oldSecondPort, secondPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AspectualacmePackage.BINDING__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AspectualacmePackage.BINDING__PROPERTY:
				return getProperty();
			case AspectualacmePackage.BINDING__FIRST_PORT:
				if (resolve) return getFirstPort();
				return basicGetFirstPort();
			case AspectualacmePackage.BINDING__SECOND_PORT:
				if (resolve) return getSecondPort();
				return basicGetSecondPort();
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
			case AspectualacmePackage.BINDING__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case AspectualacmePackage.BINDING__FIRST_PORT:
				setFirstPort((Port)newValue);
				return;
			case AspectualacmePackage.BINDING__SECOND_PORT:
				setSecondPort((Port)newValue);
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
			case AspectualacmePackage.BINDING__PROPERTY:
				getProperty().clear();
				return;
			case AspectualacmePackage.BINDING__FIRST_PORT:
				setFirstPort((Port)null);
				return;
			case AspectualacmePackage.BINDING__SECOND_PORT:
				setSecondPort((Port)null);
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
			case AspectualacmePackage.BINDING__PROPERTY:
				return property != null && !property.isEmpty();
			case AspectualacmePackage.BINDING__FIRST_PORT:
				return firstPort != null;
			case AspectualacmePackage.BINDING__SECOND_PORT:
				return secondPort != null;
		}
		return super.eIsSet(featureID);
	}

} //BindingImpl
