package tpcds.emfAnnotated;

/**
* @model
*/
public interface StoreReturns {

  /**
  * @model
  */
  public DateDim getSrReturnedDateSk(); 

  /**
  * @model
  */
  public Long getSrReturnTimeSk(); 

  /**
  * @model
  */
  public StoreReturnsId getSrId(); 
  /**
  * @model
  */
  public Long getSrItemSk();
  /**
  * @model
  */
  public Long getSrTicketNumber();
  
  /**
  * @model
  */
  public Customer getSrCustomerSk(); 

  /**
  * @model
  */
  public Long getSrCdemoSk(); 

  /**
  * @model
  */
  public Long getSrHdemoSk(); 

  /**
  * @model
  */
  public Long getSrAddrSk(); 

  /**
  * @model opposite="storeReturns"
  */
  public Store getSrStoreSk(); 

  /**
  * @model
  */
  public Long getSrReasonSk(); 

  /**
  * @model
  */
  public Long getSrReturnQuantity(); 

  /**
  * @model unsettable="true"
  */
  public double getSrReturnAmt(); 

  /**
  * @model
  */
  public double getSrReturnTax(); 

  /**
  * @model
  */
  public double getSrReturnAmtIncTax(); 

  /**
  * @model
  */
  public double getSrFee(); 

  /**
  * @model
  */
  public double getSrReturnShipCost(); 

  /**
  * @model
  */
  public double getSrRefundedCash(); 

  /**
  * @model
  */
  public double getSrReversedCharge(); 

  /**
  * @model
  */
  public double getSrStoreCredit(); 

  /**
  * @model
  */
  public double getSrNetLoss(); 
}
