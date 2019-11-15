/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aspectualacme.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>aspectualacme</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class AspectualacmeTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new AspectualacmeTests("aspectualacme Tests");
		suite.addTestSuite(AttachmentTest.class);
		suite.addTestSuite(GlueTest.class);
		suite.addTestSuite(AttachmentDeclarationTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectualacmeTests(String name) {
		super(name);
	}

} //AspectualacmeTests
