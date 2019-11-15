/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.tests;

import aspectualacme.AspectualacmeFactory;
import aspectualacme.ConnectorType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Connector Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectorTypeTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConnectorTypeTest.class);
	}

	/**
	 * Constructs a new Connector Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Connector Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConnectorType getFixture() {
		return (ConnectorType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AspectualacmeFactory.eINSTANCE.createConnectorType());
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

} //ConnectorTypeTest
