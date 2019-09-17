package tpcds.domain.lazy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerAddress {

	@Id
  private Long caAddressSk;
  private String caAddressId;
  private String caStreetNumber;
  private String caStreetName;
  private String caStreetType;
  private String caSuiteNumber;
  private String caCity;
  private String caCounty;
  private String caState;
  private String caZip;
  private String caCountry;
  private double caGmtOffset;
  private String caLocationType;


  public Long getCaAddressSk() {
    return caAddressSk;
  }

  public void setCaAddressSk(Long caAddressSk) {
    this.caAddressSk = caAddressSk;
  }


  public String getCaAddressId() {
    return caAddressId;
  }

  public void setCaAddressId(String caAddressId) {
    this.caAddressId = caAddressId;
  }


  public String getCaStreetNumber() {
    return caStreetNumber;
  }

  public void setCaStreetNumber(String caStreetNumber) {
    this.caStreetNumber = caStreetNumber;
  }


  public String getCaStreetName() {
    return caStreetName;
  }

  public void setCaStreetName(String caStreetName) {
    this.caStreetName = caStreetName;
  }


  public String getCaStreetType() {
    return caStreetType;
  }

  public void setCaStreetType(String caStreetType) {
    this.caStreetType = caStreetType;
  }


  public String getCaSuiteNumber() {
    return caSuiteNumber;
  }

  public void setCaSuiteNumber(String caSuiteNumber) {
    this.caSuiteNumber = caSuiteNumber;
  }


  public String getCaCity() {
    return caCity;
  }

  public void setCaCity(String caCity) {
    this.caCity = caCity;
  }


  public String getCaCounty() {
    return caCounty;
  }

  public void setCaCounty(String caCounty) {
    this.caCounty = caCounty;
  }


  public String getCaState() {
    return caState;
  }

  public void setCaState(String caState) {
    this.caState = caState;
  }


  public String getCaZip() {
    return caZip;
  }

  public void setCaZip(String caZip) {
    this.caZip = caZip;
  }


  public String getCaCountry() {
    return caCountry;
  }

  public void setCaCountry(String caCountry) {
    this.caCountry = caCountry;
  }


  public double getCaGmtOffset() {
    return caGmtOffset;
  }

  public void setCaGmtOffset(double caGmtOffset) {
    this.caGmtOffset = caGmtOffset;
  }


  public String getCaLocationType() {
    return caLocationType;
  }

  public void setCaLocationType(String caLocationType) {
    this.caLocationType = caLocationType;
  }

}
