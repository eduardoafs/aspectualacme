/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.impl;

import aspectualacme.Armani;
import aspectualacme.ArmaniDesignRuleExpression;
import aspectualacme.AspectualacmePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Armani</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aspectualacme.impl.ArmaniImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link aspectualacme.impl.ArmaniImpl#getDesignRule <em>Design Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArmaniImpl extends EObjectImpl implements Armani {
	/**
	 * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> modifiers;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArmaniImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectualacmePackage.Literals.ARMANI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getModifiers() {
		if (modifiers == null) {
			modifiers = new EDataTypeUniqueEList<String>(String.class, this, AspectualacmePackage.ARMANI__MODIFIERS);
		}
		return modifiers;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ARMANI__DESIGN_RULE, oldDesignRule, newDesignRule);
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
				msgs = ((InternalEObject)designRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AspectualacmePackage.ARMANI__DESIGN_RULE, null, msgs);
			if (newDesignRule != null)
				msgs = ((InternalEObject)newDesignRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AspectualacmePackage.ARMANI__DESIGN_RULE, null, msgs);
			msgs = basicSetDesignRule(newDesignRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectualacmePackage.ARMANI__DESIGN_RULE, newDesignRule, newDesignRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AspectualacmePackage.ARMANI__DESIGN_RULE:
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
			case AspectualacmePackage.ARMANI__MODIFIERS:
				return getModifiers();
			case AspectualacmePackage.ARMANI__DESIGN_RULE:
				return getDesignRule();
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
			case AspectualacmePackage.ARMANI__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends String>)newValue);
				return;
			case AspectualacmePackage.ARMANI__DESIGN_RULE:
				setDesignRule((ArmaniDesignRuleExpression)newValue);
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
			case AspectualacmePackage.ARMANI__MODIFIERS:
				getModifiers().clear();
				return;
			case AspectualacmePackage.ARMANI__DESIGN_RULE:
				setDesignRule((ArmaniDesignRuleExpression)null);
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
			case AspectualacmePackage.ARMANI__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
			case AspectualacmePackage.ARMANI__DESIGN_RULE:
				return designRule != null;
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
		result.append(" (modifiers: ");
		result.append(modifiers);
		result.append(')');
		return result.toString();
	}

} //ArmaniImpl
