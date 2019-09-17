package tpcds.emf.q1;

/**
* @model
*/
public interface DateDim {



  /**
  * @model unsettable="true"
  */
  public Long getDDateSk(); 

  /**
  * @model unsettable="true"
  */
  public String getDDateId(); 

  /**
  * @model unsettable="true"
  */
  public Long getDYear(); 

}
