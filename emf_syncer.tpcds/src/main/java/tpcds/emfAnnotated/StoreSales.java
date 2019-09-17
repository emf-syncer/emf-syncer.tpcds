package tpcds.emfAnnotated;


/**
* @model
*/
public interface StoreSales {

  /**
  * @model
  */
  public DateDim getSsSoldDateSk(); 

  /**
  * @model
  */
  public Long getSsSoldTimeSk(); 

  /**
  * @model
  */
  public Long getSsItemSk(); 


  /**
  * @model
  */
  public StoreSalesId getSsId();
  /**
  * @model
  */
  public Customer getSsCustomerSk();
  /**
  * @model
  */  
  public Long getSsTicketNumber();
  
  /**
   * @model
   */
  public Long getSsCdemoSk(); 

  /**
  * @model
  */
  public Long getSsHdemoSk(); 

  /**
  * @model
  */
  public Long getSsAddrSk(); 

  /**
  * @model
  */
  public Store getSsStoreSk(); 

  /**
  * @model
  */
  public Long getSsPromoSk(); 

  /**
  * @model
  */
  public Long getSsQuantity(); 

  /**
  * @model
  */
  public Double getSsWholesaleCost(); 

  /**
  * @model
  */
  public Double getSsListPrice(); 

  /**
  * @model
  */
  public Double getSsSalesPrice(); 

  /**
  * @model
  */
  public Double getSsExtDiscountAmt(); 

  /**
  * @model
  */
  public Double getSsExtSalesPrice(); 

  /**
  * @model
  */
  public Double getSsExtWholesaleCost(); 

  /**
  * @model
  */
  public Double getSsExtListPrice(); 

  /**
  * @model
  */
  public Double getSsExtTax(); 

  /**
  * @model
  */
  public Double getSsCouponAmt(); 

  /**
  * @model
  */
  public Double getSsNetPaid(); 

  /**
  * @model
  */
  public Double getSsNetPaidIncTax(); 

  /**
  * @model
  */
  public Double getSsNetProfit(); 
}
