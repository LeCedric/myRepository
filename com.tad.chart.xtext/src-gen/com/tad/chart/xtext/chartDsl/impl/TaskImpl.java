/**
 * generated by Xtext 2.9.2
 */
package com.tad.chart.xtext.chartDsl.impl;

import com.tad.chart.xtext.chartDsl.ChartDslPackage;
import com.tad.chart.xtext.chartDsl.Employee;
import com.tad.chart.xtext.chartDsl.Task;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.tad.chart.xtext.chartDsl.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.tad.chart.xtext.chartDsl.impl.TaskImpl#getResponsable <em>Responsable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task
{
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
   * The cached value of the '{@link #getResponsable() <em>Responsable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponsable()
   * @generated
   * @ordered
   */
  protected Employee responsable;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TaskImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ChartDslPackage.Literals.TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChartDslPackage.TASK__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Employee getResponsable()
  {
    if (responsable != null && responsable.eIsProxy())
    {
      InternalEObject oldResponsable = (InternalEObject)responsable;
      responsable = (Employee)eResolveProxy(oldResponsable);
      if (responsable != oldResponsable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChartDslPackage.TASK__RESPONSABLE, oldResponsable, responsable));
      }
    }
    return responsable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Employee basicGetResponsable()
  {
    return responsable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResponsable(Employee newResponsable)
  {
    Employee oldResponsable = responsable;
    responsable = newResponsable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChartDslPackage.TASK__RESPONSABLE, oldResponsable, responsable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ChartDslPackage.TASK__NAME:
        return getName();
      case ChartDslPackage.TASK__RESPONSABLE:
        if (resolve) return getResponsable();
        return basicGetResponsable();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ChartDslPackage.TASK__NAME:
        setName((String)newValue);
        return;
      case ChartDslPackage.TASK__RESPONSABLE:
        setResponsable((Employee)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ChartDslPackage.TASK__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ChartDslPackage.TASK__RESPONSABLE:
        setResponsable((Employee)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ChartDslPackage.TASK__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ChartDslPackage.TASK__RESPONSABLE:
        return responsable != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //TaskImpl
