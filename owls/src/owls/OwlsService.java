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
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link owls.OwlsService#getID <em>ID</em>}</li>
 *   <li>{@link owls.OwlsService#getPresents <em>Presents</em>}</li>
 *   <li>{@link owls.OwlsService#getDescribedBy <em>Described By</em>}</li>
 *   <li>{@link owls.OwlsService#getSupports <em>Supports</em>}</li>
 *   <li>{@link owls.OwlsService#getOwnedBy <em>Owned By</em>}</li>
 * </ul>
 * </p>
 *
 * @see owls.OwlsPackage#getOwlsService()
 * @model
 * @generated
 */
public interface OwlsService extends EObject {
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
	 * @see owls.OwlsPackage#getOwlsService_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link owls.OwlsService#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Presents</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link owls.OwlsProfile#getIsPresentedBy <em>Is Presented By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presents</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presents</em>' containment reference.
	 * @see #setPresents(OwlsProfile)
	 * @see owls.OwlsPackage#getOwlsService_Presents()
	 * @see owls.OwlsProfile#getIsPresentedBy
	 * @model opposite="isPresentedBy" containment="true"
	 * @generated
	 */
	OwlsProfile getPresents();

	/**
	 * Sets the value of the '{@link owls.OwlsService#getPresents <em>Presents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presents</em>' containment reference.
	 * @see #getPresents()
	 * @generated
	 */
	void setPresents(OwlsProfile value);

	/**
	 * Returns the value of the '<em><b>Described By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link owls.OwlsProcess#getDescribes <em>Describes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Described By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Described By</em>' container reference.
	 * @see #setDescribedBy(OwlsProcess)
	 * @see owls.OwlsPackage#getOwlsService_DescribedBy()
	 * @see owls.OwlsProcess#getDescribes
	 * @model opposite="describes" transient="false"
	 * @generated
	 */
	OwlsProcess getDescribedBy();

	/**
	 * Sets the value of the '{@link owls.OwlsService#getDescribedBy <em>Described By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Described By</em>' container reference.
	 * @see #getDescribedBy()
	 * @generated
	 */
	void setDescribedBy(OwlsProcess value);

	/**
	 * Returns the value of the '<em><b>Supports</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link owls.OwlsWsdlGrounding#getSupportedBy <em>Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supports</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supports</em>' containment reference.
	 * @see #setSupports(OwlsWsdlGrounding)
	 * @see owls.OwlsPackage#getOwlsService_Supports()
	 * @see owls.OwlsWsdlGrounding#getSupportedBy
	 * @model opposite="supportedBy" containment="true"
	 * @generated
	 */
	OwlsWsdlGrounding getSupports();

	/**
	 * Sets the value of the '{@link owls.OwlsService#getSupports <em>Supports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supports</em>' containment reference.
	 * @see #getSupports()
	 * @generated
	 */
	void setSupports(OwlsWsdlGrounding value);

	/**
	 * Returns the value of the '<em><b>Owned By</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link owls.Owls#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By</em>' containment reference.
	 * @see #setOwnedBy(Owls)
	 * @see owls.OwlsPackage#getOwlsService_OwnedBy()
	 * @see owls.Owls#getService
	 * @model opposite="service" containment="true"
	 * @generated
	 */
	Owls getOwnedBy();

	/**
	 * Sets the value of the '{@link owls.OwlsService#getOwnedBy <em>Owned By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By</em>' containment reference.
	 * @see #getOwnedBy()
	 * @generated
	 */
	void setOwnedBy(Owls value);

} // OwlsService
