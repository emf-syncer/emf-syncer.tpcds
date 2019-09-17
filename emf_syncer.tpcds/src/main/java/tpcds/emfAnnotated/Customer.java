package tpcds.emfAnnotated;

import java.util.List;

/**
* @model
*/
public interface Customer {



  /**
  * @model
  */
  public Long getCCustomerSk(); 

  /**
  * @model
  */
  public String getCCustomerId(); 

  /**
  * @model
  */
  public Long getCCurrentCdemoSk(); 

  /**
  * @model
  */
  public Long getCCurrentHdemoSk(); 

  /**
  * @model
  */
  public Long getCCurrentAddrSk(); 

  /**
  * @model
  */
  public Long getCFirstShiptoDateSk(); 

  /**
  * @model
  */
  public Long getCFirstSalesDateSk(); 

  /**
  * @model
  */
  public String getCSalutation(); 

  /**
  * @model
  */
  public String getCFirstName(); 

  /**
  * @model
  */
  public String getCLastName(); 

  /**
  * @model
  */
  public String getCPreferredCustFlag(); 

  /**
  * @model
  */
  public Long getCBirthDay(); 

  /**
  * @model
  */
  public Long getCBirthMonth(); 

  /**
  * @model
  */
  public Long getCBirthYear(); 

  /**
  * @model
  */
  public String getCBirthCountry(); 

  /**
  * @model
  */
  public String getCLogin(); 

  /**
  * @model
  */
  public String getCEmailAddress(); 

  /**
  * @model
  */
  public String getCLastReviewDate(); 
  
  /**
  * @model kind="reference" type="StoreReturns" opposite="srCustomerSk"
  */
  public List<StoreReturns> getStoreReturns();

  /**
   * @model kind="reference" type="StoreSales" opposite="ssCustomerSk"
   */
  public List<StoreSales> getStoreSales();
}
