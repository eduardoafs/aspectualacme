/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.tests;

import aspectualacme.AspectualacmeFactory;
import aspectualacme.WildCard;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Wild Card</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WildCardTest extends attachableElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WildCardTest.class);
	}

	/**
	 * Constructs a new Wild Card test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WildCardTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Wild Card test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WildCard getFixture() {
		return (WildCard)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AspectualacmeFactory.eINSTANCE.createWildCard());
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

} //WildCardTest
