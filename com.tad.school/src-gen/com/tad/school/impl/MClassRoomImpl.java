

/**
 */
package com.tad.school.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import com.tad.school.MClassRoom;
import com.tad.school.MSchoolPackage;
import com.tad.school.SchoolPackage;
import com.tad.school.Student;
import com.tad.school.Teacher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tad.school.impl.MClassRoomImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link com.tad.school.impl.MClassRoomImpl#getTeacher <em>Teacher</em>}</li>
 *   <li>{@link com.tad.school.impl.MClassRoomImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 public class MClassRoomImpl extends MinimalEObjectImpl.Container implements MClassRoom {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTeacher() <em>Teacher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeacher()
	 * @generated
	 * @ordered
	 */
	protected Teacher teacher;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MClassRoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MSchoolPackage.Literals.CLASS_ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MSchoolPackage.CLASS_ROOM__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teacher getTeacher() {
		if (teacher != null && teacher.eIsProxy()) {
			InternalEObject oldTeacher = (InternalEObject)teacher;
			teacher = (Teacher)eResolveProxy(oldTeacher);
			if (teacher != oldTeacher) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MSchoolPackage.CLASS_ROOM__TEACHER, oldTeacher, teacher));
			}
		}
		return teacher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teacher basicGetTeacher() {
		return teacher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeacher(Teacher newTeacher) {
		Teacher oldTeacher = teacher;
		teacher = newTeacher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MSchoolPackage.CLASS_ROOM__TEACHER, oldTeacher, teacher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getChildren() {
		if (children == null) {
			children = new EObjectResolvingEList<Student>(Student.class, this, SchoolPackage.CLASS_ROOM__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MSchoolPackage.CLASS_ROOM__NUMBER:
				return getNumber();
			case MSchoolPackage.CLASS_ROOM__TEACHER:
				if (resolve) return getTeacher();
				return basicGetTeacher();
			case MSchoolPackage.CLASS_ROOM__CHILDREN:
				return getChildren();
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
			case MSchoolPackage.CLASS_ROOM__NUMBER:
				setNumber((Integer)newValue);
				return;
			case MSchoolPackage.CLASS_ROOM__TEACHER:
				setTeacher((Teacher)newValue);
				return;
			case MSchoolPackage.CLASS_ROOM__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Student>)newValue);
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
			case MSchoolPackage.CLASS_ROOM__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case MSchoolPackage.CLASS_ROOM__TEACHER:
				setTeacher((Teacher)null);
				return;
			case MSchoolPackage.CLASS_ROOM__CHILDREN:
				getChildren().clear();
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
			case MSchoolPackage.CLASS_ROOM__NUMBER:
				return number != NUMBER_EDEFAULT;
			case MSchoolPackage.CLASS_ROOM__TEACHER:
				return teacher != null;
			case MSchoolPackage.CLASS_ROOM__CHILDREN:
				return children != null && !children.isEmpty();
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
		result.append(" (number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} //MClassRoomImpl
