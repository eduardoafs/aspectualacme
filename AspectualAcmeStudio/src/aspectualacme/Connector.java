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
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.Connector#getRole <em>Role</em>}</li>
 *   <li>{@link aspectualacme.Connector#getGlue <em>Glue</em>}</li>
 *   <li>{@link aspectualacme.Connector#getType <em>Type</em>}</li>
 *   <li>{@link aspectualacme.Connector#getParentSystem <em>Parent System</em>}</li>
 *   <li>{@link aspectualacme.Connector#getParentFamily <em>Parent Family</em>}</li>
 *   <li>{@link aspectualacme.Connector#getEffective_type <em>Effective type</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends Element {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.Role}.
	 * It is bidirectional and its opposite is '{@link aspectualacme.Role#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getConnector_Role()
	 * @see aspectualacme.Role#getConnector
	 * @model opposite="Connector" containment="true" keys="name"
	 * @generated
	 */
	EList<Role> getRole();

	/**
	 * Returns the value of the '<em><b>Glue</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.Glue}.
	 * It is bidirectional and its opposite is '{@link aspectualacme.Glue#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glue</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glue</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getConnector_Glue()
	 * @see aspectualacme.Glue#getConnector
	 * @model opposite="connector" containment="true"
	 * @generated
	 */
	EList<Glue> getGlue();
	EList<Role> allRoles();
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link aspectualacme.ConnectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see aspectualacme.AspectualacmePackage#getConnector_Type()
	 * @model keys="name"
	 * @generated
	 */
	EList<ConnectorType> getType();

	/**
	 * Returns the value of the '<em><b>Parent System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aspectualacme.System#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent System</em>' container reference.
	 * @see #setParentSystem(aspectualacme.System)
	 * @see aspectualacme.AspectualacmePackage#getConnector_ParentSystem()
	 * @see aspectualacme.System#getConnectors
	 * @model opposite="connectors" transient="false"
	 * @generated
	 */
	aspectualacme.System getParentSystem();

	/**
	 * Sets the value of the '{@link aspectualacme.Connector#getParentSystem <em>Parent System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent System</em>' container reference.
	 * @see #getParentSystem()
	 * @generated
	 */
	void setParentSystem(aspectualacme.System value);

	/**
	 * Returns the value of the '<em><b>Parent Family</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aspectualacme.Family#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Family</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Family</em>' container reference.
	 * @see #setParentFamily(Family)
	 * @see aspectualacme.AspectualacmePackage#getConnector_ParentFamily()
	 * @see aspectualacme.Family#getConnectors
	 * @model opposite="connectors" transient="false"
	 * @generated
	 */
	Family getParentFamily();

	/**
	 * Sets the value of the '{@link aspectualacme.Connector#getParentFamily <em>Parent Family</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Family</em>' container reference.
	 * @see #getParentFamily()
	 * @generated
	 */
	void setParentFamily(Family value);

	/**
	 * Returns the value of the '<em><b>Effective type</b></em>' reference list.
	 * The list contents are of type {@link aspectualacme.ConnectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective type</em>' reference list.
	 * @see aspectualacme.AspectualacmePackage#getConnector_Effective_type()
	 * @model keys="name"
	 * @generated
	 */
	EList<ConnectorType> getEffective_type();

} // Connector
