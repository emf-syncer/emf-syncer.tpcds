package tpcds.emfAnnotated;

/**
* @model
*/
public interface HouseholdDemographics {



  /**
  * @model
  */
  public Long getHdDemoSk(); 

  /**
  * @model
  */
  public Long getHdIncomeBandSk(); 

  /**
  * @model
  */
  public String getHdBuyPotential(); 

  /**
  * @model
  */
  public Long getHdDepCount(); 

  /**
  * @model
  */
  public Long getHdVehicleCount(); 
}
