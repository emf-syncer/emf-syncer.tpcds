/**
 */
package tpcds.tpcdsModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store Returns</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.StoreReturns#getSrReturnedDateSk <em>Sr Returned Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreReturns#getSrReturnTimeSk <em>Sr Return Time Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreReturns#getSrId <em>Sr Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreReturns#getSrItemSk <em>Sr Item Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreReturns#getSrTicketNumber <em>Sr Ticket Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreReturns#getSrCustomerSk <em>Sr Customer Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreReturns#getSrCdemoSk <em>Sr Cdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreReturns#getSrHdemoSk <em>Sr Hdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreReturns#getSrAddrSk <em>Sr Addr Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreReturns#getSrStoreSk <em>Sr Store Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreReturns#getSrReasonSk <em>Sr Reason Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreReturns#getSrReturnQuantity <em>Sr Return Quantity</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreReturns#getSrReturnAmt <em>Sr Return Amt</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreReturns#getSrReturnTax <em>Sr Return Tax</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreReturns#getSrReturnAmtIncTax <em>Sr Return Amt Inc Tax</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreReturns#getSrFee <em>Sr Fee</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreReturns#getSrReturnShipCost <em>Sr Return Ship Cost</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreReturns#getSrRefundedCash <em>Sr Refunded Cash</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreReturns#getSrReversedCharge <em>Sr Reversed Charge</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreReturns#getSrStoreCredit <em>Sr Store Credit</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreReturns#getSrNetLoss <em>Sr Net Loss</em>}</li>
 * </ul>
 *
 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreReturns()
 * @model
 * @generated
 */
public interface StoreReturns extends EObject {
	/**
	 * Returns the value of the '<em><b>Sr Returned Date Sk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Returned Date Sk</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Returned Date Sk</em>' reference.
	 * @see #setSrReturnedDateSk(DateDim)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreReturns_SrReturnedDateSk()
	 * @model
	 * @generated
	 */
	DateDim getSrReturnedDateSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreReturns#getSrReturnedDateSk <em>Sr Returned Date Sk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Returned Date Sk</em>' reference.
	 * @see #getSrReturnedDateSk()
	 * @generated
	 */
	void setSrReturnedDateSk(DateDim value);

	/**
	 * Returns the value of the '<em><b>Sr Return Time Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Return Time Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Return Time Sk</em>' attribute.
	 * @see #setSrReturnTimeSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreReturns_SrReturnTimeSk()
	 * @model
	 * @generated
	 */
	Long getSrReturnTimeSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreReturns#getSrReturnTimeSk <em>Sr Return Time Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Return Time Sk</em>' attribute.
	 * @see #getSrReturnTimeSk()
	 * @generated
	 */
	void setSrReturnTimeSk(Long value);

	/**
	 * Returns the value of the '<em><b>Sr Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Id</em>' reference.
	 * @see #setSrId(StoreReturnsId)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreReturns_SrId()
	 * @model
	 * @generated
	 */
	StoreReturnsId getSrId();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreReturns#getSrId <em>Sr Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Id</em>' reference.
	 * @see #getSrId()
	 * @generated
	 */
	void setSrId(StoreReturnsId value);

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
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreReturns_SrItemSk()
	 * @model
	 * @generated
	 */
	Long getSrItemSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreReturns#getSrItemSk <em>Sr Item Sk</em>}' attribute.
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
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreReturns_SrTicketNumber()
	 * @model
	 * @generated
	 */
	Long getSrTicketNumber();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreReturns#getSrTicketNumber <em>Sr Ticket Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Ticket Number</em>' attribute.
	 * @see #getSrTicketNumber()
	 * @generated
	 */
	void setSrTicketNumber(Long value);

	/**
	 * Returns the value of the '<em><b>Sr Customer Sk</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tpcds.tpcdsModel.Customer#getStoreReturns <em>Store Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Customer Sk</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Customer Sk</em>' reference.
	 * @see #setSrCustomerSk(Customer)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreReturns_SrCustomerSk()
	 * @see tpcds.tpcdsModel.Customer#getStoreReturns
	 * @model opposite="storeReturns"
	 * @generated
	 */
	Customer getSrCustomerSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreReturns#getSrCustomerSk <em>Sr Customer Sk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Customer Sk</em>' reference.
	 * @see #getSrCustomerSk()
	 * @generated
	 */
	void setSrCustomerSk(Customer value);

	/**
	 * Returns the value of the '<em><b>Sr Cdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Cdemo Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Cdemo Sk</em>' attribute.
	 * @see #setSrCdemoSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreReturns_SrCdemoSk()
	 * @model
	 * @generated
	 */
	Long getSrCdemoSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreReturns#getSrCdemoSk <em>Sr Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Cdemo Sk</em>' attribute.
	 * @see #getSrCdemoSk()
	 * @generated
	 */
	void setSrCdemoSk(Long value);

	/**
	 * Returns the value of the '<em><b>Sr Hdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Hdemo Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Hdemo Sk</em>' attribute.
	 * @see #setSrHdemoSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreReturns_SrHdemoSk()
	 * @model
	 * @generated
	 */
	Long getSrHdemoSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreReturns#getSrHdemoSk <em>Sr Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Hdemo Sk</em>' attribute.
	 * @see #getSrHdemoSk()
	 * @generated
	 */
	void setSrHdemoSk(Long value);

	/**
	 * Returns the value of the '<em><b>Sr Addr Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Addr Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Addr Sk</em>' attribute.
	 * @see #setSrAddrSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreReturns_SrAddrSk()
	 * @model
	 * @generated
	 */
	Long getSrAddrSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreReturns#getSrAddrSk <em>Sr Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Addr Sk</em>' attribute.
	 * @see #getSrAddrSk()
	 * @generated
	 */
	void setSrAddrSk(Long value);

	/**
	 * Returns the value of the '<em><b>Sr Store Sk</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tpcds.tpcdsModel.Store#getStoreReturns <em>Store Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Store Sk</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Store Sk</em>' reference.
	 * @see #setSrStoreSk(Store)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreReturns_SrStoreSk()
	 * @see tpcds.tpcdsModel.Store#getStoreReturns
	 * @model opposite="storeReturns"
	 * @generated
	 */
	Store getSrStoreSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreReturns#getSrStoreSk <em>Sr Store Sk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Store Sk</em>' reference.
	 * @see #getSrStoreSk()
	 * @generated
	 */
	void setSrStoreSk(Store value);

	/**
	 * Returns the value of the '<em><b>Sr Reason Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Reason Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Reason Sk</em>' attribute.
	 * @see #setSrReasonSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreReturns_SrReasonSk()
	 * @model
	 * @generated
	 */
	Long getSrReasonSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreReturns#getSrReasonSk <em>Sr Reason Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Reason Sk</em>' attribute.
	 * @see #getSrReasonSk()
	 * @generated
	 */
	void setSrReasonSk(Long value);

	/**
	 * Returns the value of the '<em><b>Sr Return Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Return Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Return Quantity</em>' attribute.
	 * @see #setSrReturnQuantity(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreReturns_SrReturnQuantity()
	 * @model
	 * @generated
	 */
	Long getSrReturnQuantity();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreReturns#getSrReturnQuantity <em>Sr Return Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Return Quantity</em>' attribute.
	 * @see #getSrReturnQuantity()
	 * @generated
	 */
	void setSrReturnQuantity(Long value);

	/**
	 * Returns the value of the '<em><b>Sr Return Amt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Return Amt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Return Amt</em>' attribute.
	 * @see #isSetSrReturnAmt()
	 * @see #unsetSrReturnAmt()
	 * @see #setSrReturnAmt(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreReturns_SrReturnAmt()
	 * @model unsettable="true"
	 * @generated
	 */
	double getSrReturnAmt();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreReturns#getSrReturnAmt <em>Sr Return Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Return Amt</em>' attribute.
	 * @see #isSetSrReturnAmt()
	 * @see #unsetSrReturnAmt()
	 * @see #getSrReturnAmt()
	 * @generated
	 */
	void setSrReturnAmt(double value);

	/**
	 * Unsets the value of the '{@link tpcds.tpcdsModel.StoreReturns#getSrReturnAmt <em>Sr Return Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSrReturnAmt()
	 * @see #getSrReturnAmt()
	 * @see #setSrReturnAmt(double)
	 * @generated
	 */
	void unsetSrReturnAmt();

	/**
	 * Returns whether the value of the '{@link tpcds.tpcdsModel.StoreReturns#getSrReturnAmt <em>Sr Return Amt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sr Return Amt</em>' attribute is set.
	 * @see #unsetSrReturnAmt()
	 * @see #getSrReturnAmt()
	 * @see #setSrReturnAmt(double)
	 * @generated
	 */
	boolean isSetSrReturnAmt();

	/**
	 * Returns the value of the '<em><b>Sr Return Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Return Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Return Tax</em>' attribute.
	 * @see #setSrReturnTax(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreReturns_SrReturnTax()
	 * @model
	 * @generated
	 */
	double getSrReturnTax();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreReturns#getSrReturnTax <em>Sr Return Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Return Tax</em>' attribute.
	 * @see #getSrReturnTax()
	 * @generated
	 */
	void setSrReturnTax(double value);

	/**
	 * Returns the value of the '<em><b>Sr Return Amt Inc Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Return Amt Inc Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Return Amt Inc Tax</em>' attribute.
	 * @see #setSrReturnAmtIncTax(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreReturns_SrReturnAmtIncTax()
	 * @model
	 * @generated
	 */
	double getSrReturnAmtIncTax();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreReturns#getSrReturnAmtIncTax <em>Sr Return Amt Inc Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Return Amt Inc Tax</em>' attribute.
	 * @see #getSrReturnAmtIncTax()
	 * @generated
	 */
	void setSrReturnAmtIncTax(double value);

	/**
	 * Returns the value of the '<em><b>Sr Fee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Fee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Fee</em>' attribute.
	 * @see #setSrFee(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreReturns_SrFee()
	 * @model
	 * @generated
	 */
	double getSrFee();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreReturns#getSrFee <em>Sr Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Fee</em>' attribute.
	 * @see #getSrFee()
	 * @generated
	 */
	void setSrFee(double value);

	/**
	 * Returns the value of the '<em><b>Sr Return Ship Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Return Ship Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Return Ship Cost</em>' attribute.
	 * @see #setSrReturnShipCost(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreReturns_SrReturnShipCost()
	 * @model
	 * @generated
	 */
	double getSrReturnShipCost();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreReturns#getSrReturnShipCost <em>Sr Return Ship Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Return Ship Cost</em>' attribute.
	 * @see #getSrReturnShipCost()
	 * @generated
	 */
	void setSrReturnShipCost(double value);

	/**
	 * Returns the value of the '<em><b>Sr Refunded Cash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Refunded Cash</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Refunded Cash</em>' attribute.
	 * @see #setSrRefundedCash(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreReturns_SrRefundedCash()
	 * @model
	 * @generated
	 */
	double getSrRefundedCash();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreReturns#getSrRefundedCash <em>Sr Refunded Cash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Refunded Cash</em>' attribute.
	 * @see #getSrRefundedCash()
	 * @generated
	 */
	void setSrRefundedCash(double value);

	/**
	 * Returns the value of the '<em><b>Sr Reversed Charge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Reversed Charge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Reversed Charge</em>' attribute.
	 * @see #setSrReversedCharge(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreReturns_SrReversedCharge()
	 * @model
	 * @generated
	 */
	double getSrReversedCharge();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreReturns#getSrReversedCharge <em>Sr Reversed Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Reversed Charge</em>' attribute.
	 * @see #getSrReversedCharge()
	 * @generated
	 */
	void setSrReversedCharge(double value);

	/**
	 * Returns the value of the '<em><b>Sr Store Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Store Credit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Store Credit</em>' attribute.
	 * @see #setSrStoreCredit(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreReturns_SrStoreCredit()
	 * @model
	 * @generated
	 */
	double getSrStoreCredit();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreReturns#getSrStoreCredit <em>Sr Store Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Store Credit</em>' attribute.
	 * @see #getSrStoreCredit()
	 * @generated
	 */
	void setSrStoreCredit(double value);

	/**
	 * Returns the value of the '<em><b>Sr Net Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Net Loss</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Net Loss</em>' attribute.
	 * @see #setSrNetLoss(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreReturns_SrNetLoss()
	 * @model
	 * @generated
	 */
	double getSrNetLoss();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreReturns#getSrNetLoss <em>Sr Net Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr Net Loss</em>' attribute.
	 * @see #getSrNetLoss()
	 * @generated
	 */
	void setSrNetLoss(double value);

} // StoreReturns
