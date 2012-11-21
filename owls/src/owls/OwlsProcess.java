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
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owls.OwlsProcess#getID <em>ID</em>}</li>
 *   <li>{@link owls.OwlsProcess#getLabel <em>Label</em>}</li>
 *   <li>{@link owls.OwlsProcess#getProcessURI <em>Process URI</em>}</li>
 *   <li>{@link owls.OwlsProcess#getReferenceName <em>Reference Name</em>}</li>
 *   <li>{@link owls.OwlsProcess#getDescribes <em>Describes</em>}</li>
 *   <li>{@link owls.OwlsProcess#getPeformedBy <em>Peformed By</em>}</li>
 *   <li>{@link owls.OwlsProcess#getHasInputs <em>Has Inputs</em>}</li>
 *   <li>{@link owls.OwlsProcess#getHasOutputs <em>Has Outputs</em>}</li>
 *   <li>{@link owls.OwlsProcess#getBindings <em>Bindings</em>}</li>
 *   <li>{@link owls.OwlsProcess#getMessagesBindings <em>Messages Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see owls.OwlsPackage#getOwlsProcess()
 * @model
 * @generated
 */
public interface OwlsProcess extends EObject {
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
	 * @see owls.OwlsPackage#getOwlsProcess_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link owls.OwlsProcess#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see owls.OwlsPackage#getOwlsProcess_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link owls.OwlsProcess#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Process URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process URI</em>' attribute.
	 * @see #setProcessURI(String)
	 * @see owls.OwlsPackage#getOwlsProcess_ProcessURI()
	 * @model
	 * @generated
	 */
	String getProcessURI();

	/**
	 * Sets the value of the '{@link owls.OwlsProcess#getProcessURI <em>Process URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process URI</em>' attribute.
	 * @see #getProcessURI()
	 * @generated
	 */
	void setProcessURI(String value);

	/**
	 * Returns the value of the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Name</em>' attribute.
	 * @see #setReferenceName(String)
	 * @see owls.OwlsPackage#getOwlsProcess_ReferenceName()
	 * @model
	 * @generated
	 */
	String getReferenceName();

	/**
	 * Sets the value of the '{@link owls.OwlsProcess#getReferenceName <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Name</em>' attribute.
	 * @see #getReferenceName()
	 * @generated
	 */
	void setReferenceName(String value);

	/**
	 * Returns the value of the '<em><b>Describes</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link owls.OwlsService#getDescribedBy <em>Described By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Describes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Describes</em>' containment reference.
	 * @see #setDescribes(OwlsService)
	 * @see owls.OwlsPackage#getOwlsProcess_Describes()
	 * @see owls.OwlsService#getDescribedBy
	 * @model opposite="describedBy" containment="true"
	 * @generated
	 */
	OwlsService getDescribes();

	/**
	 * Sets the value of the '{@link owls.OwlsProcess#getDescribes <em>Describes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Describes</em>' containment reference.
	 * @see #getDescribes()
	 * @generated
	 */
	void setDescribes(OwlsService value);

	/**
	 * Returns the value of the '<em><b>Peformed By</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link owls.OwlsPeform#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peformed By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peformed By</em>' containment reference.
	 * @see #setPeformedBy(OwlsPeform)
	 * @see owls.OwlsPackage#getOwlsProcess_PeformedBy()
	 * @see owls.OwlsPeform#getProcess
	 * @model opposite="process" containment="true"
	 * @generated
	 */
	OwlsPeform getPeformedBy();

	/**
	 * Sets the value of the '{@link owls.OwlsProcess#getPeformedBy <em>Peformed By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peformed By</em>' containment reference.
	 * @see #getPeformedBy()
	 * @generated
	 */
	void setPeformedBy(OwlsPeform value);

	/**
	 * Returns the value of the '<em><b>Has Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link owls.OwlsInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Inputs</em>' containment reference list.
	 * @see owls.OwlsPackage#getOwlsProcess_HasInputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<OwlsInput> getHasInputs();

	/**
	 * Returns the value of the '<em><b>Has Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link owls.OwlsOutput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Outputs</em>' containment reference list.
	 * @see owls.OwlsPackage#getOwlsProcess_HasOutputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<OwlsOutput> getHasOutputs();

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link owls.OwlsAssign}.
	 * It is bidirectional and its opposite is '{@link owls.OwlsAssign#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see owls.OwlsPackage#getOwlsProcess_Bindings()
	 * @see owls.OwlsAssign#getTarget
	 * @model opposite="target" containment="true"
	 * @generated
	 */
	EList<OwlsAssign> getBindings();

	/**
	 * Returns the value of the '<em><b>Messages Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link owls.OwlsAssignClient}.
	 * It is bidirectional and its opposite is '{@link owls.OwlsAssignClient#getProcessReference <em>Process Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages Bindings</em>' containment reference list.
	 * @see owls.OwlsPackage#getOwlsProcess_MessagesBindings()
	 * @see owls.OwlsAssignClient#getProcessReference
	 * @model opposite="processReference" containment="true"
	 * @generated
	 */
	EList<OwlsAssignClient> getMessagesBindings();

} // OwlsProcess
