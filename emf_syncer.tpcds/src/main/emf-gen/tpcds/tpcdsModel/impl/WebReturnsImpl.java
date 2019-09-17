/**
 */
package tpcds.tpcdsModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpcds.tpcdsModel.TpcdsModelPackage;
import tpcds.tpcdsModel.WebReturns;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Returns</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.impl.WebReturnsImpl#getWrReturnedDateSk <em>Wr Returned Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebReturnsImpl#getWrReturnedTimeSk <em>Wr Returned Time Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebReturnsImpl#getWrItemSk <em>Wr Item Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebReturnsImpl#getWrRefundedCustomerSk <em>Wr Refunded Customer Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebReturnsImpl#getWrRefundedCdemoSk <em>Wr Refunded Cdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebReturnsImpl#getWrRefundedHdemoSk <em>Wr Refunded Hdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebReturnsImpl#getWrRefundedAddrSk <em>Wr Refunded Addr Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebReturnsImpl#getWrReturningCustomerSk <em>Wr Returning Customer Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebReturnsImpl#getWrReturningCdemoSk <em>Wr Returning Cdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebReturnsImpl#getWrReturningHdemoSk <em>Wr Returning Hdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebReturnsImpl#getWrReturningAddrSk <em>Wr Returning Addr Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebReturnsImpl#getWrWebPageSk <em>Wr Web Page Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebReturnsImpl#getWrReasonSk <em>Wr Reason Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebReturnsImpl#getWrOrderNumber <em>Wr Order Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebReturnsImpl#getWrReturnQuantity <em>Wr Return Quantity</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebReturnsImpl#getWrReturnAmt <em>Wr Return Amt</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebReturnsImpl#getWrReturnTax <em>Wr Return Tax</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebReturnsImpl#getWrReturnAmtIncTax <em>Wr Return Amt Inc Tax</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebReturnsImpl#getWrFee <em>Wr Fee</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebReturnsImpl#getWrReturnShipCost <em>Wr Return Ship Cost</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebReturnsImpl#getWrRefundedCash <em>Wr Refunded Cash</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebReturnsImpl#getWrReversedCharge <em>Wr Reversed Charge</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebReturnsImpl#getWrAccountCredit <em>Wr Account Credit</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebReturnsImpl#getWrNetLoss <em>Wr Net Loss</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebReturnsImpl extends MinimalEObjectImpl.Container implements WebReturns {
	/**
	 * The default value of the '{@link #getWrReturnedDateSk() <em>Wr Returned Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrReturnedDateSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WR_RETURNED_DATE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWrReturnedDateSk() <em>Wr Returned Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrReturnedDateSk()
	 * @generated
	 * @ordered
	 */
	protected Long wrReturnedDateSk = WR_RETURNED_DATE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrReturnedTimeSk() <em>Wr Returned Time Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrReturnedTimeSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WR_RETURNED_TIME_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWrReturnedTimeSk() <em>Wr Returned Time Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrReturnedTimeSk()
	 * @generated
	 * @ordered
	 */
	protected Long wrReturnedTimeSk = WR_RETURNED_TIME_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrItemSk() <em>Wr Item Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrItemSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WR_ITEM_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWrItemSk() <em>Wr Item Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrItemSk()
	 * @generated
	 * @ordered
	 */
	protected Long wrItemSk = WR_ITEM_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrRefundedCustomerSk() <em>Wr Refunded Customer Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrRefundedCustomerSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WR_REFUNDED_CUSTOMER_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWrRefundedCustomerSk() <em>Wr Refunded Customer Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrRefundedCustomerSk()
	 * @generated
	 * @ordered
	 */
	protected Long wrRefundedCustomerSk = WR_REFUNDED_CUSTOMER_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrRefundedCdemoSk() <em>Wr Refunded Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrRefundedCdemoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WR_REFUNDED_CDEMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWrRefundedCdemoSk() <em>Wr Refunded Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrRefundedCdemoSk()
	 * @generated
	 * @ordered
	 */
	protected Long wrRefundedCdemoSk = WR_REFUNDED_CDEMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrRefundedHdemoSk() <em>Wr Refunded Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrRefundedHdemoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WR_REFUNDED_HDEMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWrRefundedHdemoSk() <em>Wr Refunded Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrRefundedHdemoSk()
	 * @generated
	 * @ordered
	 */
	protected Long wrRefundedHdemoSk = WR_REFUNDED_HDEMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrRefundedAddrSk() <em>Wr Refunded Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrRefundedAddrSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WR_REFUNDED_ADDR_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWrRefundedAddrSk() <em>Wr Refunded Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrRefundedAddrSk()
	 * @generated
	 * @ordered
	 */
	protected Long wrRefundedAddrSk = WR_REFUNDED_ADDR_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrReturningCustomerSk() <em>Wr Returning Customer Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrReturningCustomerSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WR_RETURNING_CUSTOMER_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWrReturningCustomerSk() <em>Wr Returning Customer Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrReturningCustomerSk()
	 * @generated
	 * @ordered
	 */
	protected Long wrReturningCustomerSk = WR_RETURNING_CUSTOMER_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrReturningCdemoSk() <em>Wr Returning Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrReturningCdemoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WR_RETURNING_CDEMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWrReturningCdemoSk() <em>Wr Returning Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrReturningCdemoSk()
	 * @generated
	 * @ordered
	 */
	protected Long wrReturningCdemoSk = WR_RETURNING_CDEMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrReturningHdemoSk() <em>Wr Returning Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrReturningHdemoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WR_RETURNING_HDEMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWrReturningHdemoSk() <em>Wr Returning Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrReturningHdemoSk()
	 * @generated
	 * @ordered
	 */
	protected Long wrReturningHdemoSk = WR_RETURNING_HDEMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrReturningAddrSk() <em>Wr Returning Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrReturningAddrSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WR_RETURNING_ADDR_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWrReturningAddrSk() <em>Wr Returning Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrReturningAddrSk()
	 * @generated
	 * @ordered
	 */
	protected Long wrReturningAddrSk = WR_RETURNING_ADDR_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrWebPageSk() <em>Wr Web Page Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrWebPageSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WR_WEB_PAGE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWrWebPageSk() <em>Wr Web Page Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrWebPageSk()
	 * @generated
	 * @ordered
	 */
	protected Long wrWebPageSk = WR_WEB_PAGE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrReasonSk() <em>Wr Reason Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrReasonSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WR_REASON_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWrReasonSk() <em>Wr Reason Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrReasonSk()
	 * @generated
	 * @ordered
	 */
	protected Long wrReasonSk = WR_REASON_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrOrderNumber() <em>Wr Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrOrderNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Long WR_ORDER_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWrOrderNumber() <em>Wr Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrOrderNumber()
	 * @generated
	 * @ordered
	 */
	protected Long wrOrderNumber = WR_ORDER_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrReturnQuantity() <em>Wr Return Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrReturnQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final Long WR_RETURN_QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWrReturnQuantity() <em>Wr Return Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrReturnQuantity()
	 * @generated
	 * @ordered
	 */
	protected Long wrReturnQuantity = WR_RETURN_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrReturnAmt() <em>Wr Return Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrReturnAmt()
	 * @generated
	 * @ordered
	 */
	protected static final double WR_RETURN_AMT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWrReturnAmt() <em>Wr Return Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrReturnAmt()
	 * @generated
	 * @ordered
	 */
	protected double wrReturnAmt = WR_RETURN_AMT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrReturnTax() <em>Wr Return Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrReturnTax()
	 * @generated
	 * @ordered
	 */
	protected static final double WR_RETURN_TAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWrReturnTax() <em>Wr Return Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrReturnTax()
	 * @generated
	 * @ordered
	 */
	protected double wrReturnTax = WR_RETURN_TAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrReturnAmtIncTax() <em>Wr Return Amt Inc Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrReturnAmtIncTax()
	 * @generated
	 * @ordered
	 */
	protected static final double WR_RETURN_AMT_INC_TAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWrReturnAmtIncTax() <em>Wr Return Amt Inc Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrReturnAmtIncTax()
	 * @generated
	 * @ordered
	 */
	protected double wrReturnAmtIncTax = WR_RETURN_AMT_INC_TAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrFee() <em>Wr Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrFee()
	 * @generated
	 * @ordered
	 */
	protected static final double WR_FEE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWrFee() <em>Wr Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrFee()
	 * @generated
	 * @ordered
	 */
	protected double wrFee = WR_FEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrReturnShipCost() <em>Wr Return Ship Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrReturnShipCost()
	 * @generated
	 * @ordered
	 */
	protected static final double WR_RETURN_SHIP_COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWrReturnShipCost() <em>Wr Return Ship Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrReturnShipCost()
	 * @generated
	 * @ordered
	 */
	protected double wrReturnShipCost = WR_RETURN_SHIP_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrRefundedCash() <em>Wr Refunded Cash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrRefundedCash()
	 * @generated
	 * @ordered
	 */
	protected static final double WR_REFUNDED_CASH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWrRefundedCash() <em>Wr Refunded Cash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrRefundedCash()
	 * @generated
	 * @ordered
	 */
	protected double wrRefundedCash = WR_REFUNDED_CASH_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrReversedCharge() <em>Wr Reversed Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrReversedCharge()
	 * @generated
	 * @ordered
	 */
	protected static final double WR_REVERSED_CHARGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWrReversedCharge() <em>Wr Reversed Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrReversedCharge()
	 * @generated
	 * @ordered
	 */
	protected double wrReversedCharge = WR_REVERSED_CHARGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrAccountCredit() <em>Wr Account Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrAccountCredit()
	 * @generated
	 * @ordered
	 */
	protected static final double WR_ACCOUNT_CREDIT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWrAccountCredit() <em>Wr Account Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrAccountCredit()
	 * @generated
	 * @ordered
	 */
	protected double wrAccountCredit = WR_ACCOUNT_CREDIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrNetLoss() <em>Wr Net Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrNetLoss()
	 * @generated
	 * @ordered
	 */
	protected static final double WR_NET_LOSS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWrNetLoss() <em>Wr Net Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrNetLoss()
	 * @generated
	 * @ordered
	 */
	protected double wrNetLoss = WR_NET_LOSS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebReturnsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpcdsModelPackage.Literals.WEB_RETURNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWrReturnedDateSk() {
		return wrReturnedDateSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrReturnedDateSk(Long newWrReturnedDateSk) {
		Long oldWrReturnedDateSk = wrReturnedDateSk;
		wrReturnedDateSk = newWrReturnedDateSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_RETURNS__WR_RETURNED_DATE_SK, oldWrReturnedDateSk, wrReturnedDateSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWrReturnedTimeSk() {
		return wrReturnedTimeSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrReturnedTimeSk(Long newWrReturnedTimeSk) {
		Long oldWrReturnedTimeSk = wrReturnedTimeSk;
		wrReturnedTimeSk = newWrReturnedTimeSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_RETURNS__WR_RETURNED_TIME_SK, oldWrReturnedTimeSk, wrReturnedTimeSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWrItemSk() {
		return wrItemSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrItemSk(Long newWrItemSk) {
		Long oldWrItemSk = wrItemSk;
		wrItemSk = newWrItemSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_RETURNS__WR_ITEM_SK, oldWrItemSk, wrItemSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWrRefundedCustomerSk() {
		return wrRefundedCustomerSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrRefundedCustomerSk(Long newWrRefundedCustomerSk) {
		Long oldWrRefundedCustomerSk = wrRefundedCustomerSk;
		wrRefundedCustomerSk = newWrRefundedCustomerSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_RETURNS__WR_REFUNDED_CUSTOMER_SK, oldWrRefundedCustomerSk, wrRefundedCustomerSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWrRefundedCdemoSk() {
		return wrRefundedCdemoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrRefundedCdemoSk(Long newWrRefundedCdemoSk) {
		Long oldWrRefundedCdemoSk = wrRefundedCdemoSk;
		wrRefundedCdemoSk = newWrRefundedCdemoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_RETURNS__WR_REFUNDED_CDEMO_SK, oldWrRefundedCdemoSk, wrRefundedCdemoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWrRefundedHdemoSk() {
		return wrRefundedHdemoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrRefundedHdemoSk(Long newWrRefundedHdemoSk) {
		Long oldWrRefundedHdemoSk = wrRefundedHdemoSk;
		wrRefundedHdemoSk = newWrRefundedHdemoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_RETURNS__WR_REFUNDED_HDEMO_SK, oldWrRefundedHdemoSk, wrRefundedHdemoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWrRefundedAddrSk() {
		return wrRefundedAddrSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrRefundedAddrSk(Long newWrRefundedAddrSk) {
		Long oldWrRefundedAddrSk = wrRefundedAddrSk;
		wrRefundedAddrSk = newWrRefundedAddrSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_RETURNS__WR_REFUNDED_ADDR_SK, oldWrRefundedAddrSk, wrRefundedAddrSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWrReturningCustomerSk() {
		return wrReturningCustomerSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrReturningCustomerSk(Long newWrReturningCustomerSk) {
		Long oldWrReturningCustomerSk = wrReturningCustomerSk;
		wrReturningCustomerSk = newWrReturningCustomerSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_RETURNS__WR_RETURNING_CUSTOMER_SK, oldWrReturningCustomerSk, wrReturningCustomerSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWrReturningCdemoSk() {
		return wrReturningCdemoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrReturningCdemoSk(Long newWrReturningCdemoSk) {
		Long oldWrReturningCdemoSk = wrReturningCdemoSk;
		wrReturningCdemoSk = newWrReturningCdemoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_RETURNS__WR_RETURNING_CDEMO_SK, oldWrReturningCdemoSk, wrReturningCdemoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWrReturningHdemoSk() {
		return wrReturningHdemoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrReturningHdemoSk(Long newWrReturningHdemoSk) {
		Long oldWrReturningHdemoSk = wrReturningHdemoSk;
		wrReturningHdemoSk = newWrReturningHdemoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_RETURNS__WR_RETURNING_HDEMO_SK, oldWrReturningHdemoSk, wrReturningHdemoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWrReturningAddrSk() {
		return wrReturningAddrSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrReturningAddrSk(Long newWrReturningAddrSk) {
		Long oldWrReturningAddrSk = wrReturningAddrSk;
		wrReturningAddrSk = newWrReturningAddrSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_RETURNS__WR_RETURNING_ADDR_SK, oldWrReturningAddrSk, wrReturningAddrSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWrWebPageSk() {
		return wrWebPageSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrWebPageSk(Long newWrWebPageSk) {
		Long oldWrWebPageSk = wrWebPageSk;
		wrWebPageSk = newWrWebPageSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_RETURNS__WR_WEB_PAGE_SK, oldWrWebPageSk, wrWebPageSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWrReasonSk() {
		return wrReasonSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrReasonSk(Long newWrReasonSk) {
		Long oldWrReasonSk = wrReasonSk;
		wrReasonSk = newWrReasonSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_RETURNS__WR_REASON_SK, oldWrReasonSk, wrReasonSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWrOrderNumber() {
		return wrOrderNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrOrderNumber(Long newWrOrderNumber) {
		Long oldWrOrderNumber = wrOrderNumber;
		wrOrderNumber = newWrOrderNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_RETURNS__WR_ORDER_NUMBER, oldWrOrderNumber, wrOrderNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWrReturnQuantity() {
		return wrReturnQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrReturnQuantity(Long newWrReturnQuantity) {
		Long oldWrReturnQuantity = wrReturnQuantity;
		wrReturnQuantity = newWrReturnQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_RETURNS__WR_RETURN_QUANTITY, oldWrReturnQuantity, wrReturnQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWrReturnAmt() {
		return wrReturnAmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrReturnAmt(double newWrReturnAmt) {
		double oldWrReturnAmt = wrReturnAmt;
		wrReturnAmt = newWrReturnAmt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_RETURNS__WR_RETURN_AMT, oldWrReturnAmt, wrReturnAmt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWrReturnTax() {
		return wrReturnTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrReturnTax(double newWrReturnTax) {
		double oldWrReturnTax = wrReturnTax;
		wrReturnTax = newWrReturnTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_RETURNS__WR_RETURN_TAX, oldWrReturnTax, wrReturnTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWrReturnAmtIncTax() {
		return wrReturnAmtIncTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrReturnAmtIncTax(double newWrReturnAmtIncTax) {
		double oldWrReturnAmtIncTax = wrReturnAmtIncTax;
		wrReturnAmtIncTax = newWrReturnAmtIncTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_RETURNS__WR_RETURN_AMT_INC_TAX, oldWrReturnAmtIncTax, wrReturnAmtIncTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWrFee() {
		return wrFee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrFee(double newWrFee) {
		double oldWrFee = wrFee;
		wrFee = newWrFee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_RETURNS__WR_FEE, oldWrFee, wrFee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWrReturnShipCost() {
		return wrReturnShipCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrReturnShipCost(double newWrReturnShipCost) {
		double oldWrReturnShipCost = wrReturnShipCost;
		wrReturnShipCost = newWrReturnShipCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_RETURNS__WR_RETURN_SHIP_COST, oldWrReturnShipCost, wrReturnShipCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWrRefundedCash() {
		return wrRefundedCash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrRefundedCash(double newWrRefundedCash) {
		double oldWrRefundedCash = wrRefundedCash;
		wrRefundedCash = newWrRefundedCash;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_RETURNS__WR_REFUNDED_CASH, oldWrRefundedCash, wrRefundedCash));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWrReversedCharge() {
		return wrReversedCharge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrReversedCharge(double newWrReversedCharge) {
		double oldWrReversedCharge = wrReversedCharge;
		wrReversedCharge = newWrReversedCharge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_RETURNS__WR_REVERSED_CHARGE, oldWrReversedCharge, wrReversedCharge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWrAccountCredit() {
		return wrAccountCredit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrAccountCredit(double newWrAccountCredit) {
		double oldWrAccountCredit = wrAccountCredit;
		wrAccountCredit = newWrAccountCredit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_RETURNS__WR_ACCOUNT_CREDIT, oldWrAccountCredit, wrAccountCredit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWrNetLoss() {
		return wrNetLoss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrNetLoss(double newWrNetLoss) {
		double oldWrNetLoss = wrNetLoss;
		wrNetLoss = newWrNetLoss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_RETURNS__WR_NET_LOSS, oldWrNetLoss, wrNetLoss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURNED_DATE_SK:
				return getWrReturnedDateSk();
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURNED_TIME_SK:
				return getWrReturnedTimeSk();
			case TpcdsModelPackage.WEB_RETURNS__WR_ITEM_SK:
				return getWrItemSk();
			case TpcdsModelPackage.WEB_RETURNS__WR_REFUNDED_CUSTOMER_SK:
				return getWrRefundedCustomerSk();
			case TpcdsModelPackage.WEB_RETURNS__WR_REFUNDED_CDEMO_SK:
				return getWrRefundedCdemoSk();
			case TpcdsModelPackage.WEB_RETURNS__WR_REFUNDED_HDEMO_SK:
				return getWrRefundedHdemoSk();
			case TpcdsModelPackage.WEB_RETURNS__WR_REFUNDED_ADDR_SK:
				return getWrRefundedAddrSk();
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURNING_CUSTOMER_SK:
				return getWrReturningCustomerSk();
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURNING_CDEMO_SK:
				return getWrReturningCdemoSk();
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURNING_HDEMO_SK:
				return getWrReturningHdemoSk();
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURNING_ADDR_SK:
				return getWrReturningAddrSk();
			case TpcdsModelPackage.WEB_RETURNS__WR_WEB_PAGE_SK:
				return getWrWebPageSk();
			case TpcdsModelPackage.WEB_RETURNS__WR_REASON_SK:
				return getWrReasonSk();
			case TpcdsModelPackage.WEB_RETURNS__WR_ORDER_NUMBER:
				return getWrOrderNumber();
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURN_QUANTITY:
				return getWrReturnQuantity();
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURN_AMT:
				return getWrReturnAmt();
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURN_TAX:
				return getWrReturnTax();
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURN_AMT_INC_TAX:
				return getWrReturnAmtIncTax();
			case TpcdsModelPackage.WEB_RETURNS__WR_FEE:
				return getWrFee();
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURN_SHIP_COST:
				return getWrReturnShipCost();
			case TpcdsModelPackage.WEB_RETURNS__WR_REFUNDED_CASH:
				return getWrRefundedCash();
			case TpcdsModelPackage.WEB_RETURNS__WR_REVERSED_CHARGE:
				return getWrReversedCharge();
			case TpcdsModelPackage.WEB_RETURNS__WR_ACCOUNT_CREDIT:
				return getWrAccountCredit();
			case TpcdsModelPackage.WEB_RETURNS__WR_NET_LOSS:
				return getWrNetLoss();
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
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURNED_DATE_SK:
				setWrReturnedDateSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURNED_TIME_SK:
				setWrReturnedTimeSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_ITEM_SK:
				setWrItemSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_REFUNDED_CUSTOMER_SK:
				setWrRefundedCustomerSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_REFUNDED_CDEMO_SK:
				setWrRefundedCdemoSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_REFUNDED_HDEMO_SK:
				setWrRefundedHdemoSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_REFUNDED_ADDR_SK:
				setWrRefundedAddrSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURNING_CUSTOMER_SK:
				setWrReturningCustomerSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURNING_CDEMO_SK:
				setWrReturningCdemoSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURNING_HDEMO_SK:
				setWrReturningHdemoSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURNING_ADDR_SK:
				setWrReturningAddrSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_WEB_PAGE_SK:
				setWrWebPageSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_REASON_SK:
				setWrReasonSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_ORDER_NUMBER:
				setWrOrderNumber((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURN_QUANTITY:
				setWrReturnQuantity((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURN_AMT:
				setWrReturnAmt((Double)newValue);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURN_TAX:
				setWrReturnTax((Double)newValue);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURN_AMT_INC_TAX:
				setWrReturnAmtIncTax((Double)newValue);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_FEE:
				setWrFee((Double)newValue);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURN_SHIP_COST:
				setWrReturnShipCost((Double)newValue);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_REFUNDED_CASH:
				setWrRefundedCash((Double)newValue);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_REVERSED_CHARGE:
				setWrReversedCharge((Double)newValue);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_ACCOUNT_CREDIT:
				setWrAccountCredit((Double)newValue);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_NET_LOSS:
				setWrNetLoss((Double)newValue);
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
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURNED_DATE_SK:
				setWrReturnedDateSk(WR_RETURNED_DATE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURNED_TIME_SK:
				setWrReturnedTimeSk(WR_RETURNED_TIME_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_ITEM_SK:
				setWrItemSk(WR_ITEM_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_REFUNDED_CUSTOMER_SK:
				setWrRefundedCustomerSk(WR_REFUNDED_CUSTOMER_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_REFUNDED_CDEMO_SK:
				setWrRefundedCdemoSk(WR_REFUNDED_CDEMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_REFUNDED_HDEMO_SK:
				setWrRefundedHdemoSk(WR_REFUNDED_HDEMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_REFUNDED_ADDR_SK:
				setWrRefundedAddrSk(WR_REFUNDED_ADDR_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURNING_CUSTOMER_SK:
				setWrReturningCustomerSk(WR_RETURNING_CUSTOMER_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURNING_CDEMO_SK:
				setWrReturningCdemoSk(WR_RETURNING_CDEMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURNING_HDEMO_SK:
				setWrReturningHdemoSk(WR_RETURNING_HDEMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURNING_ADDR_SK:
				setWrReturningAddrSk(WR_RETURNING_ADDR_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_WEB_PAGE_SK:
				setWrWebPageSk(WR_WEB_PAGE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_REASON_SK:
				setWrReasonSk(WR_REASON_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_ORDER_NUMBER:
				setWrOrderNumber(WR_ORDER_NUMBER_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURN_QUANTITY:
				setWrReturnQuantity(WR_RETURN_QUANTITY_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURN_AMT:
				setWrReturnAmt(WR_RETURN_AMT_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURN_TAX:
				setWrReturnTax(WR_RETURN_TAX_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURN_AMT_INC_TAX:
				setWrReturnAmtIncTax(WR_RETURN_AMT_INC_TAX_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_FEE:
				setWrFee(WR_FEE_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURN_SHIP_COST:
				setWrReturnShipCost(WR_RETURN_SHIP_COST_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_REFUNDED_CASH:
				setWrRefundedCash(WR_REFUNDED_CASH_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_REVERSED_CHARGE:
				setWrReversedCharge(WR_REVERSED_CHARGE_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_ACCOUNT_CREDIT:
				setWrAccountCredit(WR_ACCOUNT_CREDIT_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_RETURNS__WR_NET_LOSS:
				setWrNetLoss(WR_NET_LOSS_EDEFAULT);
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
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURNED_DATE_SK:
				return WR_RETURNED_DATE_SK_EDEFAULT == null ? wrReturnedDateSk != null : !WR_RETURNED_DATE_SK_EDEFAULT.equals(wrReturnedDateSk);
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURNED_TIME_SK:
				return WR_RETURNED_TIME_SK_EDEFAULT == null ? wrReturnedTimeSk != null : !WR_RETURNED_TIME_SK_EDEFAULT.equals(wrReturnedTimeSk);
			case TpcdsModelPackage.WEB_RETURNS__WR_ITEM_SK:
				return WR_ITEM_SK_EDEFAULT == null ? wrItemSk != null : !WR_ITEM_SK_EDEFAULT.equals(wrItemSk);
			case TpcdsModelPackage.WEB_RETURNS__WR_REFUNDED_CUSTOMER_SK:
				return WR_REFUNDED_CUSTOMER_SK_EDEFAULT == null ? wrRefundedCustomerSk != null : !WR_REFUNDED_CUSTOMER_SK_EDEFAULT.equals(wrRefundedCustomerSk);
			case TpcdsModelPackage.WEB_RETURNS__WR_REFUNDED_CDEMO_SK:
				return WR_REFUNDED_CDEMO_SK_EDEFAULT == null ? wrRefundedCdemoSk != null : !WR_REFUNDED_CDEMO_SK_EDEFAULT.equals(wrRefundedCdemoSk);
			case TpcdsModelPackage.WEB_RETURNS__WR_REFUNDED_HDEMO_SK:
				return WR_REFUNDED_HDEMO_SK_EDEFAULT == null ? wrRefundedHdemoSk != null : !WR_REFUNDED_HDEMO_SK_EDEFAULT.equals(wrRefundedHdemoSk);
			case TpcdsModelPackage.WEB_RETURNS__WR_REFUNDED_ADDR_SK:
				return WR_REFUNDED_ADDR_SK_EDEFAULT == null ? wrRefundedAddrSk != null : !WR_REFUNDED_ADDR_SK_EDEFAULT.equals(wrRefundedAddrSk);
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURNING_CUSTOMER_SK:
				return WR_RETURNING_CUSTOMER_SK_EDEFAULT == null ? wrReturningCustomerSk != null : !WR_RETURNING_CUSTOMER_SK_EDEFAULT.equals(wrReturningCustomerSk);
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURNING_CDEMO_SK:
				return WR_RETURNING_CDEMO_SK_EDEFAULT == null ? wrReturningCdemoSk != null : !WR_RETURNING_CDEMO_SK_EDEFAULT.equals(wrReturningCdemoSk);
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURNING_HDEMO_SK:
				return WR_RETURNING_HDEMO_SK_EDEFAULT == null ? wrReturningHdemoSk != null : !WR_RETURNING_HDEMO_SK_EDEFAULT.equals(wrReturningHdemoSk);
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURNING_ADDR_SK:
				return WR_RETURNING_ADDR_SK_EDEFAULT == null ? wrReturningAddrSk != null : !WR_RETURNING_ADDR_SK_EDEFAULT.equals(wrReturningAddrSk);
			case TpcdsModelPackage.WEB_RETURNS__WR_WEB_PAGE_SK:
				return WR_WEB_PAGE_SK_EDEFAULT == null ? wrWebPageSk != null : !WR_WEB_PAGE_SK_EDEFAULT.equals(wrWebPageSk);
			case TpcdsModelPackage.WEB_RETURNS__WR_REASON_SK:
				return WR_REASON_SK_EDEFAULT == null ? wrReasonSk != null : !WR_REASON_SK_EDEFAULT.equals(wrReasonSk);
			case TpcdsModelPackage.WEB_RETURNS__WR_ORDER_NUMBER:
				return WR_ORDER_NUMBER_EDEFAULT == null ? wrOrderNumber != null : !WR_ORDER_NUMBER_EDEFAULT.equals(wrOrderNumber);
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURN_QUANTITY:
				return WR_RETURN_QUANTITY_EDEFAULT == null ? wrReturnQuantity != null : !WR_RETURN_QUANTITY_EDEFAULT.equals(wrReturnQuantity);
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURN_AMT:
				return wrReturnAmt != WR_RETURN_AMT_EDEFAULT;
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURN_TAX:
				return wrReturnTax != WR_RETURN_TAX_EDEFAULT;
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURN_AMT_INC_TAX:
				return wrReturnAmtIncTax != WR_RETURN_AMT_INC_TAX_EDEFAULT;
			case TpcdsModelPackage.WEB_RETURNS__WR_FEE:
				return wrFee != WR_FEE_EDEFAULT;
			case TpcdsModelPackage.WEB_RETURNS__WR_RETURN_SHIP_COST:
				return wrReturnShipCost != WR_RETURN_SHIP_COST_EDEFAULT;
			case TpcdsModelPackage.WEB_RETURNS__WR_REFUNDED_CASH:
				return wrRefundedCash != WR_REFUNDED_CASH_EDEFAULT;
			case TpcdsModelPackage.WEB_RETURNS__WR_REVERSED_CHARGE:
				return wrReversedCharge != WR_REVERSED_CHARGE_EDEFAULT;
			case TpcdsModelPackage.WEB_RETURNS__WR_ACCOUNT_CREDIT:
				return wrAccountCredit != WR_ACCOUNT_CREDIT_EDEFAULT;
			case TpcdsModelPackage.WEB_RETURNS__WR_NET_LOSS:
				return wrNetLoss != WR_NET_LOSS_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (wrReturnedDateSk: ");
		result.append(wrReturnedDateSk);
		result.append(", wrReturnedTimeSk: ");
		result.append(wrReturnedTimeSk);
		result.append(", wrItemSk: ");
		result.append(wrItemSk);
		result.append(", wrRefundedCustomerSk: ");
		result.append(wrRefundedCustomerSk);
		result.append(", wrRefundedCdemoSk: ");
		result.append(wrRefundedCdemoSk);
		result.append(", wrRefundedHdemoSk: ");
		result.append(wrRefundedHdemoSk);
		result.append(", wrRefundedAddrSk: ");
		result.append(wrRefundedAddrSk);
		result.append(", wrReturningCustomerSk: ");
		result.append(wrReturningCustomerSk);
		result.append(", wrReturningCdemoSk: ");
		result.append(wrReturningCdemoSk);
		result.append(", wrReturningHdemoSk: ");
		result.append(wrReturningHdemoSk);
		result.append(", wrReturningAddrSk: ");
		result.append(wrReturningAddrSk);
		result.append(", wrWebPageSk: ");
		result.append(wrWebPageSk);
		result.append(", wrReasonSk: ");
		result.append(wrReasonSk);
		result.append(", wrOrderNumber: ");
		result.append(wrOrderNumber);
		result.append(", wrReturnQuantity: ");
		result.append(wrReturnQuantity);
		result.append(", wrReturnAmt: ");
		result.append(wrReturnAmt);
		result.append(", wrReturnTax: ");
		result.append(wrReturnTax);
		result.append(", wrReturnAmtIncTax: ");
		result.append(wrReturnAmtIncTax);
		result.append(", wrFee: ");
		result.append(wrFee);
		result.append(", wrReturnShipCost: ");
		result.append(wrReturnShipCost);
		result.append(", wrRefundedCash: ");
		result.append(wrRefundedCash);
		result.append(", wrReversedCharge: ");
		result.append(wrReversedCharge);
		result.append(", wrAccountCredit: ");
		result.append(wrAccountCredit);
		result.append(", wrNetLoss: ");
		result.append(wrNetLoss);
		result.append(')');
		return result.toString();
	}

} //WebReturnsImpl
