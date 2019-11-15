/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.ArmaniAdditiveExpression;
import aspectualacme.ArmaniRelationalExpression;
import aspectualacme.AspectualacmePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Armani Relational Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aspectualacme.impl.ArmaniRelationalExpressionImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link aspectualacme.impl.ArmaniRelationalExpressionImpl#getOperators <em>Operators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArmaniRelationalExpressionImpl extends ArmaniExpressionImpl implements ArmaniRelationalExpression {
	/**
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<ArmaniAdditiveExpression> expressions;

	/**
	 * The cached value of the '{@link #getOperators() <em>Operators</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperators()
	 * @generated
	 * @ordered
	 */
	protected EList<String> operators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArmaniRelationalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectualacmePackage.Literals.ARMANI_RELATIONAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArmaniAdditiveExpression> getExpressions() {
		if (expressions == null) {
			expressions = new EObjectContainmentEList<ArmaniAdditiveExpression>(ArmaniAdditiveExpression.class, this, AspectualacmePackage.ARMANI_RELATIONAL_EXPRESSION__EXPRESSIONS);
		}
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOperators() {
		if (operators == null) {
			operators = new EDataTypeUniqueEList<String>(String.class, this, AspectualacmePackage.ARMANI_RELATIONAL_EXPRESSION__OPERATORS);
		}
		return operators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AspectualacmePackage.ARMANI_RELATIONAL_EXPRESSION__EXPRESSIONS:
				return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
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
			case AspectualacmePackage.ARMANI_RELATIONAL_EXPRESSION__EXPRESSIONS:
				return getExpressions();
			case AspectualacmePackage.ARMANI_RELATIONAL_EXPRESSION__OPERATORS:
				return getOperators();
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
			case AspectualacmePackage.ARMANI_RELATIONAL_EXPRESSION__EXPRESSIONS:
				getExpressions().clear();
				getExpressions().addAll((Collection<? extends ArmaniAdditiveExpression>)newValue);
				return;
			case AspectualacmePackage.ARMANI_RELATIONAL_EXPRESSION__OPERATORS:
				getOperators().clear();
				getOperators().addAll((Collection<? extends String>)newValue);
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
			case AspectualacmePackage.ARMANI_RELATIONAL_EXPRESSION__EXPRESSIONS:
				getExpressions().clear();
				return;
			case AspectualacmePackage.ARMANI_RELATIONAL_EXPRESSION__OPERATORS:
				getOperators().clear();
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
			case AspectualacmePackage.ARMANI_RELATIONAL_EXPRESSION__EXPRESSIONS:
				return expressions != null && !expressions.isEmpty();
			case AspectualacmePackage.ARMANI_RELATIONAL_EXPRESSION__OPERATORS:
				return operators != null && !operators.isEmpty();
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
		result.append(" (operators: ");
		result.append(operators);
		result.append(')');
		return result.toString();
	}

} //ArmaniRelationalExpressionImpl
