package tpcds.domain.lazy;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Inventory  {
  @EmbeddedId
  private InventoryId invId;
  private Long invQuantityOnHand;


  public InventoryId getInvId() {
    return invId;
  }

  public void setInvId(InventoryId invId) {
    this.invId = invId;
  }


  public Long getInvQuantityOnHand() {
    return invQuantityOnHand;
  }

  public void setInvQuantityOnHand(Long invQuantityOnHand) {
    this.invQuantityOnHand = invQuantityOnHand;
  }

}
