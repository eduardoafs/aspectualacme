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
 * A representation of the model object '<em><b>Armani Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.ArmaniFunctionCall#getFunctionId <em>Function Id</em>}</li>
 *   <li>{@link aspectualacme.ArmaniFunctionCall#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getArmaniFunctionCall()
 * @model
 * @generated
 */
public interface ArmaniFunctionCall extends ArmaniPrimitiveExpression {
	/**
	 * Returns the value of the '<em><b>Function Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Id</em>' attribute.
	 * @see #setFunctionId(String)
	 * @see aspectualacme.AspectualacmePackage#getArmaniFunctionCall_FunctionId()
	 * @model required="true"
	 * @generated
	 */
	String getFunctionId();

	/**
	 * Sets the value of the '{@link aspectualacme.ArmaniFunctionCall#getFunctionId <em>Function Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Id</em>' attribute.
	 * @see #getFunctionId()
	 * @generated
	 */
	void setFunctionId(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.ArmaniPrimitiveExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getArmaniFunctionCall_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArmaniPrimitiveExpression> getParameters();

} // ArmaniFunctionCall
