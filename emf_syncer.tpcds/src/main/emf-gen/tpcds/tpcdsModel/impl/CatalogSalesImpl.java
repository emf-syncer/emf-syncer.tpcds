/**
 */
package tpcds.tpcdsModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpcds.tpcdsModel.CatalogSales;
import tpcds.tpcdsModel.TpcdsModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog Sales</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsSoldDateSk <em>Cs Sold Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsSoldTimeSk <em>Cs Sold Time Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsShipDateSk <em>Cs Ship Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsBillCustomerSk <em>Cs Bill Customer Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsBillCdemoSk <em>Cs Bill Cdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsBillHdemoSk <em>Cs Bill Hdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsBillAddrSk <em>Cs Bill Addr Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsShipCustomerSk <em>Cs Ship Customer Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsShipCdemoSk <em>Cs Ship Cdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsShipHdemoSk <em>Cs Ship Hdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsShipAddrSk <em>Cs Ship Addr Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsCallCenterSk <em>Cs Call Center Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsCatalogPageSk <em>Cs Catalog Page Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsShipModeSk <em>Cs Ship Mode Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsWarehouseSk <em>Cs Warehouse Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsItemSk <em>Cs Item Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsPromoSk <em>Cs Promo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsOrderNumber <em>Cs Order Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsQuantity <em>Cs Quantity</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsWholesaleCost <em>Cs Wholesale Cost</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsListPrice <em>Cs List Price</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsSalesPrice <em>Cs Sales Price</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsExtDiscountAmt <em>Cs Ext Discount Amt</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsExtSalesPrice <em>Cs Ext Sales Price</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsExtWholesaleCost <em>Cs Ext Wholesale Cost</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsExtListPrice <em>Cs Ext List Price</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsExtTax <em>Cs Ext Tax</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsCouponAmt <em>Cs Coupon Amt</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsExtShipCost <em>Cs Ext Ship Cost</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsNetPaid <em>Cs Net Paid</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsNetPaidIncTax <em>Cs Net Paid Inc Tax</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsNetPaidIncShip <em>Cs Net Paid Inc Ship</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsNetPaidIncShipTax <em>Cs Net Paid Inc Ship Tax</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.impl.CatalogSalesImpl#getCsNetProfit <em>Cs Net Profit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatalogSalesImpl extends MinimalEObjectImpl.Container implements CatalogSales {
	/**
	 * The default value of the '{@link #getCsSoldDateSk() <em>Cs Sold Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsSoldDateSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CS_SOLD_DATE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsSoldDateSk() <em>Cs Sold Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsSoldDateSk()
	 * @generated
	 * @ordered
	 */
	protected Long csSoldDateSk = CS_SOLD_DATE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsSoldTimeSk() <em>Cs Sold Time Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsSoldTimeSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CS_SOLD_TIME_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsSoldTimeSk() <em>Cs Sold Time Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsSoldTimeSk()
	 * @generated
	 * @ordered
	 */
	protected Long csSoldTimeSk = CS_SOLD_TIME_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsShipDateSk() <em>Cs Ship Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsShipDateSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CS_SHIP_DATE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsShipDateSk() <em>Cs Ship Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsShipDateSk()
	 * @generated
	 * @ordered
	 */
	protected Long csShipDateSk = CS_SHIP_DATE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsBillCustomerSk() <em>Cs Bill Customer Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsBillCustomerSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CS_BILL_CUSTOMER_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsBillCustomerSk() <em>Cs Bill Customer Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsBillCustomerSk()
	 * @generated
	 * @ordered
	 */
	protected Long csBillCustomerSk = CS_BILL_CUSTOMER_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsBillCdemoSk() <em>Cs Bill Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsBillCdemoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CS_BILL_CDEMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsBillCdemoSk() <em>Cs Bill Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsBillCdemoSk()
	 * @generated
	 * @ordered
	 */
	protected Long csBillCdemoSk = CS_BILL_CDEMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsBillHdemoSk() <em>Cs Bill Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsBillHdemoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CS_BILL_HDEMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsBillHdemoSk() <em>Cs Bill Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsBillHdemoSk()
	 * @generated
	 * @ordered
	 */
	protected Long csBillHdemoSk = CS_BILL_HDEMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsBillAddrSk() <em>Cs Bill Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsBillAddrSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CS_BILL_ADDR_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsBillAddrSk() <em>Cs Bill Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsBillAddrSk()
	 * @generated
	 * @ordered
	 */
	protected Long csBillAddrSk = CS_BILL_ADDR_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsShipCustomerSk() <em>Cs Ship Customer Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsShipCustomerSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CS_SHIP_CUSTOMER_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsShipCustomerSk() <em>Cs Ship Customer Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsShipCustomerSk()
	 * @generated
	 * @ordered
	 */
	protected Long csShipCustomerSk = CS_SHIP_CUSTOMER_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsShipCdemoSk() <em>Cs Ship Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsShipCdemoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CS_SHIP_CDEMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsShipCdemoSk() <em>Cs Ship Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsShipCdemoSk()
	 * @generated
	 * @ordered
	 */
	protected Long csShipCdemoSk = CS_SHIP_CDEMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsShipHdemoSk() <em>Cs Ship Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsShipHdemoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CS_SHIP_HDEMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsShipHdemoSk() <em>Cs Ship Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsShipHdemoSk()
	 * @generated
	 * @ordered
	 */
	protected Long csShipHdemoSk = CS_SHIP_HDEMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsShipAddrSk() <em>Cs Ship Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsShipAddrSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CS_SHIP_ADDR_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsShipAddrSk() <em>Cs Ship Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsShipAddrSk()
	 * @generated
	 * @ordered
	 */
	protected Long csShipAddrSk = CS_SHIP_ADDR_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsCallCenterSk() <em>Cs Call Center Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsCallCenterSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CS_CALL_CENTER_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsCallCenterSk() <em>Cs Call Center Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsCallCenterSk()
	 * @generated
	 * @ordered
	 */
	protected Long csCallCenterSk = CS_CALL_CENTER_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsCatalogPageSk() <em>Cs Catalog Page Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsCatalogPageSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CS_CATALOG_PAGE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsCatalogPageSk() <em>Cs Catalog Page Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsCatalogPageSk()
	 * @generated
	 * @ordered
	 */
	protected Long csCatalogPageSk = CS_CATALOG_PAGE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsShipModeSk() <em>Cs Ship Mode Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsShipModeSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CS_SHIP_MODE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsShipModeSk() <em>Cs Ship Mode Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsShipModeSk()
	 * @generated
	 * @ordered
	 */
	protected Long csShipModeSk = CS_SHIP_MODE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsWarehouseSk() <em>Cs Warehouse Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsWarehouseSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CS_WAREHOUSE_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsWarehouseSk() <em>Cs Warehouse Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsWarehouseSk()
	 * @generated
	 * @ordered
	 */
	protected Long csWarehouseSk = CS_WAREHOUSE_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsItemSk() <em>Cs Item Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsItemSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CS_ITEM_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsItemSk() <em>Cs Item Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsItemSk()
	 * @generated
	 * @ordered
	 */
	protected Long csItemSk = CS_ITEM_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsPromoSk() <em>Cs Promo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsPromoSk()
	 * @generated
	 * @ordered
	 */
	protected static final Long CS_PROMO_SK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsPromoSk() <em>Cs Promo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsPromoSk()
	 * @generated
	 * @ordered
	 */
	protected Long csPromoSk = CS_PROMO_SK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsOrderNumber() <em>Cs Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsOrderNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Long CS_ORDER_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsOrderNumber() <em>Cs Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsOrderNumber()
	 * @generated
	 * @ordered
	 */
	protected Long csOrderNumber = CS_ORDER_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsQuantity() <em>Cs Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final Long CS_QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsQuantity() <em>Cs Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsQuantity()
	 * @generated
	 * @ordered
	 */
	protected Long csQuantity = CS_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsWholesaleCost() <em>Cs Wholesale Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsWholesaleCost()
	 * @generated
	 * @ordered
	 */
	protected static final double CS_WHOLESALE_COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCsWholesaleCost() <em>Cs Wholesale Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsWholesaleCost()
	 * @generated
	 * @ordered
	 */
	protected double csWholesaleCost = CS_WHOLESALE_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsListPrice() <em>Cs List Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsListPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double CS_LIST_PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCsListPrice() <em>Cs List Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsListPrice()
	 * @generated
	 * @ordered
	 */
	protected double csListPrice = CS_LIST_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsSalesPrice() <em>Cs Sales Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsSalesPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double CS_SALES_PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCsSalesPrice() <em>Cs Sales Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsSalesPrice()
	 * @generated
	 * @ordered
	 */
	protected double csSalesPrice = CS_SALES_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsExtDiscountAmt() <em>Cs Ext Discount Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsExtDiscountAmt()
	 * @generated
	 * @ordered
	 */
	protected static final double CS_EXT_DISCOUNT_AMT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCsExtDiscountAmt() <em>Cs Ext Discount Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsExtDiscountAmt()
	 * @generated
	 * @ordered
	 */
	protected double csExtDiscountAmt = CS_EXT_DISCOUNT_AMT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsExtSalesPrice() <em>Cs Ext Sales Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsExtSalesPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double CS_EXT_SALES_PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCsExtSalesPrice() <em>Cs Ext Sales Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsExtSalesPrice()
	 * @generated
	 * @ordered
	 */
	protected double csExtSalesPrice = CS_EXT_SALES_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsExtWholesaleCost() <em>Cs Ext Wholesale Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsExtWholesaleCost()
	 * @generated
	 * @ordered
	 */
	protected static final double CS_EXT_WHOLESALE_COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCsExtWholesaleCost() <em>Cs Ext Wholesale Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsExtWholesaleCost()
	 * @generated
	 * @ordered
	 */
	protected double csExtWholesaleCost = CS_EXT_WHOLESALE_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsExtListPrice() <em>Cs Ext List Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsExtListPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double CS_EXT_LIST_PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCsExtListPrice() <em>Cs Ext List Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsExtListPrice()
	 * @generated
	 * @ordered
	 */
	protected double csExtListPrice = CS_EXT_LIST_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsExtTax() <em>Cs Ext Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsExtTax()
	 * @generated
	 * @ordered
	 */
	protected static final double CS_EXT_TAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCsExtTax() <em>Cs Ext Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsExtTax()
	 * @generated
	 * @ordered
	 */
	protected double csExtTax = CS_EXT_TAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsCouponAmt() <em>Cs Coupon Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsCouponAmt()
	 * @generated
	 * @ordered
	 */
	protected static final double CS_COUPON_AMT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCsCouponAmt() <em>Cs Coupon Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsCouponAmt()
	 * @generated
	 * @ordered
	 */
	protected double csCouponAmt = CS_COUPON_AMT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsExtShipCost() <em>Cs Ext Ship Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsExtShipCost()
	 * @generated
	 * @ordered
	 */
	protected static final double CS_EXT_SHIP_COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCsExtShipCost() <em>Cs Ext Ship Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsExtShipCost()
	 * @generated
	 * @ordered
	 */
	protected double csExtShipCost = CS_EXT_SHIP_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsNetPaid() <em>Cs Net Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsNetPaid()
	 * @generated
	 * @ordered
	 */
	protected static final double CS_NET_PAID_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCsNetPaid() <em>Cs Net Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsNetPaid()
	 * @generated
	 * @ordered
	 */
	protected double csNetPaid = CS_NET_PAID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsNetPaidIncTax() <em>Cs Net Paid Inc Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsNetPaidIncTax()
	 * @generated
	 * @ordered
	 */
	protected static final double CS_NET_PAID_INC_TAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCsNetPaidIncTax() <em>Cs Net Paid Inc Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsNetPaidIncTax()
	 * @generated
	 * @ordered
	 */
	protected double csNetPaidIncTax = CS_NET_PAID_INC_TAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsNetPaidIncShip() <em>Cs Net Paid Inc Ship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsNetPaidIncShip()
	 * @generated
	 * @ordered
	 */
	protected static final double CS_NET_PAID_INC_SHIP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCsNetPaidIncShip() <em>Cs Net Paid Inc Ship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsNetPaidIncShip()
	 * @generated
	 * @ordered
	 */
	protected double csNetPaidIncShip = CS_NET_PAID_INC_SHIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsNetPaidIncShipTax() <em>Cs Net Paid Inc Ship Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsNetPaidIncShipTax()
	 * @generated
	 * @ordered
	 */
	protected static final double CS_NET_PAID_INC_SHIP_TAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCsNetPaidIncShipTax() <em>Cs Net Paid Inc Ship Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsNetPaidIncShipTax()
	 * @generated
	 * @ordered
	 */
	protected double csNetPaidIncShipTax = CS_NET_PAID_INC_SHIP_TAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCsNetProfit() <em>Cs Net Profit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsNetProfit()
	 * @generated
	 * @ordered
	 */
	protected static final double CS_NET_PROFIT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCsNetProfit() <em>Cs Net Profit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsNetProfit()
	 * @generated
	 * @ordered
	 */
	protected double csNetProfit = CS_NET_PROFIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogSalesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpcdsModelPackage.Literals.CATALOG_SALES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCsSoldDateSk() {
		return csSoldDateSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsSoldDateSk(Long newCsSoldDateSk) {
		Long oldCsSoldDateSk = csSoldDateSk;
		csSoldDateSk = newCsSoldDateSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_SOLD_DATE_SK, oldCsSoldDateSk, csSoldDateSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCsSoldTimeSk() {
		return csSoldTimeSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsSoldTimeSk(Long newCsSoldTimeSk) {
		Long oldCsSoldTimeSk = csSoldTimeSk;
		csSoldTimeSk = newCsSoldTimeSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_SOLD_TIME_SK, oldCsSoldTimeSk, csSoldTimeSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCsShipDateSk() {
		return csShipDateSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsShipDateSk(Long newCsShipDateSk) {
		Long oldCsShipDateSk = csShipDateSk;
		csShipDateSk = newCsShipDateSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_SHIP_DATE_SK, oldCsShipDateSk, csShipDateSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCsBillCustomerSk() {
		return csBillCustomerSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsBillCustomerSk(Long newCsBillCustomerSk) {
		Long oldCsBillCustomerSk = csBillCustomerSk;
		csBillCustomerSk = newCsBillCustomerSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_BILL_CUSTOMER_SK, oldCsBillCustomerSk, csBillCustomerSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCsBillCdemoSk() {
		return csBillCdemoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsBillCdemoSk(Long newCsBillCdemoSk) {
		Long oldCsBillCdemoSk = csBillCdemoSk;
		csBillCdemoSk = newCsBillCdemoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_BILL_CDEMO_SK, oldCsBillCdemoSk, csBillCdemoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCsBillHdemoSk() {
		return csBillHdemoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsBillHdemoSk(Long newCsBillHdemoSk) {
		Long oldCsBillHdemoSk = csBillHdemoSk;
		csBillHdemoSk = newCsBillHdemoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_BILL_HDEMO_SK, oldCsBillHdemoSk, csBillHdemoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCsBillAddrSk() {
		return csBillAddrSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsBillAddrSk(Long newCsBillAddrSk) {
		Long oldCsBillAddrSk = csBillAddrSk;
		csBillAddrSk = newCsBillAddrSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_BILL_ADDR_SK, oldCsBillAddrSk, csBillAddrSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCsShipCustomerSk() {
		return csShipCustomerSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsShipCustomerSk(Long newCsShipCustomerSk) {
		Long oldCsShipCustomerSk = csShipCustomerSk;
		csShipCustomerSk = newCsShipCustomerSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_SHIP_CUSTOMER_SK, oldCsShipCustomerSk, csShipCustomerSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCsShipCdemoSk() {
		return csShipCdemoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsShipCdemoSk(Long newCsShipCdemoSk) {
		Long oldCsShipCdemoSk = csShipCdemoSk;
		csShipCdemoSk = newCsShipCdemoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_SHIP_CDEMO_SK, oldCsShipCdemoSk, csShipCdemoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCsShipHdemoSk() {
		return csShipHdemoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsShipHdemoSk(Long newCsShipHdemoSk) {
		Long oldCsShipHdemoSk = csShipHdemoSk;
		csShipHdemoSk = newCsShipHdemoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_SHIP_HDEMO_SK, oldCsShipHdemoSk, csShipHdemoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCsShipAddrSk() {
		return csShipAddrSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsShipAddrSk(Long newCsShipAddrSk) {
		Long oldCsShipAddrSk = csShipAddrSk;
		csShipAddrSk = newCsShipAddrSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_SHIP_ADDR_SK, oldCsShipAddrSk, csShipAddrSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCsCallCenterSk() {
		return csCallCenterSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsCallCenterSk(Long newCsCallCenterSk) {
		Long oldCsCallCenterSk = csCallCenterSk;
		csCallCenterSk = newCsCallCenterSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_CALL_CENTER_SK, oldCsCallCenterSk, csCallCenterSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCsCatalogPageSk() {
		return csCatalogPageSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsCatalogPageSk(Long newCsCatalogPageSk) {
		Long oldCsCatalogPageSk = csCatalogPageSk;
		csCatalogPageSk = newCsCatalogPageSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_CATALOG_PAGE_SK, oldCsCatalogPageSk, csCatalogPageSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCsShipModeSk() {
		return csShipModeSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsShipModeSk(Long newCsShipModeSk) {
		Long oldCsShipModeSk = csShipModeSk;
		csShipModeSk = newCsShipModeSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_SHIP_MODE_SK, oldCsShipModeSk, csShipModeSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCsWarehouseSk() {
		return csWarehouseSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsWarehouseSk(Long newCsWarehouseSk) {
		Long oldCsWarehouseSk = csWarehouseSk;
		csWarehouseSk = newCsWarehouseSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_WAREHOUSE_SK, oldCsWarehouseSk, csWarehouseSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCsItemSk() {
		return csItemSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsItemSk(Long newCsItemSk) {
		Long oldCsItemSk = csItemSk;
		csItemSk = newCsItemSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_ITEM_SK, oldCsItemSk, csItemSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCsPromoSk() {
		return csPromoSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsPromoSk(Long newCsPromoSk) {
		Long oldCsPromoSk = csPromoSk;
		csPromoSk = newCsPromoSk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_PROMO_SK, oldCsPromoSk, csPromoSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCsOrderNumber() {
		return csOrderNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsOrderNumber(Long newCsOrderNumber) {
		Long oldCsOrderNumber = csOrderNumber;
		csOrderNumber = newCsOrderNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_ORDER_NUMBER, oldCsOrderNumber, csOrderNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCsQuantity() {
		return csQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsQuantity(Long newCsQuantity) {
		Long oldCsQuantity = csQuantity;
		csQuantity = newCsQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_QUANTITY, oldCsQuantity, csQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCsWholesaleCost() {
		return csWholesaleCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsWholesaleCost(double newCsWholesaleCost) {
		double oldCsWholesaleCost = csWholesaleCost;
		csWholesaleCost = newCsWholesaleCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_WHOLESALE_COST, oldCsWholesaleCost, csWholesaleCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCsListPrice() {
		return csListPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsListPrice(double newCsListPrice) {
		double oldCsListPrice = csListPrice;
		csListPrice = newCsListPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_LIST_PRICE, oldCsListPrice, csListPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCsSalesPrice() {
		return csSalesPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsSalesPrice(double newCsSalesPrice) {
		double oldCsSalesPrice = csSalesPrice;
		csSalesPrice = newCsSalesPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_SALES_PRICE, oldCsSalesPrice, csSalesPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCsExtDiscountAmt() {
		return csExtDiscountAmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsExtDiscountAmt(double newCsExtDiscountAmt) {
		double oldCsExtDiscountAmt = csExtDiscountAmt;
		csExtDiscountAmt = newCsExtDiscountAmt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_EXT_DISCOUNT_AMT, oldCsExtDiscountAmt, csExtDiscountAmt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCsExtSalesPrice() {
		return csExtSalesPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsExtSalesPrice(double newCsExtSalesPrice) {
		double oldCsExtSalesPrice = csExtSalesPrice;
		csExtSalesPrice = newCsExtSalesPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_EXT_SALES_PRICE, oldCsExtSalesPrice, csExtSalesPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCsExtWholesaleCost() {
		return csExtWholesaleCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsExtWholesaleCost(double newCsExtWholesaleCost) {
		double oldCsExtWholesaleCost = csExtWholesaleCost;
		csExtWholesaleCost = newCsExtWholesaleCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_EXT_WHOLESALE_COST, oldCsExtWholesaleCost, csExtWholesaleCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCsExtListPrice() {
		return csExtListPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsExtListPrice(double newCsExtListPrice) {
		double oldCsExtListPrice = csExtListPrice;
		csExtListPrice = newCsExtListPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_EXT_LIST_PRICE, oldCsExtListPrice, csExtListPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCsExtTax() {
		return csExtTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsExtTax(double newCsExtTax) {
		double oldCsExtTax = csExtTax;
		csExtTax = newCsExtTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_EXT_TAX, oldCsExtTax, csExtTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCsCouponAmt() {
		return csCouponAmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsCouponAmt(double newCsCouponAmt) {
		double oldCsCouponAmt = csCouponAmt;
		csCouponAmt = newCsCouponAmt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_COUPON_AMT, oldCsCouponAmt, csCouponAmt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCsExtShipCost() {
		return csExtShipCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsExtShipCost(double newCsExtShipCost) {
		double oldCsExtShipCost = csExtShipCost;
		csExtShipCost = newCsExtShipCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_EXT_SHIP_COST, oldCsExtShipCost, csExtShipCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCsNetPaid() {
		return csNetPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsNetPaid(double newCsNetPaid) {
		double oldCsNetPaid = csNetPaid;
		csNetPaid = newCsNetPaid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_NET_PAID, oldCsNetPaid, csNetPaid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCsNetPaidIncTax() {
		return csNetPaidIncTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsNetPaidIncTax(double newCsNetPaidIncTax) {
		double oldCsNetPaidIncTax = csNetPaidIncTax;
		csNetPaidIncTax = newCsNetPaidIncTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_NET_PAID_INC_TAX, oldCsNetPaidIncTax, csNetPaidIncTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCsNetPaidIncShip() {
		return csNetPaidIncShip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsNetPaidIncShip(double newCsNetPaidIncShip) {
		double oldCsNetPaidIncShip = csNetPaidIncShip;
		csNetPaidIncShip = newCsNetPaidIncShip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_NET_PAID_INC_SHIP, oldCsNetPaidIncShip, csNetPaidIncShip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCsNetPaidIncShipTax() {
		return csNetPaidIncShipTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsNetPaidIncShipTax(double newCsNetPaidIncShipTax) {
		double oldCsNetPaidIncShipTax = csNetPaidIncShipTax;
		csNetPaidIncShipTax = newCsNetPaidIncShipTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_NET_PAID_INC_SHIP_TAX, oldCsNetPaidIncShipTax, csNetPaidIncShipTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCsNetProfit() {
		return csNetProfit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCsNetProfit(double newCsNetProfit) {
		double oldCsNetProfit = csNetProfit;
		csNetProfit = newCsNetProfit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpcdsModelPackage.CATALOG_SALES__CS_NET_PROFIT, oldCsNetProfit, csNetProfit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TpcdsModelPackage.CATALOG_SALES__CS_SOLD_DATE_SK:
				return getCsSoldDateSk();
			case TpcdsModelPackage.CATALOG_SALES__CS_SOLD_TIME_SK:
				return getCsSoldTimeSk();
			case TpcdsModelPackage.CATALOG_SALES__CS_SHIP_DATE_SK:
				return getCsShipDateSk();
			case TpcdsModelPackage.CATALOG_SALES__CS_BILL_CUSTOMER_SK:
				return getCsBillCustomerSk();
			case TpcdsModelPackage.CATALOG_SALES__CS_BILL_CDEMO_SK:
				return getCsBillCdemoSk();
			case TpcdsModelPackage.CATALOG_SALES__CS_BILL_HDEMO_SK:
				return getCsBillHdemoSk();
			case TpcdsModelPackage.CATALOG_SALES__CS_BILL_ADDR_SK:
				return getCsBillAddrSk();
			case TpcdsModelPackage.CATALOG_SALES__CS_SHIP_CUSTOMER_SK:
				return getCsShipCustomerSk();
			case TpcdsModelPackage.CATALOG_SALES__CS_SHIP_CDEMO_SK:
				return getCsShipCdemoSk();
			case TpcdsModelPackage.CATALOG_SALES__CS_SHIP_HDEMO_SK:
				return getCsShipHdemoSk();
			case TpcdsModelPackage.CATALOG_SALES__CS_SHIP_ADDR_SK:
				return getCsShipAddrSk();
			case TpcdsModelPackage.CATALOG_SALES__CS_CALL_CENTER_SK:
				return getCsCallCenterSk();
			case TpcdsModelPackage.CATALOG_SALES__CS_CATALOG_PAGE_SK:
				return getCsCatalogPageSk();
			case TpcdsModelPackage.CATALOG_SALES__CS_SHIP_MODE_SK:
				return getCsShipModeSk();
			case TpcdsModelPackage.CATALOG_SALES__CS_WAREHOUSE_SK:
				return getCsWarehouseSk();
			case TpcdsModelPackage.CATALOG_SALES__CS_ITEM_SK:
				return getCsItemSk();
			case TpcdsModelPackage.CATALOG_SALES__CS_PROMO_SK:
				return getCsPromoSk();
			case TpcdsModelPackage.CATALOG_SALES__CS_ORDER_NUMBER:
				return getCsOrderNumber();
			case TpcdsModelPackage.CATALOG_SALES__CS_QUANTITY:
				return getCsQuantity();
			case TpcdsModelPackage.CATALOG_SALES__CS_WHOLESALE_COST:
				return getCsWholesaleCost();
			case TpcdsModelPackage.CATALOG_SALES__CS_LIST_PRICE:
				return getCsListPrice();
			case TpcdsModelPackage.CATALOG_SALES__CS_SALES_PRICE:
				return getCsSalesPrice();
			case TpcdsModelPackage.CATALOG_SALES__CS_EXT_DISCOUNT_AMT:
				return getCsExtDiscountAmt();
			case TpcdsModelPackage.CATALOG_SALES__CS_EXT_SALES_PRICE:
				return getCsExtSalesPrice();
			case TpcdsModelPackage.CATALOG_SALES__CS_EXT_WHOLESALE_COST:
				return getCsExtWholesaleCost();
			case TpcdsModelPackage.CATALOG_SALES__CS_EXT_LIST_PRICE:
				return getCsExtListPrice();
			case TpcdsModelPackage.CATALOG_SALES__CS_EXT_TAX:
				return getCsExtTax();
			case TpcdsModelPackage.CATALOG_SALES__CS_COUPON_AMT:
				return getCsCouponAmt();
			case TpcdsModelPackage.CATALOG_SALES__CS_EXT_SHIP_COST:
				return getCsExtShipCost();
			case TpcdsModelPackage.CATALOG_SALES__CS_NET_PAID:
				return getCsNetPaid();
			case TpcdsModelPackage.CATALOG_SALES__CS_NET_PAID_INC_TAX:
				return getCsNetPaidIncTax();
			case TpcdsModelPackage.CATALOG_SALES__CS_NET_PAID_INC_SHIP:
				return getCsNetPaidIncShip();
			case TpcdsModelPackage.CATALOG_SALES__CS_NET_PAID_INC_SHIP_TAX:
				return getCsNetPaidIncShipTax();
			case TpcdsModelPackage.CATALOG_SALES__CS_NET_PROFIT:
				return getCsNetProfit();
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
			case TpcdsModelPackage.CATALOG_SALES__CS_SOLD_DATE_SK:
				setCsSoldDateSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_SOLD_TIME_SK:
				setCsSoldTimeSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_SHIP_DATE_SK:
				setCsShipDateSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_BILL_CUSTOMER_SK:
				setCsBillCustomerSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_BILL_CDEMO_SK:
				setCsBillCdemoSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_BILL_HDEMO_SK:
				setCsBillHdemoSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_BILL_ADDR_SK:
				setCsBillAddrSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_SHIP_CUSTOMER_SK:
				setCsShipCustomerSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_SHIP_CDEMO_SK:
				setCsShipCdemoSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_SHIP_HDEMO_SK:
				setCsShipHdemoSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_SHIP_ADDR_SK:
				setCsShipAddrSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_CALL_CENTER_SK:
				setCsCallCenterSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_CATALOG_PAGE_SK:
				setCsCatalogPageSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_SHIP_MODE_SK:
				setCsShipModeSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_WAREHOUSE_SK:
				setCsWarehouseSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_ITEM_SK:
				setCsItemSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_PROMO_SK:
				setCsPromoSk((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_ORDER_NUMBER:
				setCsOrderNumber((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_QUANTITY:
				setCsQuantity((Long)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_WHOLESALE_COST:
				setCsWholesaleCost((Double)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_LIST_PRICE:
				setCsListPrice((Double)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_SALES_PRICE:
				setCsSalesPrice((Double)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_EXT_DISCOUNT_AMT:
				setCsExtDiscountAmt((Double)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_EXT_SALES_PRICE:
				setCsExtSalesPrice((Double)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_EXT_WHOLESALE_COST:
				setCsExtWholesaleCost((Double)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_EXT_LIST_PRICE:
				setCsExtListPrice((Double)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_EXT_TAX:
				setCsExtTax((Double)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_COUPON_AMT:
				setCsCouponAmt((Double)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_EXT_SHIP_COST:
				setCsExtShipCost((Double)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_NET_PAID:
				setCsNetPaid((Double)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_NET_PAID_INC_TAX:
				setCsNetPaidIncTax((Double)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_NET_PAID_INC_SHIP:
				setCsNetPaidIncShip((Double)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_NET_PAID_INC_SHIP_TAX:
				setCsNetPaidIncShipTax((Double)newValue);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_NET_PROFIT:
				setCsNetProfit((Double)newValue);
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
			case TpcdsModelPackage.CATALOG_SALES__CS_SOLD_DATE_SK:
				setCsSoldDateSk(CS_SOLD_DATE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_SOLD_TIME_SK:
				setCsSoldTimeSk(CS_SOLD_TIME_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_SHIP_DATE_SK:
				setCsShipDateSk(CS_SHIP_DATE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_BILL_CUSTOMER_SK:
				setCsBillCustomerSk(CS_BILL_CUSTOMER_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_BILL_CDEMO_SK:
				setCsBillCdemoSk(CS_BILL_CDEMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_BILL_HDEMO_SK:
				setCsBillHdemoSk(CS_BILL_HDEMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_BILL_ADDR_SK:
				setCsBillAddrSk(CS_BILL_ADDR_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_SHIP_CUSTOMER_SK:
				setCsShipCustomerSk(CS_SHIP_CUSTOMER_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_SHIP_CDEMO_SK:
				setCsShipCdemoSk(CS_SHIP_CDEMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_SHIP_HDEMO_SK:
				setCsShipHdemoSk(CS_SHIP_HDEMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_SHIP_ADDR_SK:
				setCsShipAddrSk(CS_SHIP_ADDR_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_CALL_CENTER_SK:
				setCsCallCenterSk(CS_CALL_CENTER_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_CATALOG_PAGE_SK:
				setCsCatalogPageSk(CS_CATALOG_PAGE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_SHIP_MODE_SK:
				setCsShipModeSk(CS_SHIP_MODE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_WAREHOUSE_SK:
				setCsWarehouseSk(CS_WAREHOUSE_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_ITEM_SK:
				setCsItemSk(CS_ITEM_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_PROMO_SK:
				setCsPromoSk(CS_PROMO_SK_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_ORDER_NUMBER:
				setCsOrderNumber(CS_ORDER_NUMBER_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_QUANTITY:
				setCsQuantity(CS_QUANTITY_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_WHOLESALE_COST:
				setCsWholesaleCost(CS_WHOLESALE_COST_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_LIST_PRICE:
				setCsListPrice(CS_LIST_PRICE_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_SALES_PRICE:
				setCsSalesPrice(CS_SALES_PRICE_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_EXT_DISCOUNT_AMT:
				setCsExtDiscountAmt(CS_EXT_DISCOUNT_AMT_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_EXT_SALES_PRICE:
				setCsExtSalesPrice(CS_EXT_SALES_PRICE_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_EXT_WHOLESALE_COST:
				setCsExtWholesaleCost(CS_EXT_WHOLESALE_COST_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_EXT_LIST_PRICE:
				setCsExtListPrice(CS_EXT_LIST_PRICE_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_EXT_TAX:
				setCsExtTax(CS_EXT_TAX_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_COUPON_AMT:
				setCsCouponAmt(CS_COUPON_AMT_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_EXT_SHIP_COST:
				setCsExtShipCost(CS_EXT_SHIP_COST_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_NET_PAID:
				setCsNetPaid(CS_NET_PAID_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_NET_PAID_INC_TAX:
				setCsNetPaidIncTax(CS_NET_PAID_INC_TAX_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_NET_PAID_INC_SHIP:
				setCsNetPaidIncShip(CS_NET_PAID_INC_SHIP_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_NET_PAID_INC_SHIP_TAX:
				setCsNetPaidIncShipTax(CS_NET_PAID_INC_SHIP_TAX_EDEFAULT);
				return;
			case TpcdsModelPackage.CATALOG_SALES__CS_NET_PROFIT:
				setCsNetProfit(CS_NET_PROFIT_EDEFAULT);
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
			case TpcdsModelPackage.CATALOG_SALES__CS_SOLD_DATE_SK:
				return CS_SOLD_DATE_SK_EDEFAULT == null ? csSoldDateSk != null : !CS_SOLD_DATE_SK_EDEFAULT.equals(csSoldDateSk);
			case TpcdsModelPackage.CATALOG_SALES__CS_SOLD_TIME_SK:
				return CS_SOLD_TIME_SK_EDEFAULT == null ? csSoldTimeSk != null : !CS_SOLD_TIME_SK_EDEFAULT.equals(csSoldTimeSk);
			case TpcdsModelPackage.CATALOG_SALES__CS_SHIP_DATE_SK:
				return CS_SHIP_DATE_SK_EDEFAULT == null ? csShipDateSk != null : !CS_SHIP_DATE_SK_EDEFAULT.equals(csShipDateSk);
			case TpcdsModelPackage.CATALOG_SALES__CS_BILL_CUSTOMER_SK:
				return CS_BILL_CUSTOMER_SK_EDEFAULT == null ? csBillCustomerSk != null : !CS_BILL_CUSTOMER_SK_EDEFAULT.equals(csBillCustomerSk);
			case TpcdsModelPackage.CATALOG_SALES__CS_BILL_CDEMO_SK:
				return CS_BILL_CDEMO_SK_EDEFAULT == null ? csBillCdemoSk != null : !CS_BILL_CDEMO_SK_EDEFAULT.equals(csBillCdemoSk);
			case TpcdsModelPackage.CATALOG_SALES__CS_BILL_HDEMO_SK:
				return CS_BILL_HDEMO_SK_EDEFAULT == null ? csBillHdemoSk != null : !CS_BILL_HDEMO_SK_EDEFAULT.equals(csBillHdemoSk);
			case TpcdsModelPackage.CATALOG_SALES__CS_BILL_ADDR_SK:
				return CS_BILL_ADDR_SK_EDEFAULT == null ? csBillAddrSk != null : !CS_BILL_ADDR_SK_EDEFAULT.equals(csBillAddrSk);
			case TpcdsModelPackage.CATALOG_SALES__CS_SHIP_CUSTOMER_SK:
				return CS_SHIP_CUSTOMER_SK_EDEFAULT == null ? csShipCustomerSk != null : !CS_SHIP_CUSTOMER_SK_EDEFAULT.equals(csShipCustomerSk);
			case TpcdsModelPackage.CATALOG_SALES__CS_SHIP_CDEMO_SK:
				return CS_SHIP_CDEMO_SK_EDEFAULT == null ? csShipCdemoSk != null : !CS_SHIP_CDEMO_SK_EDEFAULT.equals(csShipCdemoSk);
			case TpcdsModelPackage.CATALOG_SALES__CS_SHIP_HDEMO_SK:
				return CS_SHIP_HDEMO_SK_EDEFAULT == null ? csShipHdemoSk != null : !CS_SHIP_HDEMO_SK_EDEFAULT.equals(csShipHdemoSk);
			case TpcdsModelPackage.CATALOG_SALES__CS_SHIP_ADDR_SK:
				return CS_SHIP_ADDR_SK_EDEFAULT == null ? csShipAddrSk != null : !CS_SHIP_ADDR_SK_EDEFAULT.equals(csShipAddrSk);
			case TpcdsModelPackage.CATALOG_SALES__CS_CALL_CENTER_SK:
				return CS_CALL_CENTER_SK_EDEFAULT == null ? csCallCenterSk != null : !CS_CALL_CENTER_SK_EDEFAULT.equals(csCallCenterSk);
			case TpcdsModelPackage.CATALOG_SALES__CS_CATALOG_PAGE_SK:
				return CS_CATALOG_PAGE_SK_EDEFAULT == null ? csCatalogPageSk != null : !CS_CATALOG_PAGE_SK_EDEFAULT.equals(csCatalogPageSk);
			case TpcdsModelPackage.CATALOG_SALES__CS_SHIP_MODE_SK:
				return CS_SHIP_MODE_SK_EDEFAULT == null ? csShipModeSk != null : !CS_SHIP_MODE_SK_EDEFAULT.equals(csShipModeSk);
			case TpcdsModelPackage.CATALOG_SALES__CS_WAREHOUSE_SK:
				return CS_WAREHOUSE_SK_EDEFAULT == null ? csWarehouseSk != null : !CS_WAREHOUSE_SK_EDEFAULT.equals(csWarehouseSk);
			case TpcdsModelPackage.CATALOG_SALES__CS_ITEM_SK:
				return CS_ITEM_SK_EDEFAULT == null ? csItemSk != null : !CS_ITEM_SK_EDEFAULT.equals(csItemSk);
			case TpcdsModelPackage.CATALOG_SALES__CS_PROMO_SK:
				return CS_PROMO_SK_EDEFAULT == null ? csPromoSk != null : !CS_PROMO_SK_EDEFAULT.equals(csPromoSk);
			case TpcdsModelPackage.CATALOG_SALES__CS_ORDER_NUMBER:
				return CS_ORDER_NUMBER_EDEFAULT == null ? csOrderNumber != null : !CS_ORDER_NUMBER_EDEFAULT.equals(csOrderNumber);
			case TpcdsModelPackage.CATALOG_SALES__CS_QUANTITY:
				return CS_QUANTITY_EDEFAULT == null ? csQuantity != null : !CS_QUANTITY_EDEFAULT.equals(csQuantity);
			case TpcdsModelPackage.CATALOG_SALES__CS_WHOLESALE_COST:
				return csWholesaleCost != CS_WHOLESALE_COST_EDEFAULT;
			case TpcdsModelPackage.CATALOG_SALES__CS_LIST_PRICE:
				return csListPrice != CS_LIST_PRICE_EDEFAULT;
			case TpcdsModelPackage.CATALOG_SALES__CS_SALES_PRICE:
				return csSalesPrice != CS_SALES_PRICE_EDEFAULT;
			case TpcdsModelPackage.CATALOG_SALES__CS_EXT_DISCOUNT_AMT:
				return csExtDiscountAmt != CS_EXT_DISCOUNT_AMT_EDEFAULT;
			case TpcdsModelPackage.CATALOG_SALES__CS_EXT_SALES_PRICE:
				return csExtSalesPrice != CS_EXT_SALES_PRICE_EDEFAULT;
			case TpcdsModelPackage.CATALOG_SALES__CS_EXT_WHOLESALE_COST:
				return csExtWholesaleCost != CS_EXT_WHOLESALE_COST_EDEFAULT;
			case TpcdsModelPackage.CATALOG_SALES__CS_EXT_LIST_PRICE:
				return csExtListPrice != CS_EXT_LIST_PRICE_EDEFAULT;
			case TpcdsModelPackage.CATALOG_SALES__CS_EXT_TAX:
				return csExtTax != CS_EXT_TAX_EDEFAULT;
			case TpcdsModelPackage.CATALOG_SALES__CS_COUPON_AMT:
				return csCouponAmt != CS_COUPON_AMT_EDEFAULT;
			case TpcdsModelPackage.CATALOG_SALES__CS_EXT_SHIP_COST:
				return csExtShipCost != CS_EXT_SHIP_COST_EDEFAULT;
			case TpcdsModelPackage.CATALOG_SALES__CS_NET_PAID:
				return csNetPaid != CS_NET_PAID_EDEFAULT;
			case TpcdsModelPackage.CATALOG_SALES__CS_NET_PAID_INC_TAX:
				return csNetPaidIncTax != CS_NET_PAID_INC_TAX_EDEFAULT;
			case TpcdsModelPackage.CATALOG_SALES__CS_NET_PAID_INC_SHIP:
				return csNetPaidIncShip != CS_NET_PAID_INC_SHIP_EDEFAULT;
			case TpcdsModelPackage.CATALOG_SALES__CS_NET_PAID_INC_SHIP_TAX:
				return csNetPaidIncShipTax != CS_NET_PAID_INC_SHIP_TAX_EDEFAULT;
			case TpcdsModelPackage.CATALOG_SALES__CS_NET_PROFIT:
				return csNetProfit != CS_NET_PROFIT_EDEFAULT;
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
		result.append(" (csSoldDateSk: ");
		result.append(csSoldDateSk);
		result.append(", csSoldTimeSk: ");
		result.append(csSoldTimeSk);
		result.append(", csShipDateSk: ");
		result.append(csShipDateSk);
		result.append(", csBillCustomerSk: ");
		result.append(csBillCustomerSk);
		result.append(", csBillCdemoSk: ");
		result.append(csBillCdemoSk);
		result.append(", csBillHdemoSk: ");
		result.append(csBillHdemoSk);
		result.append(", csBillAddrSk: ");
		result.append(csBillAddrSk);
		result.append(", csShipCustomerSk: ");
		result.append(csShipCustomerSk);
		result.append(", csShipCdemoSk: ");
		result.append(csShipCdemoSk);
		result.append(", csShipHdemoSk: ");
		result.append(csShipHdemoSk);
		result.append(", csShipAddrSk: ");
		result.append(csShipAddrSk);
		result.append(", csCallCenterSk: ");
		result.append(csCallCenterSk);
		result.append(", csCatalogPageSk: ");
		result.append(csCatalogPageSk);
		result.append(", csShipModeSk: ");
		result.append(csShipModeSk);
		result.append(", csWarehouseSk: ");
		result.append(csWarehouseSk);
		result.append(", csItemSk: ");
		result.append(csItemSk);
		result.append(", csPromoSk: ");
		result.append(csPromoSk);
		result.append(", csOrderNumber: ");
		result.append(csOrderNumber);
		result.append(", csQuantity: ");
		result.append(csQuantity);
		result.append(", csWholesaleCost: ");
		result.append(csWholesaleCost);
		result.append(", csListPrice: ");
		result.append(csListPrice);
		result.append(", csSalesPrice: ");
		result.append(csSalesPrice);
		result.append(", csExtDiscountAmt: ");
		result.append(csExtDiscountAmt);
		result.append(", csExtSalesPrice: ");
		result.append(csExtSalesPrice);
		result.append(", csExtWholesaleCost: ");
		result.append(csExtWholesaleCost);
		result.append(", csExtListPrice: ");
		result.append(csExtListPrice);
		result.append(", csExtTax: ");
		result.append(csExtTax);
		result.append(", csCouponAmt: ");
		result.append(csCouponAmt);
		result.append(", csExtShipCost: ");
		result.append(csExtShipCost);
		result.append(", csNetPaid: ");
		result.append(csNetPaid);
		result.append(", csNetPaidIncTax: ");
		result.append(csNetPaidIncTax);
		result.append(", csNetPaidIncShip: ");
		result.append(csNetPaidIncShip);
		result.append(", csNetPaidIncShipTax: ");
		result.append(csNetPaidIncShipTax);
		result.append(", csNetProfit: ");
		result.append(csNetProfit);
		result.append(')');
		return result.toString();
	}

} //CatalogSalesImpl
