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
 * A representation of the model object '<em><b>Control Construct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owls.OwlsControlConstruct#getProcesses <em>Processes</em>}</li>
 *   <li>{@link owls.OwlsControlConstruct#getConstructs <em>Constructs</em>}</li>
 *   <li>{@link owls.OwlsControlConstruct#getElements <em>Elements</em>}</li>
 *   <li>{@link owls.OwlsControlConstruct#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @see owls.OwlsPackage#getOwlsControlConstruct()
 * @model
 * @generated
 */
public interface OwlsControlConstruct extends EObject {
	/**
	 * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
	 * The list contents are of type {@link owls.OwlsProcess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processes</em>' containment reference list.
	 * @see owls.OwlsPackage#getOwlsControlConstruct_Processes()
	 * @model containment="true"
	 * @generated
	 */
	EList<OwlsProcess> getProcesses();

	/**
	 * Returns the value of the '<em><b>Constructs</b></em>' containment reference list.
	 * The list contents are of type {@link owls.OwlsControlConstruct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constructs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructs</em>' containment reference list.
	 * @see owls.OwlsPackage#getOwlsControlConstruct_Constructs()
	 * @model containment="true"
	 * @generated
	 */
	EList<OwlsControlConstruct> getConstructs();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see owls.OwlsPackage#getOwlsControlConstruct_Elements()
	 * @model
	 * @generated
	 */
	EList<EObject> getElements();

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link owls.OwlsClientMessage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see owls.OwlsPackage#getOwlsControlConstruct_Messages()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<OwlsClientMessage> getMessages();

} // OwlsControlConstruct
