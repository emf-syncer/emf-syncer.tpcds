package tpcds.domain.lazy;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class StoreReturnsId implements Serializable {
	@Column(name = "sr_item_sk")
  private Long srItemSk;
	@Column(name = "sr_ticket_number")
  private Long srTicketNumber;



  public Long getSrItemSk() {
    return srItemSk;
  }

  public void setSrItemSk(Long srItemSk) {
    this.srItemSk = srItemSk;
  }



  public Long getSrTicketNumber() {
    return srTicketNumber;
  }

  public void setSrTicketNumber(Long srTicketNumber) {
    this.srTicketNumber = srTicketNumber;
  }



}
