

/**
 */
package com.tad.school;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tad.school.MClassRoom#getNumber <em>Number</em>}</li>
 *   <li>{@link com.tad.school.MClassRoom#getTeacher <em>Teacher</em>}</li>
 *   <li>{@link com.tad.school.MClassRoom#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tad.school.MSchoolPackage#getClassRoom()
 * @model
 * @generated
 */
public interface MClassRoom extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see com.tad.school.MSchoolPackage#getClassRoom_Number()
	 * @model id="true"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link com.tad.school.MClassRoom#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Teacher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teacher</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teacher</em>' reference.
	 * @see #setTeacher(MTeacher)
	 * @see com.tad.school.MSchoolPackage#getClassRoom_Teacher()
	 * @model required="true"
	 * @generated
	 */
	Teacher getTeacher();

	/**
	 * Sets the value of the '{@link com.tad.school.MClassRoom#getTeacher <em>Teacher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teacher</em>' reference.
	 * @see #getTeacher()
	 * @generated
	 */
	void setTeacher(Teacher value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.

	 
	 * The list contents are of type {@link com.tad.school.MStudent}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see com.tad.school.MSchoolPackage#getClassRoom_Children()
	 * @model required="true"
	 * @generated
	 */
	EList<Student> getChildren();

} // MClassRoom
