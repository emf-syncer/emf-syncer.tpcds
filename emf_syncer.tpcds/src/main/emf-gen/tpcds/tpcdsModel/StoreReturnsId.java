/**
 */
package tpcds.tpcdsModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store Returns Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.StoreReturnsId#getSrItemSk <em>Sr Item Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreReturnsId#getSrTicketNumber <em>Sr Ticket Number</em>}</li>
 * </ul>
 *
 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreReturnsId()
 * @model
 * @generated
 */
public interface StoreReturnsId extends EObject {
	/**
	 * Returns the value of the '<em><b>Sr Item Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Item Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Item Sk</em>' attribute.
	 * @see #setSrItemSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreReturnsId_SrItemSk()
	 * @model
	 * @generated
	 */
	Long getSrItemSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreReturnsId#getSrItemSk <em>Sr Item Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Item Sk</em>' attribute.
	 * @see #getSrItemSk()
	 * @generated
	 */
	void setSrItemSk(Long value);

	/**
	 * Returns the value of the '<em><b>Sr Ticket Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Ticket Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Ticket Number</em>' attribute.
	 * @see #setSrTicketNumber(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreReturnsId_SrTicketNumber()
	 * @model
	 * @generated
	 */
	Long getSrTicketNumber();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreReturnsId#getSrTicketNumber <em>Sr Ticket Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Ticket Number</em>' attribute.
	 * @see #getSrTicketNumber()
	 * @generated
	 */
	void setSrTicketNumber(Long value);

} // StoreReturnsId
