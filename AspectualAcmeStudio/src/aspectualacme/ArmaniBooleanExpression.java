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
 * A representation of the model object '<em><b>Armani Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.ArmaniBooleanExpression#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getArmaniBooleanExpression()
 * @model
 * @generated
 */
public interface ArmaniBooleanExpression extends ArmaniDesignRuleExpression {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.ArmaniOrExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getArmaniBooleanExpression_Expressions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ArmaniOrExpression> getExpressions();

} // ArmaniBooleanExpression
