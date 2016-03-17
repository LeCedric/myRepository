

/**
 */
package com.tad.school;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>School</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tad.school.MSchool#getRooms <em>Rooms</em>}</li>
 *   <li>{@link com.tad.school.MSchool#getTeachers <em>Teachers</em>}</li>
 *   <li>{@link com.tad.school.MSchool#getStudents <em>Students</em>}</li>
 *   <li>{@link com.tad.school.MSchool#getName <em>Name</em>}</li>
 *   <li>{@link com.tad.school.MSchool#getRank <em>Rank</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tad.school.MSchoolPackage#getSchool()
 * @model
 * @generated
 */
public interface MSchool extends EObject {
	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.

	 
	 * The list contents are of type {@link com.tad.school.MClassRoom}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference list.
	 * @see com.tad.school.MSchoolPackage#getSchool_Rooms()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ClassRoom> getRooms();

	/**
	 * Returns the value of the '<em><b>Teachers</b></em>' reference list.

	 
	 * The list contents are of type {@link com.tad.school.MTeacher}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teachers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teachers</em>' reference list.
	 * @see com.tad.school.MSchoolPackage#getSchool_Teachers()
	 * @model required="true"
	 * @generated
	 */
	EList<Teacher> getTeachers();

	/**
	 * Returns the value of the '<em><b>Students</b></em>' reference list.

	 
	 * The list contents are of type {@link com.tad.school.MStudent}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Students</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' reference list.
	 * @see com.tad.school.MSchoolPackage#getSchool_Students()
	 * @model required="true"
	 * @generated
	 */
	EList<Student> getStudents();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.tad.school.MSchoolPackage#getSchool_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.tad.school.MSchool#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rank</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank</em>' attribute.
	 * @see #setRank(int)
	 * @see com.tad.school.MSchoolPackage#getSchool_Rank()
	 * @model
	 * @generated
	 */
	int getRank();

	/**
	 * Sets the value of the '{@link com.tad.school.MSchool#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(int value);

} // MSchool
