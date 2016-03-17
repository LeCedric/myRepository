/**
 */
package com.tad.school.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import com.tad.school.MAcademy;
import com.tad.school.MClassRoom;
import com.tad.school.MMath;
import com.tad.school.MMatter;
import com.tad.school.MNotation;
import com.tad.school.MSchool;
import com.tad.school.MSchoolPackage;
import com.tad.school.MStudent;
import com.tad.school.MTeacher;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.tad.school.MSchoolPackage
 * @generated
 */
public class SchoolAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MSchoolPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchoolAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MSchoolPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchoolSwitch<Adapter> modelSwitch =
		new SchoolSwitch<Adapter>() {
			@Override
			public Adapter caseAcademy(MAcademy object) {
				return createAcademyAdapter();
			}
			@Override
			public Adapter caseSchool(MSchool object) {
				return createSchoolAdapter();
			}
			@Override
			public Adapter caseTeacher(MTeacher object) {
				return createTeacherAdapter();
			}
			@Override
			public Adapter caseClassRoom(MClassRoom object) {
				return createClassRoomAdapter();
			}
			@Override
			public Adapter caseStudent(MStudent object) {
				return createStudentAdapter();
			}
			@Override
			public Adapter caseMatter(MMatter object) {
				return createMatterAdapter();
			}
			@Override
			public Adapter caseMath(MMath object) {
				return createMathAdapter();
			}
			@Override
			public Adapter caseNotation(MNotation object) {
				return createNotationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.tad.school.MAcademy <em>Academy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tad.school.MAcademy
	 * @generated
	 */
	public Adapter createAcademyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tad.school.MSchool <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tad.school.MSchool
	 * @generated
	 */
	public Adapter createSchoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tad.school.MTeacher <em>Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tad.school.MTeacher
	 * @generated
	 */
	public Adapter createTeacherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tad.school.MClassRoom <em>Class Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tad.school.MClassRoom
	 * @generated
	 */
	public Adapter createClassRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tad.school.MStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tad.school.MStudent
	 * @generated
	 */
	public Adapter createStudentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tad.school.MMatter <em>Matter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tad.school.MMatter
	 * @generated
	 */
	public Adapter createMatterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tad.school.MMath <em>Math</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tad.school.MMath
	 * @generated
	 */
	public Adapter createMathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.tad.school.MNotation <em>Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.tad.school.MNotation
	 * @generated
	 */
	public Adapter createNotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SchoolAdapterFactory
