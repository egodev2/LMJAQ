/**
 * generated by Xtext 2.25.0
 */
package org.xtext.lmjaq.lMJAQ.impl;

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

import org.xtext.lmjaq.lMJAQ.AbstractClass;
import org.xtext.lmjaq.lMJAQ.AbstractClassType;
import org.xtext.lmjaq.lMJAQ.AbstractProperty;
import org.xtext.lmjaq.lMJAQ.LMJAQPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lmjaq.lMJAQ.impl.AbstractClassImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.lmjaq.lMJAQ.impl.AbstractClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.lmjaq.lMJAQ.impl.AbstractClassImpl#getAbstractProperties <em>Abstract Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractClassImpl extends MinimalEObjectImpl.Container implements AbstractClass
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected AbstractClassType type;

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
   * The cached value of the '{@link #getAbstractProperties() <em>Abstract Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstractProperties()
   * @generated
   * @ordered
   */
  protected EList<AbstractProperty> abstractProperties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractClassImpl()
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
    return LMJAQPackage.Literals.ABSTRACT_CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractClassType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(AbstractClassType newType, NotificationChain msgs)
  {
    AbstractClassType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LMJAQPackage.ABSTRACT_CLASS__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(AbstractClassType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LMJAQPackage.ABSTRACT_CLASS__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LMJAQPackage.ABSTRACT_CLASS__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LMJAQPackage.ABSTRACT_CLASS__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LMJAQPackage.ABSTRACT_CLASS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AbstractProperty> getAbstractProperties()
  {
    if (abstractProperties == null)
    {
      abstractProperties = new EObjectContainmentEList<AbstractProperty>(AbstractProperty.class, this, LMJAQPackage.ABSTRACT_CLASS__ABSTRACT_PROPERTIES);
    }
    return abstractProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LMJAQPackage.ABSTRACT_CLASS__TYPE:
        return basicSetType(null, msgs);
      case LMJAQPackage.ABSTRACT_CLASS__ABSTRACT_PROPERTIES:
        return ((InternalEList<?>)getAbstractProperties()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case LMJAQPackage.ABSTRACT_CLASS__TYPE:
        return getType();
      case LMJAQPackage.ABSTRACT_CLASS__NAME:
        return getName();
      case LMJAQPackage.ABSTRACT_CLASS__ABSTRACT_PROPERTIES:
        return getAbstractProperties();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LMJAQPackage.ABSTRACT_CLASS__TYPE:
        setType((AbstractClassType)newValue);
        return;
      case LMJAQPackage.ABSTRACT_CLASS__NAME:
        setName((String)newValue);
        return;
      case LMJAQPackage.ABSTRACT_CLASS__ABSTRACT_PROPERTIES:
        getAbstractProperties().clear();
        getAbstractProperties().addAll((Collection<? extends AbstractProperty>)newValue);
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
      case LMJAQPackage.ABSTRACT_CLASS__TYPE:
        setType((AbstractClassType)null);
        return;
      case LMJAQPackage.ABSTRACT_CLASS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LMJAQPackage.ABSTRACT_CLASS__ABSTRACT_PROPERTIES:
        getAbstractProperties().clear();
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
      case LMJAQPackage.ABSTRACT_CLASS__TYPE:
        return type != null;
      case LMJAQPackage.ABSTRACT_CLASS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LMJAQPackage.ABSTRACT_CLASS__ABSTRACT_PROPERTIES:
        return abstractProperties != null && !abstractProperties.isEmpty();
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //AbstractClassImpl