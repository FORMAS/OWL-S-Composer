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
 * A representation of the model object '<em><b>Output Client Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owls.OwlsOutputClientMessage#getClientOutputs <em>Client Outputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see owls.OwlsPackage#getOwlsOutputClientMessage()
 * @model
 * @generated
 */
public interface OwlsOutputClientMessage extends OwlsClientMessage {
	/**
	 * Returns the value of the '<em><b>Client Outputs</b></em>' reference list.
	 * The list contents are of type {@link owls.OwlsOutput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Outputs</em>' reference list.
	 * @see owls.OwlsPackage#getOwlsOutputClientMessage_ClientOutputs()
	 * @model
	 * @generated
	 */
	EList<OwlsOutput> getClientOutputs();

} // OwlsOutputClientMessage
