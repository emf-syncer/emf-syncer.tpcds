package tpcds.emfAnnotated;

/**
* @model
*/
public interface DbgenVersion {



  /**
  * @model
  */
  public String getDvVersion(); 

  /**
  * @model
  */
  public java.sql.Date getDvCreateDate(); 

  /**
  * @model
  */
  public java.sql.Time getDvCreateTime(); 

  /**
  * @model
  */
  public String getDvCmdlineArgs(); 
}
