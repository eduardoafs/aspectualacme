/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Armani Quantified Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.ArmaniQuantifiedExpression#getVariable <em>Variable</em>}</li>
 *   <li>{@link aspectualacme.ArmaniQuantifiedExpression#getSetExpression <em>Set Expression</em>}</li>
 *   <li>{@link aspectualacme.ArmaniQuantifiedExpression#getDesignRule <em>Design Rule</em>}</li>
 *   <li>{@link aspectualacme.ArmaniQuantifiedExpression#getQuantifier <em>Quantifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getArmaniQuantifiedExpression()
 * @model
 * @generated
 */
public interface ArmaniQuantifiedExpression extends ArmaniDesignRuleExpression {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(ArmaniVariable)
	 * @see aspectualacme.AspectualacmePackage#getArmaniQuantifiedExpression_Variable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ArmaniVariable getVariable();

	/**
	 * Sets the value of the '{@link aspectualacme.ArmaniQuantifiedExpression#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(ArmaniVariable value);

	/**
	 * Returns the value of the '<em><b>Set Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Expression</em>' containment reference.
	 * @see #setSetExpression(ArmaniSetExpression)
	 * @see aspectualacme.AspectualacmePackage#getArmaniQuantifiedExpression_SetExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ArmaniSetExpression getSetExpression();

	/**
	 * Sets the value of the '{@link aspectualacme.ArmaniQuantifiedExpression#getSetExpression <em>Set Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Expression</em>' containment reference.
	 * @see #getSetExpression()
	 * @generated
	 */
	void setSetExpression(ArmaniSetExpression value);

	/**
	 * Returns the value of the '<em><b>Design Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Rule</em>' containment reference.
	 * @see #setDesignRule(ArmaniDesignRuleExpression)
	 * @see aspectualacme.AspectualacmePackage#getArmaniQuantifiedExpression_DesignRule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ArmaniDesignRuleExpression getDesignRule();

	/**
	 * Sets the value of the '{@link aspectualacme.ArmaniQuantifiedExpression#getDesignRule <em>Design Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Rule</em>' containment reference.
	 * @see #getDesignRule()
	 * @generated
	 */
	void setDesignRule(ArmaniDesignRuleExpression value);

	/**
	 * Returns the value of the '<em><b>Quantifier</b></em>' attribute.
	 * The literals are from the enumeration {@link aspectualacme.ArmaniQuantifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier</em>' attribute.
	 * @see aspectualacme.ArmaniQuantifier
	 * @see #setQuantifier(ArmaniQuantifier)
	 * @see aspectualacme.AspectualacmePackage#getArmaniQuantifiedExpression_Quantifier()
	 * @model required="true"
	 * @generated
	 */
	ArmaniQuantifier getQuantifier();

	/**
	 * Sets the value of the '{@link aspectualacme.ArmaniQuantifiedExpression#getQuantifier <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifier</em>' attribute.
	 * @see aspectualacme.ArmaniQuantifier
	 * @see #getQuantifier()
	 * @generated
	 */
	void setQuantifier(ArmaniQuantifier value);

} // ArmaniQuantifiedExpression
