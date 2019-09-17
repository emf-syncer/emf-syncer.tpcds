/**
 */
package tpcds.tpcdsModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store Sales</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpcds.tpcdsModel.StoreSales#getSsSoldDateSk <em>Ss Sold Date Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreSales#getSsSoldTimeSk <em>Ss Sold Time Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreSales#getSsItemSk <em>Ss Item Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreSales#getSsId <em>Ss Id</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreSales#getSsCustomerSk <em>Ss Customer Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreSales#getSsTicketNumber <em>Ss Ticket Number</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreSales#getSsCdemoSk <em>Ss Cdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreSales#getSsHdemoSk <em>Ss Hdemo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreSales#getSsAddrSk <em>Ss Addr Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreSales#getSsStoreSk <em>Ss Store Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreSales#getSsPromoSk <em>Ss Promo Sk</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreSales#getSsQuantity <em>Ss Quantity</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreSales#getSsWholesaleCost <em>Ss Wholesale Cost</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreSales#getSsListPrice <em>Ss List Price</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreSales#getSsSalesPrice <em>Ss Sales Price</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreSales#getSsExtDiscountAmt <em>Ss Ext Discount Amt</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreSales#getSsExtSalesPrice <em>Ss Ext Sales Price</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreSales#getSsExtWholesaleCost <em>Ss Ext Wholesale Cost</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreSales#getSsExtListPrice <em>Ss Ext List Price</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreSales#getSsExtTax <em>Ss Ext Tax</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreSales#getSsCouponAmt <em>Ss Coupon Amt</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreSales#getSsNetPaid <em>Ss Net Paid</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreSales#getSsNetPaidIncTax <em>Ss Net Paid Inc Tax</em>}</li>
 *   <li>{@link tpcds.tpcdsModel.StoreSales#getSsNetProfit <em>Ss Net Profit</em>}</li>
 * </ul>
 *
 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSales()
 * @model
 * @generated
 */
public interface StoreSales extends EObject {
	/**
	 * Returns the value of the '<em><b>Ss Sold Date Sk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ss Sold Date Sk</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ss Sold Date Sk</em>' reference.
	 * @see #setSsSoldDateSk(DateDim)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSales_SsSoldDateSk()
	 * @model
	 * @generated
	 */
	DateDim getSsSoldDateSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreSales#getSsSoldDateSk <em>Ss Sold Date Sk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ss Sold Date Sk</em>' reference.
	 * @see #getSsSoldDateSk()
	 * @generated
	 */
	void setSsSoldDateSk(DateDim value);

	/**
	 * Returns the value of the '<em><b>Ss Sold Time Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ss Sold Time Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ss Sold Time Sk</em>' attribute.
	 * @see #setSsSoldTimeSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSales_SsSoldTimeSk()
	 * @model
	 * @generated
	 */
	Long getSsSoldTimeSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreSales#getSsSoldTimeSk <em>Ss Sold Time Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ss Sold Time Sk</em>' attribute.
	 * @see #getSsSoldTimeSk()
	 * @generated
	 */
	void setSsSoldTimeSk(Long value);

	/**
	 * Returns the value of the '<em><b>Ss Item Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ss Item Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ss Item Sk</em>' attribute.
	 * @see #setSsItemSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSales_SsItemSk()
	 * @model
	 * @generated
	 */
	Long getSsItemSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreSales#getSsItemSk <em>Ss Item Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ss Item Sk</em>' attribute.
	 * @see #getSsItemSk()
	 * @generated
	 */
	void setSsItemSk(Long value);

	/**
	 * Returns the value of the '<em><b>Ss Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ss Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ss Id</em>' reference.
	 * @see #setSsId(StoreSalesId)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSales_SsId()
	 * @model
	 * @generated
	 */
	StoreSalesId getSsId();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreSales#getSsId <em>Ss Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ss Id</em>' reference.
	 * @see #getSsId()
	 * @generated
	 */
	void setSsId(StoreSalesId value);

	/**
	 * Returns the value of the '<em><b>Ss Customer Sk</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tpcds.tpcdsModel.Customer#getStoreSales <em>Store Sales</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ss Customer Sk</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ss Customer Sk</em>' reference.
	 * @see #setSsCustomerSk(Customer)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSales_SsCustomerSk()
	 * @see tpcds.tpcdsModel.Customer#getStoreSales
	 * @model opposite="storeSales"
	 * @generated
	 */
	Customer getSsCustomerSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreSales#getSsCustomerSk <em>Ss Customer Sk</em>}' reference.
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
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSales_SsTicketNumber()
	 * @model
	 * @generated
	 */
	Long getSsTicketNumber();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreSales#getSsTicketNumber <em>Ss Ticket Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ss Ticket Number</em>' attribute.
	 * @see #getSsTicketNumber()
	 * @generated
	 */
	void setSsTicketNumber(Long value);

	/**
	 * Returns the value of the '<em><b>Ss Cdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ss Cdemo Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ss Cdemo Sk</em>' attribute.
	 * @see #setSsCdemoSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSales_SsCdemoSk()
	 * @model
	 * @generated
	 */
	Long getSsCdemoSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreSales#getSsCdemoSk <em>Ss Cdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ss Cdemo Sk</em>' attribute.
	 * @see #getSsCdemoSk()
	 * @generated
	 */
	void setSsCdemoSk(Long value);

	/**
	 * Returns the value of the '<em><b>Ss Hdemo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ss Hdemo Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ss Hdemo Sk</em>' attribute.
	 * @see #setSsHdemoSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSales_SsHdemoSk()
	 * @model
	 * @generated
	 */
	Long getSsHdemoSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreSales#getSsHdemoSk <em>Ss Hdemo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ss Hdemo Sk</em>' attribute.
	 * @see #getSsHdemoSk()
	 * @generated
	 */
	void setSsHdemoSk(Long value);

	/**
	 * Returns the value of the '<em><b>Ss Addr Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ss Addr Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ss Addr Sk</em>' attribute.
	 * @see #setSsAddrSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSales_SsAddrSk()
	 * @model
	 * @generated
	 */
	Long getSsAddrSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreSales#getSsAddrSk <em>Ss Addr Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ss Addr Sk</em>' attribute.
	 * @see #getSsAddrSk()
	 * @generated
	 */
	void setSsAddrSk(Long value);

	/**
	 * Returns the value of the '<em><b>Ss Store Sk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ss Store Sk</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ss Store Sk</em>' reference.
	 * @see #setSsStoreSk(Store)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSales_SsStoreSk()
	 * @model
	 * @generated
	 */
	Store getSsStoreSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreSales#getSsStoreSk <em>Ss Store Sk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ss Store Sk</em>' reference.
	 * @see #getSsStoreSk()
	 * @generated
	 */
	void setSsStoreSk(Store value);

	/**
	 * Returns the value of the '<em><b>Ss Promo Sk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ss Promo Sk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ss Promo Sk</em>' attribute.
	 * @see #setSsPromoSk(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSales_SsPromoSk()
	 * @model
	 * @generated
	 */
	Long getSsPromoSk();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreSales#getSsPromoSk <em>Ss Promo Sk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ss Promo Sk</em>' attribute.
	 * @see #getSsPromoSk()
	 * @generated
	 */
	void setSsPromoSk(Long value);

	/**
	 * Returns the value of the '<em><b>Ss Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ss Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ss Quantity</em>' attribute.
	 * @see #setSsQuantity(Long)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSales_SsQuantity()
	 * @model
	 * @generated
	 */
	Long getSsQuantity();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreSales#getSsQuantity <em>Ss Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ss Quantity</em>' attribute.
	 * @see #getSsQuantity()
	 * @generated
	 */
	void setSsQuantity(Long value);

	/**
	 * Returns the value of the '<em><b>Ss Wholesale Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ss Wholesale Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ss Wholesale Cost</em>' attribute.
	 * @see #setSsWholesaleCost(Double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSales_SsWholesaleCost()
	 * @model
	 * @generated
	 */
	Double getSsWholesaleCost();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreSales#getSsWholesaleCost <em>Ss Wholesale Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ss Wholesale Cost</em>' attribute.
	 * @see #getSsWholesaleCost()
	 * @generated
	 */
	void setSsWholesaleCost(Double value);

	/**
	 * Returns the value of the '<em><b>Ss List Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ss List Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ss List Price</em>' attribute.
	 * @see #setSsListPrice(Double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSales_SsListPrice()
	 * @model
	 * @generated
	 */
	Double getSsListPrice();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreSales#getSsListPrice <em>Ss List Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ss List Price</em>' attribute.
	 * @see #getSsListPrice()
	 * @generated
	 */
	void setSsListPrice(Double value);

	/**
	 * Returns the value of the '<em><b>Ss Sales Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ss Sales Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ss Sales Price</em>' attribute.
	 * @see #setSsSalesPrice(Double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSales_SsSalesPrice()
	 * @model
	 * @generated
	 */
	Double getSsSalesPrice();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreSales#getSsSalesPrice <em>Ss Sales Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ss Sales Price</em>' attribute.
	 * @see #getSsSalesPrice()
	 * @generated
	 */
	void setSsSalesPrice(Double value);

	/**
	 * Returns the value of the '<em><b>Ss Ext Discount Amt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ss Ext Discount Amt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ss Ext Discount Amt</em>' attribute.
	 * @see #setSsExtDiscountAmt(Double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSales_SsExtDiscountAmt()
	 * @model
	 * @generated
	 */
	Double getSsExtDiscountAmt();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreSales#getSsExtDiscountAmt <em>Ss Ext Discount Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ss Ext Discount Amt</em>' attribute.
	 * @see #getSsExtDiscountAmt()
	 * @generated
	 */
	void setSsExtDiscountAmt(Double value);

	/**
	 * Returns the value of the '<em><b>Ss Ext Sales Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ss Ext Sales Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ss Ext Sales Price</em>' attribute.
	 * @see #setSsExtSalesPrice(Double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSales_SsExtSalesPrice()
	 * @model
	 * @generated
	 */
	Double getSsExtSalesPrice();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreSales#getSsExtSalesPrice <em>Ss Ext Sales Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ss Ext Sales Price</em>' attribute.
	 * @see #getSsExtSalesPrice()
	 * @generated
	 */
	void setSsExtSalesPrice(Double value);

	/**
	 * Returns the value of the '<em><b>Ss Ext Wholesale Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ss Ext Wholesale Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ss Ext Wholesale Cost</em>' attribute.
	 * @see #setSsExtWholesaleCost(Double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSales_SsExtWholesaleCost()
	 * @model
	 * @generated
	 */
	Double getSsExtWholesaleCost();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreSales#getSsExtWholesaleCost <em>Ss Ext Wholesale Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ss Ext Wholesale Cost</em>' attribute.
	 * @see #getSsExtWholesaleCost()
	 * @generated
	 */
	void setSsExtWholesaleCost(Double value);

	/**
	 * Returns the value of the '<em><b>Ss Ext List Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ss Ext List Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ss Ext List Price</em>' attribute.
	 * @see #setSsExtListPrice(Double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSales_SsExtListPrice()
	 * @model
	 * @generated
	 */
	Double getSsExtListPrice();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreSales#getSsExtListPrice <em>Ss Ext List Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ss Ext List Price</em>' attribute.
	 * @see #getSsExtListPrice()
	 * @generated
	 */
	void setSsExtListPrice(Double value);

	/**
	 * Returns the value of the '<em><b>Ss Ext Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ss Ext Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ss Ext Tax</em>' attribute.
	 * @see #setSsExtTax(Double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSales_SsExtTax()
	 * @model
	 * @generated
	 */
	Double getSsExtTax();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreSales#getSsExtTax <em>Ss Ext Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ss Ext Tax</em>' attribute.
	 * @see #getSsExtTax()
	 * @generated
	 */
	void setSsExtTax(Double value);

	/**
	 * Returns the value of the '<em><b>Ss Coupon Amt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ss Coupon Amt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ss Coupon Amt</em>' attribute.
	 * @see #setSsCouponAmt(Double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSales_SsCouponAmt()
	 * @model
	 * @generated
	 */
	Double getSsCouponAmt();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreSales#getSsCouponAmt <em>Ss Coupon Amt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ss Coupon Amt</em>' attribute.
	 * @see #getSsCouponAmt()
	 * @generated
	 */
	void setSsCouponAmt(Double value);

	/**
	 * Returns the value of the '<em><b>Ss Net Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ss Net Paid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ss Net Paid</em>' attribute.
	 * @see #setSsNetPaid(Double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSales_SsNetPaid()
	 * @model
	 * @generated
	 */
	Double getSsNetPaid();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreSales#getSsNetPaid <em>Ss Net Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ss Net Paid</em>' attribute.
	 * @see #getSsNetPaid()
	 * @generated
	 */
	void setSsNetPaid(Double value);

	/**
	 * Returns the value of the '<em><b>Ss Net Paid Inc Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ss Net Paid Inc Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ss Net Paid Inc Tax</em>' attribute.
	 * @see #setSsNetPaidIncTax(Double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSales_SsNetPaidIncTax()
	 * @model
	 * @generated
	 */
	Double getSsNetPaidIncTax();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreSales#getSsNetPaidIncTax <em>Ss Net Paid Inc Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ss Net Paid Inc Tax</em>' attribute.
	 * @see #getSsNetPaidIncTax()
	 * @generated
	 */
	void setSsNetPaidIncTax(Double value);

	/**
	 * Returns the value of the '<em><b>Ss Net Profit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ss Net Profit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ss Net Profit</em>' attribute.
	 * @see #setSsNetProfit(Double)
	 * @see tpcds.tpcdsModel.TpcdsModelPackage#getStoreSales_SsNetProfit()
	 * @model
	 * @generated
	 */
	Double getSsNetProfit();

	/**
	 * Sets the value of the '{@link tpcds.tpcdsModel.StoreSales#getSsNetProfit <em>Ss Net Profit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ss Net Profit</em>' attribute.
	 * @see #getSsNetProfit()
	 * @generated
	 */
	void setSsNetProfit(Double value);

} // StoreSales
