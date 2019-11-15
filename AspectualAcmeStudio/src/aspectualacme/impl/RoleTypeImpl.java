/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.AspectualacmePackage;
import aspectualacme.Family;
import aspectualacme.Feature;
import aspectualacme.Property;
import aspectualacme.Representation;
import aspectualacme.RoleType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aspectualacme.impl.RoleTypeImpl#getParentType <em>Parent Type</em>}</li>
 *   <li>{@link aspectualacme.impl.RoleTypeImpl#getParentFamily <em>Parent Family</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleTypeImpl extends TypeDefinitionImpl implements RoleType {
	/**
	 * The cached value of the '{@link #getParentType() <em>Parent Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentType()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleType> parentType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectualacmePackage.Literals.ROLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleType> getParentType() {
		if (parentType == null) {
			parentType = new EObjectResolvingEList<RoleType>(RoleType.class, this, AspectualacmePackage.ROLE_TYPE__PARENT_TYPE);
		}
		return parentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Family getParentFamily() {
		if (eContainerFeatureID() != AspectualacmePackage.ROLE_TYPE__PARENT_FAMILY) return null;
		return (Family)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentFamily(Family newParentFamily, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentFamily, AspectualacmePackage.ROLE_TYPE__PARENT_FAMILY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentFamily(Family newParentFamily) {
		if (newParentFamily != eInternalContainer() || (eContainerFeatureID() != AspectualacmePackage.ROLE_TYPE__PARENT_FAMILY && newParentFamily != null)) {
			if (EcoreUtil.isAncestor(this, newParentFamily))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentFamily != null)
				msgs = ((InternalEObject)newParentFamily).eInverseAdd(this, AspectualacmePackage.FAMILY__RTYPES, Family.class, msgs);
			msgs = basicSetParentFamily(newParentFamily, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ROLE_TYPE__PARENT_FAMILY, newParentFamily, newParentFamily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AspectualacmePackage.ROLE_TYPE__PARENT_FAMILY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentFamily((Family)otherEnd, msgs);
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
			case AspectualacmePackage.ROLE_TYPE__PARENT_FAMILY:
				return basicSetParentFamily(null, msgs);
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
			case AspectualacmePackage.ROLE_TYPE__PARENT_FAMILY:
				return eInternalContainer().eInverseRemove(this, AspectualacmePackage.FAMILY__RTYPES, Family.class, msgs);
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
			case AspectualacmePackage.ROLE_TYPE__PARENT_TYPE:
				return getParentType();
			case AspectualacmePackage.ROLE_TYPE__PARENT_FAMILY:
				return getParentFamily();
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
			case AspectualacmePackage.ROLE_TYPE__PARENT_TYPE:
				getParentType().clear();
				getParentType().addAll((Collection<? extends RoleType>)newValue);
				return;
			case AspectualacmePackage.ROLE_TYPE__PARENT_FAMILY:
				setParentFamily((Family)newValue);
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
			case AspectualacmePackage.ROLE_TYPE__PARENT_TYPE:
				getParentType().clear();
				return;
			case AspectualacmePackage.ROLE_TYPE__PARENT_FAMILY:
				setParentFamily((Family)null);
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
			case AspectualacmePackage.ROLE_TYPE__PARENT_TYPE:
				return parentType != null && !parentType.isEmpty();
			case AspectualacmePackage.ROLE_TYPE__PARENT_FAMILY:
				return getParentFamily() != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleTypeImpl
