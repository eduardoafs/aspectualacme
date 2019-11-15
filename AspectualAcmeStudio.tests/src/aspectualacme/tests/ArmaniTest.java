/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.tests;

import aspectualacme.Armani;
import aspectualacme.AspectualacmeFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Armani</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArmaniTest extends TestCase {

	/**
	 * The fixture for this Armani test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Armani fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArmaniTest.class);
	}

	/**
	 * Constructs a new Armani test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmaniTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Armani test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Armani fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Armani test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Armani getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AspectualacmeFactory.eINSTANCE.createArmani());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ArmaniTest
