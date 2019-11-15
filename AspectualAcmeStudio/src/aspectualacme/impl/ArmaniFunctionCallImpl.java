/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.ArmaniFunctionCall;
import aspectualacme.ArmaniPrimitiveExpression;
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
 * An implementation of the model object '<em><b>Armani Function Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aspectualacme.impl.ArmaniFunctionCallImpl#getFunctionId <em>Function Id</em>}</li>
 *   <li>{@link aspectualacme.impl.ArmaniFunctionCallImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArmaniFunctionCallImpl extends ArmaniPrimitiveExpressionImpl implements ArmaniFunctionCall {
	/**
	 * The default value of the '{@link #getFunctionId() <em>Function Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionId()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunctionId() <em>Function Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionId()
	 * @generated
	 * @ordered
	 */
	protected String functionId = FUNCTION_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ArmaniPrimitiveExpression> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArmaniFunctionCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectualacmePackage.Literals.ARMANI_FUNCTION_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunctionId() {
		return functionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionId(String newFunctionId) {
		String oldFunctionId = functionId;
		functionId = newFunctionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ARMANI_FUNCTION_CALL__FUNCTION_ID, oldFunctionId, functionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArmaniPrimitiveExpression> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<ArmaniPrimitiveExpression>(ArmaniPrimitiveExpression.class, this, AspectualacmePackage.ARMANI_FUNCTION_CALL__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AspectualacmePackage.ARMANI_FUNCTION_CALL__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case AspectualacmePackage.ARMANI_FUNCTION_CALL__FUNCTION_ID:
				return getFunctionId();
			case AspectualacmePackage.ARMANI_FUNCTION_CALL__PARAMETERS:
				return getParameters();
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
			case AspectualacmePackage.ARMANI_FUNCTION_CALL__FUNCTION_ID:
				setFunctionId((String)newValue);
				return;
			case AspectualacmePackage.ARMANI_FUNCTION_CALL__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends ArmaniPrimitiveExpression>)newValue);
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
			case AspectualacmePackage.ARMANI_FUNCTION_CALL__FUNCTION_ID:
				setFunctionId(FUNCTION_ID_EDEFAULT);
				return;
			case AspectualacmePackage.ARMANI_FUNCTION_CALL__PARAMETERS:
				getParameters().clear();
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
			case AspectualacmePackage.ARMANI_FUNCTION_CALL__FUNCTION_ID:
				return FUNCTION_ID_EDEFAULT == null ? functionId != null : !FUNCTION_ID_EDEFAULT.equals(functionId);
			case AspectualacmePackage.ARMANI_FUNCTION_CALL__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
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
		result.append(" (functionId: ");
		result.append(functionId);
		result.append(')');
		return result.toString();
	}

} //ArmaniFunctionCallImpl
