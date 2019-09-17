package tpcds.domain.lazy;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class WebSalesId implements Serializable {

  private Long wsItemSk;
  private Long wsOrderNumber;

  public Long getWsItemSk() {
    return wsItemSk;
  }

  public void setWsItemSk(Long wsItemSk) {
    this.wsItemSk = wsItemSk;
  }


  public Long getWsOrderNumber() {
    return wsOrderNumber;
  }

  public void setWsOrderNumber(Long wsOrderNumber) {
    this.wsOrderNumber = wsOrderNumber;
  }


}
