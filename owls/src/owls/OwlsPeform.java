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
 * A representation of the model object '<em><b>Peform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owls.OwlsPeform#getID <em>ID</em>}</li>
 *   <li>{@link owls.OwlsPeform#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see owls.OwlsPackage#getOwlsPeform()
 * @model
 * @generated
 */
public interface OwlsPeform extends EObject {
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
	 * @see owls.OwlsPackage#getOwlsPeform_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link owls.OwlsPeform#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Process</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link owls.OwlsProcess#getPeformedBy <em>Peformed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' container reference.
	 * @see #setProcess(OwlsProcess)
	 * @see owls.OwlsPackage#getOwlsPeform_Process()
	 * @see owls.OwlsProcess#getPeformedBy
	 * @model opposite="peformedBy" transient="false"
	 * @generated
	 */
	OwlsProcess getProcess();

	/**
	 * Sets the value of the '{@link owls.OwlsPeform#getProcess <em>Process</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' container reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(OwlsProcess value);

} // OwlsPeform
