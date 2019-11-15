/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.ArmaniDesignRuleExpression;
import aspectualacme.ArmaniQuantifiedExpression;
import aspectualacme.ArmaniQuantifier;
import aspectualacme.ArmaniSetExpression;
import aspectualacme.ArmaniVariable;
import aspectualacme.AspectualacmePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Armani Quantified Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aspectualacme.impl.ArmaniQuantifiedExpressionImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link aspectualacme.impl.ArmaniQuantifiedExpressionImpl#getSetExpression <em>Set Expression</em>}</li>
 *   <li>{@link aspectualacme.impl.ArmaniQuantifiedExpressionImpl#getDesignRule <em>Design Rule</em>}</li>
 *   <li>{@link aspectualacme.impl.ArmaniQuantifiedExpressionImpl#getQuantifier <em>Quantifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArmaniQuantifiedExpressionImpl extends ArmaniExpressionImpl implements ArmaniQuantifiedExpression {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected ArmaniVariable variable;

	/**
	 * The cached value of the '{@link #getSetExpression() <em>Set Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetExpression()
	 * @generated
	 * @ordered
	 */
	protected ArmaniSetExpression setExpression;

	/**
	 * The cached value of the '{@link #getDesignRule() <em>Design Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignRule()
	 * @generated
	 * @ordered
	 */
	protected ArmaniDesignRuleExpression designRule;

	/**
	 * The default value of the '{@link #getQuantifier() <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantifier()
	 * @generated
	 * @ordered
	 */
	protected static final ArmaniQuantifier QUANTIFIER_EDEFAULT = ArmaniQuantifier.FORALL;

	/**
	 * The cached value of the '{@link #getQuantifier() <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantifier()
	 * @generated
	 * @ordered
	 */
	protected ArmaniQuantifier quantifier = QUANTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArmaniQuantifiedExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectualacmePackage.Literals.ARMANI_QUANTIFIED_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmaniVariable getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(ArmaniVariable newVariable, NotificationChain msgs) {
		ArmaniVariable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__VARIABLE, oldVariable, newVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(ArmaniVariable newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmaniSetExpression getSetExpression() {
		return setExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetExpression(ArmaniSetExpression newSetExpression, NotificationChain msgs) {
		ArmaniSetExpression oldSetExpression = setExpression;
		setExpression = newSetExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__SET_EXPRESSION, oldSetExpression, newSetExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetExpression(ArmaniSetExpression newSetExpression) {
		if (newSetExpression != setExpression) {
			NotificationChain msgs = null;
			if (setExpression != null)
				msgs = ((InternalEObject)setExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__SET_EXPRESSION, null, msgs);
			if (newSetExpression != null)
				msgs = ((InternalEObject)newSetExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__SET_EXPRESSION, null, msgs);
			msgs = basicSetSetExpression(newSetExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__SET_EXPRESSION, newSetExpression, newSetExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmaniDesignRuleExpression getDesignRule() {
		return designRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignRule(ArmaniDesignRuleExpression newDesignRule, NotificationChain msgs) {
		ArmaniDesignRuleExpression oldDesignRule = designRule;
		designRule = newDesignRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__DESIGN_RULE, oldDesignRule, newDesignRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignRule(ArmaniDesignRuleExpression newDesignRule) {
		if (newDesignRule != designRule) {
			NotificationChain msgs = null;
			if (designRule != null)
				msgs = ((InternalEObject)designRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__DESIGN_RULE, null, msgs);
			if (newDesignRule != null)
				msgs = ((InternalEObject)newDesignRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__DESIGN_RULE, null, msgs);
			msgs = basicSetDesignRule(newDesignRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__DESIGN_RULE, newDesignRule, newDesignRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmaniQuantifier getQuantifier() {
		return quantifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantifier(ArmaniQuantifier newQuantifier) {
		ArmaniQuantifier oldQuantifier = quantifier;
		quantifier = newQuantifier == null ? QUANTIFIER_EDEFAULT : newQuantifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__QUANTIFIER, oldQuantifier, quantifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__VARIABLE:
				return basicSetVariable(null, msgs);
			case AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__SET_EXPRESSION:
				return basicSetSetExpression(null, msgs);
			case AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__DESIGN_RULE:
				return basicSetDesignRule(null, msgs);
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
			case AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__VARIABLE:
				return getVariable();
			case AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__SET_EXPRESSION:
				return getSetExpression();
			case AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__DESIGN_RULE:
				return getDesignRule();
			case AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__QUANTIFIER:
				return getQuantifier();
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
			case AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__VARIABLE:
				setVariable((ArmaniVariable)newValue);
				return;
			case AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__SET_EXPRESSION:
				setSetExpression((ArmaniSetExpression)newValue);
				return;
			case AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__DESIGN_RULE:
				setDesignRule((ArmaniDesignRuleExpression)newValue);
				return;
			case AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__QUANTIFIER:
				setQuantifier((ArmaniQuantifier)newValue);
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
			case AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__VARIABLE:
				setVariable((ArmaniVariable)null);
				return;
			case AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__SET_EXPRESSION:
				setSetExpression((ArmaniSetExpression)null);
				return;
			case AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__DESIGN_RULE:
				setDesignRule((ArmaniDesignRuleExpression)null);
				return;
			case AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__QUANTIFIER:
				setQuantifier(QUANTIFIER_EDEFAULT);
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
			case AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__VARIABLE:
				return variable != null;
			case AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__SET_EXPRESSION:
				return setExpression != null;
			case AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__DESIGN_RULE:
				return designRule != null;
			case AspectualacmePackage.ARMANI_QUANTIFIED_EXPRESSION__QUANTIFIER:
				return quantifier != QUANTIFIER_EDEFAULT;
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
		result.append(" (quantifier: ");
		result.append(quantifier);
		result.append(')');
		return result.toString();
	}

} //ArmaniQuantifiedExpressionImpl
