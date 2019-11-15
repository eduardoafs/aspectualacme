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
 * A representation of the literals of the enumeration '<em><b>Armani Set Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see aspectualacme.AspectualacmePackage#getArmaniSetTypes()
 * @model
 * @generated
 */
public enum ArmaniSetTypes implements Enumerator {
	/**
	 * The '<em><b>Components</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENTS_VALUE
	 * @generated
	 * @ordered
	 */
	COMPONENTS(0, "Components", "Components"),

	/**
	 * The '<em><b>Connectors</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTORS_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTORS(1, "Connectors", "Connectors"),

	/**
	 * The '<em><b>Roles</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLES_VALUE
	 * @generated
	 * @ordered
	 */
	ROLES(2, "Roles", "Roles"),

	/**
	 * The '<em><b>Ports</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORTS_VALUE
	 * @generated
	 * @ordered
	 */
	PORTS(3, "Ports", "Ports"),

	/**
	 * The '<em><b>Representations</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPRESENTATIONS_VALUE
	 * @generated
	 * @ordered
	 */
	REPRESENTATIONS(4, "Representations", "Representations"),

	/**
	 * The '<em><b>Properties</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPERTIES_VALUE
	 * @generated
	 * @ordered
	 */
	PROPERTIES(5, "Properties", "Properties"),

	/**
	 * The '<em><b>Elements</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	ELEMENTS(6, "Elements", "Elements");

	/**
	 * The '<em><b>Components</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Components</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPONENTS
	 * @model name="Components"
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENTS_VALUE = 0;

	/**
	 * The '<em><b>Connectors</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Connectors</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECTORS
	 * @model name="Connectors"
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTORS_VALUE = 1;

	/**
	 * The '<em><b>Roles</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Roles</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROLES
	 * @model name="Roles"
	 * @generated
	 * @ordered
	 */
	public static final int ROLES_VALUE = 2;

	/**
	 * The '<em><b>Ports</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ports</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PORTS
	 * @model name="Ports"
	 * @generated
	 * @ordered
	 */
	public static final int PORTS_VALUE = 3;

	/**
	 * The '<em><b>Representations</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Representations</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPRESENTATIONS
	 * @model name="Representations"
	 * @generated
	 * @ordered
	 */
	public static final int REPRESENTATIONS_VALUE = 4;

	/**
	 * The '<em><b>Properties</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Properties</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROPERTIES
	 * @model name="Properties"
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTIES_VALUE = 5;

	/**
	 * The '<em><b>Elements</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Elements</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELEMENTS
	 * @model name="Elements"
	 * @generated
	 * @ordered
	 */
	public static final int ELEMENTS_VALUE = 6;

	/**
	 * An array of all the '<em><b>Armani Set Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ArmaniSetTypes[] VALUES_ARRAY =
		new ArmaniSetTypes[] {
			COMPONENTS,
			CONNECTORS,
			ROLES,
			PORTS,
			REPRESENTATIONS,
			PROPERTIES,
			ELEMENTS,
		};

	/**
	 * A public read-only list of all the '<em><b>Armani Set Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ArmaniSetTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Armani Set Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArmaniSetTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArmaniSetTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Armani Set Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArmaniSetTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArmaniSetTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Armani Set Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArmaniSetTypes get(int value) {
		switch (value) {
			case COMPONENTS_VALUE: return COMPONENTS;
			case CONNECTORS_VALUE: return CONNECTORS;
			case ROLES_VALUE: return ROLES;
			case PORTS_VALUE: return PORTS;
			case REPRESENTATIONS_VALUE: return REPRESENTATIONS;
			case PROPERTIES_VALUE: return PROPERTIES;
			case ELEMENTS_VALUE: return ELEMENTS;
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
	private ArmaniSetTypes(int value, String name, String literal) {
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
	
} //ArmaniSetTypes
