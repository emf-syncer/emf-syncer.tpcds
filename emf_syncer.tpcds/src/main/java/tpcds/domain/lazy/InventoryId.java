package tpcds.domain.lazy;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class InventoryId implements Serializable {
  private Long invDateSk;
  private Long invItemSk;
  private Long invWarehouseSk;


  public Long getInvDateSk() {
    return invDateSk;
  }

  public void setInvDateSk(Long invDateSk) {
    this.invDateSk = invDateSk;
  }


  public Long getInvItemSk() {
    return invItemSk;
  }

  public void setInvItemSk(Long invItemSk) {
    this.invItemSk = invItemSk;
  }


  public Long getInvWarehouseSk() {
    return invWarehouseSk;
  }

  public void setInvWarehouseSk(Long invWarehouseSk) {
    this.invWarehouseSk = invWarehouseSk;
  }



}
