/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owls;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owls.OwlsProfile#getID <em>ID</em>}</li>
 *   <li>{@link owls.OwlsProfile#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link owls.OwlsProfile#getIsPresentedBy <em>Is Presented By</em>}</li>
 *   <li>{@link owls.OwlsProfile#getHasProcess <em>Has Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see owls.OwlsPackage#getOwlsProfile()
 * @model
 * @generated
 */
public interface OwlsProfile extends EObject {
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
	 * @see owls.OwlsPackage#getOwlsProfile_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link owls.OwlsProfile#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Is Presented By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link owls.OwlsService#getPresents <em>Presents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Presented By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Presented By</em>' container reference.
	 * @see #setIsPresentedBy(OwlsService)
	 * @see owls.OwlsPackage#getOwlsProfile_IsPresentedBy()
	 * @see owls.OwlsService#getPresents
	 * @model opposite="presents" transient="false"
	 * @generated
	 */
	OwlsService getIsPresentedBy();

	/**
	 * Sets the value of the '{@link owls.OwlsProfile#getIsPresentedBy <em>Is Presented By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Presented By</em>' container reference.
	 * @see #getIsPresentedBy()
	 * @generated
	 */
	void setIsPresentedBy(OwlsService value);

	/**
	 * Returns the value of the '<em><b>Has Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Process</em>' reference.
	 * @see #setHasProcess(OwlsProcess)
	 * @see owls.OwlsPackage#getOwlsProfile_HasProcess()
	 * @model
	 * @generated
	 */
	OwlsProcess getHasProcess();

	/**
	 * Sets the value of the '{@link owls.OwlsProfile#getHasProcess <em>Has Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Process</em>' reference.
	 * @see #getHasProcess()
	 * @generated
	 */
	void setHasProcess(OwlsProcess value);

	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see owls.OwlsPackage#getOwlsProfile_ServiceName()
	 * @model
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link owls.OwlsProfile#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

} // OwlsProfile
