/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owls.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import owls.OwlsPackage;
import owls.OwlsService;
import owls.OwlsWsdlAtomicProcessGrounding;
import owls.OwlsWsdlGrounding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wsdl Grounding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link owls.impl.OwlsWsdlGroundingImpl#getID <em>ID</em>}</li>
 *   <li>{@link owls.impl.OwlsWsdlGroundingImpl#getSupportedBy <em>Supported By</em>}</li>
 *   <li>{@link owls.impl.OwlsWsdlGroundingImpl#getHasAtomicProcessGrounding <em>Has Atomic Process Grounding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OwlsWsdlGroundingImpl extends EObjectImpl implements OwlsWsdlGrounding {
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
	 * The cached value of the '{@link #getHasAtomicProcessGrounding() <em>Has Atomic Process Grounding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAtomicProcessGrounding()
	 * @generated
	 * @ordered
	 */
	protected EList<OwlsWsdlAtomicProcessGrounding> hasAtomicProcessGrounding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OwlsWsdlGroundingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlsPackage.Literals.OWLS_WSDL_GROUNDING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_WSDL_GROUNDING__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlsService getSupportedBy() {
		if (eContainerFeatureID != OwlsPackage.OWLS_WSDL_GROUNDING__SUPPORTED_BY) return null;
		return (OwlsService)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupportedBy(OwlsService newSupportedBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSupportedBy, OwlsPackage.OWLS_WSDL_GROUNDING__SUPPORTED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportedBy(OwlsService newSupportedBy) {
		if (newSupportedBy != eInternalContainer() || (eContainerFeatureID != OwlsPackage.OWLS_WSDL_GROUNDING__SUPPORTED_BY && newSupportedBy != null)) {
			if (EcoreUtil.isAncestor(this, newSupportedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSupportedBy != null)
				msgs = ((InternalEObject)newSupportedBy).eInverseAdd(this, OwlsPackage.OWLS_SERVICE__SUPPORTS, OwlsService.class, msgs);
			msgs = basicSetSupportedBy(newSupportedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OwlsPackage.OWLS_WSDL_GROUNDING__SUPPORTED_BY, newSupportedBy, newSupportedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OwlsWsdlAtomicProcessGrounding> getHasAtomicProcessGrounding() {
		if (hasAtomicProcessGrounding == null) {
			hasAtomicProcessGrounding = new EObjectContainmentEList<OwlsWsdlAtomicProcessGrounding>(OwlsWsdlAtomicProcessGrounding.class, this, OwlsPackage.OWLS_WSDL_GROUNDING__HAS_ATOMIC_PROCESS_GROUNDING);
		}
		return hasAtomicProcessGrounding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OwlsPackage.OWLS_WSDL_GROUNDING__SUPPORTED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSupportedBy((OwlsService)otherEnd, msgs);
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
			case OwlsPackage.OWLS_WSDL_GROUNDING__SUPPORTED_BY:
				return basicSetSupportedBy(null, msgs);
			case OwlsPackage.OWLS_WSDL_GROUNDING__HAS_ATOMIC_PROCESS_GROUNDING:
				return ((InternalEList<?>)getHasAtomicProcessGrounding()).basicRemove(otherEnd, msgs);
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
			case OwlsPackage.OWLS_WSDL_GROUNDING__SUPPORTED_BY:
				return eInternalContainer().eInverseRemove(this, OwlsPackage.OWLS_SERVICE__SUPPORTS, OwlsService.class, msgs);
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
			case OwlsPackage.OWLS_WSDL_GROUNDING__ID:
				return getID();
			case OwlsPackage.OWLS_WSDL_GROUNDING__SUPPORTED_BY:
				return getSupportedBy();
			case OwlsPackage.OWLS_WSDL_GROUNDING__HAS_ATOMIC_PROCESS_GROUNDING:
				return getHasAtomicProcessGrounding();
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
			case OwlsPackage.OWLS_WSDL_GROUNDING__ID:
				setID((String)newValue);
				return;
			case OwlsPackage.OWLS_WSDL_GROUNDING__SUPPORTED_BY:
				setSupportedBy((OwlsService)newValue);
				return;
			case OwlsPackage.OWLS_WSDL_GROUNDING__HAS_ATOMIC_PROCESS_GROUNDING:
				getHasAtomicProcessGrounding().clear();
				getHasAtomicProcessGrounding().addAll((Collection<? extends OwlsWsdlAtomicProcessGrounding>)newValue);
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
			case OwlsPackage.OWLS_WSDL_GROUNDING__ID:
				setID(ID_EDEFAULT);
				return;
			case OwlsPackage.OWLS_WSDL_GROUNDING__SUPPORTED_BY:
				setSupportedBy((OwlsService)null);
				return;
			case OwlsPackage.OWLS_WSDL_GROUNDING__HAS_ATOMIC_PROCESS_GROUNDING:
				getHasAtomicProcessGrounding().clear();
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
			case OwlsPackage.OWLS_WSDL_GROUNDING__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case OwlsPackage.OWLS_WSDL_GROUNDING__SUPPORTED_BY:
				return getSupportedBy() != null;
			case OwlsPackage.OWLS_WSDL_GROUNDING__HAS_ATOMIC_PROCESS_GROUNDING:
				return hasAtomicProcessGrounding != null && !hasAtomicProcessGrounding.isEmpty();
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

} //OwlsWsdlGroundingImpl
