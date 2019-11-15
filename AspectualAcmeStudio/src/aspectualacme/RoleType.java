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
 * A representation of the model object '<em><b>Role Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.RoleType#getParentType <em>Parent Type</em>}</li>
 *   <li>{@link aspectualacme.RoleType#getParentFamily <em>Parent Family</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getRoleType()
 * @model
 * @generated
 */
public interface RoleType extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Parent Type</b></em>' reference list.
	 * The list contents are of type {@link aspectualacme.RoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type</em>' reference list.
	 * @see aspectualacme.AspectualacmePackage#getRoleType_ParentType()
	 * @model keys="name"
	 * @generated
	 */
	EList<RoleType> getParentType();

	/**
	 * Returns the value of the '<em><b>Parent Family</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aspectualacme.Family#getRtypes <em>Rtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Family</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Family</em>' container reference.
	 * @see #setParentFamily(Family)
	 * @see aspectualacme.AspectualacmePackage#getRoleType_ParentFamily()
	 * @see aspectualacme.Family#getRtypes
	 * @model opposite="rtypes" transient="false"
	 * @generated
	 */
	Family getParentFamily();

	/**
	 * Sets the value of the '{@link aspectualacme.RoleType#getParentFamily <em>Parent Family</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Family</em>' container reference.
	 * @see #getParentFamily()
	 * @generated
	 */
	void setParentFamily(Family value);

} // RoleType
