/**
 */
package tpcds.tpcdsModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Sales</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsSoldDateSk <em>Cs Sold Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsSoldTimeSk <em>Cs Sold Time Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsShipDateSk <em>Cs Ship Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsBillCustomerSk <em>Cs Bill Customer Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsBillCdemoSk <em>Cs Bill Cdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsBillHdemoSk <em>Cs Bill Hdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsBillAddrSk <em>Cs Bill Addr Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsShipCustomerSk <em>Cs Ship Customer Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsShipCdemoSk <em>Cs Ship Cdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsShipHdemoSk <em>Cs Ship Hdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsShipAddrSk <em>Cs Ship Addr Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsCallCenterSk <em>Cs Call Center Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsCatalogPageSk <em>Cs Catalog Page Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsShipModeSk <em>Cs Ship Mode Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsWarehouseSk <em>Cs Warehouse Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsItemSk <em>Cs Item Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsPromoSk <em>Cs Promo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsOrderNumber <em>Cs Order Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsQuantity <em>Cs Quantity</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsWholesaleCost <em>Cs Wholesale Cost</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsListPrice <em>Cs List Price</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsSalesPrice <em>Cs Sales Price</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsExtDiscountAmt <em>Cs Ext Discount Amt</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsExtSalesPrice <em>Cs Ext Sales Price</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsExtWholesaleCost <em>Cs Ext Wholesale Cost</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsExtListPrice <em>Cs Ext List Price</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsExtTax <em>Cs Ext Tax</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsCouponAmt <em>Cs Coupon Amt</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsExtShipCost <em>Cs Ext Ship Cost</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsNetPaid <em>Cs Net Paid</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsNetPaidIncTax <em>Cs Net Paid Inc Tax</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsNetPaidIncShip <em>Cs Net Paid Inc Ship</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsNetPaidIncShipTax <em>Cs Net Paid Inc Ship Tax</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.CatalogSales#getCsNetProfit <em>Cs Net Profit</em>}</li>
 * </ul>
 *
 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales()
 * @model
 * @generated
 */
public interface CatalogSales extends EObject {
	/**
	 * Returns the value of the '<em><b>Cs Sold Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Sold Date Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Sold Date Sk</em>' attribute.
	 * @see #setCsSoldDateSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsSoldDateSk()
	 * @model
	 * @generated
	 */
	Long getCsSoldDateSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsSoldDateSk <em>Cs Sold Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Sold Date Sk</em>' attribute.
	 * @see #getCsSoldDateSk()
	 * @generated
	 */
	void setCsSoldDateSk(Long value);

	/**
	 * Returns the value of the '<em><b>Cs Sold Time Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Sold Time Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Sold Time Sk</em>' attribute.
	 * @see #setCsSoldTimeSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsSoldTimeSk()
	 * @model
	 * @generated
	 */
	Long getCsSoldTimeSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsSoldTimeSk <em>Cs Sold Time Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Sold Time Sk</em>' attribute.
	 * @see #getCsSoldTimeSk()
	 * @generated
	 */
	void setCsSoldTimeSk(Long value);

	/**
	 * Returns the value of the '<em><b>Cs Ship Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Ship Date Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Ship Date Sk</em>' attribute.
	 * @see #setCsShipDateSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsShipDateSk()
	 * @model
	 * @generated
	 */
	Long getCsShipDateSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsShipDateSk <em>Cs Ship Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Ship Date Sk</em>' attribute.
	 * @see #getCsShipDateSk()
	 * @generated
	 */
	void setCsShipDateSk(Long value);

	/**
	 * Returns the value of the '<em><b>Cs Bill Customer Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Bill Customer Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Bill Customer Sk</em>' attribute.
	 * @see #setCsBillCustomerSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsBillCustomerSk()
	 * @model
	 * @generated
	 */
	Long getCsBillCustomerSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsBillCustomerSk <em>Cs Bill Customer Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Bill Customer Sk</em>' attribute.
	 * @see #getCsBillCustomerSk()
	 * @generated
	 */
	void setCsBillCustomerSk(Long value);

	/**
	 * Returns the value of the '<em><b>Cs Bill Cdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Bill Cdemo Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Bill Cdemo Sk</em>' attribute.
	 * @see #setCsBillCdemoSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsBillCdemoSk()
	 * @model
	 * @generated
	 */
	Long getCsBillCdemoSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsBillCdemoSk <em>Cs Bill Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Bill Cdemo Sk</em>' attribute.
	 * @see #getCsBillCdemoSk()
	 * @generated
	 */
	void setCsBillCdemoSk(Long value);

	/**
	 * Returns the value of the '<em><b>Cs Bill Hdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Bill Hdemo Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Bill Hdemo Sk</em>' attribute.
	 * @see #setCsBillHdemoSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsBillHdemoSk()
	 * @model
	 * @generated
	 */
	Long getCsBillHdemoSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsBillHdemoSk <em>Cs Bill Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Bill Hdemo Sk</em>' attribute.
	 * @see #getCsBillHdemoSk()
	 * @generated
	 */
	void setCsBillHdemoSk(Long value);

	/**
	 * Returns the value of the '<em><b>Cs Bill Addr Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Bill Addr Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Bill Addr Sk</em>' attribute.
	 * @see #setCsBillAddrSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsBillAddrSk()
	 * @model
	 * @generated
	 */
	Long getCsBillAddrSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsBillAddrSk <em>Cs Bill Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Bill Addr Sk</em>' attribute.
	 * @see #getCsBillAddrSk()
	 * @generated
	 */
	void setCsBillAddrSk(Long value);

	/**
	 * Returns the value of the '<em><b>Cs Ship Customer Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Ship Customer Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Ship Customer Sk</em>' attribute.
	 * @see #setCsShipCustomerSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsShipCustomerSk()
	 * @model
	 * @generated
	 */
	Long getCsShipCustomerSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsShipCustomerSk <em>Cs Ship Customer Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Ship Customer Sk</em>' attribute.
	 * @see #getCsShipCustomerSk()
	 * @generated
	 */
	void setCsShipCustomerSk(Long value);

	/**
	 * Returns the value of the '<em><b>Cs Ship Cdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Ship Cdemo Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Ship Cdemo Sk</em>' attribute.
	 * @see #setCsShipCdemoSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsShipCdemoSk()
	 * @model
	 * @generated
	 */
	Long getCsShipCdemoSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsShipCdemoSk <em>Cs Ship Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Ship Cdemo Sk</em>' attribute.
	 * @see #getCsShipCdemoSk()
	 * @generated
	 */
	void setCsShipCdemoSk(Long value);

	/**
	 * Returns the value of the '<em><b>Cs Ship Hdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Ship Hdemo Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Ship Hdemo Sk</em>' attribute.
	 * @see #setCsShipHdemoSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsShipHdemoSk()
	 * @model
	 * @generated
	 */
	Long getCsShipHdemoSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsShipHdemoSk <em>Cs Ship Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Ship Hdemo Sk</em>' attribute.
	 * @see #getCsShipHdemoSk()
	 * @generated
	 */
	void setCsShipHdemoSk(Long value);

	/**
	 * Returns the value of the '<em><b>Cs Ship Addr Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Ship Addr Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Ship Addr Sk</em>' attribute.
	 * @see #setCsShipAddrSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsShipAddrSk()
	 * @model
	 * @generated
	 */
	Long getCsShipAddrSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsShipAddrSk <em>Cs Ship Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Ship Addr Sk</em>' attribute.
	 * @see #getCsShipAddrSk()
	 * @generated
	 */
	void setCsShipAddrSk(Long value);

	/**
	 * Returns the value of the '<em><b>Cs Call Center Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Call Center Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Call Center Sk</em>' attribute.
	 * @see #setCsCallCenterSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsCallCenterSk()
	 * @model
	 * @generated
	 */
	Long getCsCallCenterSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsCallCenterSk <em>Cs Call Center Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Call Center Sk</em>' attribute.
	 * @see #getCsCallCenterSk()
	 * @generated
	 */
	void setCsCallCenterSk(Long value);

	/**
	 * Returns the value of the '<em><b>Cs Catalog Page Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Catalog Page Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Catalog Page Sk</em>' attribute.
	 * @see #setCsCatalogPageSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsCatalogPageSk()
	 * @model
	 * @generated
	 */
	Long getCsCatalogPageSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsCatalogPageSk <em>Cs Catalog Page Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Catalog Page Sk</em>' attribute.
	 * @see #getCsCatalogPageSk()
	 * @generated
	 */
	void setCsCatalogPageSk(Long value);

	/**
	 * Returns the value of the '<em><b>Cs Ship Mode Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Ship Mode Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Ship Mode Sk</em>' attribute.
	 * @see #setCsShipModeSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsShipModeSk()
	 * @model
	 * @generated
	 */
	Long getCsShipModeSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsShipModeSk <em>Cs Ship Mode Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Ship Mode Sk</em>' attribute.
	 * @see #getCsShipModeSk()
	 * @generated
	 */
	void setCsShipModeSk(Long value);

	/**
	 * Returns the value of the '<em><b>Cs Warehouse Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Warehouse Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Warehouse Sk</em>' attribute.
	 * @see #setCsWarehouseSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsWarehouseSk()
	 * @model
	 * @generated
	 */
	Long getCsWarehouseSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsWarehouseSk <em>Cs Warehouse Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Warehouse Sk</em>' attribute.
	 * @see #getCsWarehouseSk()
	 * @generated
	 */
	void setCsWarehouseSk(Long value);

	/**
	 * Returns the value of the '<em><b>Cs Item Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Item Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Item Sk</em>' attribute.
	 * @see #setCsItemSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsItemSk()
	 * @model
	 * @generated
	 */
	Long getCsItemSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsItemSk <em>Cs Item Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Item Sk</em>' attribute.
	 * @see #getCsItemSk()
	 * @generated
	 */
	void setCsItemSk(Long value);

	/**
	 * Returns the value of the '<em><b>Cs Promo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Promo Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Promo Sk</em>' attribute.
	 * @see #setCsPromoSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsPromoSk()
	 * @model
	 * @generated
	 */
	Long getCsPromoSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsPromoSk <em>Cs Promo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Promo Sk</em>' attribute.
	 * @see #getCsPromoSk()
	 * @generated
	 */
	void setCsPromoSk(Long value);

	/**
	 * Returns the value of the '<em><b>Cs Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Order Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Order Number</em>' attribute.
	 * @see #setCsOrderNumber(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsOrderNumber()
	 * @model
	 * @generated
	 */
	Long getCsOrderNumber();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsOrderNumber <em>Cs Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Order Number</em>' attribute.
	 * @see #getCsOrderNumber()
	 * @generated
	 */
	void setCsOrderNumber(Long value);

	/**
	 * Returns the value of the '<em><b>Cs Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Quantity</em>' attribute.
	 * @see #setCsQuantity(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsQuantity()
	 * @model
	 * @generated
	 */
	Long getCsQuantity();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsQuantity <em>Cs Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Quantity</em>' attribute.
	 * @see #getCsQuantity()
	 * @generated
	 */
	void setCsQuantity(Long value);

	/**
	 * Returns the value of the '<em><b>Cs Wholesale Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Wholesale Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Wholesale Cost</em>' attribute.
	 * @see #setCsWholesaleCost(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsWholesaleCost()
	 * @model
	 * @generated
	 */
	double getCsWholesaleCost();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsWholesaleCost <em>Cs Wholesale Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Wholesale Cost</em>' attribute.
	 * @see #getCsWholesaleCost()
	 * @generated
	 */
	void setCsWholesaleCost(double value);

	/**
	 * Returns the value of the '<em><b>Cs List Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs List Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs List Price</em>' attribute.
	 * @see #setCsListPrice(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsListPrice()
	 * @model
	 * @generated
	 */
	double getCsListPrice();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsListPrice <em>Cs List Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs List Price</em>' attribute.
	 * @see #getCsListPrice()
	 * @generated
	 */
	void setCsListPrice(double value);

	/**
	 * Returns the value of the '<em><b>Cs Sales Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Sales Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Sales Price</em>' attribute.
	 * @see #setCsSalesPrice(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsSalesPrice()
	 * @model
	 * @generated
	 */
	double getCsSalesPrice();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsSalesPrice <em>Cs Sales Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Sales Price</em>' attribute.
	 * @see #getCsSalesPrice()
	 * @generated
	 */
	void setCsSalesPrice(double value);

	/**
	 * Returns the value of the '<em><b>Cs Ext Discount Amt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Ext Discount Amt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Ext Discount Amt</em>' attribute.
	 * @see #setCsExtDiscountAmt(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsExtDiscountAmt()
	 * @model
	 * @generated
	 */
	double getCsExtDiscountAmt();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsExtDiscountAmt <em>Cs Ext Discount Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Ext Discount Amt</em>' attribute.
	 * @see #getCsExtDiscountAmt()
	 * @generated
	 */
	void setCsExtDiscountAmt(double value);

	/**
	 * Returns the value of the '<em><b>Cs Ext Sales Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Ext Sales Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Ext Sales Price</em>' attribute.
	 * @see #setCsExtSalesPrice(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsExtSalesPrice()
	 * @model
	 * @generated
	 */
	double getCsExtSalesPrice();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsExtSalesPrice <em>Cs Ext Sales Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Ext Sales Price</em>' attribute.
	 * @see #getCsExtSalesPrice()
	 * @generated
	 */
	void setCsExtSalesPrice(double value);

	/**
	 * Returns the value of the '<em><b>Cs Ext Wholesale Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Ext Wholesale Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Ext Wholesale Cost</em>' attribute.
	 * @see #setCsExtWholesaleCost(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsExtWholesaleCost()
	 * @model
	 * @generated
	 */
	double getCsExtWholesaleCost();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsExtWholesaleCost <em>Cs Ext Wholesale Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Ext Wholesale Cost</em>' attribute.
	 * @see #getCsExtWholesaleCost()
	 * @generated
	 */
	void setCsExtWholesaleCost(double value);

	/**
	 * Returns the value of the '<em><b>Cs Ext List Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Ext List Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Ext List Price</em>' attribute.
	 * @see #setCsExtListPrice(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsExtListPrice()
	 * @model
	 * @generated
	 */
	double getCsExtListPrice();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsExtListPrice <em>Cs Ext List Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Ext List Price</em>' attribute.
	 * @see #getCsExtListPrice()
	 * @generated
	 */
	void setCsExtListPrice(double value);

	/**
	 * Returns the value of the '<em><b>Cs Ext Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Ext Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Ext Tax</em>' attribute.
	 * @see #setCsExtTax(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsExtTax()
	 * @model
	 * @generated
	 */
	double getCsExtTax();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsExtTax <em>Cs Ext Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Ext Tax</em>' attribute.
	 * @see #getCsExtTax()
	 * @generated
	 */
	void setCsExtTax(double value);

	/**
	 * Returns the value of the '<em><b>Cs Coupon Amt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Coupon Amt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Coupon Amt</em>' attribute.
	 * @see #setCsCouponAmt(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsCouponAmt()
	 * @model
	 * @generated
	 */
	double getCsCouponAmt();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsCouponAmt <em>Cs Coupon Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Coupon Amt</em>' attribute.
	 * @see #getCsCouponAmt()
	 * @generated
	 */
	void setCsCouponAmt(double value);

	/**
	 * Returns the value of the '<em><b>Cs Ext Ship Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Ext Ship Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Ext Ship Cost</em>' attribute.
	 * @see #setCsExtShipCost(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsExtShipCost()
	 * @model
	 * @generated
	 */
	double getCsExtShipCost();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsExtShipCost <em>Cs Ext Ship Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Ext Ship Cost</em>' attribute.
	 * @see #getCsExtShipCost()
	 * @generated
	 */
	void setCsExtShipCost(double value);

	/**
	 * Returns the value of the '<em><b>Cs Net Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Net Paid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Net Paid</em>' attribute.
	 * @see #setCsNetPaid(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsNetPaid()
	 * @model
	 * @generated
	 */
	double getCsNetPaid();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsNetPaid <em>Cs Net Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Net Paid</em>' attribute.
	 * @see #getCsNetPaid()
	 * @generated
	 */
	void setCsNetPaid(double value);

	/**
	 * Returns the value of the '<em><b>Cs Net Paid Inc Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Net Paid Inc Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Net Paid Inc Tax</em>' attribute.
	 * @see #setCsNetPaidIncTax(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsNetPaidIncTax()
	 * @model
	 * @generated
	 */
	double getCsNetPaidIncTax();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsNetPaidIncTax <em>Cs Net Paid Inc Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Net Paid Inc Tax</em>' attribute.
	 * @see #getCsNetPaidIncTax()
	 * @generated
	 */
	void setCsNetPaidIncTax(double value);

	/**
	 * Returns the value of the '<em><b>Cs Net Paid Inc Ship</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Net Paid Inc Ship</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Net Paid Inc Ship</em>' attribute.
	 * @see #setCsNetPaidIncShip(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsNetPaidIncShip()
	 * @model
	 * @generated
	 */
	double getCsNetPaidIncShip();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsNetPaidIncShip <em>Cs Net Paid Inc Ship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Net Paid Inc Ship</em>' attribute.
	 * @see #getCsNetPaidIncShip()
	 * @generated
	 */
	void setCsNetPaidIncShip(double value);

	/**
	 * Returns the value of the '<em><b>Cs Net Paid Inc Ship Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Net Paid Inc Ship Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Net Paid Inc Ship Tax</em>' attribute.
	 * @see #setCsNetPaidIncShipTax(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsNetPaidIncShipTax()
	 * @model
	 * @generated
	 */
	double getCsNetPaidIncShipTax();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsNetPaidIncShipTax <em>Cs Net Paid Inc Ship Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Net Paid Inc Ship Tax</em>' attribute.
	 * @see #getCsNetPaidIncShipTax()
	 * @generated
	 */
	void setCsNetPaidIncShipTax(double value);

	/**
	 * Returns the value of the '<em><b>Cs Net Profit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Net Profit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Net Profit</em>' attribute.
	 * @see #setCsNetProfit(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getCatalogSales_CsNetProfit()
	 * @model
	 * @generated
	 */
	double getCsNetProfit();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.CatalogSales#getCsNetProfit <em>Cs Net Profit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Net Profit</em>' attribute.
	 * @see #getCsNetProfit()
	 * @generated
	 */
	void setCsNetProfit(double value);

} // CatalogSales
