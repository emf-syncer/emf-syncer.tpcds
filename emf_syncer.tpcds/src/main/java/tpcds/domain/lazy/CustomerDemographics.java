package tpcds.domain.lazy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerDemographics {

	@Id
  private Long cdDemoSk;
  private String cdGender;
  private String cdMaritalStatus;
  private String cdEducationStatus;
  private Long cdPurchaseEstimate;
  private String cdCreditRating;
  private Long cdDepCount;
  private Long cdDepEmployedCount;
  private Long cdDepCollegeCount;


  public Long getCdDemoSk() {
    return cdDemoSk;
  }

  public void setCdDemoSk(Long cdDemoSk) {
    this.cdDemoSk = cdDemoSk;
  }


  public String getCdGender() {
    return cdGender;
  }

  public void setCdGender(String cdGender) {
    this.cdGender = cdGender;
  }


  public String getCdMaritalStatus() {
    return cdMaritalStatus;
  }

  public void setCdMaritalStatus(String cdMaritalStatus) {
    this.cdMaritalStatus = cdMaritalStatus;
  }


  public String getCdEducationStatus() {
    return cdEducationStatus;
  }

  public void setCdEducationStatus(String cdEducationStatus) {
    this.cdEducationStatus = cdEducationStatus;
  }


  public Long getCdPurchaseEstimate() {
    return cdPurchaseEstimate;
  }

  public void setCdPurchaseEstimate(Long cdPurchaseEstimate) {
    this.cdPurchaseEstimate = cdPurchaseEstimate;
  }


  public String getCdCreditRating() {
    return cdCreditRating;
  }

  public void setCdCreditRating(String cdCreditRating) {
    this.cdCreditRating = cdCreditRating;
  }


  public Long getCdDepCount() {
    return cdDepCount;
  }

  public void setCdDepCount(Long cdDepCount) {
    this.cdDepCount = cdDepCount;
  }


  public Long getCdDepEmployedCount() {
    return cdDepEmployedCount;
  }

  public void setCdDepEmployedCount(Long cdDepEmployedCount) {
    this.cdDepEmployedCount = cdDepEmployedCount;
  }


  public Long getCdDepCollegeCount() {
    return cdDepCollegeCount;
  }

  public void setCdDepCollegeCount(Long cdDepCollegeCount) {
    this.cdDepCollegeCount = cdDepCollegeCount;
  }

}
