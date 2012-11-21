/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owls.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import owls.OwlsAssignClient;
import owls.OwlsPackage;
import owls.OwlsProcess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assign Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owls.impl.OwlsAssignClientImpl#getProcessReference <em>Process Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OwlsAssignClientImpl extends EObjectImpl implements OwlsAssignClient {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsAssignClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlsPackage.Literals.OWLS_ASSIGN_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsProcess getProcessReference() {
		if (eContainerFeatureID != OwlsPackage.OWLS_ASSIGN_CLIENT__PROCESS_REFERENCE) return null;
		return (OwlsProcess)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessReference(OwlsProcess newProcessReference, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProcessReference, OwlsPackage.OWLS_ASSIGN_CLIENT__PROCESS_REFERENCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessReference(OwlsProcess newProcessReference) {
		if (newProcessReference != eInternalContainer() || (eContainerFeatureID != OwlsPackage.OWLS_ASSIGN_CLIENT__PROCESS_REFERENCE && newProcessReference != null)) {
			if (EcoreUtil.isAncestor(this, newProcessReference))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProcessReference != null)
				msgs = ((InternalEObject)newProcessReference).eInverseAdd(this, OwlsPackage.OWLS_PROCESS__MESSAGES_BINDINGS, OwlsProcess.class, msgs);
			msgs = basicSetProcessReference(newProcessReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_ASSIGN_CLIENT__PROCESS_REFERENCE, newProcessReference, newProcessReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OwlsPackage.OWLS_ASSIGN_CLIENT__PROCESS_REFERENCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProcessReference((OwlsProcess)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OwlsPackage.OWLS_ASSIGN_CLIENT__PROCESS_REFERENCE:
				return basicSetProcessReference(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case OwlsPackage.OWLS_ASSIGN_CLIENT__PROCESS_REFERENCE:
				return eInternalContainer().eInverseRemove(this, OwlsPackage.OWLS_PROCESS__MESSAGES_BINDINGS, OwlsProcess.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OwlsPackage.OWLS_ASSIGN_CLIENT__PROCESS_REFERENCE:
				return getProcessReference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OwlsPackage.OWLS_ASSIGN_CLIENT__PROCESS_REFERENCE:
				setProcessReference((OwlsProcess)newValue);
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
			case OwlsPackage.OWLS_ASSIGN_CLIENT__PROCESS_REFERENCE:
				setProcessReference((OwlsProcess)null);
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
			case OwlsPackage.OWLS_ASSIGN_CLIENT__PROCESS_REFERENCE:
				return getProcessReference() != null;
		}
		return super.eIsSet(featureID);
	}

} //OwlsAssignClientImpl
