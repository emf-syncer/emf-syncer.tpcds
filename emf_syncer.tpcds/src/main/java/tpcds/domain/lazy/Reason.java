package tpcds.domain.lazy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reason {
@Id
  private Long rReasonSk;
  private String rReasonId;
  private String rReasonDesc;


  public Long getRReasonSk() {
    return rReasonSk;
  }

  public void setRReasonSk(Long rReasonSk) {
    this.rReasonSk = rReasonSk;
  }


  public String getRReasonId() {
    return rReasonId;
  }

  public void setRReasonId(String rReasonId) {
    this.rReasonId = rReasonId;
  }


  public String getRReasonDesc() {
    return rReasonDesc;
  }

  public void setRReasonDesc(String rReasonDesc) {
    this.rReasonDesc = rReasonDesc;
  }

}
