package tpcds.domain.lazy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WebSite {
@Id
  private Long webSiteSk;
  private String webSiteId;
  private java.sql.Date webRecStartDate;
  private java.sql.Date webRecEndDate;
  private String webName;
  private Long webOpenDateSk;
  private Long webCloseDateSk;
  private String webClass;
  private String webManager;
  private Long webMktId;
  private String webMktClass;
  private String webMktDesc;
  private String webMarketManager;
  private Long webCompanyId;
  private String webCompanyName;
  private String webStreetNumber;
  private String webStreetName;
  private String webStreetType;
  private String webSuiteNumber;
  private String webCity;
  private String webCounty;
  private String webState;
  private String webZip;
  private String webCountry;
  private double webGmtOffset;
  private double webTaxPercentage;


  public Long getWebSiteSk() {
    return webSiteSk;
  }

  public void setWebSiteSk(Long webSiteSk) {
    this.webSiteSk = webSiteSk;
  }


  public String getWebSiteId() {
    return webSiteId;
  }

  public void setWebSiteId(String webSiteId) {
    this.webSiteId = webSiteId;
  }


  public java.sql.Date getWebRecStartDate() {
    return webRecStartDate;
  }

  public void setWebRecStartDate(java.sql.Date webRecStartDate) {
    this.webRecStartDate = webRecStartDate;
  }


  public java.sql.Date getWebRecEndDate() {
    return webRecEndDate;
  }

  public void setWebRecEndDate(java.sql.Date webRecEndDate) {
    this.webRecEndDate = webRecEndDate;
  }


  public String getWebName() {
    return webName;
  }

  public void setWebName(String webName) {
    this.webName = webName;
  }


  public Long getWebOpenDateSk() {
    return webOpenDateSk;
  }

  public void setWebOpenDateSk(Long webOpenDateSk) {
    this.webOpenDateSk = webOpenDateSk;
  }


  public Long getWebCloseDateSk() {
    return webCloseDateSk;
  }

  public void setWebCloseDateSk(Long webCloseDateSk) {
    this.webCloseDateSk = webCloseDateSk;
  }


  public String getWebClass() {
    return webClass;
  }

  public void setWebClass(String webClass) {
    this.webClass = webClass;
  }


  public String getWebManager() {
    return webManager;
  }

  public void setWebManager(String webManager) {
    this.webManager = webManager;
  }


  public Long getWebMktId() {
    return webMktId;
  }

  public void setWebMktId(Long webMktId) {
    this.webMktId = webMktId;
  }


  public String getWebMktClass() {
    return webMktClass;
  }

  public void setWebMktClass(String webMktClass) {
    this.webMktClass = webMktClass;
  }


  public String getWebMktDesc() {
    return webMktDesc;
  }

  public void setWebMktDesc(String webMktDesc) {
    this.webMktDesc = webMktDesc;
  }


  public String getWebMarketManager() {
    return webMarketManager;
  }

  public void setWebMarketManager(String webMarketManager) {
    this.webMarketManager = webMarketManager;
  }


  public Long getWebCompanyId() {
    return webCompanyId;
  }

  public void setWebCompanyId(Long webCompanyId) {
    this.webCompanyId = webCompanyId;
  }


  public String getWebCompanyName() {
    return webCompanyName;
  }

  public void setWebCompanyName(String webCompanyName) {
    this.webCompanyName = webCompanyName;
  }


  public String getWebStreetNumber() {
    return webStreetNumber;
  }

  public void setWebStreetNumber(String webStreetNumber) {
    this.webStreetNumber = webStreetNumber;
  }


  public String getWebStreetName() {
    return webStreetName;
  }

  public void setWebStreetName(String webStreetName) {
    this.webStreetName = webStreetName;
  }


  public String getWebStreetType() {
    return webStreetType;
  }

  public void setWebStreetType(String webStreetType) {
    this.webStreetType = webStreetType;
  }


  public String getWebSuiteNumber() {
    return webSuiteNumber;
  }

  public void setWebSuiteNumber(String webSuiteNumber) {
    this.webSuiteNumber = webSuiteNumber;
  }


  public String getWebCity() {
    return webCity;
  }

  public void setWebCity(String webCity) {
    this.webCity = webCity;
  }


  public String getWebCounty() {
    return webCounty;
  }

  public void setWebCounty(String webCounty) {
    this.webCounty = webCounty;
  }


  public String getWebState() {
    return webState;
  }

  public void setWebState(String webState) {
    this.webState = webState;
  }


  public String getWebZip() {
    return webZip;
  }

  public void setWebZip(String webZip) {
    this.webZip = webZip;
  }


  public String getWebCountry() {
    return webCountry;
  }

  public void setWebCountry(String webCountry) {
    this.webCountry = webCountry;
  }


  public double getWebGmtOffset() {
    return webGmtOffset;
  }

  public void setWebGmtOffset(double webGmtOffset) {
    this.webGmtOffset = webGmtOffset;
  }


  public double getWebTaxPercentage() {
    return webTaxPercentage;
  }

  public void setWebTaxPercentage(double webTaxPercentage) {
    this.webTaxPercentage = webTaxPercentage;
  }

}
