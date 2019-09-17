package tpcds.domain.lazy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
@Id
  private Long iItemSk;
  private String iItemId;
  private java.sql.Date iRecStartDate;
  private java.sql.Date iRecEndDate;
  private String iItemDesc;
  private double iCurrentPrice;
  private double iWholesaleCost;
  private Long iBrandId;
  private String iBrand;
  private Long iClassId;
  private String iClass;
  private Long iCategoryId;
  private String iCategory;
  private Long iManufactId;
  private String iManufact;
  private String iSize;
  private String iFormulation;
  private String iColor;
  private String iUnits;
  private String iContainer;
  private Long iManagerId;
  private String iProductName;


  public Long getIItemSk() {
    return iItemSk;
  }

  public void setIItemSk(Long iItemSk) {
    this.iItemSk = iItemSk;
  }


  public String getIItemId() {
    return iItemId;
  }

  public void setIItemId(String iItemId) {
    this.iItemId = iItemId;
  }


  public java.sql.Date getIRecStartDate() {
    return iRecStartDate;
  }

  public void setIRecStartDate(java.sql.Date iRecStartDate) {
    this.iRecStartDate = iRecStartDate;
  }


  public java.sql.Date getIRecEndDate() {
    return iRecEndDate;
  }

  public void setIRecEndDate(java.sql.Date iRecEndDate) {
    this.iRecEndDate = iRecEndDate;
  }


  public String getIItemDesc() {
    return iItemDesc;
  }

  public void setIItemDesc(String iItemDesc) {
    this.iItemDesc = iItemDesc;
  }


  public double getICurrentPrice() {
    return iCurrentPrice;
  }

  public void setICurrentPrice(double iCurrentPrice) {
    this.iCurrentPrice = iCurrentPrice;
  }


  public double getIWholesaleCost() {
    return iWholesaleCost;
  }

  public void setIWholesaleCost(double iWholesaleCost) {
    this.iWholesaleCost = iWholesaleCost;
  }


  public Long getIBrandId() {
    return iBrandId;
  }

  public void setIBrandId(Long iBrandId) {
    this.iBrandId = iBrandId;
  }


  public String getIBrand() {
    return iBrand;
  }

  public void setIBrand(String iBrand) {
    this.iBrand = iBrand;
  }


  public Long getIClassId() {
    return iClassId;
  }

  public void setIClassId(Long iClassId) {
    this.iClassId = iClassId;
  }


  public String getIClass() {
    return iClass;
  }

  public void setIClass(String iClass) {
    this.iClass = iClass;
  }


  public Long getICategoryId() {
    return iCategoryId;
  }

  public void setICategoryId(Long iCategoryId) {
    this.iCategoryId = iCategoryId;
  }


  public String getICategory() {
    return iCategory;
  }

  public void setICategory(String iCategory) {
    this.iCategory = iCategory;
  }


  public Long getIManufactId() {
    return iManufactId;
  }

  public void setIManufactId(Long iManufactId) {
    this.iManufactId = iManufactId;
  }


  public String getIManufact() {
    return iManufact;
  }

  public void setIManufact(String iManufact) {
    this.iManufact = iManufact;
  }


  public String getISize() {
    return iSize;
  }

  public void setISize(String iSize) {
    this.iSize = iSize;
  }


  public String getIFormulation() {
    return iFormulation;
  }

  public void setIFormulation(String iFormulation) {
    this.iFormulation = iFormulation;
  }


  public String getIColor() {
    return iColor;
  }

  public void setIColor(String iColor) {
    this.iColor = iColor;
  }


  public String getIUnits() {
    return iUnits;
  }

  public void setIUnits(String iUnits) {
    this.iUnits = iUnits;
  }


  public String getIContainer() {
    return iContainer;
  }

  public void setIContainer(String iContainer) {
    this.iContainer = iContainer;
  }


  public Long getIManagerId() {
    return iManagerId;
  }

  public void setIManagerId(Long iManagerId) {
    this.iManagerId = iManagerId;
  }


  public String getIProductName() {
    return iProductName;
  }

  public void setIProductName(String iProductName) {
    this.iProductName = iProductName;
  }

}
