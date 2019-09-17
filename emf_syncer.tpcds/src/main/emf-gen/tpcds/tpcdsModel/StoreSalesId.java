/**
 */
package tpcds.tpcdsModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store Sales Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.StoreSalesId#getSsCustomerSk <em>Ss Customer Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreSalesId#getSsTicketNumber <em>Ss Ticket Number</em>}</li>
 * </ul>
 *
 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSalesId()
 * @model
 * @generated
 */
public interface StoreSalesId extends EObject {
	/**
	 * Returns the value of the '<em><b>Ss Customer Sk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ss Customer Sk</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ss Customer Sk</em>' reference.
	 * @see #setSsCustomerSk(Customer)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSalesId_SsCustomerSk()
	 * @model
	 * @generated
	 */
	Customer getSsCustomerSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreSalesId#getSsCustomerSk <em>Ss Customer Sk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ss Customer Sk</em>' reference.
	 * @see #getSsCustomerSk()
	 * @generated
	 */
	void setSsCustomerSk(Customer value);

	/**
	 * Returns the value of the '<em><b>Ss Ticket Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ss Ticket Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ss Ticket Number</em>' attribute.
	 * @see #setSsTicketNumber(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSalesId_SsTicketNumber()
	 * @model
	 * @generated
	 */
	Long getSsTicketNumber();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreSalesId#getSsTicketNumber <em>Ss Ticket Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ss Ticket Number</em>' attribute.
	 * @see #getSsTicketNumber()
	 * @generated
	 */
	void setSsTicketNumber(Long value);

} // StoreSalesId
