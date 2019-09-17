package tpcds.domain.lazy;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Store {
  @Id
  @Column(name = "s_store_sk")
  private Long sStoreSk;
  @Column(name = "s_store_id")
  private String sStoreId;
  @Column(name = "s_rec_start_date")
  private java.sql.Date sRecStartDate;
  @Column(name = "s_rec_end_date")
  private java.sql.Date sRecEndDate;
  @Column(name = "s_closed_date_sk")
  private Long sClosedDateSk;
  @Column(name = "s_store_name")
  private String sStoreName;
  @Column(name = "s_number_employees")
  private Long sNumberEmployees;
  @Column(name = "s_floor_space")
  private Long sFloorSpace;
  @Column(name = "s_hours")
  private String sHours;
  @Column(name = "s_manager")
  private String sManager;
  @Column(name = "s_market_id")
  private Long sMarketId;
  @Column(name = "s_geography_class")
  private String sGeographyClass;
  @Column(name = "s_market_desc")
  private String sMarketDesc;
  @Column(name = "s_market_manager")
  private String sMarketManager;
  @Column(name = "s_division_id")
  private Long sDivisionId;
  @Column(name = "s_division_name")
  private String sDivisionName;
  @Column(name = "s_company_id")
  private Long sCompanyId;
  @Column(name = "s_company_name")
  private String sCompanyName;
  @Column(name = "s_street_number")
  private String sStreetNumber;
  @Column(name = "s_street_name")
  private String sStreetName;
  @Column(name = "s_street_type")
  private String sStreetType;
  @Column(name = "s_suite_number")
  private String sSuiteNumber;
  @Column(name = "s_city")
  private String sCity;
  @Column(name = "s_county")
  private String sCounty;
  @Column(name = "s_state")
  private String sState;
  @Column(name = "s_zip")
  private String sZip;
  @Column(name = "s_country")
  private String sCountry;
  @Column(name = "s_gmt_offset")
  private Double sGmtOffset;
  @Column(name = "s_tax_precentage")
  private Double sTaxPrecentage;

  
  @Transient
  @OneToMany(mappedBy="ssStoreSk", fetch=FetchType.LAZY)
  Set<StoreSales> storeSales;

  @Transient
  @OneToMany(mappedBy="srStoreSk", fetch=FetchType.LAZY)
  Set<StoreReturns> storeReturns;



public Set<StoreSales> getStoreSales() {
	return storeSales;
}

public void setStoreSales(Set<StoreSales> storeSales) {
	this.storeSales = storeSales;
}

  public Set<StoreReturns> getStoreReturns() {
	return storeReturns;
}

public void setStoreReturns(Set<StoreReturns> storeReturns) {
	this.storeReturns = storeReturns;
}

public Long getSStoreSk() {
    return sStoreSk;
  }

  public void setSStoreSk(Long sStoreSk) {
    this.sStoreSk = sStoreSk;
  }


  public String getSStoreId() {
    return sStoreId;
  }

  public void setSStoreId(String sStoreId) {
    this.sStoreId = sStoreId;
  }


  public java.sql.Date getSRecStartDate() {
    return sRecStartDate;
  }

  public void setSRecStartDate(java.sql.Date sRecStartDate) {
    this.sRecStartDate = sRecStartDate;
  }


  public java.sql.Date getSRecEndDate() {
    return sRecEndDate;
  }

  public void setSRecEndDate(java.sql.Date sRecEndDate) {
    this.sRecEndDate = sRecEndDate;
  }


  public Long getSClosedDateSk() {
    return sClosedDateSk;
  }

  public void setSClosedDateSk(Long sClosedDateSk) {
    this.sClosedDateSk = sClosedDateSk;
  }


  public String getSStoreName() {
    return sStoreName;
  }

  public void setSStoreName(String sStoreName) {
    this.sStoreName = sStoreName;
  }


  public Long getSNumberEmployees() {
    return sNumberEmployees;
  }

  public void setSNumberEmployees(Long sNumberEmployees) {
    this.sNumberEmployees = sNumberEmployees;
  }


  public Long getSFloorSpace() {
    return sFloorSpace;
  }

  public void setSFloorSpace(Long sFloorSpace) {
    this.sFloorSpace = sFloorSpace;
  }


  public String getSHours() {
    return sHours;
  }

  public void setSHours(String sHours) {
    this.sHours = sHours;
  }


  public String getSManager() {
    return sManager;
  }

  public void setSManager(String sManager) {
    this.sManager = sManager;
  }


  public Long getSMarketId() {
    return sMarketId;
  }

  public void setSMarketId(Long sMarketId) {
    this.sMarketId = sMarketId;
  }


  public String getSGeographyClass() {
    return sGeographyClass;
  }

  public void setSGeographyClass(String sGeographyClass) {
    this.sGeographyClass = sGeographyClass;
  }


  public String getSMarketDesc() {
    return sMarketDesc;
  }

  public void setSMarketDesc(String sMarketDesc) {
    this.sMarketDesc = sMarketDesc;
  }


  public String getSMarketManager() {
    return sMarketManager;
  }

  public void setSMarketManager(String sMarketManager) {
    this.sMarketManager = sMarketManager;
  }


  public Long getSDivisionId() {
    return sDivisionId;
  }

  public void setSDivisionId(Long sDivisionId) {
    this.sDivisionId = sDivisionId;
  }


  public String getSDivisionName() {
    return sDivisionName;
  }

  public void setSDivisionName(String sDivisionName) {
    this.sDivisionName = sDivisionName;
  }


  public Long getSCompanyId() {
    return sCompanyId;
  }

  public void setSCompanyId(Long sCompanyId) {
    this.sCompanyId = sCompanyId;
  }


  public String getSCompanyName() {
    return sCompanyName;
  }

  public void setSCompanyName(String sCompanyName) {
    this.sCompanyName = sCompanyName;
  }


  public String getSStreetNumber() {
    return sStreetNumber;
  }

  public void setSStreetNumber(String sStreetNumber) {
    this.sStreetNumber = sStreetNumber;
  }


  public String getSStreetName() {
    return sStreetName;
  }

  public void setSStreetName(String sStreetName) {
    this.sStreetName = sStreetName;
  }


  public String getSStreetType() {
    return sStreetType;
  }

  public void setSStreetType(String sStreetType) {
    this.sStreetType = sStreetType;
  }


  public String getSSuiteNumber() {
    return sSuiteNumber;
  }

  public void setSSuiteNumber(String sSuiteNumber) {
    this.sSuiteNumber = sSuiteNumber;
  }


  public String getSCity() {
    return sCity;
  }

  public void setSCity(String sCity) {
    this.sCity = sCity;
  }


  public String getSCounty() {
    return sCounty;
  }

  public void setSCounty(String sCounty) {
    this.sCounty = sCounty;
  }


  public String getSState() {
    return sState;
  }

  public void setSState(String sState) {
    this.sState = sState;
  }


  public String getSZip() {
    return sZip;
  }

  public void setSZip(String sZip) {
    this.sZip = sZip;
  }


  public String getSCountry() {
    return sCountry;
  }

  public void setSCountry(String sCountry) {
    this.sCountry = sCountry;
  }


  public Double getSGmtOffset() {
    return sGmtOffset;
  }

  public void setSGmtOffset(Double sGmtOffset) {
    this.sGmtOffset = sGmtOffset;
  }


  public Double getSTaxPrecentage() {
    return sTaxPrecentage;
  }

  public void setSTaxPrecentage(Double sTaxPrecentage) {
    this.sTaxPrecentage = sTaxPrecentage;
  }

}
