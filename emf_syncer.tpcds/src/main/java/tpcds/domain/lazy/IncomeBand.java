package tpcds.domain.lazy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IncomeBand {
@Id
  private Long ibIncomeBandSk;
  private Long ibLowerBound;
  private Long ibUpperBound;


  public Long getIbIncomeBandSk() {
    return ibIncomeBandSk;
  }

  public void setIbIncomeBandSk(Long ibIncomeBandSk) {
    this.ibIncomeBandSk = ibIncomeBandSk;
  }


  public Long getIbLowerBound() {
    return ibLowerBound;
  }

  public void setIbLowerBound(Long ibLowerBound) {
    this.ibLowerBound = ibLowerBound;
  }


  public Long getIbUpperBound() {
    return ibUpperBound;
  }

  public void setIbUpperBound(Long ibUpperBound) {
    this.ibUpperBound = ibUpperBound;
  }

}
