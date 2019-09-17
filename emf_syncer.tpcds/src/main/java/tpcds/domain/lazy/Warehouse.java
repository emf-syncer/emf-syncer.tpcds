package tpcds.domain.lazy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Warehouse {
@Id
  private Long wWarehouseSk;
  private String wWarehouseId;
  private String wWarehouseName;
  private Long wWarehouseSqFt;
  private String wStreetNumber;
  private String wStreetName;
  private String wStreetType;
  private String wSuiteNumber;
  private String wCity;
  private String wCounty;
  private String wState;
  private String wZip;
  private String wCountry;
  private double wGmtOffset;


  public Long getWWarehouseSk() {
    return wWarehouseSk;
  }

  public void setWWarehouseSk(Long wWarehouseSk) {
    this.wWarehouseSk = wWarehouseSk;
  }


  public String getWWarehouseId() {
    return wWarehouseId;
  }

  public void setWWarehouseId(String wWarehouseId) {
    this.wWarehouseId = wWarehouseId;
  }


  public String getWWarehouseName() {
    return wWarehouseName;
  }

  public void setWWarehouseName(String wWarehouseName) {
    this.wWarehouseName = wWarehouseName;
  }


  public Long getWWarehouseSqFt() {
    return wWarehouseSqFt;
  }

  public void setWWarehouseSqFt(Long wWarehouseSqFt) {
    this.wWarehouseSqFt = wWarehouseSqFt;
  }


  public String getWStreetNumber() {
    return wStreetNumber;
  }

  public void setWStreetNumber(String wStreetNumber) {
    this.wStreetNumber = wStreetNumber;
  }


  public String getWStreetName() {
    return wStreetName;
  }

  public void setWStreetName(String wStreetName) {
    this.wStreetName = wStreetName;
  }


  public String getWStreetType() {
    return wStreetType;
  }

  public void setWStreetType(String wStreetType) {
    this.wStreetType = wStreetType;
  }


  public String getWSuiteNumber() {
    return wSuiteNumber;
  }

  public void setWSuiteNumber(String wSuiteNumber) {
    this.wSuiteNumber = wSuiteNumber;
  }


  public String getWCity() {
    return wCity;
  }

  public void setWCity(String wCity) {
    this.wCity = wCity;
  }


  public String getWCounty() {
    return wCounty;
  }

  public void setWCounty(String wCounty) {
    this.wCounty = wCounty;
  }


  public String getWState() {
    return wState;
  }

  public void setWState(String wState) {
    this.wState = wState;
  }


  public String getWZip() {
    return wZip;
  }

  public void setWZip(String wZip) {
    this.wZip = wZip;
  }


  public String getWCountry() {
    return wCountry;
  }

  public void setWCountry(String wCountry) {
    this.wCountry = wCountry;
  }


  public double getWGmtOffset() {
    return wGmtOffset;
  }

  public void setWGmtOffset(double wGmtOffset) {
    this.wGmtOffset = wGmtOffset;
  }

}
