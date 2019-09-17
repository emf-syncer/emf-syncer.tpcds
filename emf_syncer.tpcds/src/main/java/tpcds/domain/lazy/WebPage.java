package tpcds.domain.lazy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WebPage {
@Id
  private Long wpWebPageSk;
  private String wpWebPageId;
  private java.sql.Date wpRecStartDate;
  private java.sql.Date wpRecEndDate;
  private Long wpCreationDateSk;
  private Long wpAccessDateSk;
  private String wpAutogenFlag;
  private Long wpCustomerSk;
  private String wpUrl;
  private String wpType;
  private Long wpCharCount;
  private Long wpLinkCount;
  private Long wpImageCount;
  private Long wpMaxAdCount;


  public Long getWpWebPageSk() {
    return wpWebPageSk;
  }

  public void setWpWebPageSk(Long wpWebPageSk) {
    this.wpWebPageSk = wpWebPageSk;
  }


  public String getWpWebPageId() {
    return wpWebPageId;
  }

  public void setWpWebPageId(String wpWebPageId) {
    this.wpWebPageId = wpWebPageId;
  }


  public java.sql.Date getWpRecStartDate() {
    return wpRecStartDate;
  }

  public void setWpRecStartDate(java.sql.Date wpRecStartDate) {
    this.wpRecStartDate = wpRecStartDate;
  }


  public java.sql.Date getWpRecEndDate() {
    return wpRecEndDate;
  }

  public void setWpRecEndDate(java.sql.Date wpRecEndDate) {
    this.wpRecEndDate = wpRecEndDate;
  }


  public Long getWpCreationDateSk() {
    return wpCreationDateSk;
  }

  public void setWpCreationDateSk(Long wpCreationDateSk) {
    this.wpCreationDateSk = wpCreationDateSk;
  }


  public Long getWpAccessDateSk() {
    return wpAccessDateSk;
  }

  public void setWpAccessDateSk(Long wpAccessDateSk) {
    this.wpAccessDateSk = wpAccessDateSk;
  }


  public String getWpAutogenFlag() {
    return wpAutogenFlag;
  }

  public void setWpAutogenFlag(String wpAutogenFlag) {
    this.wpAutogenFlag = wpAutogenFlag;
  }


  public Long getWpCustomerSk() {
    return wpCustomerSk;
  }

  public void setWpCustomerSk(Long wpCustomerSk) {
    this.wpCustomerSk = wpCustomerSk;
  }


  public String getWpUrl() {
    return wpUrl;
  }

  public void setWpUrl(String wpUrl) {
    this.wpUrl = wpUrl;
  }


  public String getWpType() {
    return wpType;
  }

  public void setWpType(String wpType) {
    this.wpType = wpType;
  }


  public Long getWpCharCount() {
    return wpCharCount;
  }

  public void setWpCharCount(Long wpCharCount) {
    this.wpCharCount = wpCharCount;
  }


  public Long getWpLinkCount() {
    return wpLinkCount;
  }

  public void setWpLinkCount(Long wpLinkCount) {
    this.wpLinkCount = wpLinkCount;
  }


  public Long getWpImageCount() {
    return wpImageCount;
  }

  public void setWpImageCount(Long wpImageCount) {
    this.wpImageCount = wpImageCount;
  }


  public Long getWpMaxAdCount() {
    return wpMaxAdCount;
  }

  public void setWpMaxAdCount(Long wpMaxAdCount) {
    this.wpMaxAdCount = wpMaxAdCount;
  }

}
