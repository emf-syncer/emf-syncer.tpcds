package tpcds.emfAnnotated;

/**
* @model
*/
public interface CustomerAddress {



  /**
  * @model
  */
  public Long getCaAddressSk(); 

  /**
  * @model
  */
  public String getCaAddressId(); 

  /**
  * @model
  */
  public String getCaStreetNumber(); 

  /**
  * @model
  */
  public String getCaStreetName(); 

  /**
  * @model
  */
  public String getCaStreetType(); 

  /**
  * @model
  */
  public String getCaSuiteNumber(); 

  /**
  * @model
  */
  public String getCaCity(); 

  /**
  * @model
  */
  public String getCaCounty(); 

  /**
  * @model
  */
  public String getCaState(); 

  /**
  * @model
  */
  public String getCaZip(); 

  /**
  * @model
  */
  public String getCaCountry(); 

  /**
  * @model
  */
  public double getCaGmtOffset(); 

  /**
  * @model
  */
  public String getCaLocationType(); 
}
