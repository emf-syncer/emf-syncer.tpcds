/**
 */
package tpcds.tpcdsModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpcds.tpcdsModel.CatalogReturns;
import tpcds.tpcdsModel.TpcdsModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog Returns</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl#getCrReturnedDateSk <em>Cr Returned Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl#getCrReturnedTimeSk <em>Cr Returned Time Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl#getCrItemSk <em>Cr Item Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl#getCrRefundedCustomerSk <em>Cr Refunded Customer Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl#getCrRefundedCdemoSk <em>Cr Refunded Cdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl#getCrRefundedHdemoSk <em>Cr Refunded Hdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl#getCrRefundedAddrSk <em>Cr Refunded Addr Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl#getCrReturningCustomerSk <em>Cr Returning Customer Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl#getCrReturningCdemoSk <em>Cr Returning Cdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl#getCrReturningHdemoSk <em>Cr Returning Hdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl#getCrReturningAddrSk <em>Cr Returning Addr Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl#getCrCallCenterSk <em>Cr Call Center Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl#getCrCatalogPageSk <em>Cr Catalog Page Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl#getCrShipModeSk <em>Cr Ship Mode Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl#getCrWarehouseSk <em>Cr Warehouse Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl#getCrReasonSk <em>Cr Reason Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl#getCrOrderNumber <em>Cr Order Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl#getCrReturnQuantity <em>Cr Return Quantity</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl#getCrReturnAmount <em>Cr Return Amount</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl#getCrReturnTax <em>Cr Return Tax</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl#getCrReturnAmtIncTax <em>Cr Return Amt Inc Tax</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl#getCrFee <em>Cr Fee</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl#getCrReturnShipCost <em>Cr Return Ship Cost</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl#getCrRefundedCash <em>Cr Refunded Cash</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl#getCrReversedCharge <em>Cr Reversed Charge</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl#getCrStoreCredit <em>Cr Store Credit</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogReturnsImpl#getCrNetLoss <em>Cr Net Loss</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatalogReturnsImpl extends MinimalEObjectImpl.Container implements CatalogReturns {
	/**
	 * The default value of the '{@link #getCrReturnedDateSk() <em>Cr Returned Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrReturnedDateSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CR_RETURNED_DATE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrReturnedDateSk() <em>Cr Returned Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrReturnedDateSk()
	 * @generated
	 * @ordered
	 */
	protected Long crReturnedDateSk = CR_RETURNED_DATE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrReturnedTimeSk() <em>Cr Returned Time Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrReturnedTimeSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CR_RETURNED_TIME_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrReturnedTimeSk() <em>Cr Returned Time Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrReturnedTimeSk()
	 * @generated
	 * @ordered
	 */
	protected Long crReturnedTimeSk = CR_RETURNED_TIME_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrItemSk() <em>Cr Item Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrItemSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CR_ITEM_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrItemSk() <em>Cr Item Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrItemSk()
	 * @generated
	 * @ordered
	 */
	protected Long crItemSk = CR_ITEM_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrRefundedCustomerSk() <em>Cr Refunded Customer Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrRefundedCustomerSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CR_REFUNDED_CUSTOMER_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrRefundedCustomerSk() <em>Cr Refunded Customer Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrRefundedCustomerSk()
	 * @generated
	 * @ordered
	 */
	protected Long crRefundedCustomerSk = CR_REFUNDED_CUSTOMER_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrRefundedCdemoSk() <em>Cr Refunded Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrRefundedCdemoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CR_REFUNDED_CDEMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrRefundedCdemoSk() <em>Cr Refunded Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrRefundedCdemoSk()
	 * @generated
	 * @ordered
	 */
	protected Long crRefundedCdemoSk = CR_REFUNDED_CDEMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrRefundedHdemoSk() <em>Cr Refunded Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrRefundedHdemoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CR_REFUNDED_HDEMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrRefundedHdemoSk() <em>Cr Refunded Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrRefundedHdemoSk()
	 * @generated
	 * @ordered
	 */
	protected Long crRefundedHdemoSk = CR_REFUNDED_HDEMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrRefundedAddrSk() <em>Cr Refunded Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrRefundedAddrSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CR_REFUNDED_ADDR_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrRefundedAddrSk() <em>Cr Refunded Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrRefundedAddrSk()
	 * @generated
	 * @ordered
	 */
	protected Long crRefundedAddrSk = CR_REFUNDED_ADDR_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrReturningCustomerSk() <em>Cr Returning Customer Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrReturningCustomerSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CR_RETURNING_CUSTOMER_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrReturningCustomerSk() <em>Cr Returning Customer Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrReturningCustomerSk()
	 * @generated
	 * @ordered
	 */
	protected Long crReturningCustomerSk = CR_RETURNING_CUSTOMER_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrReturningCdemoSk() <em>Cr Returning Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrReturningCdemoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CR_RETURNING_CDEMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrReturningCdemoSk() <em>Cr Returning Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrReturningCdemoSk()
	 * @generated
	 * @ordered
	 */
	protected Long crReturningCdemoSk = CR_RETURNING_CDEMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrReturningHdemoSk() <em>Cr Returning Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrReturningHdemoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CR_RETURNING_HDEMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrReturningHdemoSk() <em>Cr Returning Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrReturningHdemoSk()
	 * @generated
	 * @ordered
	 */
	protected Long crReturningHdemoSk = CR_RETURNING_HDEMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrReturningAddrSk() <em>Cr Returning Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrReturningAddrSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CR_RETURNING_ADDR_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrReturningAddrSk() <em>Cr Returning Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrReturningAddrSk()
	 * @generated
	 * @ordered
	 */
	protected Long crReturningAddrSk = CR_RETURNING_ADDR_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrCallCenterSk() <em>Cr Call Center Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrCallCenterSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CR_CALL_CENTER_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrCallCenterSk() <em>Cr Call Center Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrCallCenterSk()
	 * @generated
	 * @ordered
	 */
	protected Long crCallCenterSk = CR_CALL_CENTER_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrCatalogPageSk() <em>Cr Catalog Page Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrCatalogPageSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CR_CATALOG_PAGE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrCatalogPageSk() <em>Cr Catalog Page Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrCatalogPageSk()
	 * @generated
	 * @ordered
	 */
	protected Long crCatalogPageSk = CR_CATALOG_PAGE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrShipModeSk() <em>Cr Ship Mode Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrShipModeSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CR_SHIP_MODE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrShipModeSk() <em>Cr Ship Mode Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrShipModeSk()
	 * @generated
	 * @ordered
	 */
	protected Long crShipModeSk = CR_SHIP_MODE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrWarehouseSk() <em>Cr Warehouse Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrWarehouseSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CR_WAREHOUSE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrWarehouseSk() <em>Cr Warehouse Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrWarehouseSk()
	 * @generated
	 * @ordered
	 */
	protected Long crWarehouseSk = CR_WAREHOUSE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrReasonSk() <em>Cr Reason Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrReasonSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CR_REASON_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrReasonSk() <em>Cr Reason Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrReasonSk()
	 * @generated
	 * @ordered
	 */
	protected Long crReasonSk = CR_REASON_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrOrderNumber() <em>Cr Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrOrderNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Long CR_ORDER_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrOrderNumber() <em>Cr Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrOrderNumber()
	 * @generated
	 * @ordered
	 */
	protected Long crOrderNumber = CR_ORDER_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrReturnQuantity() <em>Cr Return Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrReturnQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final Long CR_RETURN_QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrReturnQuantity() <em>Cr Return Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrReturnQuantity()
	 * @generated
	 * @ordered
	 */
	protected Long crReturnQuantity = CR_RETURN_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrReturnAmount() <em>Cr Return Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrReturnAmount()
	 * @generated
	 * @ordered
	 */
	protected static final double CR_RETURN_AMOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCrReturnAmount() <em>Cr Return Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrReturnAmount()
	 * @generated
	 * @ordered
	 */
	protected double crReturnAmount = CR_RETURN_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrReturnTax() <em>Cr Return Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrReturnTax()
	 * @generated
	 * @ordered
	 */
	protected static final double CR_RETURN_TAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCrReturnTax() <em>Cr Return Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrReturnTax()
	 * @generated
	 * @ordered
	 */
	protected double crReturnTax = CR_RETURN_TAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrReturnAmtIncTax() <em>Cr Return Amt Inc Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrReturnAmtIncTax()
	 * @generated
	 * @ordered
	 */
	protected static final double CR_RETURN_AMT_INC_TAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCrReturnAmtIncTax() <em>Cr Return Amt Inc Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrReturnAmtIncTax()
	 * @generated
	 * @ordered
	 */
	protected double crReturnAmtIncTax = CR_RETURN_AMT_INC_TAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrFee() <em>Cr Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrFee()
	 * @generated
	 * @ordered
	 */
	protected static final double CR_FEE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCrFee() <em>Cr Fee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrFee()
	 * @generated
	 * @ordered
	 */
	protected double crFee = CR_FEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrReturnShipCost() <em>Cr Return Ship Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrReturnShipCost()
	 * @generated
	 * @ordered
	 */
	protected static final double CR_RETURN_SHIP_COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCrReturnShipCost() <em>Cr Return Ship Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrReturnShipCost()
	 * @generated
	 * @ordered
	 */
	protected double crReturnShipCost = CR_RETURN_SHIP_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrRefundedCash() <em>Cr Refunded Cash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrRefundedCash()
	 * @generated
	 * @ordered
	 */
	protected static final double CR_REFUNDED_CASH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCrRefundedCash() <em>Cr Refunded Cash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrRefundedCash()
	 * @generated
	 * @ordered
	 */
	protected double crRefundedCash = CR_REFUNDED_CASH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrReversedCharge() <em>Cr Reversed Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrReversedCharge()
	 * @generated
	 * @ordered
	 */
	protected static final double CR_REVERSED_CHARGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCrReversedCharge() <em>Cr Reversed Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrReversedCharge()
	 * @generated
	 * @ordered
	 */
	protected double crReversedCharge = CR_REVERSED_CHARGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrStoreCredit() <em>Cr Store Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrStoreCredit()
	 * @generated
	 * @ordered
	 */
	protected static final double CR_STORE_CREDIT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCrStoreCredit() <em>Cr Store Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrStoreCredit()
	 * @generated
	 * @ordered
	 */
	protected double crStoreCredit = CR_STORE_CREDIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrNetLoss() <em>Cr Net Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrNetLoss()
	 * @generated
	 * @ordered
	 */
	protected static final double CR_NET_LOSS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCrNetLoss() <em>Cr Net Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrNetLoss()
	 * @generated
	 * @ordered
	 */
	protected double crNetLoss = CR_NET_LOSS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogReturnsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpcdsModelPackage.Literals.CATALOG_RETURNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCrReturnedDateSk() {
		return crReturnedDateSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrReturnedDateSk(Long newCrReturnedDateSk) {
		Long oldCrReturnedDateSk = crReturnedDateSk;
		crReturnedDateSk = newCrReturnedDateSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNED_DATE_SK, oldCrReturnedDateSk, crReturnedDateSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCrReturnedTimeSk() {
		return crReturnedTimeSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrReturnedTimeSk(Long newCrReturnedTimeSk) {
		Long oldCrReturnedTimeSk = crReturnedTimeSk;
		crReturnedTimeSk = newCrReturnedTimeSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNED_TIME_SK, oldCrReturnedTimeSk, crReturnedTimeSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCrItemSk() {
		return crItemSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrItemSk(Long newCrItemSk) {
		Long oldCrItemSk = crItemSk;
		crItemSk = newCrItemSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_RETURNS__CR_ITEM_SK, oldCrItemSk, crItemSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCrRefundedCustomerSk() {
		return crRefundedCustomerSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrRefundedCustomerSk(Long newCrRefundedCustomerSk) {
		Long oldCrRefundedCustomerSk = crRefundedCustomerSk;
		crRefundedCustomerSk = newCrRefundedCustomerSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_RETURNS__CR_REFUNDED_CUSTOMER_SK, oldCrRefundedCustomerSk, crRefundedCustomerSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCrRefundedCdemoSk() {
		return crRefundedCdemoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrRefundedCdemoSk(Long newCrRefundedCdemoSk) {
		Long oldCrRefundedCdemoSk = crRefundedCdemoSk;
		crRefundedCdemoSk = newCrRefundedCdemoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_RETURNS__CR_REFUNDED_CDEMO_SK, oldCrRefundedCdemoSk, crRefundedCdemoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCrRefundedHdemoSk() {
		return crRefundedHdemoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrRefundedHdemoSk(Long newCrRefundedHdemoSk) {
		Long oldCrRefundedHdemoSk = crRefundedHdemoSk;
		crRefundedHdemoSk = newCrRefundedHdemoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_RETURNS__CR_REFUNDED_HDEMO_SK, oldCrRefundedHdemoSk, crRefundedHdemoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCrRefundedAddrSk() {
		return crRefundedAddrSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrRefundedAddrSk(Long newCrRefundedAddrSk) {
		Long oldCrRefundedAddrSk = crRefundedAddrSk;
		crRefundedAddrSk = newCrRefundedAddrSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_RETURNS__CR_REFUNDED_ADDR_SK, oldCrRefundedAddrSk, crRefundedAddrSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCrReturningCustomerSk() {
		return crReturningCustomerSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrReturningCustomerSk(Long newCrReturningCustomerSk) {
		Long oldCrReturningCustomerSk = crReturningCustomerSk;
		crReturningCustomerSk = newCrReturningCustomerSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNING_CUSTOMER_SK, oldCrReturningCustomerSk, crReturningCustomerSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCrReturningCdemoSk() {
		return crReturningCdemoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrReturningCdemoSk(Long newCrReturningCdemoSk) {
		Long oldCrReturningCdemoSk = crReturningCdemoSk;
		crReturningCdemoSk = newCrReturningCdemoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNING_CDEMO_SK, oldCrReturningCdemoSk, crReturningCdemoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCrReturningHdemoSk() {
		return crReturningHdemoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrReturningHdemoSk(Long newCrReturningHdemoSk) {
		Long oldCrReturningHdemoSk = crReturningHdemoSk;
		crReturningHdemoSk = newCrReturningHdemoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNING_HDEMO_SK, oldCrReturningHdemoSk, crReturningHdemoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCrReturningAddrSk() {
		return crReturningAddrSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrReturningAddrSk(Long newCrReturningAddrSk) {
		Long oldCrReturningAddrSk = crReturningAddrSk;
		crReturningAddrSk = newCrReturningAddrSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNING_ADDR_SK, oldCrReturningAddrSk, crReturningAddrSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCrCallCenterSk() {
		return crCallCenterSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrCallCenterSk(Long newCrCallCenterSk) {
		Long oldCrCallCenterSk = crCallCenterSk;
		crCallCenterSk = newCrCallCenterSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_RETURNS__CR_CALL_CENTER_SK, oldCrCallCenterSk, crCallCenterSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCrCatalogPageSk() {
		return crCatalogPageSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrCatalogPageSk(Long newCrCatalogPageSk) {
		Long oldCrCatalogPageSk = crCatalogPageSk;
		crCatalogPageSk = newCrCatalogPageSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_RETURNS__CR_CATALOG_PAGE_SK, oldCrCatalogPageSk, crCatalogPageSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCrShipModeSk() {
		return crShipModeSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrShipModeSk(Long newCrShipModeSk) {
		Long oldCrShipModeSk = crShipModeSk;
		crShipModeSk = newCrShipModeSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_RETURNS__CR_SHIP_MODE_SK, oldCrShipModeSk, crShipModeSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCrWarehouseSk() {
		return crWarehouseSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrWarehouseSk(Long newCrWarehouseSk) {
		Long oldCrWarehouseSk = crWarehouseSk;
		crWarehouseSk = newCrWarehouseSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_RETURNS__CR_WAREHOUSE_SK, oldCrWarehouseSk, crWarehouseSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCrReasonSk() {
		return crReasonSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrReasonSk(Long newCrReasonSk) {
		Long oldCrReasonSk = crReasonSk;
		crReasonSk = newCrReasonSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_RETURNS__CR_REASON_SK, oldCrReasonSk, crReasonSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCrOrderNumber() {
		return crOrderNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrOrderNumber(Long newCrOrderNumber) {
		Long oldCrOrderNumber = crOrderNumber;
		crOrderNumber = newCrOrderNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_RETURNS__CR_ORDER_NUMBER, oldCrOrderNumber, crOrderNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCrReturnQuantity() {
		return crReturnQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrReturnQuantity(Long newCrReturnQuantity) {
		Long oldCrReturnQuantity = crReturnQuantity;
		crReturnQuantity = newCrReturnQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_RETURNS__CR_RETURN_QUANTITY, oldCrReturnQuantity, crReturnQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCrReturnAmount() {
		return crReturnAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrReturnAmount(double newCrReturnAmount) {
		double oldCrReturnAmount = crReturnAmount;
		crReturnAmount = newCrReturnAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_RETURNS__CR_RETURN_AMOUNT, oldCrReturnAmount, crReturnAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCrReturnTax() {
		return crReturnTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrReturnTax(double newCrReturnTax) {
		double oldCrReturnTax = crReturnTax;
		crReturnTax = newCrReturnTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_RETURNS__CR_RETURN_TAX, oldCrReturnTax, crReturnTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCrReturnAmtIncTax() {
		return crReturnAmtIncTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrReturnAmtIncTax(double newCrReturnAmtIncTax) {
		double oldCrReturnAmtIncTax = crReturnAmtIncTax;
		crReturnAmtIncTax = newCrReturnAmtIncTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_RETURNS__CR_RETURN_AMT_INC_TAX, oldCrReturnAmtIncTax, crReturnAmtIncTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCrFee() {
		return crFee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrFee(double newCrFee) {
		double oldCrFee = crFee;
		crFee = newCrFee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_RETURNS__CR_FEE, oldCrFee, crFee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCrReturnShipCost() {
		return crReturnShipCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrReturnShipCost(double newCrReturnShipCost) {
		double oldCrReturnShipCost = crReturnShipCost;
		crReturnShipCost = newCrReturnShipCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_RETURNS__CR_RETURN_SHIP_COST, oldCrReturnShipCost, crReturnShipCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCrRefundedCash() {
		return crRefundedCash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrRefundedCash(double newCrRefundedCash) {
		double oldCrRefundedCash = crRefundedCash;
		crRefundedCash = newCrRefundedCash;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_RETURNS__CR_REFUNDED_CASH, oldCrRefundedCash, crRefundedCash));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCrReversedCharge() {
		return crReversedCharge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrReversedCharge(double newCrReversedCharge) {
		double oldCrReversedCharge = crReversedCharge;
		crReversedCharge = newCrReversedCharge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_RETURNS__CR_REVERSED_CHARGE, oldCrReversedCharge, crReversedCharge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCrStoreCredit() {
		return crStoreCredit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrStoreCredit(double newCrStoreCredit) {
		double oldCrStoreCredit = crStoreCredit;
		crStoreCredit = newCrStoreCredit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_RETURNS__CR_STORE_CREDIT, oldCrStoreCredit, crStoreCredit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCrNetLoss() {
		return crNetLoss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrNetLoss(double newCrNetLoss) {
		double oldCrNetLoss = crNetLoss;
		crNetLoss = newCrNetLoss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_RETURNS__CR_NET_LOSS, oldCrNetLoss, crNetLoss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNED_DATE_SK:
				return getCrReturnedDateSk();
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNED_TIME_SK:
				return getCrReturnedTimeSk();
			case TpcdsModelPackage.CATALOG_RETURNS__CR_ITEM_SK:
				return getCrItemSk();
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REFUNDED_CUSTOMER_SK:
				return getCrRefundedCustomerSk();
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REFUNDED_CDEMO_SK:
				return getCrRefundedCdemoSk();
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REFUNDED_HDEMO_SK:
				return getCrRefundedHdemoSk();
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REFUNDED_ADDR_SK:
				return getCrRefundedAddrSk();
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNING_CUSTOMER_SK:
				return getCrReturningCustomerSk();
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNING_CDEMO_SK:
				return getCrReturningCdemoSk();
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNING_HDEMO_SK:
				return getCrReturningHdemoSk();
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNING_ADDR_SK:
				return getCrReturningAddrSk();
			case TpcdsModelPackage.CATALOG_RETURNS__CR_CALL_CENTER_SK:
				return getCrCallCenterSk();
			case TpcdsModelPackage.CATALOG_RETURNS__CR_CATALOG_PAGE_SK:
				return getCrCatalogPageSk();
			case TpcdsModelPackage.CATALOG_RETURNS__CR_SHIP_MODE_SK:
				return getCrShipModeSk();
			case TpcdsModelPackage.CATALOG_RETURNS__CR_WAREHOUSE_SK:
				return getCrWarehouseSk();
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REASON_SK:
				return getCrReasonSk();
			case TpcdsModelPackage.CATALOG_RETURNS__CR_ORDER_NUMBER:
				return getCrOrderNumber();
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURN_QUANTITY:
				return getCrReturnQuantity();
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURN_AMOUNT:
				return getCrReturnAmount();
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURN_TAX:
				return getCrReturnTax();
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURN_AMT_INC_TAX:
				return getCrReturnAmtIncTax();
			case TpcdsModelPackage.CATALOG_RETURNS__CR_FEE:
				return getCrFee();
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURN_SHIP_COST:
				return getCrReturnShipCost();
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REFUNDED_CASH:
				return getCrRefundedCash();
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REVERSED_CHARGE:
				return getCrReversedCharge();
			case TpcdsModelPackage.CATALOG_RETURNS__CR_STORE_CREDIT:
				return getCrStoreCredit();
			case TpcdsModelPackage.CATALOG_RETURNS__CR_NET_LOSS:
				return getCrNetLoss();
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
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNED_DATE_SK:
				setCrReturnedDateSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNED_TIME_SK:
				setCrReturnedTimeSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_ITEM_SK:
				setCrItemSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REFUNDED_CUSTOMER_SK:
				setCrRefundedCustomerSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REFUNDED_CDEMO_SK:
				setCrRefundedCdemoSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REFUNDED_HDEMO_SK:
				setCrRefundedHdemoSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REFUNDED_ADDR_SK:
				setCrRefundedAddrSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNING_CUSTOMER_SK:
				setCrReturningCustomerSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNING_CDEMO_SK:
				setCrReturningCdemoSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNING_HDEMO_SK:
				setCrReturningHdemoSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNING_ADDR_SK:
				setCrReturningAddrSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_CALL_CENTER_SK:
				setCrCallCenterSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_CATALOG_PAGE_SK:
				setCrCatalogPageSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_SHIP_MODE_SK:
				setCrShipModeSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_WAREHOUSE_SK:
				setCrWarehouseSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REASON_SK:
				setCrReasonSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_ORDER_NUMBER:
				setCrOrderNumber((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURN_QUANTITY:
				setCrReturnQuantity((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURN_AMOUNT:
				setCrReturnAmount((Double)newValue);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURN_TAX:
				setCrReturnTax((Double)newValue);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURN_AMT_INC_TAX:
				setCrReturnAmtIncTax((Double)newValue);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_FEE:
				setCrFee((Double)newValue);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURN_SHIP_COST:
				setCrReturnShipCost((Double)newValue);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REFUNDED_CASH:
				setCrRefundedCash((Double)newValue);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REVERSED_CHARGE:
				setCrReversedCharge((Double)newValue);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_STORE_CREDIT:
				setCrStoreCredit((Double)newValue);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_NET_LOSS:
				setCrNetLoss((Double)newValue);
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
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNED_DATE_SK:
				setCrReturnedDateSk(CR_RETURNED_DATE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNED_TIME_SK:
				setCrReturnedTimeSk(CR_RETURNED_TIME_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_ITEM_SK:
				setCrItemSk(CR_ITEM_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REFUNDED_CUSTOMER_SK:
				setCrRefundedCustomerSk(CR_REFUNDED_CUSTOMER_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REFUNDED_CDEMO_SK:
				setCrRefundedCdemoSk(CR_REFUNDED_CDEMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REFUNDED_HDEMO_SK:
				setCrRefundedHdemoSk(CR_REFUNDED_HDEMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REFUNDED_ADDR_SK:
				setCrRefundedAddrSk(CR_REFUNDED_ADDR_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNING_CUSTOMER_SK:
				setCrReturningCustomerSk(CR_RETURNING_CUSTOMER_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNING_CDEMO_SK:
				setCrReturningCdemoSk(CR_RETURNING_CDEMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNING_HDEMO_SK:
				setCrReturningHdemoSk(CR_RETURNING_HDEMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNING_ADDR_SK:
				setCrReturningAddrSk(CR_RETURNING_ADDR_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_CALL_CENTER_SK:
				setCrCallCenterSk(CR_CALL_CENTER_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_CATALOG_PAGE_SK:
				setCrCatalogPageSk(CR_CATALOG_PAGE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_SHIP_MODE_SK:
				setCrShipModeSk(CR_SHIP_MODE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_WAREHOUSE_SK:
				setCrWarehouseSk(CR_WAREHOUSE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REASON_SK:
				setCrReasonSk(CR_REASON_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_ORDER_NUMBER:
				setCrOrderNumber(CR_ORDER_NUMBER_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURN_QUANTITY:
				setCrReturnQuantity(CR_RETURN_QUANTITY_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURN_AMOUNT:
				setCrReturnAmount(CR_RETURN_AMOUNT_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURN_TAX:
				setCrReturnTax(CR_RETURN_TAX_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURN_AMT_INC_TAX:
				setCrReturnAmtIncTax(CR_RETURN_AMT_INC_TAX_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_FEE:
				setCrFee(CR_FEE_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURN_SHIP_COST:
				setCrReturnShipCost(CR_RETURN_SHIP_COST_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REFUNDED_CASH:
				setCrRefundedCash(CR_REFUNDED_CASH_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REVERSED_CHARGE:
				setCrReversedCharge(CR_REVERSED_CHARGE_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_STORE_CREDIT:
				setCrStoreCredit(CR_STORE_CREDIT_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_NET_LOSS:
				setCrNetLoss(CR_NET_LOSS_EDEFAULT);
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
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNED_DATE_SK:
				return CR_RETURNED_DATE_SK_EDEFAULT == null ? crReturnedDateSk != null : !CR_RETURNED_DATE_SK_EDEFAULT.equals(crReturnedDateSk);
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNED_TIME_SK:
				return CR_RETURNED_TIME_SK_EDEFAULT == null ? crReturnedTimeSk != null : !CR_RETURNED_TIME_SK_EDEFAULT.equals(crReturnedTimeSk);
			case TpcdsModelPackage.CATALOG_RETURNS__CR_ITEM_SK:
				return CR_ITEM_SK_EDEFAULT == null ? crItemSk != null : !CR_ITEM_SK_EDEFAULT.equals(crItemSk);
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REFUNDED_CUSTOMER_SK:
				return CR_REFUNDED_CUSTOMER_SK_EDEFAULT == null ? crRefundedCustomerSk != null : !CR_REFUNDED_CUSTOMER_SK_EDEFAULT.equals(crRefundedCustomerSk);
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REFUNDED_CDEMO_SK:
				return CR_REFUNDED_CDEMO_SK_EDEFAULT == null ? crRefundedCdemoSk != null : !CR_REFUNDED_CDEMO_SK_EDEFAULT.equals(crRefundedCdemoSk);
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REFUNDED_HDEMO_SK:
				return CR_REFUNDED_HDEMO_SK_EDEFAULT == null ? crRefundedHdemoSk != null : !CR_REFUNDED_HDEMO_SK_EDEFAULT.equals(crRefundedHdemoSk);
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REFUNDED_ADDR_SK:
				return CR_REFUNDED_ADDR_SK_EDEFAULT == null ? crRefundedAddrSk != null : !CR_REFUNDED_ADDR_SK_EDEFAULT.equals(crRefundedAddrSk);
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNING_CUSTOMER_SK:
				return CR_RETURNING_CUSTOMER_SK_EDEFAULT == null ? crReturningCustomerSk != null : !CR_RETURNING_CUSTOMER_SK_EDEFAULT.equals(crReturningCustomerSk);
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNING_CDEMO_SK:
				return CR_RETURNING_CDEMO_SK_EDEFAULT == null ? crReturningCdemoSk != null : !CR_RETURNING_CDEMO_SK_EDEFAULT.equals(crReturningCdemoSk);
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNING_HDEMO_SK:
				return CR_RETURNING_HDEMO_SK_EDEFAULT == null ? crReturningHdemoSk != null : !CR_RETURNING_HDEMO_SK_EDEFAULT.equals(crReturningHdemoSk);
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURNING_ADDR_SK:
				return CR_RETURNING_ADDR_SK_EDEFAULT == null ? crReturningAddrSk != null : !CR_RETURNING_ADDR_SK_EDEFAULT.equals(crReturningAddrSk);
			case TpcdsModelPackage.CATALOG_RETURNS__CR_CALL_CENTER_SK:
				return CR_CALL_CENTER_SK_EDEFAULT == null ? crCallCenterSk != null : !CR_CALL_CENTER_SK_EDEFAULT.equals(crCallCenterSk);
			case TpcdsModelPackage.CATALOG_RETURNS__CR_CATALOG_PAGE_SK:
				return CR_CATALOG_PAGE_SK_EDEFAULT == null ? crCatalogPageSk != null : !CR_CATALOG_PAGE_SK_EDEFAULT.equals(crCatalogPageSk);
			case TpcdsModelPackage.CATALOG_RETURNS__CR_SHIP_MODE_SK:
				return CR_SHIP_MODE_SK_EDEFAULT == null ? crShipModeSk != null : !CR_SHIP_MODE_SK_EDEFAULT.equals(crShipModeSk);
			case TpcdsModelPackage.CATALOG_RETURNS__CR_WAREHOUSE_SK:
				return CR_WAREHOUSE_SK_EDEFAULT == null ? crWarehouseSk != null : !CR_WAREHOUSE_SK_EDEFAULT.equals(crWarehouseSk);
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REASON_SK:
				return CR_REASON_SK_EDEFAULT == null ? crReasonSk != null : !CR_REASON_SK_EDEFAULT.equals(crReasonSk);
			case TpcdsModelPackage.CATALOG_RETURNS__CR_ORDER_NUMBER:
				return CR_ORDER_NUMBER_EDEFAULT == null ? crOrderNumber != null : !CR_ORDER_NUMBER_EDEFAULT.equals(crOrderNumber);
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURN_QUANTITY:
				return CR_RETURN_QUANTITY_EDEFAULT == null ? crReturnQuantity != null : !CR_RETURN_QUANTITY_EDEFAULT.equals(crReturnQuantity);
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURN_AMOUNT:
				return crReturnAmount != CR_RETURN_AMOUNT_EDEFAULT;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURN_TAX:
				return crReturnTax != CR_RETURN_TAX_EDEFAULT;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURN_AMT_INC_TAX:
				return crReturnAmtIncTax != CR_RETURN_AMT_INC_TAX_EDEFAULT;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_FEE:
				return crFee != CR_FEE_EDEFAULT;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_RETURN_SHIP_COST:
				return crReturnShipCost != CR_RETURN_SHIP_COST_EDEFAULT;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REFUNDED_CASH:
				return crRefundedCash != CR_REFUNDED_CASH_EDEFAULT;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_REVERSED_CHARGE:
				return crReversedCharge != CR_REVERSED_CHARGE_EDEFAULT;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_STORE_CREDIT:
				return crStoreCredit != CR_STORE_CREDIT_EDEFAULT;
			case TpcdsModelPackage.CATALOG_RETURNS__CR_NET_LOSS:
				return crNetLoss != CR_NET_LOSS_EDEFAULT;
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
		result.append(" (crReturnedDateSk: ");
		result.append(crReturnedDateSk);
		result.append(", crReturnedTimeSk: ");
		result.append(crReturnedTimeSk);
		result.append(", crItemSk: ");
		result.append(crItemSk);
		result.append(", crRefundedCustomerSk: ");
		result.append(crRefundedCustomerSk);
		result.append(", crRefundedCdemoSk: ");
		result.append(crRefundedCdemoSk);
		result.append(", crRefundedHdemoSk: ");
		result.append(crRefundedHdemoSk);
		result.append(", crRefundedAddrSk: ");
		result.append(crRefundedAddrSk);
		result.append(", crReturningCustomerSk: ");
		result.append(crReturningCustomerSk);
		result.append(", crReturningCdemoSk: ");
		result.append(crReturningCdemoSk);
		result.append(", crReturningHdemoSk: ");
		result.append(crReturningHdemoSk);
		result.append(", crReturningAddrSk: ");
		result.append(crReturningAddrSk);
		result.append(", crCallCenterSk: ");
		result.append(crCallCenterSk);
		result.append(", crCatalogPageSk: ");
		result.append(crCatalogPageSk);
		result.append(", crShipModeSk: ");
		result.append(crShipModeSk);
		result.append(", crWarehouseSk: ");
		result.append(crWarehouseSk);
		result.append(", crReasonSk: ");
		result.append(crReasonSk);
		result.append(", crOrderNumber: ");
		result.append(crOrderNumber);
		result.append(", crReturnQuantity: ");
		result.append(crReturnQuantity);
		result.append(", crReturnAmount: ");
		result.append(crReturnAmount);
		result.append(", crReturnTax: ");
		result.append(crReturnTax);
		result.append(", crReturnAmtIncTax: ");
		result.append(crReturnAmtIncTax);
		result.append(", crFee: ");
		result.append(crFee);
		result.append(", crReturnShipCost: ");
		result.append(crReturnShipCost);
		result.append(", crRefundedCash: ");
		result.append(crRefundedCash);
		result.append(", crReversedCharge: ");
		result.append(crReversedCharge);
		result.append(", crStoreCredit: ");
		result.append(crStoreCredit);
		result.append(", crNetLoss: ");
		result.append(crNetLoss);
		result.append(')');
		return result.toString();
	}

} //CatalogReturnsImpl
