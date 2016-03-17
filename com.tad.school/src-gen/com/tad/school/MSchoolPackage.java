/**
 */
package com.tad.school;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.tad.school.MSchoolFactory
 * @model kind="package"
 * @generated
 */
public interface MSchoolPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "school";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.tad.school/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "school";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MSchoolPackage eINSTANCE = com.tad.school.impl.MSchoolPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.tad.school.impl.MAcademyImpl <em>Academy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tad.school.impl.MAcademyImpl
	 * @see com.tad.school.impl.MSchoolPackageImpl#getAcademy()
	 * @generated
	 */
	int ACADEMY = 0;

	/**
	 * The feature id for the '<em><b>Teachers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMY__TEACHERS = 0;

	/**
	 * The feature id for the '<em><b>Students</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMY__STUDENTS = 1;

	/**
	 * The feature id for the '<em><b>Schools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMY__SCHOOLS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMY__NAME = 3;

	/**
	 * The number of structural features of the '<em>Academy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Academy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACADEMY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.tad.school.impl.MSchoolImpl <em>School</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tad.school.impl.MSchoolImpl
	 * @see com.tad.school.impl.MSchoolPackageImpl#getSchool()
	 * @generated
	 */
	int SCHOOL = 1;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__ROOMS = 0;

	/**
	 * The feature id for the '<em><b>Teachers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__TEACHERS = 1;

	/**
	 * The feature id for the '<em><b>Students</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__STUDENTS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__NAME = 3;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__RANK = 4;

	/**
	 * The number of structural features of the '<em>School</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>School</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.tad.school.impl.MTeacherImpl <em>Teacher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tad.school.impl.MTeacherImpl
	 * @see com.tad.school.impl.MSchoolPackageImpl#getTeacher()
	 * @generated
	 */
	int TEACHER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Teacher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER___EVALUATE__MSTUDENT = 0;

	/**
	 * The number of operations of the '<em>Teacher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.tad.school.impl.MClassRoomImpl <em>Class Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tad.school.impl.MClassRoomImpl
	 * @see com.tad.school.impl.MSchoolPackageImpl#getClassRoom()
	 * @generated
	 */
	int CLASS_ROOM = 3;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ROOM__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Teacher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ROOM__TEACHER = 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ROOM__CHILDREN = 2;

	/**
	 * The number of structural features of the '<em>Class Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ROOM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Class Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.tad.school.impl.MStudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tad.school.impl.MStudentImpl
	 * @see com.tad.school.impl.MSchoolPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__AGE = 1;

	/**
	 * The feature id for the '<em><b>Notations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NOTATIONS = 2;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.tad.school.impl.MMatterImpl <em>Matter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tad.school.impl.MMatterImpl
	 * @see com.tad.school.impl.MSchoolPackageImpl#getMatter()
	 * @generated
	 */
	int MATTER = 5;

	/**
	 * The number of structural features of the '<em>Matter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Matter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.tad.school.impl.MMathImpl <em>Math</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tad.school.impl.MMathImpl
	 * @see com.tad.school.impl.MSchoolPackageImpl#getMath()
	 * @generated
	 */
	int MATH = 6;

	/**
	 * The number of structural features of the '<em>Math</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_FEATURE_COUNT = MATTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Math</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION_COUNT = MATTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.tad.school.impl.MNotationImpl <em>Notation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tad.school.impl.MNotationImpl
	 * @see com.tad.school.impl.MSchoolPackageImpl#getNotation()
	 * @generated
	 */
	int NOTATION = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Notation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Notation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.tad.school.MAcademy <em>Academy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Academy</em>'.
	 * @see com.tad.school.MAcademy
	 * @generated
	 */
	EClass getAcademy();

	/**
	 * Returns the meta object for the containment reference list '{@link com.tad.school.MAcademy#getTeachers <em>Teachers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teachers</em>'.
	 * @see com.tad.school.MAcademy#getTeachers()
	 * @see #getAcademy()
	 * @generated
	 */
	EReference getAcademy_Teachers();

	/**
	 * Returns the meta object for the containment reference list '{@link com.tad.school.MAcademy#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Students</em>'.
	 * @see com.tad.school.MAcademy#getStudents()
	 * @see #getAcademy()
	 * @generated
	 */
	EReference getAcademy_Students();

	/**
	 * Returns the meta object for the containment reference list '{@link com.tad.school.MAcademy#getSchools <em>Schools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schools</em>'.
	 * @see com.tad.school.MAcademy#getSchools()
	 * @see #getAcademy()
	 * @generated
	 */
	EReference getAcademy_Schools();

	/**
	 * Returns the meta object for the attribute '{@link com.tad.school.MAcademy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.tad.school.MAcademy#getName()
	 * @see #getAcademy()
	 * @generated
	 */
	EAttribute getAcademy_Name();

	/**
	 * Returns the meta object for class '{@link com.tad.school.MSchool <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>School</em>'.
	 * @see com.tad.school.MSchool
	 * @generated
	 */
	EClass getSchool();

	/**
	 * Returns the meta object for the containment reference list '{@link com.tad.school.MSchool#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see com.tad.school.MSchool#getRooms()
	 * @see #getSchool()
	 * @generated
	 */
	EReference getSchool_Rooms();

	/**
	 * Returns the meta object for the reference list '{@link com.tad.school.MSchool#getTeachers <em>Teachers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Teachers</em>'.
	 * @see com.tad.school.MSchool#getTeachers()
	 * @see #getSchool()
	 * @generated
	 */
	EReference getSchool_Teachers();

	/**
	 * Returns the meta object for the reference list '{@link com.tad.school.MSchool#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Students</em>'.
	 * @see com.tad.school.MSchool#getStudents()
	 * @see #getSchool()
	 * @generated
	 */
	EReference getSchool_Students();

	/**
	 * Returns the meta object for the attribute '{@link com.tad.school.MSchool#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.tad.school.MSchool#getName()
	 * @see #getSchool()
	 * @generated
	 */
	EAttribute getSchool_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.tad.school.MSchool#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see com.tad.school.MSchool#getRank()
	 * @see #getSchool()
	 * @generated
	 */
	EAttribute getSchool_Rank();

	/**
	 * Returns the meta object for class '{@link com.tad.school.MTeacher <em>Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Teacher</em>'.
	 * @see com.tad.school.MTeacher
	 * @generated
	 */
	EClass getTeacher();

	/**
	 * Returns the meta object for the attribute '{@link com.tad.school.MTeacher#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.tad.school.MTeacher#getName()
	 * @see #getTeacher()
	 * @generated
	 */
	EAttribute getTeacher_Name();

	/**
	 * Returns the meta object for the '{@link com.tad.school.MTeacher#evaluate(com.tad.school.MStudent) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see com.tad.school.MTeacher#evaluate(com.tad.school.MStudent)
	 * @generated
	 */
	EOperation getTeacher__Evaluate__MStudent();

	/**
	 * Returns the meta object for class '{@link com.tad.school.MClassRoom <em>Class Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Room</em>'.
	 * @see com.tad.school.MClassRoom
	 * @generated
	 */
	EClass getClassRoom();

	/**
	 * Returns the meta object for the attribute '{@link com.tad.school.MClassRoom#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see com.tad.school.MClassRoom#getNumber()
	 * @see #getClassRoom()
	 * @generated
	 */
	EAttribute getClassRoom_Number();

	/**
	 * Returns the meta object for the reference '{@link com.tad.school.MClassRoom#getTeacher <em>Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Teacher</em>'.
	 * @see com.tad.school.MClassRoom#getTeacher()
	 * @see #getClassRoom()
	 * @generated
	 */
	EReference getClassRoom_Teacher();

	/**
	 * Returns the meta object for the reference list '{@link com.tad.school.MClassRoom#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see com.tad.school.MClassRoom#getChildren()
	 * @see #getClassRoom()
	 * @generated
	 */
	EReference getClassRoom_Children();

	/**
	 * Returns the meta object for class '{@link com.tad.school.MStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see com.tad.school.MStudent
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the attribute '{@link com.tad.school.MStudent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.tad.school.MStudent#getName()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.tad.school.MStudent#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see com.tad.school.MStudent#getAge()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Age();

	/**
	 * Returns the meta object for the containment reference list '{@link com.tad.school.MStudent#getNotations <em>Notations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notations</em>'.
	 * @see com.tad.school.MStudent#getNotations()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Notations();

	/**
	 * Returns the meta object for class '{@link com.tad.school.MMatter <em>Matter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matter</em>'.
	 * @see com.tad.school.MMatter
	 * @generated
	 */
	EClass getMatter();

	/**
	 * Returns the meta object for class '{@link com.tad.school.MMath <em>Math</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Math</em>'.
	 * @see com.tad.school.MMath
	 * @generated
	 */
	EClass getMath();

	/**
	 * Returns the meta object for class '{@link com.tad.school.MNotation <em>Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notation</em>'.
	 * @see com.tad.school.MNotation
	 * @generated
	 */
	EClass getNotation();

	/**
	 * Returns the meta object for the attribute '{@link com.tad.school.MNotation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.tad.school.MNotation#getValue()
	 * @see #getNotation()
	 * @generated
	 */
	EAttribute getNotation_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MSchoolFactory getSchoolFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.tad.school.impl.MAcademyImpl <em>Academy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tad.school.impl.MAcademyImpl
		 * @see com.tad.school.impl.MSchoolPackageImpl#getAcademy()
		 * @generated
		 */
		EClass ACADEMY = eINSTANCE.getAcademy();

		/**
		 * The meta object literal for the '<em><b>Teachers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACADEMY__TEACHERS = eINSTANCE.getAcademy_Teachers();

		/**
		 * The meta object literal for the '<em><b>Students</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACADEMY__STUDENTS = eINSTANCE.getAcademy_Students();

		/**
		 * The meta object literal for the '<em><b>Schools</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACADEMY__SCHOOLS = eINSTANCE.getAcademy_Schools();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACADEMY__NAME = eINSTANCE.getAcademy_Name();

		/**
		 * The meta object literal for the '{@link com.tad.school.impl.MSchoolImpl <em>School</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tad.school.impl.MSchoolImpl
		 * @see com.tad.school.impl.MSchoolPackageImpl#getSchool()
		 * @generated
		 */
		EClass SCHOOL = eINSTANCE.getSchool();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHOOL__ROOMS = eINSTANCE.getSchool_Rooms();

		/**
		 * The meta object literal for the '<em><b>Teachers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHOOL__TEACHERS = eINSTANCE.getSchool_Teachers();

		/**
		 * The meta object literal for the '<em><b>Students</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHOOL__STUDENTS = eINSTANCE.getSchool_Students();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHOOL__NAME = eINSTANCE.getSchool_Name();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHOOL__RANK = eINSTANCE.getSchool_Rank();

		/**
		 * The meta object literal for the '{@link com.tad.school.impl.MTeacherImpl <em>Teacher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tad.school.impl.MTeacherImpl
		 * @see com.tad.school.impl.MSchoolPackageImpl#getTeacher()
		 * @generated
		 */
		EClass TEACHER = eINSTANCE.getTeacher();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEACHER__NAME = eINSTANCE.getTeacher_Name();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEACHER___EVALUATE__MSTUDENT = eINSTANCE.getTeacher__Evaluate__MStudent();

		/**
		 * The meta object literal for the '{@link com.tad.school.impl.MClassRoomImpl <em>Class Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tad.school.impl.MClassRoomImpl
		 * @see com.tad.school.impl.MSchoolPackageImpl#getClassRoom()
		 * @generated
		 */
		EClass CLASS_ROOM = eINSTANCE.getClassRoom();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_ROOM__NUMBER = eINSTANCE.getClassRoom_Number();

		/**
		 * The meta object literal for the '<em><b>Teacher</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_ROOM__TEACHER = eINSTANCE.getClassRoom_Teacher();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_ROOM__CHILDREN = eINSTANCE.getClassRoom_Children();

		/**
		 * The meta object literal for the '{@link com.tad.school.impl.MStudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tad.school.impl.MStudentImpl
		 * @see com.tad.school.impl.MSchoolPackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__NAME = eINSTANCE.getStudent_Name();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__AGE = eINSTANCE.getStudent_Age();

		/**
		 * The meta object literal for the '<em><b>Notations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__NOTATIONS = eINSTANCE.getStudent_Notations();

		/**
		 * The meta object literal for the '{@link com.tad.school.impl.MMatterImpl <em>Matter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tad.school.impl.MMatterImpl
		 * @see com.tad.school.impl.MSchoolPackageImpl#getMatter()
		 * @generated
		 */
		EClass MATTER = eINSTANCE.getMatter();

		/**
		 * The meta object literal for the '{@link com.tad.school.impl.MMathImpl <em>Math</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tad.school.impl.MMathImpl
		 * @see com.tad.school.impl.MSchoolPackageImpl#getMath()
		 * @generated
		 */
		EClass MATH = eINSTANCE.getMath();

		/**
		 * The meta object literal for the '{@link com.tad.school.impl.MNotationImpl <em>Notation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tad.school.impl.MNotationImpl
		 * @see com.tad.school.impl.MSchoolPackageImpl#getNotation()
		 * @generated
		 */
		EClass NOTATION = eINSTANCE.getNotation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTATION__VALUE = eINSTANCE.getNotation_Value();

	}

} //MSchoolPackage
