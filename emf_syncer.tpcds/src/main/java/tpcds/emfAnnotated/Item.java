package tpcds.emfAnnotated;

/**
* @model
*/
public interface Item {



  /**
  * @model
  */
  public Long getIItemSk(); 

  /**
  * @model
  */
  public String getIItemId(); 

  /**
  * @model
  */
  public java.sql.Date getIRecStartDate(); 

  /**
  * @model
  */
  public java.sql.Date getIRecEndDate(); 

  /**
  * @model
  */
  public String getIItemDesc(); 

  /**
  * @model
  */
  public double getICurrentPrice(); 

  /**
  * @model
  */
  public double getIWholesaleCost(); 

  /**
  * @model
  */
  public Long getIBrandId(); 

  /**
  * @model
  */
  public String getIBrand(); 

  /**
  * @model
  */
  public Long getIClassId(); 

  /**
  * @model
  */
  public String getIClass(); 

  /**
  * @model
  */
  public Long getICategoryId(); 

  /**
  * @model
  */
  public String getICategory(); 

  /**
  * @model
  */
  public Long getIManufactId(); 

  /**
  * @model
  */
  public String getIManufact(); 

  /**
  * @model
  */
  public String getISize(); 

  /**
  * @model
  */
  public String getIFormulation(); 

  /**
  * @model
  */
  public String getIColor(); 

  /**
  * @model
  */
  public String getIUnits(); 

  /**
  * @model
  */
  public String getIContainer(); 

  /**
  * @model
  */
  public Long getIManagerId(); 

  /**
  * @model
  */
  public String getIProductName(); 
}
