/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owls;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Client Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owls.OwlsInputClientMessage#getClientInputs <em>Client Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see owls.OwlsPackage#getOwlsInputClientMessage()
 * @model
 * @generated
 */
public interface OwlsInputClientMessage extends OwlsClientMessage {
	/**
	 * Returns the value of the '<em><b>Client Inputs</b></em>' reference list.
	 * The list contents are of type {@link owls.OwlsInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Inputs</em>' reference list.
	 * @see owls.OwlsPackage#getOwlsInputClientMessage_ClientInputs()
	 * @model
	 * @generated
	 */
	EList<OwlsInput> getClientInputs();

} // OwlsInputClientMessage
