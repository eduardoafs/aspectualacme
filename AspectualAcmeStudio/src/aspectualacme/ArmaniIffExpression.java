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
 * A representation of the model object '<em><b>Armani Iff Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.ArmaniIffExpression#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getArmaniIffExpression()
 * @model
 * @generated
 */
public interface ArmaniIffExpression extends ArmaniExpression {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.ArmaniEqualityExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getArmaniIffExpression_Expressions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ArmaniEqualityExpression> getExpressions();

} // ArmaniIffExpression
