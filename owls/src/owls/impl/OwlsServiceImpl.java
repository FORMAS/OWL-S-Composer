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
import owls.OwlsPackage;
import owls.OwlsProcess;
import owls.OwlsProfile;
import owls.OwlsService;
import owls.OwlsWsdlGrounding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owls.impl.OwlsServiceImpl#getID <em>ID</em>}</li>
 *   <li>{@link owls.impl.OwlsServiceImpl#getPresents <em>Presents</em>}</li>
 *   <li>{@link owls.impl.OwlsServiceImpl#getDescribedBy <em>Described By</em>}</li>
 *   <li>{@link owls.impl.OwlsServiceImpl#getSupports <em>Supports</em>}</li>
 *   <li>{@link owls.impl.OwlsServiceImpl#getOwnedBy <em>Owned By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OwlsServiceImpl extends EObjectImpl implements OwlsService {
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
	 * The cached value of the '{@link #getPresents() <em>Presents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresents()
	 * @generated
	 * @ordered
	 */
	protected OwlsProfile presents;

	/**
	 * The cached value of the '{@link #getSupports() <em>Supports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupports()
	 * @generated
	 * @ordered
	 */
	protected OwlsWsdlGrounding supports;

	/**
	 * The cached value of the '{@link #getOwnedBy() <em>Owned By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBy()
	 * @generated
	 * @ordered
	 */
	protected Owls ownedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwlsServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlsPackage.Literals.OWLS_SERVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_SERVICE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsProfile getPresents() {
		return presents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresents(OwlsProfile newPresents, NotificationChain msgs) {
		OwlsProfile oldPresents = presents;
		presents = newPresents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_SERVICE__PRESENTS, oldPresents, newPresents);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresents(OwlsProfile newPresents) {
		if (newPresents != presents) {
			NotificationChain msgs = null;
			if (presents != null)
				msgs = ((InternalEObject)presents).eInverseRemove(this, OwlsPackage.OWLS_PROFILE__IS_PRESENTED_BY, OwlsProfile.class, msgs);
			if (newPresents != null)
				msgs = ((InternalEObject)newPresents).eInverseAdd(this, OwlsPackage.OWLS_PROFILE__IS_PRESENTED_BY, OwlsProfile.class, msgs);
			msgs = basicSetPresents(newPresents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_SERVICE__PRESENTS, newPresents, newPresents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsProcess getDescribedBy() {
		if (eContainerFeatureID != OwlsPackage.OWLS_SERVICE__DESCRIBED_BY) return null;
		return (OwlsProcess)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescribedBy(OwlsProcess newDescribedBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDescribedBy, OwlsPackage.OWLS_SERVICE__DESCRIBED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescribedBy(OwlsProcess newDescribedBy) {
		if (newDescribedBy != eInternalContainer() || (eContainerFeatureID != OwlsPackage.OWLS_SERVICE__DESCRIBED_BY && newDescribedBy != null)) {
			if (EcoreUtil.isAncestor(this, newDescribedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDescribedBy != null)
				msgs = ((InternalEObject)newDescribedBy).eInverseAdd(this, OwlsPackage.OWLS_PROCESS__DESCRIBES, OwlsProcess.class, msgs);
			msgs = basicSetDescribedBy(newDescribedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_SERVICE__DESCRIBED_BY, newDescribedBy, newDescribedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsWsdlGrounding getSupports() {
		return supports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupports(OwlsWsdlGrounding newSupports, NotificationChain msgs) {
		OwlsWsdlGrounding oldSupports = supports;
		supports = newSupports;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_SERVICE__SUPPORTS, oldSupports, newSupports);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupports(OwlsWsdlGrounding newSupports) {
		if (newSupports != supports) {
			NotificationChain msgs = null;
			if (supports != null)
				msgs = ((InternalEObject)supports).eInverseRemove(this, OwlsPackage.OWLS_WSDL_GROUNDING__SUPPORTED_BY, OwlsWsdlGrounding.class, msgs);
			if (newSupports != null)
				msgs = ((InternalEObject)newSupports).eInverseAdd(this, OwlsPackage.OWLS_WSDL_GROUNDING__SUPPORTED_BY, OwlsWsdlGrounding.class, msgs);
			msgs = basicSetSupports(newSupports, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_SERVICE__SUPPORTS, newSupports, newSupports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Owls getOwnedBy() {
		return ownedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedBy(Owls newOwnedBy, NotificationChain msgs) {
		Owls oldOwnedBy = ownedBy;
		ownedBy = newOwnedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_SERVICE__OWNED_BY, oldOwnedBy, newOwnedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedBy(Owls newOwnedBy) {
		if (newOwnedBy != ownedBy) {
			NotificationChain msgs = null;
			if (ownedBy != null)
				msgs = ((InternalEObject)ownedBy).eInverseRemove(this, OwlsPackage.OWLS__SERVICE, Owls.class, msgs);
			if (newOwnedBy != null)
				msgs = ((InternalEObject)newOwnedBy).eInverseAdd(this, OwlsPackage.OWLS__SERVICE, Owls.class, msgs);
			msgs = basicSetOwnedBy(newOwnedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_SERVICE__OWNED_BY, newOwnedBy, newOwnedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OwlsPackage.OWLS_SERVICE__PRESENTS:
				if (presents != null)
					msgs = ((InternalEObject)presents).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OwlsPackage.OWLS_SERVICE__PRESENTS, null, msgs);
				return basicSetPresents((OwlsProfile)otherEnd, msgs);
			case OwlsPackage.OWLS_SERVICE__DESCRIBED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDescribedBy((OwlsProcess)otherEnd, msgs);
			case OwlsPackage.OWLS_SERVICE__SUPPORTS:
				if (supports != null)
					msgs = ((InternalEObject)supports).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OwlsPackage.OWLS_SERVICE__SUPPORTS, null, msgs);
				return basicSetSupports((OwlsWsdlGrounding)otherEnd, msgs);
			case OwlsPackage.OWLS_SERVICE__OWNED_BY:
				if (ownedBy != null)
					msgs = ((InternalEObject)ownedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OwlsPackage.OWLS_SERVICE__OWNED_BY, null, msgs);
				return basicSetOwnedBy((Owls)otherEnd, msgs);
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
			case OwlsPackage.OWLS_SERVICE__PRESENTS:
				return basicSetPresents(null, msgs);
			case OwlsPackage.OWLS_SERVICE__DESCRIBED_BY:
				return basicSetDescribedBy(null, msgs);
			case OwlsPackage.OWLS_SERVICE__SUPPORTS:
				return basicSetSupports(null, msgs);
			case OwlsPackage.OWLS_SERVICE__OWNED_BY:
				return basicSetOwnedBy(null, msgs);
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
			case OwlsPackage.OWLS_SERVICE__DESCRIBED_BY:
				return eInternalContainer().eInverseRemove(this, OwlsPackage.OWLS_PROCESS__DESCRIBES, OwlsProcess.class, msgs);
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
			case OwlsPackage.OWLS_SERVICE__ID:
				return getID();
			case OwlsPackage.OWLS_SERVICE__PRESENTS:
				return getPresents();
			case OwlsPackage.OWLS_SERVICE__DESCRIBED_BY:
				return getDescribedBy();
			case OwlsPackage.OWLS_SERVICE__SUPPORTS:
				return getSupports();
			case OwlsPackage.OWLS_SERVICE__OWNED_BY:
				return getOwnedBy();
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
			case OwlsPackage.OWLS_SERVICE__ID:
				setID((String)newValue);
				return;
			case OwlsPackage.OWLS_SERVICE__PRESENTS:
				setPresents((OwlsProfile)newValue);
				return;
			case OwlsPackage.OWLS_SERVICE__DESCRIBED_BY:
				setDescribedBy((OwlsProcess)newValue);
				return;
			case OwlsPackage.OWLS_SERVICE__SUPPORTS:
				setSupports((OwlsWsdlGrounding)newValue);
				return;
			case OwlsPackage.OWLS_SERVICE__OWNED_BY:
				setOwnedBy((Owls)newValue);
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
			case OwlsPackage.OWLS_SERVICE__ID:
				setID(ID_EDEFAULT);
				return;
			case OwlsPackage.OWLS_SERVICE__PRESENTS:
				setPresents((OwlsProfile)null);
				return;
			case OwlsPackage.OWLS_SERVICE__DESCRIBED_BY:
				setDescribedBy((OwlsProcess)null);
				return;
			case OwlsPackage.OWLS_SERVICE__SUPPORTS:
				setSupports((OwlsWsdlGrounding)null);
				return;
			case OwlsPackage.OWLS_SERVICE__OWNED_BY:
				setOwnedBy((Owls)null);
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
			case OwlsPackage.OWLS_SERVICE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case OwlsPackage.OWLS_SERVICE__PRESENTS:
				return presents != null;
			case OwlsPackage.OWLS_SERVICE__DESCRIBED_BY:
				return getDescribedBy() != null;
			case OwlsPackage.OWLS_SERVICE__SUPPORTS:
				return supports != null;
			case OwlsPackage.OWLS_SERVICE__OWNED_BY:
				return ownedBy != null;
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
		result.append(')');
		return result.toString();
	}

} //OwlsServiceImpl
