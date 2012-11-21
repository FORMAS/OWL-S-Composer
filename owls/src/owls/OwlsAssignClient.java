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
 * A representation of the model object '<em><b>Assign Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owls.OwlsAssignClient#getProcessReference <em>Process Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see owls.OwlsPackage#getOwlsAssignClient()
 * @model
 * @generated
 */
public interface OwlsAssignClient extends EObject {
	/**
	 * Returns the value of the '<em><b>Process Reference</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link owls.OwlsProcess#getMessagesBindings <em>Messages Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Reference</em>' container reference.
	 * @see #setProcessReference(OwlsProcess)
	 * @see owls.OwlsPackage#getOwlsAssignClient_ProcessReference()
	 * @see owls.OwlsProcess#getMessagesBindings
	 * @model opposite="messagesBindings" transient="false"
	 * @generated
	 */
	OwlsProcess getProcessReference();

	/**
	 * Sets the value of the '{@link owls.OwlsAssignClient#getProcessReference <em>Process Reference</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Reference</em>' container reference.
	 * @see #getProcessReference()
	 * @generated
	 */
	void setProcessReference(OwlsProcess value);

} // OwlsAssignClient
