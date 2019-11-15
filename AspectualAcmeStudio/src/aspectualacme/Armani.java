/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Armani</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.Armani#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link aspectualacme.Armani#getDesignRule <em>Design Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getArmani()
 * @model
 * @generated
 */
public interface Armani extends EObject {
	/**
	 * Returns the value of the '<em><b>Modifiers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifiers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifiers</em>' attribute list.
	 * @see aspectualacme.AspectualacmePackage#getArmani_Modifiers()
	 * @model required="true" upper="2"
	 * @generated
	 */
	EList<String> getModifiers();

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
	 * @see aspectualacme.AspectualacmePackage#getArmani_DesignRule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ArmaniDesignRuleExpression getDesignRule();

	/**
	 * Sets the value of the '{@link aspectualacme.Armani#getDesignRule <em>Design Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Rule</em>' containment reference.
	 * @see #getDesignRule()
	 * @generated
	 */
	void setDesignRule(ArmaniDesignRuleExpression value);

} // Armani
