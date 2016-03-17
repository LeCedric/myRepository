

/**
 */
package com.tad.school;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Academy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tad.school.MAcademy#getTeachers <em>Teachers</em>}</li>
 *   <li>{@link com.tad.school.MAcademy#getStudents <em>Students</em>}</li>
 *   <li>{@link com.tad.school.MAcademy#getSchools <em>Schools</em>}</li>
 *   <li>{@link com.tad.school.MAcademy#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tad.school.MSchoolPackage#getAcademy()
 * @model
 * @generated
 */
public interface MAcademy extends EObject {
	/**
	 * Returns the value of the '<em><b>Teachers</b></em>' containment reference list.

	 
	 * The list contents are of type {@link com.tad.school.MTeacher}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teachers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teachers</em>' containment reference list.
	 * @see com.tad.school.MSchoolPackage#getAcademy_Teachers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Teacher> getTeachers();

	/**
	 * Returns the value of the '<em><b>Students</b></em>' containment reference list.

	 
	 * The list contents are of type {@link com.tad.school.MStudent}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Students</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' containment reference list.
	 * @see com.tad.school.MSchoolPackage#getAcademy_Students()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Student> getStudents();

	/**
	 * Returns the value of the '<em><b>Schools</b></em>' containment reference list.

	 
	 * The list contents are of type {@link com.tad.school.MSchool}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schools</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schools</em>' containment reference list.
	 * @see com.tad.school.MSchoolPackage#getAcademy_Schools()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<School> getSchools();

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
	 * @see com.tad.school.MSchoolPackage#getAcademy_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.tad.school.MAcademy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // MAcademy
