package tpcds.emfAnnotated;

/**
* @model
*/
public interface Inventory {



  /**
  * @model
  */
  public Long getInvDateSk(); 

  /**
  * @model
  */
  public Long getInvItemSk(); 

  /**
  * @model
  */
  public Long getInvWarehouseSk(); 

  /**
  * @model
  */
  public Long getInvQuantityOnHand(); 
}
