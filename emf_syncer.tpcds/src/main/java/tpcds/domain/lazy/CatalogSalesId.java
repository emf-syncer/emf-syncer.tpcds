package tpcds.domain.lazy;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CatalogSalesId implements Serializable {

  private Long csItemSk;
  private Long csOrderNumber;



  public Long getCsItemSk() {
    return csItemSk;
  }

  public void setCsItemSk(Long csItemSk) {
    this.csItemSk = csItemSk;
  }


  public Long getCsOrderNumber() {
    return csOrderNumber;
  }

  public void setCsOrderNumber(Long csOrderNumber) {
    this.csOrderNumber = csOrderNumber;
  }


}
