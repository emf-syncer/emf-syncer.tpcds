package tpcds.domain.lazy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CallCenter implements tpcds.emfAnnotated.CallCenter {

	@Id
  private Long ccCallCenterSk;
  private String ccCallCenterId;
  private java.sql.Date ccRecStartDate;
  private java.sql.Date ccRecEndDate;
  private Long ccClosedDateSk;
  private Long ccOpenDateSk;
  private String ccName;
  private String ccClass;
  private Long ccEmployees;
  private Long ccSqFt;
  private String ccHours;
  private String ccManager;
  private Long ccMktId;
  private String ccMktClass;
  private String ccMktDesc;
  private String ccMarketManager;
  private Long ccDivision;
  private String ccDivisionName;
  private Long ccCompany;
  private String ccCompanyName;
  private String ccStreetNumber;
  private String ccStreetName;
  private String ccStreetType;
  private String ccSuiteNumber;
  private String ccCity;
  private String ccCounty;
  private String ccState;
  private String ccZip;
  private String ccCountry;
  private double ccGmtOffset;
  private double ccTaxPercentage;


  public Long getCcCallCenterSk() {
    return ccCallCenterSk;
  }

  public void setCcCallCenterSk(Long ccCallCenterSk) {
    this.ccCallCenterSk = ccCallCenterSk;
  }


  public String getCcCallCenterId() {
    return ccCallCenterId;
  }

  public void setCcCallCenterId(String ccCallCenterId) {
    this.ccCallCenterId = ccCallCenterId;
  }


  public java.sql.Date getCcRecStartDate() {
    return ccRecStartDate;
  }

  public void setCcRecStartDate(java.sql.Date ccRecStartDate) {
    this.ccRecStartDate = ccRecStartDate;
  }


  public java.sql.Date getCcRecEndDate() {
    return ccRecEndDate;
  }

  public void setCcRecEndDate(java.sql.Date ccRecEndDate) {
    this.ccRecEndDate = ccRecEndDate;
  }


  public Long getCcClosedDateSk() {
    return ccClosedDateSk;
  }

  public void setCcClosedDateSk(Long ccClosedDateSk) {
    this.ccClosedDateSk = ccClosedDateSk;
  }


  public Long getCcOpenDateSk() {
    return ccOpenDateSk;
  }

  public void setCcOpenDateSk(Long ccOpenDateSk) {
    this.ccOpenDateSk = ccOpenDateSk;
  }


  public String getCcName() {
    return ccName;
  }

  public void setCcName(String ccName) {
    this.ccName = ccName;
  }


  public String getCcClass() {
    return ccClass;
  }

  public void setCcClass(String ccClass) {
    this.ccClass = ccClass;
  }


  public Long getCcEmployees() {
    return ccEmployees;
  }

  public void setCcEmployees(Long ccEmployees) {
    this.ccEmployees = ccEmployees;
  }


  public Long getCcSqFt() {
    return ccSqFt;
  }

  public void setCcSqFt(Long ccSqFt) {
    this.ccSqFt = ccSqFt;
  }


  public String getCcHours() {
    return ccHours;
  }

  public void setCcHours(String ccHours) {
    this.ccHours = ccHours;
  }


  public String getCcManager() {
    return ccManager;
  }

  public void setCcManager(String ccManager) {
    this.ccManager = ccManager;
  }


  public Long getCcMktId() {
    return ccMktId;
  }

  public void setCcMktId(Long ccMktId) {
    this.ccMktId = ccMktId;
  }


  public String getCcMktClass() {
    return ccMktClass;
  }

  public void setCcMktClass(String ccMktClass) {
    this.ccMktClass = ccMktClass;
  }


  public String getCcMktDesc() {
    return ccMktDesc;
  }

  public void setCcMktDesc(String ccMktDesc) {
    this.ccMktDesc = ccMktDesc;
  }


  public String getCcMarketManager() {
    return ccMarketManager;
  }

  public void setCcMarketManager(String ccMarketManager) {
    this.ccMarketManager = ccMarketManager;
  }


  public Long getCcDivision() {
    return ccDivision;
  }

  public void setCcDivision(Long ccDivision) {
    this.ccDivision = ccDivision;
  }


  public String getCcDivisionName() {
    return ccDivisionName;
  }

  public void setCcDivisionName(String ccDivisionName) {
    this.ccDivisionName = ccDivisionName;
  }


  public Long getCcCompany() {
    return ccCompany;
  }

  public void setCcCompany(Long ccCompany) {
    this.ccCompany = ccCompany;
  }


  public String getCcCompanyName() {
    return ccCompanyName;
  }

  public void setCcCompanyName(String ccCompanyName) {
    this.ccCompanyName = ccCompanyName;
  }


  public String getCcStreetNumber() {
    return ccStreetNumber;
  }

  public void setCcStreetNumber(String ccStreetNumber) {
    this.ccStreetNumber = ccStreetNumber;
  }


  public String getCcStreetName() {
    return ccStreetName;
  }

  public void setCcStreetName(String ccStreetName) {
    this.ccStreetName = ccStreetName;
  }


  public String getCcStreetType() {
    return ccStreetType;
  }

  public void setCcStreetType(String ccStreetType) {
    this.ccStreetType = ccStreetType;
  }


  public String getCcSuiteNumber() {
    return ccSuiteNumber;
  }

  public void setCcSuiteNumber(String ccSuiteNumber) {
    this.ccSuiteNumber = ccSuiteNumber;
  }


  public String getCcCity() {
    return ccCity;
  }

  public void setCcCity(String ccCity) {
    this.ccCity = ccCity;
  }


  public String getCcCounty() {
    return ccCounty;
  }

  public void setCcCounty(String ccCounty) {
    this.ccCounty = ccCounty;
  }


  public String getCcState() {
    return ccState;
  }

  public void setCcState(String ccState) {
    this.ccState = ccState;
  }


  public String getCcZip() {
    return ccZip;
  }

  public void setCcZip(String ccZip) {
    this.ccZip = ccZip;
  }


  public String getCcCountry() {
    return ccCountry;
  }

  public void setCcCountry(String ccCountry) {
    this.ccCountry = ccCountry;
  }


  public double getCcGmtOffset() {
    return ccGmtOffset;
  }

  public void setCcGmtOffset(double ccGmtOffset) {
    this.ccGmtOffset = ccGmtOffset;
  }


  public double getCcTaxPercentage() {
    return ccTaxPercentage;
  }

  public void setCcTaxPercentage(double ccTaxPercentage) {
    this.ccTaxPercentage = ccTaxPercentage;
  }

}
