/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Armani Quantifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see aspectualacme.AspectualacmePackage#getArmaniQuantifier()
 * @model
 * @generated
 */
public enum ArmaniQuantifier implements Enumerator {
	/**
	 * The '<em><b>Forall</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORALL_VALUE
	 * @generated
	 * @ordered
	 */
	FORALL(0, "forall", "forall"),

	/**
	 * The '<em><b>Exists</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXISTS_VALUE
	 * @generated
	 * @ordered
	 */
	EXISTS(1, "exists", "exists");

	/**
	 * The '<em><b>Forall</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Forall</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORALL
	 * @model name="forall"
	 * @generated
	 * @ordered
	 */
	public static final int FORALL_VALUE = 0;

	/**
	 * The '<em><b>Exists</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exists</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXISTS
	 * @model name="exists"
	 * @generated
	 * @ordered
	 */
	public static final int EXISTS_VALUE = 1;

	/**
	 * An array of all the '<em><b>Armani Quantifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ArmaniQuantifier[] VALUES_ARRAY =
		new ArmaniQuantifier[] {
			FORALL,
			EXISTS,
		};

	/**
	 * A public read-only list of all the '<em><b>Armani Quantifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ArmaniQuantifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Armani Quantifier</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArmaniQuantifier get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArmaniQuantifier result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Armani Quantifier</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArmaniQuantifier getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArmaniQuantifier result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Armani Quantifier</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArmaniQuantifier get(int value) {
		switch (value) {
			case FORALL_VALUE: return FORALL;
			case EXISTS_VALUE: return EXISTS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ArmaniQuantifier(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ArmaniQuantifier
