package tpcds.emf.q1;

import java.util.List;

/**
* @model
*/
public interface Store {

  /**
  * @model unsettable="true"
  */
  public Long getSStoreSk(); 

  /**
  * @model unsettable="true"
  */
  public String getSStoreId(); 

  /**
  * @model unsettable="true"
  */
  public String getSState(); 

  
  /**
  * @model opposite="srStoreSk" unsettable="true" containment="true"
  */
  public List<StoreReturns> getStoreReturns();
}
