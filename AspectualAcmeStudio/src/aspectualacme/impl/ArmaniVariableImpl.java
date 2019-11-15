/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.ArmaniTypes;
import aspectualacme.ArmaniVariable;
import aspectualacme.AspectualacmePackage;
import aspectualacme.TypeDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Armani Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aspectualacme.impl.ArmaniVariableImpl#getId <em>Id</em>}</li>
 *   <li>{@link aspectualacme.impl.ArmaniVariableImpl#getUserType <em>User Type</em>}</li>
 *   <li>{@link aspectualacme.impl.ArmaniVariableImpl#getBasicType <em>Basic Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArmaniVariableImpl extends ArmaniExpressionImpl implements ArmaniVariable {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUserType() <em>User Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserType()
	 * @generated
	 * @ordered
	 */
	protected TypeDefinition userType;

	/**
	 * The default value of the '{@link #getBasicType() <em>Basic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicType()
	 * @generated
	 * @ordered
	 */
	protected static final ArmaniTypes BASIC_TYPE_EDEFAULT = ArmaniTypes.COMPONENT;

	/**
	 * The cached value of the '{@link #getBasicType() <em>Basic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicType()
	 * @generated
	 * @ordered
	 */
	protected ArmaniTypes basicType = BASIC_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArmaniVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectualacmePackage.Literals.ARMANI_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ARMANI_VARIABLE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition getUserType() {
		if (userType != null && userType.eIsProxy()) {
			InternalEObject oldUserType = (InternalEObject)userType;
			userType = (TypeDefinition)eResolveProxy(oldUserType);
			if (userType != oldUserType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectualacmePackage.ARMANI_VARIABLE__USER_TYPE, oldUserType, userType));
			}
		}
		return userType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition basicGetUserType() {
		return userType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserType(TypeDefinition newUserType) {
		TypeDefinition oldUserType = userType;
		userType = newUserType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ARMANI_VARIABLE__USER_TYPE, oldUserType, userType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmaniTypes getBasicType() {
		return basicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasicType(ArmaniTypes newBasicType) {
		ArmaniTypes oldBasicType = basicType;
		basicType = newBasicType == null ? BASIC_TYPE_EDEFAULT : newBasicType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ARMANI_VARIABLE__BASIC_TYPE, oldBasicType, basicType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AspectualacmePackage.ARMANI_VARIABLE__ID:
				return getId();
			case AspectualacmePackage.ARMANI_VARIABLE__USER_TYPE:
				if (resolve) return getUserType();
				return basicGetUserType();
			case AspectualacmePackage.ARMANI_VARIABLE__BASIC_TYPE:
				return getBasicType();
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
			case AspectualacmePackage.ARMANI_VARIABLE__ID:
				setId((String)newValue);
				return;
			case AspectualacmePackage.ARMANI_VARIABLE__USER_TYPE:
				setUserType((TypeDefinition)newValue);
				return;
			case AspectualacmePackage.ARMANI_VARIABLE__BASIC_TYPE:
				setBasicType((ArmaniTypes)newValue);
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
			case AspectualacmePackage.ARMANI_VARIABLE__ID:
				setId(ID_EDEFAULT);
				return;
			case AspectualacmePackage.ARMANI_VARIABLE__USER_TYPE:
				setUserType((TypeDefinition)null);
				return;
			case AspectualacmePackage.ARMANI_VARIABLE__BASIC_TYPE:
				setBasicType(BASIC_TYPE_EDEFAULT);
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
			case AspectualacmePackage.ARMANI_VARIABLE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AspectualacmePackage.ARMANI_VARIABLE__USER_TYPE:
				return userType != null;
			case AspectualacmePackage.ARMANI_VARIABLE__BASIC_TYPE:
				return basicType != BASIC_TYPE_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", basicType: ");
		result.append(basicType);
		result.append(')');
		return result.toString();
	}

} //ArmaniVariableImpl
