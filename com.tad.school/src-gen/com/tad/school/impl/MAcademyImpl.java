

/**
 */
package com.tad.school.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.tad.school.MAcademy;
import com.tad.school.MSchoolPackage;
import com.tad.school.School;
import com.tad.school.SchoolPackage;
import com.tad.school.Student;
import com.tad.school.Teacher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Academy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tad.school.impl.MAcademyImpl#getTeachers <em>Teachers</em>}</li>
 *   <li>{@link com.tad.school.impl.MAcademyImpl#getStudents <em>Students</em>}</li>
 *   <li>{@link com.tad.school.impl.MAcademyImpl#getSchools <em>Schools</em>}</li>
 *   <li>{@link com.tad.school.impl.MAcademyImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 public class MAcademyImpl extends MinimalEObjectImpl.Container implements MAcademy {
	/**
	 * The cached value of the '{@link #getTeachers() <em>Teachers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeachers()
	 * @generated
	 * @ordered
	 */
	protected EList<Teacher> teachers;

	/**
	 * The cached value of the '{@link #getStudents() <em>Students</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudents()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> students;

	/**
	 * The cached value of the '{@link #getSchools() <em>Schools</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchools()
	 * @generated
	 * @ordered
	 */
	protected EList<School> schools;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MAcademyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MSchoolPackage.Literals.ACADEMY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Teacher> getTeachers() {
		if (teachers == null) {
			teachers = new EObjectContainmentEList<Teacher>(Teacher.class, this, SchoolPackage.ACADEMY__TEACHERS);
		}
		return teachers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getStudents() {
		if (students == null) {
			students = new EObjectContainmentEList<Student>(Student.class, this, SchoolPackage.ACADEMY__STUDENTS);
		}
		return students;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<School> getSchools() {
		if (schools == null) {
			schools = new EObjectContainmentEList<School>(School.class, this, SchoolPackage.ACADEMY__SCHOOLS);
		}
		return schools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MSchoolPackage.ACADEMY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MSchoolPackage.ACADEMY__TEACHERS:
				return ((InternalEList<?>)getTeachers()).basicRemove(otherEnd, msgs);
			case MSchoolPackage.ACADEMY__STUDENTS:
				return ((InternalEList<?>)getStudents()).basicRemove(otherEnd, msgs);
			case MSchoolPackage.ACADEMY__SCHOOLS:
				return ((InternalEList<?>)getSchools()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MSchoolPackage.ACADEMY__TEACHERS:
				return getTeachers();
			case MSchoolPackage.ACADEMY__STUDENTS:
				return getStudents();
			case MSchoolPackage.ACADEMY__SCHOOLS:
				return getSchools();
			case MSchoolPackage.ACADEMY__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MSchoolPackage.ACADEMY__TEACHERS:
				getTeachers().clear();
				getTeachers().addAll((Collection<? extends Teacher>)newValue);
				return;
			case MSchoolPackage.ACADEMY__STUDENTS:
				getStudents().clear();
				getStudents().addAll((Collection<? extends Student>)newValue);
				return;
			case MSchoolPackage.ACADEMY__SCHOOLS:
				getSchools().clear();
				getSchools().addAll((Collection<? extends School>)newValue);
				return;
			case MSchoolPackage.ACADEMY__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MSchoolPackage.ACADEMY__TEACHERS:
				getTeachers().clear();
				return;
			case MSchoolPackage.ACADEMY__STUDENTS:
				getStudents().clear();
				return;
			case MSchoolPackage.ACADEMY__SCHOOLS:
				getSchools().clear();
				return;
			case MSchoolPackage.ACADEMY__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MSchoolPackage.ACADEMY__TEACHERS:
				return teachers != null && !teachers.isEmpty();
			case MSchoolPackage.ACADEMY__STUDENTS:
				return students != null && !students.isEmpty();
			case MSchoolPackage.ACADEMY__SCHOOLS:
				return schools != null && !schools.isEmpty();
			case MSchoolPackage.ACADEMY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MAcademyImpl
