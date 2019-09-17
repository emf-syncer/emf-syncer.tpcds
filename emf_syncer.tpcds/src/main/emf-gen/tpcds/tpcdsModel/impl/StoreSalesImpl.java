/**
 */
package tpcds.tpcdsModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpcds.tpcdsModel.Customer;
import tpcds.tpcdsModel.DateDim;
import tpcds.tpcdsModel.Store;
import tpcds.tpcdsModel.StoreSales;
import tpcds.tpcdsModel.StoreSalesId;
import tpcds.tpcdsModel.TpcdsModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Store Sales</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreSalesImpl#getSsSoldDateSk <em>Ss Sold Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreSalesImpl#getSsSoldTimeSk <em>Ss Sold Time Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreSalesImpl#getSsItemSk <em>Ss Item Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreSalesImpl#getSsId <em>Ss Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreSalesImpl#getSsCustomerSk <em>Ss Customer Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreSalesImpl#getSsTicketNumber <em>Ss Ticket Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreSalesImpl#getSsCdemoSk <em>Ss Cdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreSalesImpl#getSsHdemoSk <em>Ss Hdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreSalesImpl#getSsAddrSk <em>Ss Addr Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreSalesImpl#getSsStoreSk <em>Ss Store Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreSalesImpl#getSsPromoSk <em>Ss Promo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreSalesImpl#getSsQuantity <em>Ss Quantity</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreSalesImpl#getSsWholesaleCost <em>Ss Wholesale Cost</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreSalesImpl#getSsListPrice <em>Ss List Price</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreSalesImpl#getSsSalesPrice <em>Ss Sales Price</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreSalesImpl#getSsExtDiscountAmt <em>Ss Ext Discount Amt</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreSalesImpl#getSsExtSalesPrice <em>Ss Ext Sales Price</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreSalesImpl#getSsExtWholesaleCost <em>Ss Ext Wholesale Cost</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreSalesImpl#getSsExtListPrice <em>Ss Ext List Price</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreSalesImpl#getSsExtTax <em>Ss Ext Tax</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreSalesImpl#getSsCouponAmt <em>Ss Coupon Amt</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreSalesImpl#getSsNetPaid <em>Ss Net Paid</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreSalesImpl#getSsNetPaidIncTax <em>Ss Net Paid Inc Tax</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.StoreSalesImpl#getSsNetProfit <em>Ss Net Profit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoreSalesImpl extends MinimalEObjectImpl.Container implements StoreSales {
	/**
	 * The cached value of the '{@link #getSsSoldDateSk() <em>Ss Sold Date Sk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsSoldDateSk()
	 * @generated
	 * @ordered
	 */
	protected DateDim ssSoldDateSk;

	/**
	 * The default value of the '{@link #getSsSoldTimeSk() <em>Ss Sold Time Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsSoldTimeSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long SS_SOLD_TIME_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsSoldTimeSk() <em>Ss Sold Time Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsSoldTimeSk()
	 * @generated
	 * @ordered
	 */
	protected Long ssSoldTimeSk = SS_SOLD_TIME_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsItemSk() <em>Ss Item Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsItemSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long SS_ITEM_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsItemSk() <em>Ss Item Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsItemSk()
	 * @generated
	 * @ordered
	 */
	protected Long ssItemSk = SS_ITEM_SK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSsId() <em>Ss Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsId()
	 * @generated
	 * @ordered
	 */
	protected StoreSalesId ssId;

	/**
	 * The cached value of the '{@link #getSsCustomerSk() <em>Ss Customer Sk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsCustomerSk()
	 * @generated
	 * @ordered
	 */
	protected Customer ssCustomerSk;

	/**
	 * The default value of the '{@link #getSsTicketNumber() <em>Ss Ticket Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsTicketNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Long SS_TICKET_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsTicketNumber() <em>Ss Ticket Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsTicketNumber()
	 * @generated
	 * @ordered
	 */
	protected Long ssTicketNumber = SS_TICKET_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsCdemoSk() <em>Ss Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsCdemoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long SS_CDEMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsCdemoSk() <em>Ss Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsCdemoSk()
	 * @generated
	 * @ordered
	 */
	protected Long ssCdemoSk = SS_CDEMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsHdemoSk() <em>Ss Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsHdemoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long SS_HDEMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsHdemoSk() <em>Ss Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsHdemoSk()
	 * @generated
	 * @ordered
	 */
	protected Long ssHdemoSk = SS_HDEMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsAddrSk() <em>Ss Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsAddrSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long SS_ADDR_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsAddrSk() <em>Ss Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsAddrSk()
	 * @generated
	 * @ordered
	 */
	protected Long ssAddrSk = SS_ADDR_SK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSsStoreSk() <em>Ss Store Sk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsStoreSk()
	 * @generated
	 * @ordered
	 */
	protected Store ssStoreSk;

	/**
	 * The default value of the '{@link #getSsPromoSk() <em>Ss Promo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsPromoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long SS_PROMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsPromoSk() <em>Ss Promo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsPromoSk()
	 * @generated
	 * @ordered
	 */
	protected Long ssPromoSk = SS_PROMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsQuantity() <em>Ss Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final Long SS_QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsQuantity() <em>Ss Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsQuantity()
	 * @generated
	 * @ordered
	 */
	protected Long ssQuantity = SS_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsWholesaleCost() <em>Ss Wholesale Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsWholesaleCost()
	 * @generated
	 * @ordered
	 */
	protected static final Double SS_WHOLESALE_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsWholesaleCost() <em>Ss Wholesale Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsWholesaleCost()
	 * @generated
	 * @ordered
	 */
	protected Double ssWholesaleCost = SS_WHOLESALE_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsListPrice() <em>Ss List Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsListPrice()
	 * @generated
	 * @ordered
	 */
	protected static final Double SS_LIST_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsListPrice() <em>Ss List Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsListPrice()
	 * @generated
	 * @ordered
	 */
	protected Double ssListPrice = SS_LIST_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsSalesPrice() <em>Ss Sales Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsSalesPrice()
	 * @generated
	 * @ordered
	 */
	protected static final Double SS_SALES_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsSalesPrice() <em>Ss Sales Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsSalesPrice()
	 * @generated
	 * @ordered
	 */
	protected Double ssSalesPrice = SS_SALES_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsExtDiscountAmt() <em>Ss Ext Discount Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsExtDiscountAmt()
	 * @generated
	 * @ordered
	 */
	protected static final Double SS_EXT_DISCOUNT_AMT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsExtDiscountAmt() <em>Ss Ext Discount Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsExtDiscountAmt()
	 * @generated
	 * @ordered
	 */
	protected Double ssExtDiscountAmt = SS_EXT_DISCOUNT_AMT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsExtSalesPrice() <em>Ss Ext Sales Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsExtSalesPrice()
	 * @generated
	 * @ordered
	 */
	protected static final Double SS_EXT_SALES_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsExtSalesPrice() <em>Ss Ext Sales Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsExtSalesPrice()
	 * @generated
	 * @ordered
	 */
	protected Double ssExtSalesPrice = SS_EXT_SALES_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsExtWholesaleCost() <em>Ss Ext Wholesale Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsExtWholesaleCost()
	 * @generated
	 * @ordered
	 */
	protected static final Double SS_EXT_WHOLESALE_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsExtWholesaleCost() <em>Ss Ext Wholesale Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsExtWholesaleCost()
	 * @generated
	 * @ordered
	 */
	protected Double ssExtWholesaleCost = SS_EXT_WHOLESALE_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsExtListPrice() <em>Ss Ext List Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsExtListPrice()
	 * @generated
	 * @ordered
	 */
	protected static final Double SS_EXT_LIST_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsExtListPrice() <em>Ss Ext List Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsExtListPrice()
	 * @generated
	 * @ordered
	 */
	protected Double ssExtListPrice = SS_EXT_LIST_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsExtTax() <em>Ss Ext Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsExtTax()
	 * @generated
	 * @ordered
	 */
	protected static final Double SS_EXT_TAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsExtTax() <em>Ss Ext Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsExtTax()
	 * @generated
	 * @ordered
	 */
	protected Double ssExtTax = SS_EXT_TAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsCouponAmt() <em>Ss Coupon Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsCouponAmt()
	 * @generated
	 * @ordered
	 */
	protected static final Double SS_COUPON_AMT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsCouponAmt() <em>Ss Coupon Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsCouponAmt()
	 * @generated
	 * @ordered
	 */
	protected Double ssCouponAmt = SS_COUPON_AMT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsNetPaid() <em>Ss Net Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsNetPaid()
	 * @generated
	 * @ordered
	 */
	protected static final Double SS_NET_PAID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsNetPaid() <em>Ss Net Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsNetPaid()
	 * @generated
	 * @ordered
	 */
	protected Double ssNetPaid = SS_NET_PAID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsNetPaidIncTax() <em>Ss Net Paid Inc Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsNetPaidIncTax()
	 * @generated
	 * @ordered
	 */
	protected static final Double SS_NET_PAID_INC_TAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsNetPaidIncTax() <em>Ss Net Paid Inc Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsNetPaidIncTax()
	 * @generated
	 * @ordered
	 */
	protected Double ssNetPaidIncTax = SS_NET_PAID_INC_TAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsNetProfit() <em>Ss Net Profit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsNetProfit()
	 * @generated
	 * @ordered
	 */
	protected static final Double SS_NET_PROFIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsNetProfit() <em>Ss Net Profit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsNetProfit()
	 * @generated
	 * @ordered
	 */
	protected Double ssNetProfit = SS_NET_PROFIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreSalesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpcdsModelPackage.Literals.STORE_SALES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateDim getSsSoldDateSk() {
		if (ssSoldDateSk != null && ssSoldDateSk.eIsProxy()) {
			InternalEObject oldSsSoldDateSk = (InternalEObject)ssSoldDateSk;
			ssSoldDateSk = (DateDim)eResolveProxy(oldSsSoldDateSk);
			if (ssSoldDateSk != oldSsSoldDateSk) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TpcdsModelPackage.STORE_SALES__SS_SOLD_DATE_SK, oldSsSoldDateSk, ssSoldDateSk));
			}
		}
		return ssSoldDateSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateDim basicGetSsSoldDateSk() {
		return ssSoldDateSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsSoldDateSk(DateDim newSsSoldDateSk) {
		DateDim oldSsSoldDateSk = ssSoldDateSk;
		ssSoldDateSk = newSsSoldDateSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_SALES__SS_SOLD_DATE_SK, oldSsSoldDateSk, ssSoldDateSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSsSoldTimeSk() {
		return ssSoldTimeSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsSoldTimeSk(Long newSsSoldTimeSk) {
		Long oldSsSoldTimeSk = ssSoldTimeSk;
		ssSoldTimeSk = newSsSoldTimeSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_SALES__SS_SOLD_TIME_SK, oldSsSoldTimeSk, ssSoldTimeSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSsItemSk() {
		return ssItemSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsItemSk(Long newSsItemSk) {
		Long oldSsItemSk = ssItemSk;
		ssItemSk = newSsItemSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_SALES__SS_ITEM_SK, oldSsItemSk, ssItemSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StoreSalesId getSsId() {
		if (ssId != null && ssId.eIsProxy()) {
			InternalEObject oldSsId = (InternalEObject)ssId;
			ssId = (StoreSalesId)eResolveProxy(oldSsId);
			if (ssId != oldSsId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TpcdsModelPackage.STORE_SALES__SS_ID, oldSsId, ssId));
			}
		}
		return ssId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreSalesId basicGetSsId() {
		return ssId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsId(StoreSalesId newSsId) {
		StoreSalesId oldSsId = ssId;
		ssId = newSsId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_SALES__SS_ID, oldSsId, ssId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Customer getSsCustomerSk() {
		if (ssCustomerSk != null && ssCustomerSk.eIsProxy()) {
			InternalEObject oldSsCustomerSk = (InternalEObject)ssCustomerSk;
			ssCustomerSk = (Customer)eResolveProxy(oldSsCustomerSk);
			if (ssCustomerSk != oldSsCustomerSk) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TpcdsModelPackage.STORE_SALES__SS_CUSTOMER_SK, oldSsCustomerSk, ssCustomerSk));
			}
		}
		return ssCustomerSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetSsCustomerSk() {
		return ssCustomerSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSsCustomerSk(Customer newSsCustomerSk, NotificationChain msgs) {
		Customer oldSsCustomerSk = ssCustomerSk;
		ssCustomerSk = newSsCustomerSk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_SALES__SS_CUSTOMER_SK, oldSsCustomerSk, newSsCustomerSk);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsCustomerSk(Customer newSsCustomerSk) {
		if (newSsCustomerSk != ssCustomerSk) {
			NotificationChain msgs = null;
			if (ssCustomerSk != null)
				msgs = ((InternalEObject)ssCustomerSk).eInverseRemove(this, TpcdsModelPackage.CUSTOMER__STORE_SALES, Customer.class, msgs);
			if (newSsCustomerSk != null)
				msgs = ((InternalEObject)newSsCustomerSk).eInverseAdd(this, TpcdsModelPackage.CUSTOMER__STORE_SALES, Customer.class, msgs);
			msgs = basicSetSsCustomerSk(newSsCustomerSk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_SALES__SS_CUSTOMER_SK, newSsCustomerSk, newSsCustomerSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSsTicketNumber() {
		return ssTicketNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsTicketNumber(Long newSsTicketNumber) {
		Long oldSsTicketNumber = ssTicketNumber;
		ssTicketNumber = newSsTicketNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_SALES__SS_TICKET_NUMBER, oldSsTicketNumber, ssTicketNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSsCdemoSk() {
		return ssCdemoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsCdemoSk(Long newSsCdemoSk) {
		Long oldSsCdemoSk = ssCdemoSk;
		ssCdemoSk = newSsCdemoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_SALES__SS_CDEMO_SK, oldSsCdemoSk, ssCdemoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSsHdemoSk() {
		return ssHdemoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsHdemoSk(Long newSsHdemoSk) {
		Long oldSsHdemoSk = ssHdemoSk;
		ssHdemoSk = newSsHdemoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_SALES__SS_HDEMO_SK, oldSsHdemoSk, ssHdemoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSsAddrSk() {
		return ssAddrSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsAddrSk(Long newSsAddrSk) {
		Long oldSsAddrSk = ssAddrSk;
		ssAddrSk = newSsAddrSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_SALES__SS_ADDR_SK, oldSsAddrSk, ssAddrSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Store getSsStoreSk() {
		if (ssStoreSk != null && ssStoreSk.eIsProxy()) {
			InternalEObject oldSsStoreSk = (InternalEObject)ssStoreSk;
			ssStoreSk = (Store)eResolveProxy(oldSsStoreSk);
			if (ssStoreSk != oldSsStoreSk) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TpcdsModelPackage.STORE_SALES__SS_STORE_SK, oldSsStoreSk, ssStoreSk));
			}
		}
		return ssStoreSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Store basicGetSsStoreSk() {
		return ssStoreSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsStoreSk(Store newSsStoreSk) {
		Store oldSsStoreSk = ssStoreSk;
		ssStoreSk = newSsStoreSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_SALES__SS_STORE_SK, oldSsStoreSk, ssStoreSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSsPromoSk() {
		return ssPromoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsPromoSk(Long newSsPromoSk) {
		Long oldSsPromoSk = ssPromoSk;
		ssPromoSk = newSsPromoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_SALES__SS_PROMO_SK, oldSsPromoSk, ssPromoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSsQuantity() {
		return ssQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsQuantity(Long newSsQuantity) {
		Long oldSsQuantity = ssQuantity;
		ssQuantity = newSsQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_SALES__SS_QUANTITY, oldSsQuantity, ssQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getSsWholesaleCost() {
		return ssWholesaleCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsWholesaleCost(Double newSsWholesaleCost) {
		Double oldSsWholesaleCost = ssWholesaleCost;
		ssWholesaleCost = newSsWholesaleCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_SALES__SS_WHOLESALE_COST, oldSsWholesaleCost, ssWholesaleCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getSsListPrice() {
		return ssListPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsListPrice(Double newSsListPrice) {
		Double oldSsListPrice = ssListPrice;
		ssListPrice = newSsListPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_SALES__SS_LIST_PRICE, oldSsListPrice, ssListPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getSsSalesPrice() {
		return ssSalesPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsSalesPrice(Double newSsSalesPrice) {
		Double oldSsSalesPrice = ssSalesPrice;
		ssSalesPrice = newSsSalesPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_SALES__SS_SALES_PRICE, oldSsSalesPrice, ssSalesPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getSsExtDiscountAmt() {
		return ssExtDiscountAmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsExtDiscountAmt(Double newSsExtDiscountAmt) {
		Double oldSsExtDiscountAmt = ssExtDiscountAmt;
		ssExtDiscountAmt = newSsExtDiscountAmt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_SALES__SS_EXT_DISCOUNT_AMT, oldSsExtDiscountAmt, ssExtDiscountAmt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getSsExtSalesPrice() {
		return ssExtSalesPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsExtSalesPrice(Double newSsExtSalesPrice) {
		Double oldSsExtSalesPrice = ssExtSalesPrice;
		ssExtSalesPrice = newSsExtSalesPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_SALES__SS_EXT_SALES_PRICE, oldSsExtSalesPrice, ssExtSalesPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getSsExtWholesaleCost() {
		return ssExtWholesaleCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsExtWholesaleCost(Double newSsExtWholesaleCost) {
		Double oldSsExtWholesaleCost = ssExtWholesaleCost;
		ssExtWholesaleCost = newSsExtWholesaleCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_SALES__SS_EXT_WHOLESALE_COST, oldSsExtWholesaleCost, ssExtWholesaleCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getSsExtListPrice() {
		return ssExtListPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsExtListPrice(Double newSsExtListPrice) {
		Double oldSsExtListPrice = ssExtListPrice;
		ssExtListPrice = newSsExtListPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_SALES__SS_EXT_LIST_PRICE, oldSsExtListPrice, ssExtListPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getSsExtTax() {
		return ssExtTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsExtTax(Double newSsExtTax) {
		Double oldSsExtTax = ssExtTax;
		ssExtTax = newSsExtTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_SALES__SS_EXT_TAX, oldSsExtTax, ssExtTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getSsCouponAmt() {
		return ssCouponAmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsCouponAmt(Double newSsCouponAmt) {
		Double oldSsCouponAmt = ssCouponAmt;
		ssCouponAmt = newSsCouponAmt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_SALES__SS_COUPON_AMT, oldSsCouponAmt, ssCouponAmt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getSsNetPaid() {
		return ssNetPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsNetPaid(Double newSsNetPaid) {
		Double oldSsNetPaid = ssNetPaid;
		ssNetPaid = newSsNetPaid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_SALES__SS_NET_PAID, oldSsNetPaid, ssNetPaid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getSsNetPaidIncTax() {
		return ssNetPaidIncTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsNetPaidIncTax(Double newSsNetPaidIncTax) {
		Double oldSsNetPaidIncTax = ssNetPaidIncTax;
		ssNetPaidIncTax = newSsNetPaidIncTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_SALES__SS_NET_PAID_INC_TAX, oldSsNetPaidIncTax, ssNetPaidIncTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getSsNetProfit() {
		return ssNetProfit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsNetProfit(Double newSsNetProfit) {
		Double oldSsNetProfit = ssNetProfit;
		ssNetProfit = newSsNetProfit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.STORE_SALES__SS_NET_PROFIT, oldSsNetProfit, ssNetProfit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TpcdsModelPackage.STORE_SALES__SS_CUSTOMER_SK:
				if (ssCustomerSk != null)
					msgs = ((InternalEObject)ssCustomerSk).eInverseRemove(this, TpcdsModelPackage.CUSTOMER__STORE_SALES, Customer.class, msgs);
				return basicSetSsCustomerSk((Customer)otherEnd, msgs);
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
			case TpcdsModelPackage.STORE_SALES__SS_CUSTOMER_SK:
				return basicSetSsCustomerSk(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TpcdsModelPackage.STORE_SALES__SS_SOLD_DATE_SK:
				if (resolve) return getSsSoldDateSk();
				return basicGetSsSoldDateSk();
			case TpcdsModelPackage.STORE_SALES__SS_SOLD_TIME_SK:
				return getSsSoldTimeSk();
			case TpcdsModelPackage.STORE_SALES__SS_ITEM_SK:
				return getSsItemSk();
			case TpcdsModelPackage.STORE_SALES__SS_ID:
				if (resolve) return getSsId();
				return basicGetSsId();
			case TpcdsModelPackage.STORE_SALES__SS_CUSTOMER_SK:
				if (resolve) return getSsCustomerSk();
				return basicGetSsCustomerSk();
			case TpcdsModelPackage.STORE_SALES__SS_TICKET_NUMBER:
				return getSsTicketNumber();
			case TpcdsModelPackage.STORE_SALES__SS_CDEMO_SK:
				return getSsCdemoSk();
			case TpcdsModelPackage.STORE_SALES__SS_HDEMO_SK:
				return getSsHdemoSk();
			case TpcdsModelPackage.STORE_SALES__SS_ADDR_SK:
				return getSsAddrSk();
			case TpcdsModelPackage.STORE_SALES__SS_STORE_SK:
				if (resolve) return getSsStoreSk();
				return basicGetSsStoreSk();
			case TpcdsModelPackage.STORE_SALES__SS_PROMO_SK:
				return getSsPromoSk();
			case TpcdsModelPackage.STORE_SALES__SS_QUANTITY:
				return getSsQuantity();
			case TpcdsModelPackage.STORE_SALES__SS_WHOLESALE_COST:
				return getSsWholesaleCost();
			case TpcdsModelPackage.STORE_SALES__SS_LIST_PRICE:
				return getSsListPrice();
			case TpcdsModelPackage.STORE_SALES__SS_SALES_PRICE:
				return getSsSalesPrice();
			case TpcdsModelPackage.STORE_SALES__SS_EXT_DISCOUNT_AMT:
				return getSsExtDiscountAmt();
			case TpcdsModelPackage.STORE_SALES__SS_EXT_SALES_PRICE:
				return getSsExtSalesPrice();
			case TpcdsModelPackage.STORE_SALES__SS_EXT_WHOLESALE_COST:
				return getSsExtWholesaleCost();
			case TpcdsModelPackage.STORE_SALES__SS_EXT_LIST_PRICE:
				return getSsExtListPrice();
			case TpcdsModelPackage.STORE_SALES__SS_EXT_TAX:
				return getSsExtTax();
			case TpcdsModelPackage.STORE_SALES__SS_COUPON_AMT:
				return getSsCouponAmt();
			case TpcdsModelPackage.STORE_SALES__SS_NET_PAID:
				return getSsNetPaid();
			case TpcdsModelPackage.STORE_SALES__SS_NET_PAID_INC_TAX:
				return getSsNetPaidIncTax();
			case TpcdsModelPackage.STORE_SALES__SS_NET_PROFIT:
				return getSsNetProfit();
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
			case TpcdsModelPackage.STORE_SALES__SS_SOLD_DATE_SK:
				setSsSoldDateSk((DateDim)newValue);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_SOLD_TIME_SK:
				setSsSoldTimeSk((Long)newValue);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_ITEM_SK:
				setSsItemSk((Long)newValue);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_ID:
				setSsId((StoreSalesId)newValue);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_CUSTOMER_SK:
				setSsCustomerSk((Customer)newValue);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_TICKET_NUMBER:
				setSsTicketNumber((Long)newValue);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_CDEMO_SK:
				setSsCdemoSk((Long)newValue);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_HDEMO_SK:
				setSsHdemoSk((Long)newValue);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_ADDR_SK:
				setSsAddrSk((Long)newValue);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_STORE_SK:
				setSsStoreSk((Store)newValue);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_PROMO_SK:
				setSsPromoSk((Long)newValue);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_QUANTITY:
				setSsQuantity((Long)newValue);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_WHOLESALE_COST:
				setSsWholesaleCost((Double)newValue);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_LIST_PRICE:
				setSsListPrice((Double)newValue);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_SALES_PRICE:
				setSsSalesPrice((Double)newValue);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_EXT_DISCOUNT_AMT:
				setSsExtDiscountAmt((Double)newValue);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_EXT_SALES_PRICE:
				setSsExtSalesPrice((Double)newValue);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_EXT_WHOLESALE_COST:
				setSsExtWholesaleCost((Double)newValue);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_EXT_LIST_PRICE:
				setSsExtListPrice((Double)newValue);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_EXT_TAX:
				setSsExtTax((Double)newValue);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_COUPON_AMT:
				setSsCouponAmt((Double)newValue);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_NET_PAID:
				setSsNetPaid((Double)newValue);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_NET_PAID_INC_TAX:
				setSsNetPaidIncTax((Double)newValue);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_NET_PROFIT:
				setSsNetProfit((Double)newValue);
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
			case TpcdsModelPackage.STORE_SALES__SS_SOLD_DATE_SK:
				setSsSoldDateSk((DateDim)null);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_SOLD_TIME_SK:
				setSsSoldTimeSk(SS_SOLD_TIME_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_ITEM_SK:
				setSsItemSk(SS_ITEM_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_ID:
				setSsId((StoreSalesId)null);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_CUSTOMER_SK:
				setSsCustomerSk((Customer)null);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_TICKET_NUMBER:
				setSsTicketNumber(SS_TICKET_NUMBER_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_CDEMO_SK:
				setSsCdemoSk(SS_CDEMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_HDEMO_SK:
				setSsHdemoSk(SS_HDEMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_ADDR_SK:
				setSsAddrSk(SS_ADDR_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_STORE_SK:
				setSsStoreSk((Store)null);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_PROMO_SK:
				setSsPromoSk(SS_PROMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_QUANTITY:
				setSsQuantity(SS_QUANTITY_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_WHOLESALE_COST:
				setSsWholesaleCost(SS_WHOLESALE_COST_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_LIST_PRICE:
				setSsListPrice(SS_LIST_PRICE_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_SALES_PRICE:
				setSsSalesPrice(SS_SALES_PRICE_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_EXT_DISCOUNT_AMT:
				setSsExtDiscountAmt(SS_EXT_DISCOUNT_AMT_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_EXT_SALES_PRICE:
				setSsExtSalesPrice(SS_EXT_SALES_PRICE_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_EXT_WHOLESALE_COST:
				setSsExtWholesaleCost(SS_EXT_WHOLESALE_COST_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_EXT_LIST_PRICE:
				setSsExtListPrice(SS_EXT_LIST_PRICE_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_EXT_TAX:
				setSsExtTax(SS_EXT_TAX_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_COUPON_AMT:
				setSsCouponAmt(SS_COUPON_AMT_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_NET_PAID:
				setSsNetPaid(SS_NET_PAID_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_NET_PAID_INC_TAX:
				setSsNetPaidIncTax(SS_NET_PAID_INC_TAX_EDEFAULT);
				return;
			case TpcdsModelPackage.STORE_SALES__SS_NET_PROFIT:
				setSsNetProfit(SS_NET_PROFIT_EDEFAULT);
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
			case TpcdsModelPackage.STORE_SALES__SS_SOLD_DATE_SK:
				return ssSoldDateSk != null;
			case TpcdsModelPackage.STORE_SALES__SS_SOLD_TIME_SK:
				return SS_SOLD_TIME_SK_EDEFAULT == null ? ssSoldTimeSk != null : !SS_SOLD_TIME_SK_EDEFAULT.equals(ssSoldTimeSk);
			case TpcdsModelPackage.STORE_SALES__SS_ITEM_SK:
				return SS_ITEM_SK_EDEFAULT == null ? ssItemSk != null : !SS_ITEM_SK_EDEFAULT.equals(ssItemSk);
			case TpcdsModelPackage.STORE_SALES__SS_ID:
				return ssId != null;
			case TpcdsModelPackage.STORE_SALES__SS_CUSTOMER_SK:
				return ssCustomerSk != null;
			case TpcdsModelPackage.STORE_SALES__SS_TICKET_NUMBER:
				return SS_TICKET_NUMBER_EDEFAULT == null ? ssTicketNumber != null : !SS_TICKET_NUMBER_EDEFAULT.equals(ssTicketNumber);
			case TpcdsModelPackage.STORE_SALES__SS_CDEMO_SK:
				return SS_CDEMO_SK_EDEFAULT == null ? ssCdemoSk != null : !SS_CDEMO_SK_EDEFAULT.equals(ssCdemoSk);
			case TpcdsModelPackage.STORE_SALES__SS_HDEMO_SK:
				return SS_HDEMO_SK_EDEFAULT == null ? ssHdemoSk != null : !SS_HDEMO_SK_EDEFAULT.equals(ssHdemoSk);
			case TpcdsModelPackage.STORE_SALES__SS_ADDR_SK:
				return SS_ADDR_SK_EDEFAULT == null ? ssAddrSk != null : !SS_ADDR_SK_EDEFAULT.equals(ssAddrSk);
			case TpcdsModelPackage.STORE_SALES__SS_STORE_SK:
				return ssStoreSk != null;
			case TpcdsModelPackage.STORE_SALES__SS_PROMO_SK:
				return SS_PROMO_SK_EDEFAULT == null ? ssPromoSk != null : !SS_PROMO_SK_EDEFAULT.equals(ssPromoSk);
			case TpcdsModelPackage.STORE_SALES__SS_QUANTITY:
				return SS_QUANTITY_EDEFAULT == null ? ssQuantity != null : !SS_QUANTITY_EDEFAULT.equals(ssQuantity);
			case TpcdsModelPackage.STORE_SALES__SS_WHOLESALE_COST:
				return SS_WHOLESALE_COST_EDEFAULT == null ? ssWholesaleCost != null : !SS_WHOLESALE_COST_EDEFAULT.equals(ssWholesaleCost);
			case TpcdsModelPackage.STORE_SALES__SS_LIST_PRICE:
				return SS_LIST_PRICE_EDEFAULT == null ? ssListPrice != null : !SS_LIST_PRICE_EDEFAULT.equals(ssListPrice);
			case TpcdsModelPackage.STORE_SALES__SS_SALES_PRICE:
				return SS_SALES_PRICE_EDEFAULT == null ? ssSalesPrice != null : !SS_SALES_PRICE_EDEFAULT.equals(ssSalesPrice);
			case TpcdsModelPackage.STORE_SALES__SS_EXT_DISCOUNT_AMT:
				return SS_EXT_DISCOUNT_AMT_EDEFAULT == null ? ssExtDiscountAmt != null : !SS_EXT_DISCOUNT_AMT_EDEFAULT.equals(ssExtDiscountAmt);
			case TpcdsModelPackage.STORE_SALES__SS_EXT_SALES_PRICE:
				return SS_EXT_SALES_PRICE_EDEFAULT == null ? ssExtSalesPrice != null : !SS_EXT_SALES_PRICE_EDEFAULT.equals(ssExtSalesPrice);
			case TpcdsModelPackage.STORE_SALES__SS_EXT_WHOLESALE_COST:
				return SS_EXT_WHOLESALE_COST_EDEFAULT == null ? ssExtWholesaleCost != null : !SS_EXT_WHOLESALE_COST_EDEFAULT.equals(ssExtWholesaleCost);
			case TpcdsModelPackage.STORE_SALES__SS_EXT_LIST_PRICE:
				return SS_EXT_LIST_PRICE_EDEFAULT == null ? ssExtListPrice != null : !SS_EXT_LIST_PRICE_EDEFAULT.equals(ssExtListPrice);
			case TpcdsModelPackage.STORE_SALES__SS_EXT_TAX:
				return SS_EXT_TAX_EDEFAULT == null ? ssExtTax != null : !SS_EXT_TAX_EDEFAULT.equals(ssExtTax);
			case TpcdsModelPackage.STORE_SALES__SS_COUPON_AMT:
				return SS_COUPON_AMT_EDEFAULT == null ? ssCouponAmt != null : !SS_COUPON_AMT_EDEFAULT.equals(ssCouponAmt);
			case TpcdsModelPackage.STORE_SALES__SS_NET_PAID:
				return SS_NET_PAID_EDEFAULT == null ? ssNetPaid != null : !SS_NET_PAID_EDEFAULT.equals(ssNetPaid);
			case TpcdsModelPackage.STORE_SALES__SS_NET_PAID_INC_TAX:
				return SS_NET_PAID_INC_TAX_EDEFAULT == null ? ssNetPaidIncTax != null : !SS_NET_PAID_INC_TAX_EDEFAULT.equals(ssNetPaidIncTax);
			case TpcdsModelPackage.STORE_SALES__SS_NET_PROFIT:
				return SS_NET_PROFIT_EDEFAULT == null ? ssNetProfit != null : !SS_NET_PROFIT_EDEFAULT.equals(ssNetProfit);
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
		result.append(" (ssSoldTimeSk: ");
		result.append(ssSoldTimeSk);
		result.append(", ssItemSk: ");
		result.append(ssItemSk);
		result.append(", ssTicketNumber: ");
		result.append(ssTicketNumber);
		result.append(", ssCdemoSk: ");
		result.append(ssCdemoSk);
		result.append(", ssHdemoSk: ");
		result.append(ssHdemoSk);
		result.append(", ssAddrSk: ");
		result.append(ssAddrSk);
		result.append(", ssPromoSk: ");
		result.append(ssPromoSk);
		result.append(", ssQuantity: ");
		result.append(ssQuantity);
		result.append(", ssWholesaleCost: ");
		result.append(ssWholesaleCost);
		result.append(", ssListPrice: ");
		result.append(ssListPrice);
		result.append(", ssSalesPrice: ");
		result.append(ssSalesPrice);
		result.append(", ssExtDiscountAmt: ");
		result.append(ssExtDiscountAmt);
		result.append(", ssExtSalesPrice: ");
		result.append(ssExtSalesPrice);
		result.append(", ssExtWholesaleCost: ");
		result.append(ssExtWholesaleCost);
		result.append(", ssExtListPrice: ");
		result.append(ssExtListPrice);
		result.append(", ssExtTax: ");
		result.append(ssExtTax);
		result.append(", ssCouponAmt: ");
		result.append(ssCouponAmt);
		result.append(", ssNetPaid: ");
		result.append(ssNetPaid);
		result.append(", ssNetPaidIncTax: ");
		result.append(ssNetPaidIncTax);
		result.append(", ssNetProfit: ");
		result.append(ssNetProfit);
		result.append(')');
		return result.toString();
	}

} //StoreSalesImpl
