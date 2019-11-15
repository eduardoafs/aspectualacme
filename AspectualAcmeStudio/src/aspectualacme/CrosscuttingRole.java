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
 * A representation of the model object '<em><b>Crosscutting Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.CrosscuttingRole#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getCrosscuttingRole()
 * @model
 * @generated
 */
public interface CrosscuttingRole extends Role {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link aspectualacme.RoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see aspectualacme.AspectualacmePackage#getCrosscuttingRole_Type()
	 * @model keys="name"
	 * @generated
	 */
	EList<RoleType> getType();

} // CrosscuttingRole
