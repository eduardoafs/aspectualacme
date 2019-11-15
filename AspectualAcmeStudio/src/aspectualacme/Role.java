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
 *   <li>{@link aspectualacme.Role#getConnectorT <em>Connector T</em>}</li>
 *   <li>{@link aspectualacme.Role#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link aspectualacme.Role#getEffective_type <em>Effective type</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getRole()
 * @model
 * @generated
 */
public interface Role extends attachableElement, BindableElement {
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
	 * Returns the value of the '<em><b>Connector T</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aspectualacme.ConnectorType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector T</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector T</em>' container reference.
	 * @see #setConnectorT(ConnectorType)
	 * @see aspectualacme.AspectualacmePackage#getRole_ConnectorT()
	 * @see aspectualacme.ConnectorType#getRole
	 * @model opposite="role" transient="false"
	 * @generated
	 */
	ConnectorType getConnectorT();

	/**
	 * Sets the value of the '{@link aspectualacme.Role#getConnectorT <em>Connector T</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector T</em>' container reference.
	 * @see #getConnectorT()
	 * @generated
	 */
	void setConnectorT(ConnectorType value);

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

	/**
	 * Returns the value of the '<em><b>Effective type</b></em>' reference list.
	 * The list contents are of type {@link aspectualacme.RoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective type</em>' reference list.
	 * @see aspectualacme.AspectualacmePackage#getRole_Effective_type()
	 * @model keys="name"
	 * @generated
	 */
	EList<RoleType> getEffective_type();

} // Role
