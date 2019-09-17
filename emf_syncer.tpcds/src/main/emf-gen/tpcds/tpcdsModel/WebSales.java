/**
 */
package tpcds.tpcdsModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Sales</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsSoldDateSk <em>Ws Sold Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsSoldTimeSk <em>Ws Sold Time Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsShipDateSk <em>Ws Ship Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsItemSk <em>Ws Item Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsBillCustomerSk <em>Ws Bill Customer Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsBillCdemoSk <em>Ws Bill Cdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsBillHdemoSk <em>Ws Bill Hdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsBillAddrSk <em>Ws Bill Addr Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsShipCustomerSk <em>Ws Ship Customer Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsShipCdemoSk <em>Ws Ship Cdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsShipHdemoSk <em>Ws Ship Hdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsShipAddrSk <em>Ws Ship Addr Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsWebPageSk <em>Ws Web Page Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsWebSiteSk <em>Ws Web Site Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsShipModeSk <em>Ws Ship Mode Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsWarehouseSk <em>Ws Warehouse Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsPromoSk <em>Ws Promo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsOrderNumber <em>Ws Order Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsQuantity <em>Ws Quantity</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsWholesaleCost <em>Ws Wholesale Cost</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsListPrice <em>Ws List Price</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsSalesPrice <em>Ws Sales Price</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsExtDiscountAmt <em>Ws Ext Discount Amt</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsExtSalesPrice <em>Ws Ext Sales Price</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsExtWholesaleCost <em>Ws Ext Wholesale Cost</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsExtListPrice <em>Ws Ext List Price</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsExtTax <em>Ws Ext Tax</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsCouponAmt <em>Ws Coupon Amt</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsExtShipCost <em>Ws Ext Ship Cost</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsNetPaid <em>Ws Net Paid</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsNetPaidIncTax <em>Ws Net Paid Inc Tax</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsNetPaidIncShip <em>Ws Net Paid Inc Ship</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsNetPaidIncShipTax <em>Ws Net Paid Inc Ship Tax</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.WebSales#getWsNetProfit <em>Ws Net Profit</em>}</li>
 * </ul>
 *
 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales()
 * @model
 * @generated
 */
public interface WebSales extends EObject {
	/**
	 * Returns the value of the '<em><b>Ws Sold Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Sold Date Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Sold Date Sk</em>' attribute.
	 * @see #setWsSoldDateSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsSoldDateSk()
	 * @model
	 * @generated
	 */
	Long getWsSoldDateSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsSoldDateSk <em>Ws Sold Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Sold Date Sk</em>' attribute.
	 * @see #getWsSoldDateSk()
	 * @generated
	 */
	void setWsSoldDateSk(Long value);

	/**
	 * Returns the value of the '<em><b>Ws Sold Time Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Sold Time Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Sold Time Sk</em>' attribute.
	 * @see #setWsSoldTimeSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsSoldTimeSk()
	 * @model
	 * @generated
	 */
	Long getWsSoldTimeSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsSoldTimeSk <em>Ws Sold Time Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Sold Time Sk</em>' attribute.
	 * @see #getWsSoldTimeSk()
	 * @generated
	 */
	void setWsSoldTimeSk(Long value);

	/**
	 * Returns the value of the '<em><b>Ws Ship Date Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Ship Date Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Ship Date Sk</em>' attribute.
	 * @see #setWsShipDateSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsShipDateSk()
	 * @model
	 * @generated
	 */
	Long getWsShipDateSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsShipDateSk <em>Ws Ship Date Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Ship Date Sk</em>' attribute.
	 * @see #getWsShipDateSk()
	 * @generated
	 */
	void setWsShipDateSk(Long value);

	/**
	 * Returns the value of the '<em><b>Ws Item Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Item Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Item Sk</em>' attribute.
	 * @see #setWsItemSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsItemSk()
	 * @model
	 * @generated
	 */
	Long getWsItemSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsItemSk <em>Ws Item Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Item Sk</em>' attribute.
	 * @see #getWsItemSk()
	 * @generated
	 */
	void setWsItemSk(Long value);

	/**
	 * Returns the value of the '<em><b>Ws Bill Customer Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Bill Customer Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Bill Customer Sk</em>' attribute.
	 * @see #setWsBillCustomerSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsBillCustomerSk()
	 * @model
	 * @generated
	 */
	Long getWsBillCustomerSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsBillCustomerSk <em>Ws Bill Customer Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Bill Customer Sk</em>' attribute.
	 * @see #getWsBillCustomerSk()
	 * @generated
	 */
	void setWsBillCustomerSk(Long value);

	/**
	 * Returns the value of the '<em><b>Ws Bill Cdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Bill Cdemo Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Bill Cdemo Sk</em>' attribute.
	 * @see #setWsBillCdemoSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsBillCdemoSk()
	 * @model
	 * @generated
	 */
	Long getWsBillCdemoSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsBillCdemoSk <em>Ws Bill Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Bill Cdemo Sk</em>' attribute.
	 * @see #getWsBillCdemoSk()
	 * @generated
	 */
	void setWsBillCdemoSk(Long value);

	/**
	 * Returns the value of the '<em><b>Ws Bill Hdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Bill Hdemo Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Bill Hdemo Sk</em>' attribute.
	 * @see #setWsBillHdemoSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsBillHdemoSk()
	 * @model
	 * @generated
	 */
	Long getWsBillHdemoSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsBillHdemoSk <em>Ws Bill Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Bill Hdemo Sk</em>' attribute.
	 * @see #getWsBillHdemoSk()
	 * @generated
	 */
	void setWsBillHdemoSk(Long value);

	/**
	 * Returns the value of the '<em><b>Ws Bill Addr Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Bill Addr Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Bill Addr Sk</em>' attribute.
	 * @see #setWsBillAddrSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsBillAddrSk()
	 * @model
	 * @generated
	 */
	Long getWsBillAddrSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsBillAddrSk <em>Ws Bill Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Bill Addr Sk</em>' attribute.
	 * @see #getWsBillAddrSk()
	 * @generated
	 */
	void setWsBillAddrSk(Long value);

	/**
	 * Returns the value of the '<em><b>Ws Ship Customer Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Ship Customer Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Ship Customer Sk</em>' attribute.
	 * @see #setWsShipCustomerSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsShipCustomerSk()
	 * @model
	 * @generated
	 */
	Long getWsShipCustomerSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsShipCustomerSk <em>Ws Ship Customer Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Ship Customer Sk</em>' attribute.
	 * @see #getWsShipCustomerSk()
	 * @generated
	 */
	void setWsShipCustomerSk(Long value);

	/**
	 * Returns the value of the '<em><b>Ws Ship Cdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Ship Cdemo Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Ship Cdemo Sk</em>' attribute.
	 * @see #setWsShipCdemoSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsShipCdemoSk()
	 * @model
	 * @generated
	 */
	Long getWsShipCdemoSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsShipCdemoSk <em>Ws Ship Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Ship Cdemo Sk</em>' attribute.
	 * @see #getWsShipCdemoSk()
	 * @generated
	 */
	void setWsShipCdemoSk(Long value);

	/**
	 * Returns the value of the '<em><b>Ws Ship Hdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Ship Hdemo Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Ship Hdemo Sk</em>' attribute.
	 * @see #setWsShipHdemoSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsShipHdemoSk()
	 * @model
	 * @generated
	 */
	Long getWsShipHdemoSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsShipHdemoSk <em>Ws Ship Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Ship Hdemo Sk</em>' attribute.
	 * @see #getWsShipHdemoSk()
	 * @generated
	 */
	void setWsShipHdemoSk(Long value);

	/**
	 * Returns the value of the '<em><b>Ws Ship Addr Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Ship Addr Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Ship Addr Sk</em>' attribute.
	 * @see #setWsShipAddrSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsShipAddrSk()
	 * @model
	 * @generated
	 */
	Long getWsShipAddrSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsShipAddrSk <em>Ws Ship Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Ship Addr Sk</em>' attribute.
	 * @see #getWsShipAddrSk()
	 * @generated
	 */
	void setWsShipAddrSk(Long value);

	/**
	 * Returns the value of the '<em><b>Ws Web Page Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Web Page Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Web Page Sk</em>' attribute.
	 * @see #setWsWebPageSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsWebPageSk()
	 * @model
	 * @generated
	 */
	Long getWsWebPageSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsWebPageSk <em>Ws Web Page Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Web Page Sk</em>' attribute.
	 * @see #getWsWebPageSk()
	 * @generated
	 */
	void setWsWebPageSk(Long value);

	/**
	 * Returns the value of the '<em><b>Ws Web Site Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Web Site Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Web Site Sk</em>' attribute.
	 * @see #setWsWebSiteSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsWebSiteSk()
	 * @model
	 * @generated
	 */
	Long getWsWebSiteSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsWebSiteSk <em>Ws Web Site Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Web Site Sk</em>' attribute.
	 * @see #getWsWebSiteSk()
	 * @generated
	 */
	void setWsWebSiteSk(Long value);

	/**
	 * Returns the value of the '<em><b>Ws Ship Mode Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Ship Mode Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Ship Mode Sk</em>' attribute.
	 * @see #setWsShipModeSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsShipModeSk()
	 * @model
	 * @generated
	 */
	Long getWsShipModeSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsShipModeSk <em>Ws Ship Mode Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Ship Mode Sk</em>' attribute.
	 * @see #getWsShipModeSk()
	 * @generated
	 */
	void setWsShipModeSk(Long value);

	/**
	 * Returns the value of the '<em><b>Ws Warehouse Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Warehouse Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Warehouse Sk</em>' attribute.
	 * @see #setWsWarehouseSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsWarehouseSk()
	 * @model
	 * @generated
	 */
	Long getWsWarehouseSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsWarehouseSk <em>Ws Warehouse Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Warehouse Sk</em>' attribute.
	 * @see #getWsWarehouseSk()
	 * @generated
	 */
	void setWsWarehouseSk(Long value);

	/**
	 * Returns the value of the '<em><b>Ws Promo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Promo Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Promo Sk</em>' attribute.
	 * @see #setWsPromoSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsPromoSk()
	 * @model
	 * @generated
	 */
	Long getWsPromoSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsPromoSk <em>Ws Promo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Promo Sk</em>' attribute.
	 * @see #getWsPromoSk()
	 * @generated
	 */
	void setWsPromoSk(Long value);

	/**
	 * Returns the value of the '<em><b>Ws Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Order Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Order Number</em>' attribute.
	 * @see #setWsOrderNumber(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsOrderNumber()
	 * @model
	 * @generated
	 */
	Long getWsOrderNumber();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsOrderNumber <em>Ws Order Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Order Number</em>' attribute.
	 * @see #getWsOrderNumber()
	 * @generated
	 */
	void setWsOrderNumber(Long value);

	/**
	 * Returns the value of the '<em><b>Ws Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Quantity</em>' attribute.
	 * @see #setWsQuantity(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsQuantity()
	 * @model
	 * @generated
	 */
	Long getWsQuantity();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsQuantity <em>Ws Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Quantity</em>' attribute.
	 * @see #getWsQuantity()
	 * @generated
	 */
	void setWsQuantity(Long value);

	/**
	 * Returns the value of the '<em><b>Ws Wholesale Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Wholesale Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Wholesale Cost</em>' attribute.
	 * @see #setWsWholesaleCost(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsWholesaleCost()
	 * @model
	 * @generated
	 */
	double getWsWholesaleCost();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsWholesaleCost <em>Ws Wholesale Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Wholesale Cost</em>' attribute.
	 * @see #getWsWholesaleCost()
	 * @generated
	 */
	void setWsWholesaleCost(double value);

	/**
	 * Returns the value of the '<em><b>Ws List Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws List Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws List Price</em>' attribute.
	 * @see #setWsListPrice(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsListPrice()
	 * @model
	 * @generated
	 */
	double getWsListPrice();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsListPrice <em>Ws List Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws List Price</em>' attribute.
	 * @see #getWsListPrice()
	 * @generated
	 */
	void setWsListPrice(double value);

	/**
	 * Returns the value of the '<em><b>Ws Sales Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Sales Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Sales Price</em>' attribute.
	 * @see #setWsSalesPrice(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsSalesPrice()
	 * @model
	 * @generated
	 */
	double getWsSalesPrice();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsSalesPrice <em>Ws Sales Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Sales Price</em>' attribute.
	 * @see #getWsSalesPrice()
	 * @generated
	 */
	void setWsSalesPrice(double value);

	/**
	 * Returns the value of the '<em><b>Ws Ext Discount Amt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Ext Discount Amt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Ext Discount Amt</em>' attribute.
	 * @see #setWsExtDiscountAmt(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsExtDiscountAmt()
	 * @model
	 * @generated
	 */
	double getWsExtDiscountAmt();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsExtDiscountAmt <em>Ws Ext Discount Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Ext Discount Amt</em>' attribute.
	 * @see #getWsExtDiscountAmt()
	 * @generated
	 */
	void setWsExtDiscountAmt(double value);

	/**
	 * Returns the value of the '<em><b>Ws Ext Sales Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Ext Sales Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Ext Sales Price</em>' attribute.
	 * @see #setWsExtSalesPrice(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsExtSalesPrice()
	 * @model
	 * @generated
	 */
	double getWsExtSalesPrice();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsExtSalesPrice <em>Ws Ext Sales Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Ext Sales Price</em>' attribute.
	 * @see #getWsExtSalesPrice()
	 * @generated
	 */
	void setWsExtSalesPrice(double value);

	/**
	 * Returns the value of the '<em><b>Ws Ext Wholesale Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Ext Wholesale Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Ext Wholesale Cost</em>' attribute.
	 * @see #setWsExtWholesaleCost(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsExtWholesaleCost()
	 * @model
	 * @generated
	 */
	double getWsExtWholesaleCost();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsExtWholesaleCost <em>Ws Ext Wholesale Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Ext Wholesale Cost</em>' attribute.
	 * @see #getWsExtWholesaleCost()
	 * @generated
	 */
	void setWsExtWholesaleCost(double value);

	/**
	 * Returns the value of the '<em><b>Ws Ext List Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Ext List Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Ext List Price</em>' attribute.
	 * @see #setWsExtListPrice(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsExtListPrice()
	 * @model
	 * @generated
	 */
	double getWsExtListPrice();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsExtListPrice <em>Ws Ext List Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Ext List Price</em>' attribute.
	 * @see #getWsExtListPrice()
	 * @generated
	 */
	void setWsExtListPrice(double value);

	/**
	 * Returns the value of the '<em><b>Ws Ext Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Ext Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Ext Tax</em>' attribute.
	 * @see #setWsExtTax(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsExtTax()
	 * @model
	 * @generated
	 */
	double getWsExtTax();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsExtTax <em>Ws Ext Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Ext Tax</em>' attribute.
	 * @see #getWsExtTax()
	 * @generated
	 */
	void setWsExtTax(double value);

	/**
	 * Returns the value of the '<em><b>Ws Coupon Amt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Coupon Amt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Coupon Amt</em>' attribute.
	 * @see #setWsCouponAmt(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsCouponAmt()
	 * @model
	 * @generated
	 */
	double getWsCouponAmt();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsCouponAmt <em>Ws Coupon Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Coupon Amt</em>' attribute.
	 * @see #getWsCouponAmt()
	 * @generated
	 */
	void setWsCouponAmt(double value);

	/**
	 * Returns the value of the '<em><b>Ws Ext Ship Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Ext Ship Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Ext Ship Cost</em>' attribute.
	 * @see #setWsExtShipCost(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsExtShipCost()
	 * @model
	 * @generated
	 */
	double getWsExtShipCost();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsExtShipCost <em>Ws Ext Ship Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Ext Ship Cost</em>' attribute.
	 * @see #getWsExtShipCost()
	 * @generated
	 */
	void setWsExtShipCost(double value);

	/**
	 * Returns the value of the '<em><b>Ws Net Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Net Paid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Net Paid</em>' attribute.
	 * @see #setWsNetPaid(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsNetPaid()
	 * @model
	 * @generated
	 */
	double getWsNetPaid();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsNetPaid <em>Ws Net Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Net Paid</em>' attribute.
	 * @see #getWsNetPaid()
	 * @generated
	 */
	void setWsNetPaid(double value);

	/**
	 * Returns the value of the '<em><b>Ws Net Paid Inc Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Net Paid Inc Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Net Paid Inc Tax</em>' attribute.
	 * @see #setWsNetPaidIncTax(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsNetPaidIncTax()
	 * @model
	 * @generated
	 */
	double getWsNetPaidIncTax();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsNetPaidIncTax <em>Ws Net Paid Inc Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Net Paid Inc Tax</em>' attribute.
	 * @see #getWsNetPaidIncTax()
	 * @generated
	 */
	void setWsNetPaidIncTax(double value);

	/**
	 * Returns the value of the '<em><b>Ws Net Paid Inc Ship</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Net Paid Inc Ship</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Net Paid Inc Ship</em>' attribute.
	 * @see #setWsNetPaidIncShip(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsNetPaidIncShip()
	 * @model
	 * @generated
	 */
	double getWsNetPaidIncShip();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsNetPaidIncShip <em>Ws Net Paid Inc Ship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Net Paid Inc Ship</em>' attribute.
	 * @see #getWsNetPaidIncShip()
	 * @generated
	 */
	void setWsNetPaidIncShip(double value);

	/**
	 * Returns the value of the '<em><b>Ws Net Paid Inc Ship Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Net Paid Inc Ship Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Net Paid Inc Ship Tax</em>' attribute.
	 * @see #setWsNetPaidIncShipTax(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsNetPaidIncShipTax()
	 * @model
	 * @generated
	 */
	double getWsNetPaidIncShipTax();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsNetPaidIncShipTax <em>Ws Net Paid Inc Ship Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Net Paid Inc Ship Tax</em>' attribute.
	 * @see #getWsNetPaidIncShipTax()
	 * @generated
	 */
	void setWsNetPaidIncShipTax(double value);

	/**
	 * Returns the value of the '<em><b>Ws Net Profit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Net Profit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Net Profit</em>' attribute.
	 * @see #setWsNetProfit(double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getWebSales_WsNetProfit()
	 * @model
	 * @generated
	 */
	double getWsNetProfit();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.WebSales#getWsNetProfit <em>Ws Net Profit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Net Profit</em>' attribute.
	 * @see #getWsNetProfit()
	 * @generated
	 */
	void setWsNetProfit(double value);

} // WebSales
