package tpcds.emfAnnotated;

/**
* @model
*/
public interface DateDim {



  /**
  * @model
  */
  public Long getDDateSk(); 

  /**
  * @model
  */
  public String getDDateId(); 

  /**
  * @model
  */
  public java.sql.Date getDDate(); 

  /**
  * @model
  */
  public Long getDMonthSeq(); 

  /**
  * @model
  */
  public Long getDWeekSeq(); 

  /**
  * @model
  */
  public Long getDQuarterSeq(); 

  /**
  * @model
  */
  public Long getDYear(); 

  /**
  * @model
  */
  public Long getDDow(); 

  /**
  * @model
  */
  public Long getDMoy(); 

  /**
  * @model
  */
  public Long getDDom(); 

  /**
  * @model
  */
  public Long getDQoy(); 

  /**
  * @model
  */
  public Long getDFyYear(); 

  /**
  * @model
  */
  public Long getDFyQuarterSeq(); 

  /**
  * @model
  */
  public Long getDFyWeekSeq(); 

  /**
  * @model
  */
  public String getDDayName(); 

  /**
  * @model
  */
  public String getDQuarterName(); 

  /**
  * @model
  */
  public String getDHoliday(); 

  /**
  * @model
  */
  public String getDWeekend(); 

  /**
  * @model
  */
  public String getDFollowingHoliday(); 

  /**
  * @model
  */
  public Long getDFirstDom(); 

  /**
  * @model
  */
  public Long getDLastDom(); 

  /**
  * @model
  */
  public Long getDSameDayLy(); 

  /**
  * @model
  */
  public Long getDSameDayLq(); 

  /**
  * @model
  */
  public String getDCurrentDay(); 

  /**
  * @model
  */
  public String getDCurrentWeek(); 

  /**
  * @model
  */
  public String getDCurrentMonth(); 

  /**
  * @model
  */
  public String getDCurrentQuarter(); 

  /**
  * @model
  */
  public String getDCurrentYear(); 
}
