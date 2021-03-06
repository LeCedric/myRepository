/**
 */
package com.tad.school.provider;

import com.tad.school.util.SchoolAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SchoolItemProviderAdapterFactory extends SchoolAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchoolItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.tad.school.MAcademy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcademyItemProvider academyItemProvider;

	/**
	 * This creates an adapter for a {@link com.tad.school.MAcademy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAcademyAdapter() {
		if (academyItemProvider == null) {
			academyItemProvider = new AcademyItemProvider(this);
		}

		return academyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.tad.school.MSchool} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchoolItemProvider schoolItemProvider;

	/**
	 * This creates an adapter for a {@link com.tad.school.MSchool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchoolAdapter() {
		if (schoolItemProvider == null) {
			schoolItemProvider = new SchoolItemProvider(this);
		}

		return schoolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.tad.school.MTeacher} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeacherItemProvider teacherItemProvider;

	/**
	 * This creates an adapter for a {@link com.tad.school.MTeacher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTeacherAdapter() {
		if (teacherItemProvider == null) {
			teacherItemProvider = new TeacherItemProvider(this);
		}

		return teacherItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.tad.school.MClassRoom} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassRoomItemProvider classRoomItemProvider;

	/**
	 * This creates an adapter for a {@link com.tad.school.MClassRoom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassRoomAdapter() {
		if (classRoomItemProvider == null) {
			classRoomItemProvider = new ClassRoomItemProvider(this);
		}

		return classRoomItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.tad.school.MStudent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentItemProvider studentItemProvider;

	/**
	 * This creates an adapter for a {@link com.tad.school.MStudent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStudentAdapter() {
		if (studentItemProvider == null) {
			studentItemProvider = new StudentItemProvider(this);
		}

		return studentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.tad.school.MMatter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatterItemProvider matterItemProvider;

	/**
	 * This creates an adapter for a {@link com.tad.school.MMatter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMatterAdapter() {
		if (matterItemProvider == null) {
			matterItemProvider = new MatterItemProvider(this);
		}

		return matterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.tad.school.MMath} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MathItemProvider mathItemProvider;

	/**
	 * This creates an adapter for a {@link com.tad.school.MMath}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMathAdapter() {
		if (mathItemProvider == null) {
			mathItemProvider = new MathItemProvider(this);
		}

		return mathItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.tad.school.MNotation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotationItemProvider notationItemProvider;

	/**
	 * This creates an adapter for a {@link com.tad.school.MNotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotationAdapter() {
		if (notationItemProvider == null) {
			notationItemProvider = new NotationItemProvider(this);
		}

		return notationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (academyItemProvider != null) academyItemProvider.dispose();
		if (schoolItemProvider != null) schoolItemProvider.dispose();
		if (teacherItemProvider != null) teacherItemProvider.dispose();
		if (classRoomItemProvider != null) classRoomItemProvider.dispose();
		if (studentItemProvider != null) studentItemProvider.dispose();
		if (matterItemProvider != null) matterItemProvider.dispose();
		if (mathItemProvider != null) mathItemProvider.dispose();
		if (notationItemProvider != null) notationItemProvider.dispose();
	}

}
