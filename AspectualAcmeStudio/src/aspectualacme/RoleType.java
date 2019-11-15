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
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getRoleType()
 * @model
 * @generated
 */
public interface RoleType extends Element {
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

} // RoleType
