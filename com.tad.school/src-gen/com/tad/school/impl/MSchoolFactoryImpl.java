/**
 */
package com.tad.school.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.tad.school.MAcademy;
import com.tad.school.MClassRoom;
import com.tad.school.MMath;
import com.tad.school.MMatter;
import com.tad.school.MNotation;
import com.tad.school.MSchool;
import com.tad.school.MSchoolFactory;
import com.tad.school.MSchoolPackage;
import com.tad.school.MStudent;
import com.tad.school.MTeacher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MSchoolFactoryImpl extends EFactoryImpl implements MSchoolFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MSchoolFactory init() {
		try {
			MSchoolFactory theSchoolFactory = (MSchoolFactory)EPackage.Registry.INSTANCE.getEFactory(MSchoolPackage.eNS_URI);
			if (theSchoolFactory != null) {
				return theSchoolFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MSchoolFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSchoolFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MSchoolPackage.ACADEMY: return createAcademy();
			case MSchoolPackage.SCHOOL: return createSchool();
			case MSchoolPackage.TEACHER: return createTeacher();
			case MSchoolPackage.CLASS_ROOM: return createClassRoom();
			case MSchoolPackage.STUDENT: return createStudent();
			case MSchoolPackage.MATTER: return createMatter();
			case MSchoolPackage.MATH: return createMath();
			case MSchoolPackage.NOTATION: return createNotation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAcademy createAcademy() {
		MAcademyImpl academy = new MAcademyImpl();
		return academy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSchool createSchool() {
		MSchoolImpl school = new MSchoolImpl();
		return school;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTeacher createTeacher() {
		MTeacherImpl teacher = new MTeacherImpl();
		return teacher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MClassRoom createClassRoom() {
		MClassRoomImpl classRoom = new MClassRoomImpl();
		return classRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MStudent createStudent() {
		MStudentImpl student = new MStudentImpl();
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMatter createMatter() {
		MMatterImpl matter = new MMatterImpl();
		return matter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMath createMath() {
		MMathImpl math = new MMathImpl();
		return math;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MNotation createNotation() {
		MNotationImpl notation = new MNotationImpl();
		return notation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSchoolPackage getSchoolPackage() {
		return (MSchoolPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MSchoolPackage getPackage() {
		return MSchoolPackage.eINSTANCE;
	}

} //MSchoolFactoryImpl
