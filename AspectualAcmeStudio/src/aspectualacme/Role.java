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
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.Role#getConnector <em>Connector</em>}</li>
 *   <li>{@link aspectualacme.Role#getRoleType <em>Role Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getRole()
 * @model
 * @generated
 */
public interface Role extends attachableElement {
	/**
	 * Returns the value of the '<em><b>Connector</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aspectualacme.Connector#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' container reference.
	 * @see #setConnector(Connector)
	 * @see aspectualacme.AspectualacmePackage#getRole_Connector()
	 * @see aspectualacme.Connector#getRole
	 * @model opposite="role" transient="false"
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link aspectualacme.Role#getConnector <em>Connector</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' container reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

	/**
	 * Returns the value of the '<em><b>Role Type</b></em>' reference list.
	 * The list contents are of type {@link aspectualacme.RoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type</em>' reference list.
	 * @see aspectualacme.AspectualacmePackage#getRole_RoleType()
	 * @model
	 * @generated
	 */
	EList<RoleType> getRoleType();

} // Role
