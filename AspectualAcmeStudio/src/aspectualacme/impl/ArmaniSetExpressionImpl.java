/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.ArmaniConstant;
import aspectualacme.ArmaniSetExpression;
import aspectualacme.ArmaniSetTypes;
import aspectualacme.AspectualacmePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Armani Set Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aspectualacme.impl.ArmaniSetExpressionImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link aspectualacme.impl.ArmaniSetExpressionImpl#getReferenceType <em>Reference Type</em>}</li>
 *   <li>{@link aspectualacme.impl.ArmaniSetExpressionImpl#getSetValues <em>Set Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArmaniSetExpressionImpl extends ArmaniPrimitiveExpressionImpl implements ArmaniSetExpression {
	/**
	 * The default value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected String reference = REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferenceType() <em>Reference Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceType()
	 * @generated
	 * @ordered
	 */
	protected static final ArmaniSetTypes REFERENCE_TYPE_EDEFAULT = ArmaniSetTypes.COMPONENTS;

	/**
	 * The cached value of the '{@link #getReferenceType() <em>Reference Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceType()
	 * @generated
	 * @ordered
	 */
	protected ArmaniSetTypes referenceType = REFERENCE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSetValues() <em>Set Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ArmaniConstant> setValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArmaniSetExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectualacmePackage.Literals.ARMANI_SET_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(String newReference) {
		String oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ARMANI_SET_EXPRESSION__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmaniSetTypes getReferenceType() {
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceType(ArmaniSetTypes newReferenceType) {
		ArmaniSetTypes oldReferenceType = referenceType;
		referenceType = newReferenceType == null ? REFERENCE_TYPE_EDEFAULT : newReferenceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ARMANI_SET_EXPRESSION__REFERENCE_TYPE, oldReferenceType, referenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArmaniConstant> getSetValues() {
		if (setValues == null) {
			setValues = new EObjectContainmentEList<ArmaniConstant>(ArmaniConstant.class, this, AspectualacmePackage.ARMANI_SET_EXPRESSION__SET_VALUES);
		}
		return setValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AspectualacmePackage.ARMANI_SET_EXPRESSION__SET_VALUES:
				return ((InternalEList<?>)getSetValues()).basicRemove(otherEnd, msgs);
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
			case AspectualacmePackage.ARMANI_SET_EXPRESSION__REFERENCE:
				return getReference();
			case AspectualacmePackage.ARMANI_SET_EXPRESSION__REFERENCE_TYPE:
				return getReferenceType();
			case AspectualacmePackage.ARMANI_SET_EXPRESSION__SET_VALUES:
				return getSetValues();
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
			case AspectualacmePackage.ARMANI_SET_EXPRESSION__REFERENCE:
				setReference((String)newValue);
				return;
			case AspectualacmePackage.ARMANI_SET_EXPRESSION__REFERENCE_TYPE:
				setReferenceType((ArmaniSetTypes)newValue);
				return;
			case AspectualacmePackage.ARMANI_SET_EXPRESSION__SET_VALUES:
				getSetValues().clear();
				getSetValues().addAll((Collection<? extends ArmaniConstant>)newValue);
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
			case AspectualacmePackage.ARMANI_SET_EXPRESSION__REFERENCE:
				setReference(REFERENCE_EDEFAULT);
				return;
			case AspectualacmePackage.ARMANI_SET_EXPRESSION__REFERENCE_TYPE:
				setReferenceType(REFERENCE_TYPE_EDEFAULT);
				return;
			case AspectualacmePackage.ARMANI_SET_EXPRESSION__SET_VALUES:
				getSetValues().clear();
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
			case AspectualacmePackage.ARMANI_SET_EXPRESSION__REFERENCE:
				return REFERENCE_EDEFAULT == null ? reference != null : !REFERENCE_EDEFAULT.equals(reference);
			case AspectualacmePackage.ARMANI_SET_EXPRESSION__REFERENCE_TYPE:
				return referenceType != REFERENCE_TYPE_EDEFAULT;
			case AspectualacmePackage.ARMANI_SET_EXPRESSION__SET_VALUES:
				return setValues != null && !setValues.isEmpty();
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
		result.append(" (reference: ");
		result.append(reference);
		result.append(", referenceType: ");
		result.append(referenceType);
		result.append(')');
		return result.toString();
	}

} //ArmaniSetExpressionImpl
