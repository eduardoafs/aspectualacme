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
 * A representation of the model object '<em><b>Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.Family#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link aspectualacme.Family#getComponents <em>Components</em>}</li>
 *   <li>{@link aspectualacme.Family#getAttachments <em>Attachments</em>}</li>
 *   <li>{@link aspectualacme.Family#getWildcard <em>Wildcard</em>}</li>
 *   <li>{@link aspectualacme.Family#getCtypes <em>Ctypes</em>}</li>
 *   <li>{@link aspectualacme.Family#getPtypes <em>Ptypes</em>}</li>
 *   <li>{@link aspectualacme.Family#getCntypes <em>Cntypes</em>}</li>
 *   <li>{@link aspectualacme.Family#getRtypes <em>Rtypes</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getFamily()
 * @model
 * @generated
 */
public interface Family extends BasicElement {
	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getFamily_Connectors()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Connector> getConnectors();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.Component}.
	 * It is bidirectional and its opposite is '{@link aspectualacme.Component#getParentFamily <em>Parent Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getFamily_Components()
	 * @see aspectualacme.Component#getParentFamily
	 * @model opposite="parentFamily" containment="true" keys="name"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Attachments</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.Attachment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachments</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getFamily_Attachments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attachment> getAttachments();

	/**
	 * Returns the value of the '<em><b>Wildcard</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.WildCard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wildcard</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wildcard</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getFamily_Wildcard()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<WildCard> getWildcard();

	/**
	 * Returns the value of the '<em><b>Ctypes</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ctypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctypes</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getFamily_Ctypes()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<ComponentType> getCtypes();

	/**
	 * Returns the value of the '<em><b>Ptypes</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.PortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ptypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ptypes</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getFamily_Ptypes()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<PortType> getPtypes();

	/**
	 * Returns the value of the '<em><b>Cntypes</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.ConnectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cntypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cntypes</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getFamily_Cntypes()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<ConnectorType> getCntypes();

	/**
	 * Returns the value of the '<em><b>Rtypes</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.RoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtypes</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getFamily_Rtypes()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<RoleType> getRtypes();

} // Family
