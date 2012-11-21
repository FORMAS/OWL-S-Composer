/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owls;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wsdl Grounding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owls.OwlsWsdlGrounding#getID <em>ID</em>}</li>
 *   <li>{@link owls.OwlsWsdlGrounding#getSupportedBy <em>Supported By</em>}</li>
 *   <li>{@link owls.OwlsWsdlGrounding#getHasAtomicProcessGrounding <em>Has Atomic Process Grounding</em>}</li>
 * </ul>
 * </p>
 *
 * @see owls.OwlsPackage#getOwlsWsdlGrounding()
 * @model
 * @generated
 */
public interface OwlsWsdlGrounding extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see owls.OwlsPackage#getOwlsWsdlGrounding_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link owls.OwlsWsdlGrounding#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Supported By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link owls.OwlsService#getSupports <em>Supports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported By</em>' container reference.
	 * @see #setSupportedBy(OwlsService)
	 * @see owls.OwlsPackage#getOwlsWsdlGrounding_SupportedBy()
	 * @see owls.OwlsService#getSupports
	 * @model opposite="supports" transient="false"
	 * @generated
	 */
	OwlsService getSupportedBy();

	/**
	 * Sets the value of the '{@link owls.OwlsWsdlGrounding#getSupportedBy <em>Supported By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported By</em>' container reference.
	 * @see #getSupportedBy()
	 * @generated
	 */
	void setSupportedBy(OwlsService value);

	/**
	 * Returns the value of the '<em><b>Has Atomic Process Grounding</b></em>' containment reference list.
	 * The list contents are of type {@link owls.OwlsWsdlAtomicProcessGrounding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Atomic Process Grounding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Atomic Process Grounding</em>' containment reference list.
	 * @see owls.OwlsPackage#getOwlsWsdlGrounding_HasAtomicProcessGrounding()
	 * @model containment="true" keys="iD"
	 * @generated
	 */
	EList<OwlsWsdlAtomicProcessGrounding> getHasAtomicProcessGrounding();

} // OwlsWsdlGrounding
