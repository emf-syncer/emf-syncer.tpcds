package tpcds.emfAnnotated;

/**
* @model
*/
public interface TimeDim {



  /**
  * @model
  */
  public Long getTTimeSk(); 

  /**
  * @model
  */
  public String getTTimeId(); 

  /**
  * @model
  */
  public Long getTTime(); 

  /**
  * @model
  */
  public Long getTHour(); 

  /**
  * @model
  */
  public Long getTMinute(); 

  /**
  * @model
  */
  public Long getTSecond(); 

  /**
  * @model
  */
  public String getTAmPm(); 

  /**
  * @model
  */
  public String getTShift(); 

  /**
  * @model
  */
  public String getTSubShift(); 

  /**
  * @model
  */
  public String getTMealTime(); 
}
