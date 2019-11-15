/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.tests;

import aspectualacme.AspectualacmeFactory;
import aspectualacme.Attachment;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attachment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttachmentTest extends TestCase {

	/**
	 * The fixture for this Attachment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attachment fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AttachmentTest.class);
	}

	/**
	 * Constructs a new Attachment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachmentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Attachment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Attachment fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Attachment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attachment getFixture() {
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
		setFixture(AspectualacmeFactory.eINSTANCE.createAttachment());
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

} //AttachmentTest
