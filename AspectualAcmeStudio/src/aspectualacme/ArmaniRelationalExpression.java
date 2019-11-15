/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Armani Relational Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.ArmaniRelationalExpression#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link aspectualacme.ArmaniRelationalExpression#getOperators <em>Operators</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getArmaniRelationalExpression()
 * @model
 * @generated
 */
public interface ArmaniRelationalExpression extends ArmaniExpression {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.ArmaniAdditiveExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getArmaniRelationalExpression_Expressions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ArmaniAdditiveExpression> getExpressions();

	/**
	 * Returns the value of the '<em><b>Operators</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operators</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operators</em>' attribute list.
	 * @see aspectualacme.AspectualacmePackage#getArmaniRelationalExpression_Operators()
	 * @model
	 * @generated
	 */
	EList<String> getOperators();

} // ArmaniRelationalExpression
