/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.tests;

import aspectualacme.AspectualacmeFactory;
import aspectualacme.CrosscuttingRole;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Crosscutting Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CrosscuttingRoleTest extends RoleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CrosscuttingRoleTest.class);
	}

	/**
	 * Constructs a new Crosscutting Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrosscuttingRoleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Crosscutting Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CrosscuttingRole getFixture() {
		return (CrosscuttingRole)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AspectualacmeFactory.eINSTANCE.createCrosscuttingRole());
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

} //CrosscuttingRoleTest
