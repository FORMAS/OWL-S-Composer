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

import owls.OwlsPackage;
import owls.OwlsProcess;
import owls.OwlsProfile;
import owls.OwlsService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owls.impl.OwlsProfileImpl#getID <em>ID</em>}</li>
 *   <li>{@link owls.impl.OwlsProfileImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link owls.impl.OwlsProfileImpl#getIsPresentedBy <em>Is Presented By</em>}</li>
 *   <li>{@link owls.impl.OwlsProfileImpl#getHasProcess <em>Has Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OwlsProfileImpl extends EObjectImpl implements OwlsProfile {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String iD = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasProcess() <em>Has Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasProcess()
	 * @generated
	 * @ordered
	 */
	protected OwlsProcess hasProcess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlsPackage.Literals.OWLS_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_PROFILE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsService getIsPresentedBy() {
		if (eContainerFeatureID != OwlsPackage.OWLS_PROFILE__IS_PRESENTED_BY) return null;
		return (OwlsService)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsPresentedBy(OwlsService newIsPresentedBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIsPresentedBy, OwlsPackage.OWLS_PROFILE__IS_PRESENTED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPresentedBy(OwlsService newIsPresentedBy) {
		if (newIsPresentedBy != eInternalContainer() || (eContainerFeatureID != OwlsPackage.OWLS_PROFILE__IS_PRESENTED_BY && newIsPresentedBy != null)) {
			if (EcoreUtil.isAncestor(this, newIsPresentedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIsPresentedBy != null)
				msgs = ((InternalEObject)newIsPresentedBy).eInverseAdd(this, OwlsPackage.OWLS_SERVICE__PRESENTS, OwlsService.class, msgs);
			msgs = basicSetIsPresentedBy(newIsPresentedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_PROFILE__IS_PRESENTED_BY, newIsPresentedBy, newIsPresentedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsProcess getHasProcess() {
		if (hasProcess != null && hasProcess.eIsProxy()) {
			InternalEObject oldHasProcess = (InternalEObject)hasProcess;
			hasProcess = (OwlsProcess)eResolveProxy(oldHasProcess);
			if (hasProcess != oldHasProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlsPackage.OWLS_PROFILE__HAS_PROCESS, oldHasProcess, hasProcess));
			}
		}
		return hasProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsProcess basicGetHasProcess() {
		return hasProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasProcess(OwlsProcess newHasProcess) {
		OwlsProcess oldHasProcess = hasProcess;
		hasProcess = newHasProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_PROFILE__HAS_PROCESS, oldHasProcess, hasProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_PROFILE__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OwlsPackage.OWLS_PROFILE__IS_PRESENTED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIsPresentedBy((OwlsService)otherEnd, msgs);
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
			case OwlsPackage.OWLS_PROFILE__IS_PRESENTED_BY:
				return basicSetIsPresentedBy(null, msgs);
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
			case OwlsPackage.OWLS_PROFILE__IS_PRESENTED_BY:
				return eInternalContainer().eInverseRemove(this, OwlsPackage.OWLS_SERVICE__PRESENTS, OwlsService.class, msgs);
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
			case OwlsPackage.OWLS_PROFILE__ID:
				return getID();
			case OwlsPackage.OWLS_PROFILE__SERVICE_NAME:
				return getServiceName();
			case OwlsPackage.OWLS_PROFILE__IS_PRESENTED_BY:
				return getIsPresentedBy();
			case OwlsPackage.OWLS_PROFILE__HAS_PROCESS:
				if (resolve) return getHasProcess();
				return basicGetHasProcess();
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
			case OwlsPackage.OWLS_PROFILE__ID:
				setID((String)newValue);
				return;
			case OwlsPackage.OWLS_PROFILE__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case OwlsPackage.OWLS_PROFILE__IS_PRESENTED_BY:
				setIsPresentedBy((OwlsService)newValue);
				return;
			case OwlsPackage.OWLS_PROFILE__HAS_PROCESS:
				setHasProcess((OwlsProcess)newValue);
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
			case OwlsPackage.OWLS_PROFILE__ID:
				setID(ID_EDEFAULT);
				return;
			case OwlsPackage.OWLS_PROFILE__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case OwlsPackage.OWLS_PROFILE__IS_PRESENTED_BY:
				setIsPresentedBy((OwlsService)null);
				return;
			case OwlsPackage.OWLS_PROFILE__HAS_PROCESS:
				setHasProcess((OwlsProcess)null);
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
			case OwlsPackage.OWLS_PROFILE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case OwlsPackage.OWLS_PROFILE__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case OwlsPackage.OWLS_PROFILE__IS_PRESENTED_BY:
				return getIsPresentedBy() != null;
			case OwlsPackage.OWLS_PROFILE__HAS_PROCESS:
				return hasProcess != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (iD: ");
		result.append(iD);
		result.append(", serviceName: ");
		result.append(serviceName);
		result.append(')');
		return result.toString();
	}

} //OwlsProfileImpl
