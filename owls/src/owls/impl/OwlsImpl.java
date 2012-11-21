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

import owls.Owls;
import owls.OwlsOntology;
import owls.OwlsPackage;
import owls.OwlsProcess;
import owls.OwlsProfile;
import owls.OwlsService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Owls</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owls.impl.OwlsImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link owls.impl.OwlsImpl#getOntology <em>Ontology</em>}</li>
 *   <li>{@link owls.impl.OwlsImpl#getService <em>Service</em>}</li>
 *   <li>{@link owls.impl.OwlsImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link owls.impl.OwlsImpl#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OwlsImpl extends EObjectImpl implements Owls {
	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOntology() <em>Ontology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntology()
	 * @generated
	 * @ordered
	 */
	protected OwlsOntology ontology;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected OwlsProfile profile;

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected OwlsProcess process;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlsPackage.Literals.OWLS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsOntology getOntology() {
		return ontology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOntology(OwlsOntology newOntology, NotificationChain msgs) {
		OwlsOntology oldOntology = ontology;
		ontology = newOntology;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS__ONTOLOGY, oldOntology, newOntology);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOntology(OwlsOntology newOntology) {
		if (newOntology != ontology) {
			NotificationChain msgs = null;
			if (ontology != null)
				msgs = ((InternalEObject)ontology).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OwlsPackage.OWLS__ONTOLOGY, null, msgs);
			if (newOntology != null)
				msgs = ((InternalEObject)newOntology).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OwlsPackage.OWLS__ONTOLOGY, null, msgs);
			msgs = basicSetOntology(newOntology, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS__ONTOLOGY, newOntology, newOntology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsService getService() {
		if (eContainerFeatureID != OwlsPackage.OWLS__SERVICE) return null;
		return (OwlsService)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(OwlsService newService, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newService, OwlsPackage.OWLS__SERVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(OwlsService newService) {
		if (newService != eInternalContainer() || (eContainerFeatureID != OwlsPackage.OWLS__SERVICE && newService != null)) {
			if (EcoreUtil.isAncestor(this, newService))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newService != null)
				msgs = ((InternalEObject)newService).eInverseAdd(this, OwlsPackage.OWLS_SERVICE__OWNED_BY, OwlsService.class, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS__SERVICE, newService, newService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsProfile getProfile() {
		if (profile != null && profile.eIsProxy()) {
			InternalEObject oldProfile = (InternalEObject)profile;
			profile = (OwlsProfile)eResolveProxy(oldProfile);
			if (profile != oldProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlsPackage.OWLS__PROFILE, oldProfile, profile));
			}
		}
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsProfile basicGetProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfile(OwlsProfile newProfile) {
		OwlsProfile oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS__PROFILE, oldProfile, profile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsProcess getProcess() {
		if (process != null && process.eIsProxy()) {
			InternalEObject oldProcess = (InternalEObject)process;
			process = (OwlsProcess)eResolveProxy(oldProcess);
			if (process != oldProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OwlsPackage.OWLS__PROCESS, oldProcess, process));
			}
		}
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsProcess basicGetProcess() {
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess(OwlsProcess newProcess) {
		OwlsProcess oldProcess = process;
		process = newProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS__PROCESS, oldProcess, process));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OwlsPackage.OWLS__SERVICE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetService((OwlsService)otherEnd, msgs);
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
			case OwlsPackage.OWLS__ONTOLOGY:
				return basicSetOntology(null, msgs);
			case OwlsPackage.OWLS__SERVICE:
				return basicSetService(null, msgs);
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
			case OwlsPackage.OWLS__SERVICE:
				return eInternalContainer().eInverseRemove(this, OwlsPackage.OWLS_SERVICE__OWNED_BY, OwlsService.class, msgs);
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
			case OwlsPackage.OWLS__NAMESPACE:
				return getNamespace();
			case OwlsPackage.OWLS__ONTOLOGY:
				return getOntology();
			case OwlsPackage.OWLS__SERVICE:
				return getService();
			case OwlsPackage.OWLS__PROFILE:
				if (resolve) return getProfile();
				return basicGetProfile();
			case OwlsPackage.OWLS__PROCESS:
				if (resolve) return getProcess();
				return basicGetProcess();
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
			case OwlsPackage.OWLS__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case OwlsPackage.OWLS__ONTOLOGY:
				setOntology((OwlsOntology)newValue);
				return;
			case OwlsPackage.OWLS__SERVICE:
				setService((OwlsService)newValue);
				return;
			case OwlsPackage.OWLS__PROFILE:
				setProfile((OwlsProfile)newValue);
				return;
			case OwlsPackage.OWLS__PROCESS:
				setProcess((OwlsProcess)newValue);
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
			case OwlsPackage.OWLS__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case OwlsPackage.OWLS__ONTOLOGY:
				setOntology((OwlsOntology)null);
				return;
			case OwlsPackage.OWLS__SERVICE:
				setService((OwlsService)null);
				return;
			case OwlsPackage.OWLS__PROFILE:
				setProfile((OwlsProfile)null);
				return;
			case OwlsPackage.OWLS__PROCESS:
				setProcess((OwlsProcess)null);
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
			case OwlsPackage.OWLS__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case OwlsPackage.OWLS__ONTOLOGY:
				return ontology != null;
			case OwlsPackage.OWLS__SERVICE:
				return getService() != null;
			case OwlsPackage.OWLS__PROFILE:
				return profile != null;
			case OwlsPackage.OWLS__PROCESS:
				return process != null;
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
		result.append(" (namespace: ");
		result.append(namespace);
		result.append(')');
		return result.toString();
	}

} //OwlsImpl
