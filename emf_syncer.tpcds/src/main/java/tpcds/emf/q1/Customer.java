package tpcds.emf.q1;

import java.util.List;

/**
* @model
*/
public interface Customer {



  /**
  * @model unsettable="true"
  */
  public Long getCCustomerSk(); 

  /**
  * @model unsettable="true"
  */
  public String getCCustomerId(); 

  /**
   * @model
   */
   public String getCPreferredCustFlag(); 
  
  /**
  * @model kind="reference" type="StoreReturns" opposite="srCustomerSk" unsettable="true"
  */
  public List<StoreReturns> getStoreReturns();

}
