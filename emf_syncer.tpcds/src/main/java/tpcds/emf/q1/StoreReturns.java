package tpcds.emf.q1;

/**
* @model
*/
public interface StoreReturns {

  /**
  * @model unsettable="true"
  */
  public DateDim getSrReturnedDateSk(); 

  /**
  * @model unsettable="true"
  */
  public StoreReturnsId getSrId(); 
  
  /**
  * @model unsettable="true"
  */
  public Customer getSrCustomerSk(); 

  /**
  * @model opposite="storeReturns" unsettable="true"
  */
  public Store getSrStoreSk(); 

  /**
  * @model unsettable="true" 
  */
  public double getSrReturnAmt(); 

}
