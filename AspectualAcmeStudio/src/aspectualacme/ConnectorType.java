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
 * A representation of the model object '<em><b>Connector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.ConnectorType#getParentType <em>Parent Type</em>}</li>
 *   <li>{@link aspectualacme.ConnectorType#getRole <em>Role</em>}</li>
 *   <li>{@link aspectualacme.ConnectorType#getGlue <em>Glue</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getConnectorType()
 * @model
 * @generated
 */
public interface ConnectorType extends Element {
	/**
	 * Returns the value of the '<em><b>Parent Type</b></em>' reference list.
	 * The list contents are of type {@link aspectualacme.ConnectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type</em>' reference list.
	 * @see aspectualacme.AspectualacmePackage#getConnectorType_ParentType()
	 * @model keys="name"
	 * @generated
	 */
	EList<ConnectorType> getParentType();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getConnectorType_Role()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Role> getRole();

	/**
	 * Returns the value of the '<em><b>Glue</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.Glue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glue</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glue</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getConnectorType_Glue()
	 * @model containment="true"
	 * @generated
	 */
	EList<Glue> getGlue();

} // ConnectorType
