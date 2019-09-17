/**
 */
package tpcds.tpcdsModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpcds.tpcdsModel.TpcdsModelPackage;
import tpcds.tpcdsModel.WebSales;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Sales</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsSoldDateSk <em>Ws Sold Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsSoldTimeSk <em>Ws Sold Time Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsShipDateSk <em>Ws Ship Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsItemSk <em>Ws Item Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsBillCustomerSk <em>Ws Bill Customer Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsBillCdemoSk <em>Ws Bill Cdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsBillHdemoSk <em>Ws Bill Hdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsBillAddrSk <em>Ws Bill Addr Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsShipCustomerSk <em>Ws Ship Customer Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsShipCdemoSk <em>Ws Ship Cdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsShipHdemoSk <em>Ws Ship Hdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsShipAddrSk <em>Ws Ship Addr Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsWebPageSk <em>Ws Web Page Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsWebSiteSk <em>Ws Web Site Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsShipModeSk <em>Ws Ship Mode Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsWarehouseSk <em>Ws Warehouse Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsPromoSk <em>Ws Promo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsOrderNumber <em>Ws Order Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsQuantity <em>Ws Quantity</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsWholesaleCost <em>Ws Wholesale Cost</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsListPrice <em>Ws List Price</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsSalesPrice <em>Ws Sales Price</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsExtDiscountAmt <em>Ws Ext Discount Amt</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsExtSalesPrice <em>Ws Ext Sales Price</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsExtWholesaleCost <em>Ws Ext Wholesale Cost</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsExtListPrice <em>Ws Ext List Price</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsExtTax <em>Ws Ext Tax</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsCouponAmt <em>Ws Coupon Amt</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsExtShipCost <em>Ws Ext Ship Cost</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsNetPaid <em>Ws Net Paid</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsNetPaidIncTax <em>Ws Net Paid Inc Tax</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsNetPaidIncShip <em>Ws Net Paid Inc Ship</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsNetPaidIncShipTax <em>Ws Net Paid Inc Ship Tax</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.WebSalesImpl#getWsNetProfit <em>Ws Net Profit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebSalesImpl extends MinimalEObjectImpl.Container implements WebSales {
	/**
	 * The default value of the '{@link #getWsSoldDateSk() <em>Ws Sold Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsSoldDateSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WS_SOLD_DATE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsSoldDateSk() <em>Ws Sold Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsSoldDateSk()
	 * @generated
	 * @ordered
	 */
	protected Long wsSoldDateSk = WS_SOLD_DATE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsSoldTimeSk() <em>Ws Sold Time Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsSoldTimeSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WS_SOLD_TIME_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsSoldTimeSk() <em>Ws Sold Time Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsSoldTimeSk()
	 * @generated
	 * @ordered
	 */
	protected Long wsSoldTimeSk = WS_SOLD_TIME_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsShipDateSk() <em>Ws Ship Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsShipDateSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WS_SHIP_DATE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsShipDateSk() <em>Ws Ship Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsShipDateSk()
	 * @generated
	 * @ordered
	 */
	protected Long wsShipDateSk = WS_SHIP_DATE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsItemSk() <em>Ws Item Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsItemSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WS_ITEM_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsItemSk() <em>Ws Item Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsItemSk()
	 * @generated
	 * @ordered
	 */
	protected Long wsItemSk = WS_ITEM_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsBillCustomerSk() <em>Ws Bill Customer Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsBillCustomerSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WS_BILL_CUSTOMER_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsBillCustomerSk() <em>Ws Bill Customer Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsBillCustomerSk()
	 * @generated
	 * @ordered
	 */
	protected Long wsBillCustomerSk = WS_BILL_CUSTOMER_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsBillCdemoSk() <em>Ws Bill Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsBillCdemoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WS_BILL_CDEMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsBillCdemoSk() <em>Ws Bill Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsBillCdemoSk()
	 * @generated
	 * @ordered
	 */
	protected Long wsBillCdemoSk = WS_BILL_CDEMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsBillHdemoSk() <em>Ws Bill Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsBillHdemoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WS_BILL_HDEMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsBillHdemoSk() <em>Ws Bill Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsBillHdemoSk()
	 * @generated
	 * @ordered
	 */
	protected Long wsBillHdemoSk = WS_BILL_HDEMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsBillAddrSk() <em>Ws Bill Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsBillAddrSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WS_BILL_ADDR_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsBillAddrSk() <em>Ws Bill Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsBillAddrSk()
	 * @generated
	 * @ordered
	 */
	protected Long wsBillAddrSk = WS_BILL_ADDR_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsShipCustomerSk() <em>Ws Ship Customer Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsShipCustomerSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WS_SHIP_CUSTOMER_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsShipCustomerSk() <em>Ws Ship Customer Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsShipCustomerSk()
	 * @generated
	 * @ordered
	 */
	protected Long wsShipCustomerSk = WS_SHIP_CUSTOMER_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsShipCdemoSk() <em>Ws Ship Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsShipCdemoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WS_SHIP_CDEMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsShipCdemoSk() <em>Ws Ship Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsShipCdemoSk()
	 * @generated
	 * @ordered
	 */
	protected Long wsShipCdemoSk = WS_SHIP_CDEMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsShipHdemoSk() <em>Ws Ship Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsShipHdemoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WS_SHIP_HDEMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsShipHdemoSk() <em>Ws Ship Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsShipHdemoSk()
	 * @generated
	 * @ordered
	 */
	protected Long wsShipHdemoSk = WS_SHIP_HDEMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsShipAddrSk() <em>Ws Ship Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsShipAddrSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WS_SHIP_ADDR_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsShipAddrSk() <em>Ws Ship Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsShipAddrSk()
	 * @generated
	 * @ordered
	 */
	protected Long wsShipAddrSk = WS_SHIP_ADDR_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsWebPageSk() <em>Ws Web Page Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsWebPageSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WS_WEB_PAGE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsWebPageSk() <em>Ws Web Page Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsWebPageSk()
	 * @generated
	 * @ordered
	 */
	protected Long wsWebPageSk = WS_WEB_PAGE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsWebSiteSk() <em>Ws Web Site Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsWebSiteSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WS_WEB_SITE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsWebSiteSk() <em>Ws Web Site Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsWebSiteSk()
	 * @generated
	 * @ordered
	 */
	protected Long wsWebSiteSk = WS_WEB_SITE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsShipModeSk() <em>Ws Ship Mode Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsShipModeSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WS_SHIP_MODE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsShipModeSk() <em>Ws Ship Mode Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsShipModeSk()
	 * @generated
	 * @ordered
	 */
	protected Long wsShipModeSk = WS_SHIP_MODE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsWarehouseSk() <em>Ws Warehouse Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsWarehouseSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WS_WAREHOUSE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsWarehouseSk() <em>Ws Warehouse Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsWarehouseSk()
	 * @generated
	 * @ordered
	 */
	protected Long wsWarehouseSk = WS_WAREHOUSE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsPromoSk() <em>Ws Promo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsPromoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long WS_PROMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsPromoSk() <em>Ws Promo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsPromoSk()
	 * @generated
	 * @ordered
	 */
	protected Long wsPromoSk = WS_PROMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsOrderNumber() <em>Ws Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsOrderNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Long WS_ORDER_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsOrderNumber() <em>Ws Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsOrderNumber()
	 * @generated
	 * @ordered
	 */
	protected Long wsOrderNumber = WS_ORDER_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsQuantity() <em>Ws Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final Long WS_QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsQuantity() <em>Ws Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsQuantity()
	 * @generated
	 * @ordered
	 */
	protected Long wsQuantity = WS_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsWholesaleCost() <em>Ws Wholesale Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsWholesaleCost()
	 * @generated
	 * @ordered
	 */
	protected static final double WS_WHOLESALE_COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWsWholesaleCost() <em>Ws Wholesale Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsWholesaleCost()
	 * @generated
	 * @ordered
	 */
	protected double wsWholesaleCost = WS_WHOLESALE_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsListPrice() <em>Ws List Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsListPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double WS_LIST_PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWsListPrice() <em>Ws List Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsListPrice()
	 * @generated
	 * @ordered
	 */
	protected double wsListPrice = WS_LIST_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsSalesPrice() <em>Ws Sales Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsSalesPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double WS_SALES_PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWsSalesPrice() <em>Ws Sales Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsSalesPrice()
	 * @generated
	 * @ordered
	 */
	protected double wsSalesPrice = WS_SALES_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsExtDiscountAmt() <em>Ws Ext Discount Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsExtDiscountAmt()
	 * @generated
	 * @ordered
	 */
	protected static final double WS_EXT_DISCOUNT_AMT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWsExtDiscountAmt() <em>Ws Ext Discount Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsExtDiscountAmt()
	 * @generated
	 * @ordered
	 */
	protected double wsExtDiscountAmt = WS_EXT_DISCOUNT_AMT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsExtSalesPrice() <em>Ws Ext Sales Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsExtSalesPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double WS_EXT_SALES_PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWsExtSalesPrice() <em>Ws Ext Sales Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsExtSalesPrice()
	 * @generated
	 * @ordered
	 */
	protected double wsExtSalesPrice = WS_EXT_SALES_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsExtWholesaleCost() <em>Ws Ext Wholesale Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsExtWholesaleCost()
	 * @generated
	 * @ordered
	 */
	protected static final double WS_EXT_WHOLESALE_COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWsExtWholesaleCost() <em>Ws Ext Wholesale Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsExtWholesaleCost()
	 * @generated
	 * @ordered
	 */
	protected double wsExtWholesaleCost = WS_EXT_WHOLESALE_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsExtListPrice() <em>Ws Ext List Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsExtListPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double WS_EXT_LIST_PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWsExtListPrice() <em>Ws Ext List Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsExtListPrice()
	 * @generated
	 * @ordered
	 */
	protected double wsExtListPrice = WS_EXT_LIST_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsExtTax() <em>Ws Ext Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsExtTax()
	 * @generated
	 * @ordered
	 */
	protected static final double WS_EXT_TAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWsExtTax() <em>Ws Ext Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsExtTax()
	 * @generated
	 * @ordered
	 */
	protected double wsExtTax = WS_EXT_TAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsCouponAmt() <em>Ws Coupon Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsCouponAmt()
	 * @generated
	 * @ordered
	 */
	protected static final double WS_COUPON_AMT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWsCouponAmt() <em>Ws Coupon Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsCouponAmt()
	 * @generated
	 * @ordered
	 */
	protected double wsCouponAmt = WS_COUPON_AMT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsExtShipCost() <em>Ws Ext Ship Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsExtShipCost()
	 * @generated
	 * @ordered
	 */
	protected static final double WS_EXT_SHIP_COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWsExtShipCost() <em>Ws Ext Ship Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsExtShipCost()
	 * @generated
	 * @ordered
	 */
	protected double wsExtShipCost = WS_EXT_SHIP_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsNetPaid() <em>Ws Net Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsNetPaid()
	 * @generated
	 * @ordered
	 */
	protected static final double WS_NET_PAID_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWsNetPaid() <em>Ws Net Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsNetPaid()
	 * @generated
	 * @ordered
	 */
	protected double wsNetPaid = WS_NET_PAID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsNetPaidIncTax() <em>Ws Net Paid Inc Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsNetPaidIncTax()
	 * @generated
	 * @ordered
	 */
	protected static final double WS_NET_PAID_INC_TAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWsNetPaidIncTax() <em>Ws Net Paid Inc Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsNetPaidIncTax()
	 * @generated
	 * @ordered
	 */
	protected double wsNetPaidIncTax = WS_NET_PAID_INC_TAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsNetPaidIncShip() <em>Ws Net Paid Inc Ship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsNetPaidIncShip()
	 * @generated
	 * @ordered
	 */
	protected static final double WS_NET_PAID_INC_SHIP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWsNetPaidIncShip() <em>Ws Net Paid Inc Ship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsNetPaidIncShip()
	 * @generated
	 * @ordered
	 */
	protected double wsNetPaidIncShip = WS_NET_PAID_INC_SHIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsNetPaidIncShipTax() <em>Ws Net Paid Inc Ship Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsNetPaidIncShipTax()
	 * @generated
	 * @ordered
	 */
	protected static final double WS_NET_PAID_INC_SHIP_TAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWsNetPaidIncShipTax() <em>Ws Net Paid Inc Ship Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsNetPaidIncShipTax()
	 * @generated
	 * @ordered
	 */
	protected double wsNetPaidIncShipTax = WS_NET_PAID_INC_SHIP_TAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsNetProfit() <em>Ws Net Profit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsNetProfit()
	 * @generated
	 * @ordered
	 */
	protected static final double WS_NET_PROFIT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWsNetProfit() <em>Ws Net Profit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsNetProfit()
	 * @generated
	 * @ordered
	 */
	protected double wsNetProfit = WS_NET_PROFIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebSalesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpcdsModelPackage.Literals.WEB_SALES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWsSoldDateSk() {
		return wsSoldDateSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsSoldDateSk(Long newWsSoldDateSk) {
		Long oldWsSoldDateSk = wsSoldDateSk;
		wsSoldDateSk = newWsSoldDateSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_SOLD_DATE_SK, oldWsSoldDateSk, wsSoldDateSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWsSoldTimeSk() {
		return wsSoldTimeSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsSoldTimeSk(Long newWsSoldTimeSk) {
		Long oldWsSoldTimeSk = wsSoldTimeSk;
		wsSoldTimeSk = newWsSoldTimeSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_SOLD_TIME_SK, oldWsSoldTimeSk, wsSoldTimeSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWsShipDateSk() {
		return wsShipDateSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsShipDateSk(Long newWsShipDateSk) {
		Long oldWsShipDateSk = wsShipDateSk;
		wsShipDateSk = newWsShipDateSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_SHIP_DATE_SK, oldWsShipDateSk, wsShipDateSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWsItemSk() {
		return wsItemSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsItemSk(Long newWsItemSk) {
		Long oldWsItemSk = wsItemSk;
		wsItemSk = newWsItemSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_ITEM_SK, oldWsItemSk, wsItemSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWsBillCustomerSk() {
		return wsBillCustomerSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsBillCustomerSk(Long newWsBillCustomerSk) {
		Long oldWsBillCustomerSk = wsBillCustomerSk;
		wsBillCustomerSk = newWsBillCustomerSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_BILL_CUSTOMER_SK, oldWsBillCustomerSk, wsBillCustomerSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWsBillCdemoSk() {
		return wsBillCdemoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsBillCdemoSk(Long newWsBillCdemoSk) {
		Long oldWsBillCdemoSk = wsBillCdemoSk;
		wsBillCdemoSk = newWsBillCdemoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_BILL_CDEMO_SK, oldWsBillCdemoSk, wsBillCdemoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWsBillHdemoSk() {
		return wsBillHdemoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsBillHdemoSk(Long newWsBillHdemoSk) {
		Long oldWsBillHdemoSk = wsBillHdemoSk;
		wsBillHdemoSk = newWsBillHdemoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_BILL_HDEMO_SK, oldWsBillHdemoSk, wsBillHdemoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWsBillAddrSk() {
		return wsBillAddrSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsBillAddrSk(Long newWsBillAddrSk) {
		Long oldWsBillAddrSk = wsBillAddrSk;
		wsBillAddrSk = newWsBillAddrSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_BILL_ADDR_SK, oldWsBillAddrSk, wsBillAddrSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWsShipCustomerSk() {
		return wsShipCustomerSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsShipCustomerSk(Long newWsShipCustomerSk) {
		Long oldWsShipCustomerSk = wsShipCustomerSk;
		wsShipCustomerSk = newWsShipCustomerSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_SHIP_CUSTOMER_SK, oldWsShipCustomerSk, wsShipCustomerSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWsShipCdemoSk() {
		return wsShipCdemoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsShipCdemoSk(Long newWsShipCdemoSk) {
		Long oldWsShipCdemoSk = wsShipCdemoSk;
		wsShipCdemoSk = newWsShipCdemoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_SHIP_CDEMO_SK, oldWsShipCdemoSk, wsShipCdemoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWsShipHdemoSk() {
		return wsShipHdemoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsShipHdemoSk(Long newWsShipHdemoSk) {
		Long oldWsShipHdemoSk = wsShipHdemoSk;
		wsShipHdemoSk = newWsShipHdemoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_SHIP_HDEMO_SK, oldWsShipHdemoSk, wsShipHdemoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWsShipAddrSk() {
		return wsShipAddrSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsShipAddrSk(Long newWsShipAddrSk) {
		Long oldWsShipAddrSk = wsShipAddrSk;
		wsShipAddrSk = newWsShipAddrSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_SHIP_ADDR_SK, oldWsShipAddrSk, wsShipAddrSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWsWebPageSk() {
		return wsWebPageSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsWebPageSk(Long newWsWebPageSk) {
		Long oldWsWebPageSk = wsWebPageSk;
		wsWebPageSk = newWsWebPageSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_WEB_PAGE_SK, oldWsWebPageSk, wsWebPageSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWsWebSiteSk() {
		return wsWebSiteSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsWebSiteSk(Long newWsWebSiteSk) {
		Long oldWsWebSiteSk = wsWebSiteSk;
		wsWebSiteSk = newWsWebSiteSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_WEB_SITE_SK, oldWsWebSiteSk, wsWebSiteSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWsShipModeSk() {
		return wsShipModeSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsShipModeSk(Long newWsShipModeSk) {
		Long oldWsShipModeSk = wsShipModeSk;
		wsShipModeSk = newWsShipModeSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_SHIP_MODE_SK, oldWsShipModeSk, wsShipModeSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWsWarehouseSk() {
		return wsWarehouseSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsWarehouseSk(Long newWsWarehouseSk) {
		Long oldWsWarehouseSk = wsWarehouseSk;
		wsWarehouseSk = newWsWarehouseSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_WAREHOUSE_SK, oldWsWarehouseSk, wsWarehouseSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWsPromoSk() {
		return wsPromoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsPromoSk(Long newWsPromoSk) {
		Long oldWsPromoSk = wsPromoSk;
		wsPromoSk = newWsPromoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_PROMO_SK, oldWsPromoSk, wsPromoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWsOrderNumber() {
		return wsOrderNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsOrderNumber(Long newWsOrderNumber) {
		Long oldWsOrderNumber = wsOrderNumber;
		wsOrderNumber = newWsOrderNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_ORDER_NUMBER, oldWsOrderNumber, wsOrderNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWsQuantity() {
		return wsQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsQuantity(Long newWsQuantity) {
		Long oldWsQuantity = wsQuantity;
		wsQuantity = newWsQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_QUANTITY, oldWsQuantity, wsQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWsWholesaleCost() {
		return wsWholesaleCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsWholesaleCost(double newWsWholesaleCost) {
		double oldWsWholesaleCost = wsWholesaleCost;
		wsWholesaleCost = newWsWholesaleCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_WHOLESALE_COST, oldWsWholesaleCost, wsWholesaleCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWsListPrice() {
		return wsListPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsListPrice(double newWsListPrice) {
		double oldWsListPrice = wsListPrice;
		wsListPrice = newWsListPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_LIST_PRICE, oldWsListPrice, wsListPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWsSalesPrice() {
		return wsSalesPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsSalesPrice(double newWsSalesPrice) {
		double oldWsSalesPrice = wsSalesPrice;
		wsSalesPrice = newWsSalesPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_SALES_PRICE, oldWsSalesPrice, wsSalesPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWsExtDiscountAmt() {
		return wsExtDiscountAmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsExtDiscountAmt(double newWsExtDiscountAmt) {
		double oldWsExtDiscountAmt = wsExtDiscountAmt;
		wsExtDiscountAmt = newWsExtDiscountAmt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_EXT_DISCOUNT_AMT, oldWsExtDiscountAmt, wsExtDiscountAmt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWsExtSalesPrice() {
		return wsExtSalesPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsExtSalesPrice(double newWsExtSalesPrice) {
		double oldWsExtSalesPrice = wsExtSalesPrice;
		wsExtSalesPrice = newWsExtSalesPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_EXT_SALES_PRICE, oldWsExtSalesPrice, wsExtSalesPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWsExtWholesaleCost() {
		return wsExtWholesaleCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsExtWholesaleCost(double newWsExtWholesaleCost) {
		double oldWsExtWholesaleCost = wsExtWholesaleCost;
		wsExtWholesaleCost = newWsExtWholesaleCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_EXT_WHOLESALE_COST, oldWsExtWholesaleCost, wsExtWholesaleCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWsExtListPrice() {
		return wsExtListPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsExtListPrice(double newWsExtListPrice) {
		double oldWsExtListPrice = wsExtListPrice;
		wsExtListPrice = newWsExtListPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_EXT_LIST_PRICE, oldWsExtListPrice, wsExtListPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWsExtTax() {
		return wsExtTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsExtTax(double newWsExtTax) {
		double oldWsExtTax = wsExtTax;
		wsExtTax = newWsExtTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_EXT_TAX, oldWsExtTax, wsExtTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWsCouponAmt() {
		return wsCouponAmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsCouponAmt(double newWsCouponAmt) {
		double oldWsCouponAmt = wsCouponAmt;
		wsCouponAmt = newWsCouponAmt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_COUPON_AMT, oldWsCouponAmt, wsCouponAmt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWsExtShipCost() {
		return wsExtShipCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsExtShipCost(double newWsExtShipCost) {
		double oldWsExtShipCost = wsExtShipCost;
		wsExtShipCost = newWsExtShipCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_EXT_SHIP_COST, oldWsExtShipCost, wsExtShipCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWsNetPaid() {
		return wsNetPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsNetPaid(double newWsNetPaid) {
		double oldWsNetPaid = wsNetPaid;
		wsNetPaid = newWsNetPaid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_NET_PAID, oldWsNetPaid, wsNetPaid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWsNetPaidIncTax() {
		return wsNetPaidIncTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsNetPaidIncTax(double newWsNetPaidIncTax) {
		double oldWsNetPaidIncTax = wsNetPaidIncTax;
		wsNetPaidIncTax = newWsNetPaidIncTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_NET_PAID_INC_TAX, oldWsNetPaidIncTax, wsNetPaidIncTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWsNetPaidIncShip() {
		return wsNetPaidIncShip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsNetPaidIncShip(double newWsNetPaidIncShip) {
		double oldWsNetPaidIncShip = wsNetPaidIncShip;
		wsNetPaidIncShip = newWsNetPaidIncShip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_NET_PAID_INC_SHIP, oldWsNetPaidIncShip, wsNetPaidIncShip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWsNetPaidIncShipTax() {
		return wsNetPaidIncShipTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsNetPaidIncShipTax(double newWsNetPaidIncShipTax) {
		double oldWsNetPaidIncShipTax = wsNetPaidIncShipTax;
		wsNetPaidIncShipTax = newWsNetPaidIncShipTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_NET_PAID_INC_SHIP_TAX, oldWsNetPaidIncShipTax, wsNetPaidIncShipTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWsNetProfit() {
		return wsNetProfit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWsNetProfit(double newWsNetProfit) {
		double oldWsNetProfit = wsNetProfit;
		wsNetProfit = newWsNetProfit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.WEB_SALES__WS_NET_PROFIT, oldWsNetProfit, wsNetProfit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TpcdsModelPackage.WEB_SALES__WS_SOLD_DATE_SK:
				return getWsSoldDateSk();
			case TpcdsModelPackage.WEB_SALES__WS_SOLD_TIME_SK:
				return getWsSoldTimeSk();
			case TpcdsModelPackage.WEB_SALES__WS_SHIP_DATE_SK:
				return getWsShipDateSk();
			case TpcdsModelPackage.WEB_SALES__WS_ITEM_SK:
				return getWsItemSk();
			case TpcdsModelPackage.WEB_SALES__WS_BILL_CUSTOMER_SK:
				return getWsBillCustomerSk();
			case TpcdsModelPackage.WEB_SALES__WS_BILL_CDEMO_SK:
				return getWsBillCdemoSk();
			case TpcdsModelPackage.WEB_SALES__WS_BILL_HDEMO_SK:
				return getWsBillHdemoSk();
			case TpcdsModelPackage.WEB_SALES__WS_BILL_ADDR_SK:
				return getWsBillAddrSk();
			case TpcdsModelPackage.WEB_SALES__WS_SHIP_CUSTOMER_SK:
				return getWsShipCustomerSk();
			case TpcdsModelPackage.WEB_SALES__WS_SHIP_CDEMO_SK:
				return getWsShipCdemoSk();
			case TpcdsModelPackage.WEB_SALES__WS_SHIP_HDEMO_SK:
				return getWsShipHdemoSk();
			case TpcdsModelPackage.WEB_SALES__WS_SHIP_ADDR_SK:
				return getWsShipAddrSk();
			case TpcdsModelPackage.WEB_SALES__WS_WEB_PAGE_SK:
				return getWsWebPageSk();
			case TpcdsModelPackage.WEB_SALES__WS_WEB_SITE_SK:
				return getWsWebSiteSk();
			case TpcdsModelPackage.WEB_SALES__WS_SHIP_MODE_SK:
				return getWsShipModeSk();
			case TpcdsModelPackage.WEB_SALES__WS_WAREHOUSE_SK:
				return getWsWarehouseSk();
			case TpcdsModelPackage.WEB_SALES__WS_PROMO_SK:
				return getWsPromoSk();
			case TpcdsModelPackage.WEB_SALES__WS_ORDER_NUMBER:
				return getWsOrderNumber();
			case TpcdsModelPackage.WEB_SALES__WS_QUANTITY:
				return getWsQuantity();
			case TpcdsModelPackage.WEB_SALES__WS_WHOLESALE_COST:
				return getWsWholesaleCost();
			case TpcdsModelPackage.WEB_SALES__WS_LIST_PRICE:
				return getWsListPrice();
			case TpcdsModelPackage.WEB_SALES__WS_SALES_PRICE:
				return getWsSalesPrice();
			case TpcdsModelPackage.WEB_SALES__WS_EXT_DISCOUNT_AMT:
				return getWsExtDiscountAmt();
			case TpcdsModelPackage.WEB_SALES__WS_EXT_SALES_PRICE:
				return getWsExtSalesPrice();
			case TpcdsModelPackage.WEB_SALES__WS_EXT_WHOLESALE_COST:
				return getWsExtWholesaleCost();
			case TpcdsModelPackage.WEB_SALES__WS_EXT_LIST_PRICE:
				return getWsExtListPrice();
			case TpcdsModelPackage.WEB_SALES__WS_EXT_TAX:
				return getWsExtTax();
			case TpcdsModelPackage.WEB_SALES__WS_COUPON_AMT:
				return getWsCouponAmt();
			case TpcdsModelPackage.WEB_SALES__WS_EXT_SHIP_COST:
				return getWsExtShipCost();
			case TpcdsModelPackage.WEB_SALES__WS_NET_PAID:
				return getWsNetPaid();
			case TpcdsModelPackage.WEB_SALES__WS_NET_PAID_INC_TAX:
				return getWsNetPaidIncTax();
			case TpcdsModelPackage.WEB_SALES__WS_NET_PAID_INC_SHIP:
				return getWsNetPaidIncShip();
			case TpcdsModelPackage.WEB_SALES__WS_NET_PAID_INC_SHIP_TAX:
				return getWsNetPaidIncShipTax();
			case TpcdsModelPackage.WEB_SALES__WS_NET_PROFIT:
				return getWsNetProfit();
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
			case TpcdsModelPackage.WEB_SALES__WS_SOLD_DATE_SK:
				setWsSoldDateSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_SOLD_TIME_SK:
				setWsSoldTimeSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_SHIP_DATE_SK:
				setWsShipDateSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_ITEM_SK:
				setWsItemSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_BILL_CUSTOMER_SK:
				setWsBillCustomerSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_BILL_CDEMO_SK:
				setWsBillCdemoSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_BILL_HDEMO_SK:
				setWsBillHdemoSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_BILL_ADDR_SK:
				setWsBillAddrSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_SHIP_CUSTOMER_SK:
				setWsShipCustomerSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_SHIP_CDEMO_SK:
				setWsShipCdemoSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_SHIP_HDEMO_SK:
				setWsShipHdemoSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_SHIP_ADDR_SK:
				setWsShipAddrSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_WEB_PAGE_SK:
				setWsWebPageSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_WEB_SITE_SK:
				setWsWebSiteSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_SHIP_MODE_SK:
				setWsShipModeSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_WAREHOUSE_SK:
				setWsWarehouseSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_PROMO_SK:
				setWsPromoSk((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_ORDER_NUMBER:
				setWsOrderNumber((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_QUANTITY:
				setWsQuantity((Long)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_WHOLESALE_COST:
				setWsWholesaleCost((Double)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_LIST_PRICE:
				setWsListPrice((Double)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_SALES_PRICE:
				setWsSalesPrice((Double)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_EXT_DISCOUNT_AMT:
				setWsExtDiscountAmt((Double)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_EXT_SALES_PRICE:
				setWsExtSalesPrice((Double)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_EXT_WHOLESALE_COST:
				setWsExtWholesaleCost((Double)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_EXT_LIST_PRICE:
				setWsExtListPrice((Double)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_EXT_TAX:
				setWsExtTax((Double)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_COUPON_AMT:
				setWsCouponAmt((Double)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_EXT_SHIP_COST:
				setWsExtShipCost((Double)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_NET_PAID:
				setWsNetPaid((Double)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_NET_PAID_INC_TAX:
				setWsNetPaidIncTax((Double)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_NET_PAID_INC_SHIP:
				setWsNetPaidIncShip((Double)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_NET_PAID_INC_SHIP_TAX:
				setWsNetPaidIncShipTax((Double)newValue);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_NET_PROFIT:
				setWsNetProfit((Double)newValue);
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
			case TpcdsModelPackage.WEB_SALES__WS_SOLD_DATE_SK:
				setWsSoldDateSk(WS_SOLD_DATE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_SOLD_TIME_SK:
				setWsSoldTimeSk(WS_SOLD_TIME_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_SHIP_DATE_SK:
				setWsShipDateSk(WS_SHIP_DATE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_ITEM_SK:
				setWsItemSk(WS_ITEM_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_BILL_CUSTOMER_SK:
				setWsBillCustomerSk(WS_BILL_CUSTOMER_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_BILL_CDEMO_SK:
				setWsBillCdemoSk(WS_BILL_CDEMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_BILL_HDEMO_SK:
				setWsBillHdemoSk(WS_BILL_HDEMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_BILL_ADDR_SK:
				setWsBillAddrSk(WS_BILL_ADDR_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_SHIP_CUSTOMER_SK:
				setWsShipCustomerSk(WS_SHIP_CUSTOMER_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_SHIP_CDEMO_SK:
				setWsShipCdemoSk(WS_SHIP_CDEMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_SHIP_HDEMO_SK:
				setWsShipHdemoSk(WS_SHIP_HDEMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_SHIP_ADDR_SK:
				setWsShipAddrSk(WS_SHIP_ADDR_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_WEB_PAGE_SK:
				setWsWebPageSk(WS_WEB_PAGE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_WEB_SITE_SK:
				setWsWebSiteSk(WS_WEB_SITE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_SHIP_MODE_SK:
				setWsShipModeSk(WS_SHIP_MODE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_WAREHOUSE_SK:
				setWsWarehouseSk(WS_WAREHOUSE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_PROMO_SK:
				setWsPromoSk(WS_PROMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_ORDER_NUMBER:
				setWsOrderNumber(WS_ORDER_NUMBER_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_QUANTITY:
				setWsQuantity(WS_QUANTITY_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_WHOLESALE_COST:
				setWsWholesaleCost(WS_WHOLESALE_COST_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_LIST_PRICE:
				setWsListPrice(WS_LIST_PRICE_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_SALES_PRICE:
				setWsSalesPrice(WS_SALES_PRICE_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_EXT_DISCOUNT_AMT:
				setWsExtDiscountAmt(WS_EXT_DISCOUNT_AMT_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_EXT_SALES_PRICE:
				setWsExtSalesPrice(WS_EXT_SALES_PRICE_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_EXT_WHOLESALE_COST:
				setWsExtWholesaleCost(WS_EXT_WHOLESALE_COST_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_EXT_LIST_PRICE:
				setWsExtListPrice(WS_EXT_LIST_PRICE_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_EXT_TAX:
				setWsExtTax(WS_EXT_TAX_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_COUPON_AMT:
				setWsCouponAmt(WS_COUPON_AMT_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_EXT_SHIP_COST:
				setWsExtShipCost(WS_EXT_SHIP_COST_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_NET_PAID:
				setWsNetPaid(WS_NET_PAID_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_NET_PAID_INC_TAX:
				setWsNetPaidIncTax(WS_NET_PAID_INC_TAX_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_NET_PAID_INC_SHIP:
				setWsNetPaidIncShip(WS_NET_PAID_INC_SHIP_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_NET_PAID_INC_SHIP_TAX:
				setWsNetPaidIncShipTax(WS_NET_PAID_INC_SHIP_TAX_EDEFAULT);
				return;
			case TpcdsModelPackage.WEB_SALES__WS_NET_PROFIT:
				setWsNetProfit(WS_NET_PROFIT_EDEFAULT);
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
			case TpcdsModelPackage.WEB_SALES__WS_SOLD_DATE_SK:
				return WS_SOLD_DATE_SK_EDEFAULT == null ? wsSoldDateSk != null : !WS_SOLD_DATE_SK_EDEFAULT.equals(wsSoldDateSk);
			case TpcdsModelPackage.WEB_SALES__WS_SOLD_TIME_SK:
				return WS_SOLD_TIME_SK_EDEFAULT == null ? wsSoldTimeSk != null : !WS_SOLD_TIME_SK_EDEFAULT.equals(wsSoldTimeSk);
			case TpcdsModelPackage.WEB_SALES__WS_SHIP_DATE_SK:
				return WS_SHIP_DATE_SK_EDEFAULT == null ? wsShipDateSk != null : !WS_SHIP_DATE_SK_EDEFAULT.equals(wsShipDateSk);
			case TpcdsModelPackage.WEB_SALES__WS_ITEM_SK:
				return WS_ITEM_SK_EDEFAULT == null ? wsItemSk != null : !WS_ITEM_SK_EDEFAULT.equals(wsItemSk);
			case TpcdsModelPackage.WEB_SALES__WS_BILL_CUSTOMER_SK:
				return WS_BILL_CUSTOMER_SK_EDEFAULT == null ? wsBillCustomerSk != null : !WS_BILL_CUSTOMER_SK_EDEFAULT.equals(wsBillCustomerSk);
			case TpcdsModelPackage.WEB_SALES__WS_BILL_CDEMO_SK:
				return WS_BILL_CDEMO_SK_EDEFAULT == null ? wsBillCdemoSk != null : !WS_BILL_CDEMO_SK_EDEFAULT.equals(wsBillCdemoSk);
			case TpcdsModelPackage.WEB_SALES__WS_BILL_HDEMO_SK:
				return WS_BILL_HDEMO_SK_EDEFAULT == null ? wsBillHdemoSk != null : !WS_BILL_HDEMO_SK_EDEFAULT.equals(wsBillHdemoSk);
			case TpcdsModelPackage.WEB_SALES__WS_BILL_ADDR_SK:
				return WS_BILL_ADDR_SK_EDEFAULT == null ? wsBillAddrSk != null : !WS_BILL_ADDR_SK_EDEFAULT.equals(wsBillAddrSk);
			case TpcdsModelPackage.WEB_SALES__WS_SHIP_CUSTOMER_SK:
				return WS_SHIP_CUSTOMER_SK_EDEFAULT == null ? wsShipCustomerSk != null : !WS_SHIP_CUSTOMER_SK_EDEFAULT.equals(wsShipCustomerSk);
			case TpcdsModelPackage.WEB_SALES__WS_SHIP_CDEMO_SK:
				return WS_SHIP_CDEMO_SK_EDEFAULT == null ? wsShipCdemoSk != null : !WS_SHIP_CDEMO_SK_EDEFAULT.equals(wsShipCdemoSk);
			case TpcdsModelPackage.WEB_SALES__WS_SHIP_HDEMO_SK:
				return WS_SHIP_HDEMO_SK_EDEFAULT == null ? wsShipHdemoSk != null : !WS_SHIP_HDEMO_SK_EDEFAULT.equals(wsShipHdemoSk);
			case TpcdsModelPackage.WEB_SALES__WS_SHIP_ADDR_SK:
				return WS_SHIP_ADDR_SK_EDEFAULT == null ? wsShipAddrSk != null : !WS_SHIP_ADDR_SK_EDEFAULT.equals(wsShipAddrSk);
			case TpcdsModelPackage.WEB_SALES__WS_WEB_PAGE_SK:
				return WS_WEB_PAGE_SK_EDEFAULT == null ? wsWebPageSk != null : !WS_WEB_PAGE_SK_EDEFAULT.equals(wsWebPageSk);
			case TpcdsModelPackage.WEB_SALES__WS_WEB_SITE_SK:
				return WS_WEB_SITE_SK_EDEFAULT == null ? wsWebSiteSk != null : !WS_WEB_SITE_SK_EDEFAULT.equals(wsWebSiteSk);
			case TpcdsModelPackage.WEB_SALES__WS_SHIP_MODE_SK:
				return WS_SHIP_MODE_SK_EDEFAULT == null ? wsShipModeSk != null : !WS_SHIP_MODE_SK_EDEFAULT.equals(wsShipModeSk);
			case TpcdsModelPackage.WEB_SALES__WS_WAREHOUSE_SK:
				return WS_WAREHOUSE_SK_EDEFAULT == null ? wsWarehouseSk != null : !WS_WAREHOUSE_SK_EDEFAULT.equals(wsWarehouseSk);
			case TpcdsModelPackage.WEB_SALES__WS_PROMO_SK:
				return WS_PROMO_SK_EDEFAULT == null ? wsPromoSk != null : !WS_PROMO_SK_EDEFAULT.equals(wsPromoSk);
			case TpcdsModelPackage.WEB_SALES__WS_ORDER_NUMBER:
				return WS_ORDER_NUMBER_EDEFAULT == null ? wsOrderNumber != null : !WS_ORDER_NUMBER_EDEFAULT.equals(wsOrderNumber);
			case TpcdsModelPackage.WEB_SALES__WS_QUANTITY:
				return WS_QUANTITY_EDEFAULT == null ? wsQuantity != null : !WS_QUANTITY_EDEFAULT.equals(wsQuantity);
			case TpcdsModelPackage.WEB_SALES__WS_WHOLESALE_COST:
				return wsWholesaleCost != WS_WHOLESALE_COST_EDEFAULT;
			case TpcdsModelPackage.WEB_SALES__WS_LIST_PRICE:
				return wsListPrice != WS_LIST_PRICE_EDEFAULT;
			case TpcdsModelPackage.WEB_SALES__WS_SALES_PRICE:
				return wsSalesPrice != WS_SALES_PRICE_EDEFAULT;
			case TpcdsModelPackage.WEB_SALES__WS_EXT_DISCOUNT_AMT:
				return wsExtDiscountAmt != WS_EXT_DISCOUNT_AMT_EDEFAULT;
			case TpcdsModelPackage.WEB_SALES__WS_EXT_SALES_PRICE:
				return wsExtSalesPrice != WS_EXT_SALES_PRICE_EDEFAULT;
			case TpcdsModelPackage.WEB_SALES__WS_EXT_WHOLESALE_COST:
				return wsExtWholesaleCost != WS_EXT_WHOLESALE_COST_EDEFAULT;
			case TpcdsModelPackage.WEB_SALES__WS_EXT_LIST_PRICE:
				return wsExtListPrice != WS_EXT_LIST_PRICE_EDEFAULT;
			case TpcdsModelPackage.WEB_SALES__WS_EXT_TAX:
				return wsExtTax != WS_EXT_TAX_EDEFAULT;
			case TpcdsModelPackage.WEB_SALES__WS_COUPON_AMT:
				return wsCouponAmt != WS_COUPON_AMT_EDEFAULT;
			case TpcdsModelPackage.WEB_SALES__WS_EXT_SHIP_COST:
				return wsExtShipCost != WS_EXT_SHIP_COST_EDEFAULT;
			case TpcdsModelPackage.WEB_SALES__WS_NET_PAID:
				return wsNetPaid != WS_NET_PAID_EDEFAULT;
			case TpcdsModelPackage.WEB_SALES__WS_NET_PAID_INC_TAX:
				return wsNetPaidIncTax != WS_NET_PAID_INC_TAX_EDEFAULT;
			case TpcdsModelPackage.WEB_SALES__WS_NET_PAID_INC_SHIP:
				return wsNetPaidIncShip != WS_NET_PAID_INC_SHIP_EDEFAULT;
			case TpcdsModelPackage.WEB_SALES__WS_NET_PAID_INC_SHIP_TAX:
				return wsNetPaidIncShipTax != WS_NET_PAID_INC_SHIP_TAX_EDEFAULT;
			case TpcdsModelPackage.WEB_SALES__WS_NET_PROFIT:
				return wsNetProfit != WS_NET_PROFIT_EDEFAULT;
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
		result.append(" (wsSoldDateSk: ");
		result.append(wsSoldDateSk);
		result.append(", wsSoldTimeSk: ");
		result.append(wsSoldTimeSk);
		result.append(", wsShipDateSk: ");
		result.append(wsShipDateSk);
		result.append(", wsItemSk: ");
		result.append(wsItemSk);
		result.append(", wsBillCustomerSk: ");
		result.append(wsBillCustomerSk);
		result.append(", wsBillCdemoSk: ");
		result.append(wsBillCdemoSk);
		result.append(", wsBillHdemoSk: ");
		result.append(wsBillHdemoSk);
		result.append(", wsBillAddrSk: ");
		result.append(wsBillAddrSk);
		result.append(", wsShipCustomerSk: ");
		result.append(wsShipCustomerSk);
		result.append(", wsShipCdemoSk: ");
		result.append(wsShipCdemoSk);
		result.append(", wsShipHdemoSk: ");
		result.append(wsShipHdemoSk);
		result.append(", wsShipAddrSk: ");
		result.append(wsShipAddrSk);
		result.append(", wsWebPageSk: ");
		result.append(wsWebPageSk);
		result.append(", wsWebSiteSk: ");
		result.append(wsWebSiteSk);
		result.append(", wsShipModeSk: ");
		result.append(wsShipModeSk);
		result.append(", wsWarehouseSk: ");
		result.append(wsWarehouseSk);
		result.append(", wsPromoSk: ");
		result.append(wsPromoSk);
		result.append(", wsOrderNumber: ");
		result.append(wsOrderNumber);
		result.append(", wsQuantity: ");
		result.append(wsQuantity);
		result.append(", wsWholesaleCost: ");
		result.append(wsWholesaleCost);
		result.append(", wsListPrice: ");
		result.append(wsListPrice);
		result.append(", wsSalesPrice: ");
		result.append(wsSalesPrice);
		result.append(", wsExtDiscountAmt: ");
		result.append(wsExtDiscountAmt);
		result.append(", wsExtSalesPrice: ");
		result.append(wsExtSalesPrice);
		result.append(", wsExtWholesaleCost: ");
		result.append(wsExtWholesaleCost);
		result.append(", wsExtListPrice: ");
		result.append(wsExtListPrice);
		result.append(", wsExtTax: ");
		result.append(wsExtTax);
		result.append(", wsCouponAmt: ");
		result.append(wsCouponAmt);
		result.append(", wsExtShipCost: ");
		result.append(wsExtShipCost);
		result.append(", wsNetPaid: ");
		result.append(wsNetPaid);
		result.append(", wsNetPaidIncTax: ");
		result.append(wsNetPaidIncTax);
		result.append(", wsNetPaidIncShip: ");
		result.append(wsNetPaidIncShip);
		result.append(", wsNetPaidIncShipTax: ");
		result.append(wsNetPaidIncShipTax);
		result.append(", wsNetProfit: ");
		result.append(wsNetProfit);
		result.append(')');
		return result.toString();
	}

} //WebSalesImpl
