package tpcds.emfAnnotated;

/**
* @model
*/
public interface WebPage {



  /**
  * @model
  */
  public Long getWpWebPageSk(); 

  /**
  * @model
  */
  public String getWpWebPageId(); 

  /**
  * @model
  */
  public java.sql.Date getWpRecStartDate(); 

  /**
  * @model
  */
  public java.sql.Date getWpRecEndDate(); 

  /**
  * @model
  */
  public Long getWpCreationDateSk(); 

  /**
  * @model
  */
  public Long getWpAccessDateSk(); 

  /**
  * @model
  */
  public String getWpAutogenFlag(); 

  /**
  * @model
  */
  public Long getWpCustomerSk(); 

  /**
  * @model
  */
  public String getWpUrl(); 

  /**
  * @model
  */
  public String getWpType(); 

  /**
  * @model
  */
  public Long getWpCharCount(); 

  /**
  * @model
  */
  public Long getWpLinkCount(); 

  /**
  * @model
  */
  public Long getWpImageCount(); 

  /**
  * @model
  */
  public Long getWpMaxAdCount(); 
}
