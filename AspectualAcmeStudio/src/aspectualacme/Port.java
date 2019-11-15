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
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.Port#getPortType <em>Port Type</em>}</li>
 *   <li>{@link aspectualacme.Port#getComponent <em>Component</em>}</li>
 *   <li>{@link aspectualacme.Port#getComponentT <em>Component T</em>}</li>
 *   <li>{@link aspectualacme.Port#getEffective_type <em>Effective type</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getPort()
 * @model
 * @generated
 */
public interface Port extends attachableElement, BindableElement {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aspectualacme.Component#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' container reference.
	 * @see #setComponent(Component)
	 * @see aspectualacme.AspectualacmePackage#getPort_Component()
	 * @see aspectualacme.Component#getPort
	 * @model opposite="port" transient="false"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link aspectualacme.Port#getComponent <em>Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' container reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Component T</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link aspectualacme.ComponentType#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component T</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component T</em>' container reference.
	 * @see #setComponentT(ComponentType)
	 * @see aspectualacme.AspectualacmePackage#getPort_ComponentT()
	 * @see aspectualacme.ComponentType#getPort
	 * @model opposite="port" transient="false"
	 * @generated
	 */
	ComponentType getComponentT();

	/**
	 * Sets the value of the '{@link aspectualacme.Port#getComponentT <em>Component T</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component T</em>' container reference.
	 * @see #getComponentT()
	 * @generated
	 */
	void setComponentT(ComponentType value);

	/**
	 * Returns the value of the '<em><b>Effective type</b></em>' reference list.
	 * The list contents are of type {@link aspectualacme.PortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective type</em>' reference list.
	 * @see aspectualacme.AspectualacmePackage#getPort_Effective_type()
	 * @model keys="name"
	 * @generated
	 */
	EList<PortType> getEffective_type();

	/**
	 * Returns the value of the '<em><b>Port Type</b></em>' reference list.
	 * The list contents are of type {@link aspectualacme.PortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Type</em>' reference list.
	 * @see aspectualacme.AspectualacmePackage#getPort_PortType()
	 * @model keys="name"
	 * @generated
	 */
	EList<PortType> getPortType();

} // Port
