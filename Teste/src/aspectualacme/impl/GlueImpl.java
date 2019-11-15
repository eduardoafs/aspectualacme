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
import aspectualacme.CrosscuttingRole;
import aspectualacme.Glue;
import aspectualacme.GlueType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aspectualacme.impl.GlueImpl#getPrefixRole <em>Prefix Role</em>}</li>
 *   <li>{@link aspectualacme.impl.GlueImpl#getSuffixRole <em>Suffix Role</em>}</li>
 *   <li>{@link aspectualacme.impl.GlueImpl#getGlueType <em>Glue Type</em>}</li>
 *   <li>{@link aspectualacme.impl.GlueImpl#getAspectualConnector <em>Aspectual Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlueImpl extends EObjectImpl implements Glue {
	/**
	 * The cached value of the '{@link #getPrefixRole() <em>Prefix Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefixRole()
	 * @generated
	 * @ordered
	 */
	protected CrosscuttingRole prefixRole;

	/**
	 * The cached value of the '{@link #getSuffixRole() <em>Suffix Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffixRole()
	 * @generated
	 * @ordered
	 */
	protected BaseRole suffixRole;

	/**
	 * The default value of the '{@link #getGlueType() <em>Glue Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlueType()
	 * @generated
	 * @ordered
	 */
	protected static final GlueType GLUE_TYPE_EDEFAULT = GlueType.BEFORE;

	/**
	 * The cached value of the '{@link #getGlueType() <em>Glue Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlueType()
	 * @generated
	 * @ordered
	 */
	protected GlueType glueType = GLUE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectualacmePackage.Literals.GLUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrosscuttingRole getPrefixRole() {
		if (prefixRole != null && prefixRole.eIsProxy()) {
			InternalEObject oldPrefixRole = (InternalEObject)prefixRole;
			prefixRole = (CrosscuttingRole)eResolveProxy(oldPrefixRole);
			if (prefixRole != oldPrefixRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectualacmePackage.GLUE__PREFIX_ROLE, oldPrefixRole, prefixRole));
			}
		}
		return prefixRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrosscuttingRole basicGetPrefixRole() {
		return prefixRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefixRole(CrosscuttingRole newPrefixRole) {
		CrosscuttingRole oldPrefixRole = prefixRole;
		prefixRole = newPrefixRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.GLUE__PREFIX_ROLE, oldPrefixRole, prefixRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseRole getSuffixRole() {
		if (suffixRole != null && suffixRole.eIsProxy()) {
			InternalEObject oldSuffixRole = (InternalEObject)suffixRole;
			suffixRole = (BaseRole)eResolveProxy(oldSuffixRole);
			if (suffixRole != oldSuffixRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectualacmePackage.GLUE__SUFFIX_ROLE, oldSuffixRole, suffixRole));
			}
		}
		return suffixRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseRole basicGetSuffixRole() {
		return suffixRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuffixRole(BaseRole newSuffixRole) {
		BaseRole oldSuffixRole = suffixRole;
		suffixRole = newSuffixRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.GLUE__SUFFIX_ROLE, oldSuffixRole, suffixRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlueType getGlueType() {
		return glueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlueType(GlueType newGlueType) {
		GlueType oldGlueType = glueType;
		glueType = newGlueType == null ? GLUE_TYPE_EDEFAULT : newGlueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.GLUE__GLUE_TYPE, oldGlueType, glueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectualConnector getAspectualConnector() {
		if (eContainerFeatureID() != AspectualacmePackage.GLUE__ASPECTUAL_CONNECTOR) return null;
		return (AspectualConnector)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAspectualConnector(AspectualConnector newAspectualConnector, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAspectualConnector, AspectualacmePackage.GLUE__ASPECTUAL_CONNECTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspectualConnector(AspectualConnector newAspectualConnector) {
		if (newAspectualConnector != eInternalContainer() || (eContainerFeatureID() != AspectualacmePackage.GLUE__ASPECTUAL_CONNECTOR && newAspectualConnector != null)) {
			if (EcoreUtil.isAncestor(this, newAspectualConnector))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAspectualConnector != null)
				msgs = ((InternalEObject)newAspectualConnector).eInverseAdd(this, AspectualacmePackage.ASPECTUAL_CONNECTOR__GLUES, AspectualConnector.class, msgs);
			msgs = basicSetAspectualConnector(newAspectualConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.GLUE__ASPECTUAL_CONNECTOR, newAspectualConnector, newAspectualConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AspectualacmePackage.GLUE__ASPECTUAL_CONNECTOR:
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
			case AspectualacmePackage.GLUE__ASPECTUAL_CONNECTOR:
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
			case AspectualacmePackage.GLUE__ASPECTUAL_CONNECTOR:
				return eInternalContainer().eInverseRemove(this, AspectualacmePackage.ASPECTUAL_CONNECTOR__GLUES, AspectualConnector.class, msgs);
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
			case AspectualacmePackage.GLUE__PREFIX_ROLE:
				if (resolve) return getPrefixRole();
				return basicGetPrefixRole();
			case AspectualacmePackage.GLUE__SUFFIX_ROLE:
				if (resolve) return getSuffixRole();
				return basicGetSuffixRole();
			case AspectualacmePackage.GLUE__GLUE_TYPE:
				return getGlueType();
			case AspectualacmePackage.GLUE__ASPECTUAL_CONNECTOR:
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
			case AspectualacmePackage.GLUE__PREFIX_ROLE:
				setPrefixRole((CrosscuttingRole)newValue);
				return;
			case AspectualacmePackage.GLUE__SUFFIX_ROLE:
				setSuffixRole((BaseRole)newValue);
				return;
			case AspectualacmePackage.GLUE__GLUE_TYPE:
				setGlueType((GlueType)newValue);
				return;
			case AspectualacmePackage.GLUE__ASPECTUAL_CONNECTOR:
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
			case AspectualacmePackage.GLUE__PREFIX_ROLE:
				setPrefixRole((CrosscuttingRole)null);
				return;
			case AspectualacmePackage.GLUE__SUFFIX_ROLE:
				setSuffixRole((BaseRole)null);
				return;
			case AspectualacmePackage.GLUE__GLUE_TYPE:
				setGlueType(GLUE_TYPE_EDEFAULT);
				return;
			case AspectualacmePackage.GLUE__ASPECTUAL_CONNECTOR:
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
			case AspectualacmePackage.GLUE__PREFIX_ROLE:
				return prefixRole != null;
			case AspectualacmePackage.GLUE__SUFFIX_ROLE:
				return suffixRole != null;
			case AspectualacmePackage.GLUE__GLUE_TYPE:
				return glueType != GLUE_TYPE_EDEFAULT;
			case AspectualacmePackage.GLUE__ASPECTUAL_CONNECTOR:
				return getAspectualConnector() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (glueType: ");
		result.append(glueType);
		result.append(')');
		return result.toString();
	}

} //GlueImpl
