package tpcds.domain.lazy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HouseholdDemographics {
@Id
  private Long hdDemoSk;
  private Long hdIncomeBandSk;
  private String hdBuyPotential;
  private Long hdDepCount;
  private Long hdVehicleCount;


  public Long getHdDemoSk() {
    return hdDemoSk;
  }

  public void setHdDemoSk(Long hdDemoSk) {
    this.hdDemoSk = hdDemoSk;
  }


  public Long getHdIncomeBandSk() {
    return hdIncomeBandSk;
  }

  public void setHdIncomeBandSk(Long hdIncomeBandSk) {
    this.hdIncomeBandSk = hdIncomeBandSk;
  }


  public String getHdBuyPotential() {
    return hdBuyPotential;
  }

  public void setHdBuyPotential(String hdBuyPotential) {
    this.hdBuyPotential = hdBuyPotential;
  }


  public Long getHdDepCount() {
    return hdDepCount;
  }

  public void setHdDepCount(Long hdDepCount) {
    this.hdDepCount = hdDepCount;
  }


  public Long getHdVehicleCount() {
    return hdVehicleCount;
  }

  public void setHdVehicleCount(Long hdVehicleCount) {
    this.hdVehicleCount = hdVehicleCount;
  }

}
