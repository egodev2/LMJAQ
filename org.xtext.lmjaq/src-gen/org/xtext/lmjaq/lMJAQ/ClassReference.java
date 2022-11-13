/**
 * generated by Xtext 2.25.0
 */
package org.xtext.lmjaq.lMJAQ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lmjaq.lMJAQ.ClassReference#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.lmjaq.lMJAQ.LMJAQPackage#getClassReference()
 * @model
 * @generated
 */
public interface ClassReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(AbstractClassType)
   * @see org.xtext.lmjaq.lMJAQ.LMJAQPackage#getClassReference_Type()
   * @model containment="true"
   * @generated
   */
  AbstractClassType getType();

  /**
   * Sets the value of the '{@link org.xtext.lmjaq.lMJAQ.ClassReference#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(AbstractClassType value);

} // ClassReference
