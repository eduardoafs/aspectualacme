/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.AspectualConnector;
import aspectualacme.AspectualacmePackage;
import aspectualacme.BaseRole;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aspectualacme.impl.BaseRoleImpl#getAspectualConnector <em>Aspectual Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseRoleImpl extends RoleImpl implements BaseRole {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectualacmePackage.Literals.BASE_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectualConnector getAspectualConnector() {
		if (eContainerFeatureID() != AspectualacmePackage.BASE_ROLE__ASPECTUAL_CONNECTOR) return null;
		return (AspectualConnector)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAspectualConnector(AspectualConnector newAspectualConnector, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAspectualConnector, AspectualacmePackage.BASE_ROLE__ASPECTUAL_CONNECTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspectualConnector(AspectualConnector newAspectualConnector) {
		if (newAspectualConnector != eInternalContainer() || (eContainerFeatureID() != AspectualacmePackage.BASE_ROLE__ASPECTUAL_CONNECTOR && newAspectualConnector != null)) {
			if (EcoreUtil.isAncestor(this, newAspectualConnector))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAspectualConnector != null)
				msgs = ((InternalEObject)newAspectualConnector).eInverseAdd(this, AspectualacmePackage.ASPECTUAL_CONNECTOR__BASE_ROLE, AspectualConnector.class, msgs);
			msgs = basicSetAspectualConnector(newAspectualConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.BASE_ROLE__ASPECTUAL_CONNECTOR, newAspectualConnector, newAspectualConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AspectualacmePackage.BASE_ROLE__ASPECTUAL_CONNECTOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAspectualConnector((AspectualConnector)otherEnd, msgs);
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
			case AspectualacmePackage.BASE_ROLE__ASPECTUAL_CONNECTOR:
				return basicSetAspectualConnector(null, msgs);
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
			case AspectualacmePackage.BASE_ROLE__ASPECTUAL_CONNECTOR:
				return eInternalContainer().eInverseRemove(this, AspectualacmePackage.ASPECTUAL_CONNECTOR__BASE_ROLE, AspectualConnector.class, msgs);
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
			case AspectualacmePackage.BASE_ROLE__ASPECTUAL_CONNECTOR:
				return getAspectualConnector();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AspectualacmePackage.BASE_ROLE__ASPECTUAL_CONNECTOR:
				setAspectualConnector((AspectualConnector)newValue);
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
			case AspectualacmePackage.BASE_ROLE__ASPECTUAL_CONNECTOR:
				setAspectualConnector((AspectualConnector)null);
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
			case AspectualacmePackage.BASE_ROLE__ASPECTUAL_CONNECTOR:
				return getAspectualConnector() != null;
		}
		return super.eIsSet(featureID);
	}

} //BaseRoleImpl
