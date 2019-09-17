package tpcds.emfAnnotated;

import java.util.List;

/**
* @model
*/
public interface Store {

  /**
  * @model
  */
  public Long getSStoreSk(); 

  /**
  * @model
  */
  public String getSStoreId(); 

  /**
  * @model
  */
  public java.sql.Date getSRecStartDate(); 

  /**
  * @model
  */
  public java.sql.Date getSRecEndDate(); 

  /**
  * @model
  */
  public Long getSClosedDateSk(); 

  /**
  * @model
  */
  public String getSStoreName(); 

  /**
  * @model
  */
  public Long getSNumberEmployees(); 

  /**
  * @model
  */
  public Long getSFloorSpace(); 

  /**
  * @model
  */
  public String getSHours(); 

  /**
  * @model
  */
  public String getSManager(); 

  /**
  * @model
  */
  public Long getSMarketId(); 

  /**
  * @model
  */
  public String getSGeographyClass(); 

  /**
  * @model
  */
  public String getSMarketDesc(); 

  /**
  * @model
  */
  public String getSMarketManager(); 

  /**
  * @model
  */
  public Long getSDivisionId(); 

  /**
  * @model
  */
  public String getSDivisionName(); 

  /**
  * @model
  */
  public Long getSCompanyId(); 

  /**
  * @model
  */
  public String getSCompanyName(); 

  /**
  * @model
  */
  public String getSStreetNumber(); 

  /**
  * @model
  */
  public String getSStreetName(); 

  /**
  * @model
  */
  public String getSStreetType(); 

  /**
  * @model
  */
  public String getSSuiteNumber(); 

  /**
  * @model
  */
  public String getSCity(); 

  /**
  * @model
  */
  public String getSCounty(); 

  /**
  * @model
  */
  public String getSState(); 

  /**
  * @model
  */
  public String getSZip(); 

  /**
  * @model
  */
  public String getSCountry(); 

  /**
  * @model
  */
  public double getSGmtOffset(); 

  /**
  * @model
  */
  public double getSTaxPrecentage(); 
  
  /**
  * @model
  */
  public List<StoreSales> getStoreSales();

  /**
  * @model opposite="srStoreSk"
  */
  public List<StoreReturns> getStoreReturns();
}
