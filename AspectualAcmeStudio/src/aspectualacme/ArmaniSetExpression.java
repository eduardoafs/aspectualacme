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
 * A representation of the model object '<em><b>Armani Set Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.ArmaniSetExpression#getReference <em>Reference</em>}</li>
 *   <li>{@link aspectualacme.ArmaniSetExpression#getReferenceType <em>Reference Type</em>}</li>
 *   <li>{@link aspectualacme.ArmaniSetExpression#getSetValues <em>Set Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getArmaniSetExpression()
 * @model
 * @generated
 */
public interface ArmaniSetExpression extends ArmaniPrimitiveExpression {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see aspectualacme.AspectualacmePackage#getArmaniSetExpression_Reference()
	 * @model
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link aspectualacme.ArmaniSetExpression#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

	/**
	 * Returns the value of the '<em><b>Reference Type</b></em>' attribute.
	 * The literals are from the enumeration {@link aspectualacme.ArmaniSetTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Type</em>' attribute.
	 * @see aspectualacme.ArmaniSetTypes
	 * @see #setReferenceType(ArmaniSetTypes)
	 * @see aspectualacme.AspectualacmePackage#getArmaniSetExpression_ReferenceType()
	 * @model
	 * @generated
	 */
	ArmaniSetTypes getReferenceType();

	/**
	 * Sets the value of the '{@link aspectualacme.ArmaniSetExpression#getReferenceType <em>Reference Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Type</em>' attribute.
	 * @see aspectualacme.ArmaniSetTypes
	 * @see #getReferenceType()
	 * @generated
	 */
	void setReferenceType(ArmaniSetTypes value);

	/**
	 * Returns the value of the '<em><b>Set Values</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.ArmaniConstant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Values</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getArmaniSetExpression_SetValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArmaniConstant> getSetValues();

} // ArmaniSetExpression
