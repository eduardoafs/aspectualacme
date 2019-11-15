/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Armani Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.ArmaniUnaryExpression#getUnaryExpression <em>Unary Expression</em>}</li>
 *   <li>{@link aspectualacme.ArmaniUnaryExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getArmaniUnaryExpression()
 * @model
 * @generated
 */
public interface ArmaniUnaryExpression extends ArmaniExpression {
	/**
	 * Returns the value of the '<em><b>Unary Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unary Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Expression</em>' containment reference.
	 * @see #setUnaryExpression(ArmaniUnaryExpression)
	 * @see aspectualacme.AspectualacmePackage#getArmaniUnaryExpression_UnaryExpression()
	 * @model containment="true"
	 * @generated
	 */
	ArmaniUnaryExpression getUnaryExpression();

	/**
	 * Sets the value of the '{@link aspectualacme.ArmaniUnaryExpression#getUnaryExpression <em>Unary Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unary Expression</em>' containment reference.
	 * @see #getUnaryExpression()
	 * @generated
	 */
	void setUnaryExpression(ArmaniUnaryExpression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see aspectualacme.AspectualacmePackage#getArmaniUnaryExpression_Operator()
	 * @model
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link aspectualacme.ArmaniUnaryExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

} // ArmaniUnaryExpression
