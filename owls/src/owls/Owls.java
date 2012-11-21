/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package owls;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Owls</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owls.Owls#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link owls.Owls#getOntology <em>Ontology</em>}</li>
 *   <li>{@link owls.Owls#getService <em>Service</em>}</li>
 *   <li>{@link owls.Owls#getProfile <em>Profile</em>}</li>
 *   <li>{@link owls.Owls#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see owls.OwlsPackage#getOwls()
 * @model
 * @generated
 */
public interface Owls extends EObject {
	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see owls.OwlsPackage#getOwls_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link owls.Owls#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Ontology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontology</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontology</em>' containment reference.
	 * @see #setOntology(OwlsOntology)
	 * @see owls.OwlsPackage#getOwls_Ontology()
	 * @model containment="true"
	 * @generated
	 */
	OwlsOntology getOntology();

	/**
	 * Sets the value of the '{@link owls.Owls#getOntology <em>Ontology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ontology</em>' containment reference.
	 * @see #getOntology()
	 * @generated
	 */
	void setOntology(OwlsOntology value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link owls.OwlsService#getOwnedBy <em>Owned By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' container reference.
	 * @see #setService(OwlsService)
	 * @see owls.OwlsPackage#getOwls_Service()
	 * @see owls.OwlsService#getOwnedBy
	 * @model opposite="ownedBy" transient="false"
	 * @generated
	 */
	OwlsService getService();

	/**
	 * Sets the value of the '{@link owls.Owls#getService <em>Service</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' container reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(OwlsService value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' reference.
	 * @see #setProfile(OwlsProfile)
	 * @see owls.OwlsPackage#getOwls_Profile()
	 * @model
	 * @generated
	 */
	OwlsProfile getProfile();

	/**
	 * Sets the value of the '{@link owls.Owls#getProfile <em>Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(OwlsProfile value);

	/**
	 * Returns the value of the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' reference.
	 * @see #setProcess(OwlsProcess)
	 * @see owls.OwlsPackage#getOwls_Process()
	 * @model
	 * @generated
	 */
	OwlsProcess getProcess();

	/**
	 * Sets the value of the '{@link owls.Owls#getProcess <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(OwlsProcess value);

} // Owls
