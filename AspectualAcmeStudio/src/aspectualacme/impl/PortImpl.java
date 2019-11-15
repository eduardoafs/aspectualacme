/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.AspectualacmePackage;
import aspectualacme.Component;
import aspectualacme.ComponentType;
import aspectualacme.Port;
import aspectualacme.PortType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aspectualacme.impl.PortImpl#getPortType <em>Port Type</em>}</li>
 *   <li>{@link aspectualacme.impl.PortImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link aspectualacme.impl.PortImpl#getComponentT <em>Component T</em>}</li>
 *   <li>{@link aspectualacme.impl.PortImpl#getEffective_type <em>Effective type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortImpl extends attachableElementImpl implements Port {
	/**
	 * The cached value of the '{@link #getPortType() <em>Port Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortType()
	 * @generated
	 * @ordered
	 */
	protected EList<PortType> portType;

	/**
	 * The cached value of the '{@link #getEffective_type() <em>Effective type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffective_type()
	 * @generated
	 * @ordered
	 */
	protected EList<PortType> effective_type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectualacmePackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponent() {
		if (eContainerFeatureID() != AspectualacmePackage.PORT__COMPONENT) return null;
		return (Component)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(Component newComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComponent, AspectualacmePackage.PORT__COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent) {
		if (newComponent != eInternalContainer() || (eContainerFeatureID() != AspectualacmePackage.PORT__COMPONENT && newComponent != null)) {
			if (EcoreUtil.isAncestor(this, newComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponent != null)
				msgs = ((InternalEObject)newComponent).eInverseAdd(this, AspectualacmePackage.COMPONENT__PORT, Component.class, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.PORT__COMPONENT, newComponent, newComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType getComponentT() {
		if (eContainerFeatureID() != AspectualacmePackage.PORT__COMPONENT_T) return null;
		return (ComponentType)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentT(ComponentType newComponentT, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComponentT, AspectualacmePackage.PORT__COMPONENT_T, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentT(ComponentType newComponentT) {
		if (newComponentT != eInternalContainer() || (eContainerFeatureID() != AspectualacmePackage.PORT__COMPONENT_T && newComponentT != null)) {
			if (EcoreUtil.isAncestor(this, newComponentT))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponentT != null)
				msgs = ((InternalEObject)newComponentT).eInverseAdd(this, AspectualacmePackage.COMPONENT_TYPE__PORT, ComponentType.class, msgs);
			msgs = basicSetComponentT(newComponentT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.PORT__COMPONENT_T, newComponentT, newComponentT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortType> getEffective_type() {
		if (effective_type == null) {
			effective_type = new EObjectResolvingEList<PortType>(PortType.class, this, AspectualacmePackage.PORT__EFFECTIVE_TYPE);
		}
		return effective_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortType> getPortType() {
		if (portType == null) {
			portType = new EObjectResolvingEList<PortType>(PortType.class, this, AspectualacmePackage.PORT__PORT_TYPE);
		}
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AspectualacmePackage.PORT__COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComponent((Component)otherEnd, msgs);
			case AspectualacmePackage.PORT__COMPONENT_T:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComponentT((ComponentType)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AspectualacmePackage.PORT__COMPONENT:
				return basicSetComponent(null, msgs);
			case AspectualacmePackage.PORT__COMPONENT_T:
				return basicSetComponentT(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AspectualacmePackage.PORT__COMPONENT:
				return eInternalContainer().eInverseRemove(this, AspectualacmePackage.COMPONENT__PORT, Component.class, msgs);
			case AspectualacmePackage.PORT__COMPONENT_T:
				return eInternalContainer().eInverseRemove(this, AspectualacmePackage.COMPONENT_TYPE__PORT, ComponentType.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AspectualacmePackage.PORT__PORT_TYPE:
				return getPortType();
			case AspectualacmePackage.PORT__COMPONENT:
				return getComponent();
			case AspectualacmePackage.PORT__COMPONENT_T:
				return getComponentT();
			case AspectualacmePackage.PORT__EFFECTIVE_TYPE:
				return getEffective_type();
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
			case AspectualacmePackage.PORT__PORT_TYPE:
				getPortType().clear();
				getPortType().addAll((Collection<? extends PortType>)newValue);
				return;
			case AspectualacmePackage.PORT__COMPONENT:
				setComponent((Component)newValue);
				return;
			case AspectualacmePackage.PORT__COMPONENT_T:
				setComponentT((ComponentType)newValue);
				return;
			case AspectualacmePackage.PORT__EFFECTIVE_TYPE:
				getEffective_type().clear();
				getEffective_type().addAll((Collection<? extends PortType>)newValue);
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
			case AspectualacmePackage.PORT__PORT_TYPE:
				getPortType().clear();
				return;
			case AspectualacmePackage.PORT__COMPONENT:
				setComponent((Component)null);
				return;
			case AspectualacmePackage.PORT__COMPONENT_T:
				setComponentT((ComponentType)null);
				return;
			case AspectualacmePackage.PORT__EFFECTIVE_TYPE:
				getEffective_type().clear();
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
			case AspectualacmePackage.PORT__PORT_TYPE:
				return portType != null && !portType.isEmpty();
			case AspectualacmePackage.PORT__COMPONENT:
				return getComponent() != null;
			case AspectualacmePackage.PORT__COMPONENT_T:
				return getComponentT() != null;
			case AspectualacmePackage.PORT__EFFECTIVE_TYPE:
				return effective_type != null && !effective_type.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PortImpl
