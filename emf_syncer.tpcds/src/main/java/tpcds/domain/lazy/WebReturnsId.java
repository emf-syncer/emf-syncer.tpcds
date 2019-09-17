package tpcds.domain.lazy;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class WebReturnsId implements Serializable {
  private Long wrItemSk;
  private Long wrOrderNumber;


  public Long getWrItemSk() {
    return wrItemSk;
  }

  public void setWrItemSk(Long wrItemSk) {
    this.wrItemSk = wrItemSk;
  }




  public Long getWrOrderNumber() {
    return wrOrderNumber;
  }

  public void setWrOrderNumber(Long wrOrderNumber) {
    this.wrOrderNumber = wrOrderNumber;
  }




}
