/**
 */
package com.tad.school.tests;

import com.tad.school.MSchoolFactory;
import com.tad.school.MTeacher;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Teacher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link com.tad.school.MTeacher#evaluate(com.tad.school.MStudent) <em>Evaluate</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TeacherTest extends TestCase {

	/**
	 * The fixture for this Teacher test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MTeacher fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TeacherTest.class);
	}

	/**
	 * Constructs a new Teacher test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeacherTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Teacher test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MTeacher fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Teacher test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MTeacher getFixture() {
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
		setFixture(MSchoolFactory.eINSTANCE.createTeacher());
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

	/**
	 * Tests the '{@link com.tad.school.MTeacher#evaluate(com.tad.school.MStudent) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tad.school.MTeacher#evaluate(com.tad.school.MStudent)
	 * @generated
	 */
	public void testEvaluate__MStudent() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //TeacherTest
