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
 *   <li>{@link aspectualacme.ConnectorType#getParentFamily <em>Parent Family</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getConnectorType()
 * @model
 * @generated
 */
public interface ConnectorType extends TypeDefinition {
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
	 * It is bidirectional and its opposite is '{@link aspectualacme.Role#getConnectorT <em>Connector T</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getConnectorType_Role()
	 * @see aspectualacme.Role#getConnectorT
	 * @model opposite="ConnectorT" containment="true" keys="name"
	 * @generated
	 */
	EList<Role> getRole();
	EList<Role> allRoles();
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

	/**
	 * Returns the value of the '<em><b>Parent Family</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aspectualacme.Family#getCntypes <em>Cntypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Family</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Family</em>' container reference.
	 * @see #setParentFamily(Family)
	 * @see aspectualacme.AspectualacmePackage#getConnectorType_ParentFamily()
	 * @see aspectualacme.Family#getCntypes
	 * @model opposite="cntypes" transient="false"
	 * @generated
	 */
	Family getParentFamily();

	/**
	 * Sets the value of the '{@link aspectualacme.ConnectorType#getParentFamily <em>Parent Family</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Family</em>' container reference.
	 * @see #getParentFamily()
	 * @generated
	 */
	void setParentFamily(Family value);

} // ConnectorType
