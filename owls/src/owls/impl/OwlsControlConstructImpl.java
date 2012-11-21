/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owls.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import owls.OwlsClientMessage;
import owls.OwlsControlConstruct;
import owls.OwlsPackage;
import owls.OwlsProcess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Construct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owls.impl.OwlsControlConstructImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link owls.impl.OwlsControlConstructImpl#getConstructs <em>Constructs</em>}</li>
 *   <li>{@link owls.impl.OwlsControlConstructImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link owls.impl.OwlsControlConstructImpl#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OwlsControlConstructImpl extends EObjectImpl implements OwlsControlConstruct {
	/**
	 * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<OwlsProcess> processes;

	/**
	 * The cached value of the '{@link #getConstructs() <em>Constructs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructs()
	 * @generated
	 * @ordered
	 */
	protected EList<OwlsControlConstruct> constructs;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> elements;

	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<OwlsClientMessage> messages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsControlConstructImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlsPackage.Literals.OWLS_CONTROL_CONSTRUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OwlsProcess> getProcesses() {
		if (processes == null) {
			processes = new EObjectContainmentEList<OwlsProcess>(OwlsProcess.class, this, OwlsPackage.OWLS_CONTROL_CONSTRUCT__PROCESSES);
		}
		return processes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OwlsControlConstruct> getConstructs() {
		if (constructs == null) {
			constructs = new EObjectContainmentEList<OwlsControlConstruct>(OwlsControlConstruct.class, this, OwlsPackage.OWLS_CONTROL_CONSTRUCT__CONSTRUCTS);
		}
		return constructs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getElements() {
		if (elements == null) {
			elements = new EObjectResolvingEList<EObject>(EObject.class, this, OwlsPackage.OWLS_CONTROL_CONSTRUCT__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OwlsClientMessage> getMessages() {
		if (messages == null) {
			messages = new EObjectContainmentEList<OwlsClientMessage>(OwlsClientMessage.class, this, OwlsPackage.OWLS_CONTROL_CONSTRUCT__MESSAGES);
		}
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OwlsPackage.OWLS_CONTROL_CONSTRUCT__PROCESSES:
				return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
			case OwlsPackage.OWLS_CONTROL_CONSTRUCT__CONSTRUCTS:
				return ((InternalEList<?>)getConstructs()).basicRemove(otherEnd, msgs);
			case OwlsPackage.OWLS_CONTROL_CONSTRUCT__MESSAGES:
				return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlsPackage.OWLS_CONTROL_CONSTRUCT__PROCESSES:
				return getProcesses();
			case OwlsPackage.OWLS_CONTROL_CONSTRUCT__CONSTRUCTS:
				return getConstructs();
			case OwlsPackage.OWLS_CONTROL_CONSTRUCT__ELEMENTS:
				return getElements();
			case OwlsPackage.OWLS_CONTROL_CONSTRUCT__MESSAGES:
				return getMessages();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OwlsPackage.OWLS_CONTROL_CONSTRUCT__PROCESSES:
				getProcesses().clear();
				getProcesses().addAll((Collection<? extends OwlsProcess>)newValue);
				return;
			case OwlsPackage.OWLS_CONTROL_CONSTRUCT__CONSTRUCTS:
				getConstructs().clear();
				getConstructs().addAll((Collection<? extends OwlsControlConstruct>)newValue);
				return;
			case OwlsPackage.OWLS_CONTROL_CONSTRUCT__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends EObject>)newValue);
				return;
			case OwlsPackage.OWLS_CONTROL_CONSTRUCT__MESSAGES:
				getMessages().clear();
				getMessages().addAll((Collection<? extends OwlsClientMessage>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case OwlsPackage.OWLS_CONTROL_CONSTRUCT__PROCESSES:
				getProcesses().clear();
				return;
			case OwlsPackage.OWLS_CONTROL_CONSTRUCT__CONSTRUCTS:
				getConstructs().clear();
				return;
			case OwlsPackage.OWLS_CONTROL_CONSTRUCT__ELEMENTS:
				getElements().clear();
				return;
			case OwlsPackage.OWLS_CONTROL_CONSTRUCT__MESSAGES:
				getMessages().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OwlsPackage.OWLS_CONTROL_CONSTRUCT__PROCESSES:
				return processes != null && !processes.isEmpty();
			case OwlsPackage.OWLS_CONTROL_CONSTRUCT__CONSTRUCTS:
				return constructs != null && !constructs.isEmpty();
			case OwlsPackage.OWLS_CONTROL_CONSTRUCT__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case OwlsPackage.OWLS_CONTROL_CONSTRUCT__MESSAGES:
				return messages != null && !messages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OwlsControlConstructImpl
