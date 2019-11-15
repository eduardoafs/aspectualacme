/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.AspectualacmePackage;
import aspectualacme.Connector;
import aspectualacme.ConnectorType;
import aspectualacme.Role;
import aspectualacme.RoleType;

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
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aspectualacme.impl.RoleImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link aspectualacme.impl.RoleImpl#getConnectorT <em>Connector T</em>}</li>
 *   <li>{@link aspectualacme.impl.RoleImpl#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link aspectualacme.impl.RoleImpl#getEffective_type <em>Effective type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends attachableElementImpl implements Role {
	/**
	 * The cached value of the '{@link #getRoleType() <em>Role Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleType()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleType> roleType;

	/**
	 * The cached value of the '{@link #getEffective_type() <em>Effective type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffective_type()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleType> effective_type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectualacmePackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getConnector() {
		if (eContainerFeatureID() != AspectualacmePackage.ROLE__CONNECTOR) return null;
		return (Connector)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnector(Connector newConnector, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConnector, AspectualacmePackage.ROLE__CONNECTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(Connector newConnector) {
		if (newConnector != eInternalContainer() || (eContainerFeatureID() != AspectualacmePackage.ROLE__CONNECTOR && newConnector != null)) {
			if (EcoreUtil.isAncestor(this, newConnector))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConnector != null)
				msgs = ((InternalEObject)newConnector).eInverseAdd(this, AspectualacmePackage.CONNECTOR__ROLE, Connector.class, msgs);
			msgs = basicSetConnector(newConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ROLE__CONNECTOR, newConnector, newConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorType getConnectorT() {
		if (eContainerFeatureID() != AspectualacmePackage.ROLE__CONNECTOR_T) return null;
		return (ConnectorType)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectorT(ConnectorType newConnectorT, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConnectorT, AspectualacmePackage.ROLE__CONNECTOR_T, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorT(ConnectorType newConnectorT) {
		if (newConnectorT != eInternalContainer() || (eContainerFeatureID() != AspectualacmePackage.ROLE__CONNECTOR_T && newConnectorT != null)) {
			if (EcoreUtil.isAncestor(this, newConnectorT))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConnectorT != null)
				msgs = ((InternalEObject)newConnectorT).eInverseAdd(this, AspectualacmePackage.CONNECTOR_TYPE__ROLE, ConnectorType.class, msgs);
			msgs = basicSetConnectorT(newConnectorT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ROLE__CONNECTOR_T, newConnectorT, newConnectorT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleType> getRoleType() {
		if (roleType == null) {
			roleType = new EObjectResolvingEList<RoleType>(RoleType.class, this, AspectualacmePackage.ROLE__ROLE_TYPE);
		}
		return roleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleType> getEffective_type() {
		if (effective_type == null) {
			effective_type = new EObjectResolvingEList<RoleType>(RoleType.class, this, AspectualacmePackage.ROLE__EFFECTIVE_TYPE);
		}
		return effective_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AspectualacmePackage.ROLE__CONNECTOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConnector((Connector)otherEnd, msgs);
			case AspectualacmePackage.ROLE__CONNECTOR_T:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConnectorT((ConnectorType)otherEnd, msgs);
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
			case AspectualacmePackage.ROLE__CONNECTOR:
				return basicSetConnector(null, msgs);
			case AspectualacmePackage.ROLE__CONNECTOR_T:
				return basicSetConnectorT(null, msgs);
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
			case AspectualacmePackage.ROLE__CONNECTOR:
				return eInternalContainer().eInverseRemove(this, AspectualacmePackage.CONNECTOR__ROLE, Connector.class, msgs);
			case AspectualacmePackage.ROLE__CONNECTOR_T:
				return eInternalContainer().eInverseRemove(this, AspectualacmePackage.CONNECTOR_TYPE__ROLE, ConnectorType.class, msgs);
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
			case AspectualacmePackage.ROLE__CONNECTOR:
				return getConnector();
			case AspectualacmePackage.ROLE__CONNECTOR_T:
				return getConnectorT();
			case AspectualacmePackage.ROLE__ROLE_TYPE:
				return getRoleType();
			case AspectualacmePackage.ROLE__EFFECTIVE_TYPE:
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
			case AspectualacmePackage.ROLE__CONNECTOR:
				setConnector((Connector)newValue);
				return;
			case AspectualacmePackage.ROLE__CONNECTOR_T:
				setConnectorT((ConnectorType)newValue);
				return;
			case AspectualacmePackage.ROLE__ROLE_TYPE:
				getRoleType().clear();
				getRoleType().addAll((Collection<? extends RoleType>)newValue);
				return;
			case AspectualacmePackage.ROLE__EFFECTIVE_TYPE:
				getEffective_type().clear();
				getEffective_type().addAll((Collection<? extends RoleType>)newValue);
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
			case AspectualacmePackage.ROLE__CONNECTOR:
				setConnector((Connector)null);
				return;
			case AspectualacmePackage.ROLE__CONNECTOR_T:
				setConnectorT((ConnectorType)null);
				return;
			case AspectualacmePackage.ROLE__ROLE_TYPE:
				getRoleType().clear();
				return;
			case AspectualacmePackage.ROLE__EFFECTIVE_TYPE:
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
			case AspectualacmePackage.ROLE__CONNECTOR:
				return getConnector() != null;
			case AspectualacmePackage.ROLE__CONNECTOR_T:
				return getConnectorT() != null;
			case AspectualacmePackage.ROLE__ROLE_TYPE:
				return roleType != null && !roleType.isEmpty();
			case AspectualacmePackage.ROLE__EFFECTIVE_TYPE:
				return effective_type != null && !effective_type.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoleImpl
