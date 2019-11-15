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
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.System#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link aspectualacme.System#getProperties <em>Properties</em>}</li>
 *   <li>{@link aspectualacme.System#getAttachments <em>Attachments</em>}</li>
 *   <li>{@link aspectualacme.System#getWildCard <em>Wild Card</em>}</li>
 *   <li>{@link aspectualacme.System#getComponents <em>Components</em>}</li>
 *   <li>{@link aspectualacme.System#getParentRepresentation <em>Parent Representation</em>}</li>
 *   <li>{@link aspectualacme.System#getEffective_type <em>Effective type</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getSystem()
 * @model
 * @generated
 */
public interface System extends BasicElement {

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.Connector}.
	 * It is bidirectional and its opposite is '{@link aspectualacme.Connector#getParentSystem <em>Parent System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getSystem_Connectors()
	 * @see aspectualacme.Connector#getParentSystem
	 * @model opposite="parentSystem" containment="true" keys="name"
	 * @generated
	 */
	EList<Connector> getConnectors();

	/**
	 * Returns the value of the '<em><b>Attachments</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.Attachment}.
	 * It is bidirectional and its opposite is '{@link aspectualacme.Attachment#getParentSystem <em>Parent System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachments</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getSystem_Attachments()
	 * @see aspectualacme.Attachment#getParentSystem
	 * @model opposite="parentSystem" containment="true"
	 * @generated
	 */
	EList<Attachment> getAttachments();

	/**
	 * Returns the value of the '<em><b>Wild Card</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.WildCard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wild Card</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wild Card</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getSystem_WildCard()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<WildCard> getWildCard();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.Property}.
	 * It is bidirectional and its opposite is '{@link aspectualacme.Property#getParentSystem <em>Parent System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getSystem_Properties()
	 * @see aspectualacme.Property#getParentSystem
	 * @model opposite="parentSystem" containment="true" keys="name"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link aspectualacme.Component}.
	 * It is bidirectional and its opposite is '{@link aspectualacme.Component#getParentSystem <em>Parent System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see aspectualacme.AspectualacmePackage#getSystem_Components()
	 * @see aspectualacme.Component#getParentSystem
	 * @model opposite="parentSystem" containment="true" keys="name"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Parent Representation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aspectualacme.Representation#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Representation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Representation</em>' container reference.
	 * @see #setParentRepresentation(Representation)
	 * @see aspectualacme.AspectualacmePackage#getSystem_ParentRepresentation()
	 * @see aspectualacme.Representation#getSystem
	 * @model opposite="system" transient="false"
	 * @generated
	 */
	Representation getParentRepresentation();

	/**
	 * Sets the value of the '{@link aspectualacme.System#getParentRepresentation <em>Parent Representation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Representation</em>' container reference.
	 * @see #getParentRepresentation()
	 * @generated
	 */
	void setParentRepresentation(Representation value);

	/**
	 * Returns the value of the '<em><b>Effective type</b></em>' reference list.
	 * The list contents are of type {@link aspectualacme.Family}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective type</em>' reference list.
	 * @see aspectualacme.AspectualacmePackage#getSystem_Effective_type()
	 * @model keys="name"
	 * @generated
	 */
	EList<Family> getEffective_type();

} // System
