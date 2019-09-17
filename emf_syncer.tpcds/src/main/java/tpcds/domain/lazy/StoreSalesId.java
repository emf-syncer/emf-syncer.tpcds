package tpcds.domain.lazy;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Embeddable
public class StoreSalesId implements Serializable {
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "ss_customer_sk", referencedColumnName = "c_customer_sk")
  private Customer ssCustomerSk;
	@Column(name="ss_ticket_number")
  private Long ssTicketNumber;



  public Customer getSsCustomerSk() {
    return ssCustomerSk;
  }

  public void setSsCustomerSk(Customer ssCustomerSk) {
    this.ssCustomerSk = ssCustomerSk;
  }


  public Long getSsTicketNumber() {
    return ssTicketNumber;
  }

  public void setSsTicketNumber(Long ssTicketNumber) {
    this.ssTicketNumber = ssTicketNumber;
  }


}
