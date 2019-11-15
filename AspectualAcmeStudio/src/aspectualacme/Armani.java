/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Armani</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aspectualacme.Armani#getTokens <em>Tokens</em>}</li>
 * </ul>
 * </p>
 *
 * @see aspectualacme.AspectualacmePackage#getArmani()
 * @model
 * @generated
 */
public interface Armani extends EObject {
	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' attribute list.
	 * @see aspectualacme.AspectualacmePackage#getArmani_Tokens()
	 * @model
	 * @generated
	 */
	EList<String> getTokens();

} // Armani
