package tpcds.domain.lazy;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CatalogReturnsId implements Serializable {

  private Long crItemSk;
  private Long crOrderNumber;



  public Long getCrItemSk() {
    return crItemSk;
  }

  public void setCrItemSk(Long crItemSk) {
    this.crItemSk = crItemSk;
  }




  public Long getCrOrderNumber() {
    return crOrderNumber;
  }

  public void setCrOrderNumber(Long crOrderNumber) {
    this.crOrderNumber = crOrderNumber;
  }



}
