/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Armani Primitive Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.ArmaniPrimitiveExpression#getDesignRule <em>Design Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getArmaniPrimitiveExpression()
 * @model
 * @generated
 */
public interface ArmaniPrimitiveExpression extends ArmaniUnaryExpression {
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
	 * @see aspectualacme.AspectualacmePackage#getArmaniPrimitiveExpression_DesignRule()
	 * @model containment="true"
	 * @generated
	 */
	ArmaniDesignRuleExpression getDesignRule();

	/**
	 * Sets the value of the '{@link aspectualacme.ArmaniPrimitiveExpression#getDesignRule <em>Design Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Rule</em>' containment reference.
	 * @see #getDesignRule()
	 * @generated
	 */
	void setDesignRule(ArmaniDesignRuleExpression value);

} // ArmaniPrimitiveExpression
