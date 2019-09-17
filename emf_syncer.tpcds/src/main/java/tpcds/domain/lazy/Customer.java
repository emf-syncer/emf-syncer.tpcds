package tpcds.domain.lazy;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Customer {

  @Id
  @Column(name = "c_customer_sk")
  private Long cCustomerSk;
  @Column(name = "c_customer_id")
  private String cCustomerId;
  @Column(name = "c_current_cdemo_sk")
  private Long cCurrentCdemoSk;
  @Column(name = "c_current_hdemo_sk")
  private Long cCurrentHdemoSk;
  @Column(name = "c_current_addr_sk")
  private Long cCurrentAddrSk;
  @Column(name = "c_first_shipto_date_sk")
  private Long cFirstShiptoDateSk;
  @Column(name = "c_first_sales_date_sk")
  private Long cFirstSalesDateSk;
  @Column(name = "c_salutation")
  private String cSalutation;
  @Column(name = "c_first_name")
  private String cFirstName;
  @Column(name = "c_last_name")
  private String cLastName;
  @Column(name = "c_preferred_cust_flag")
  private String cPreferredCustFlag;
  @Column(name = "c_birth_day")
  private Long cBirthDay;
  @Column(name = "c_birth_month")
  private Long cBirthMonth;
  @Column(name = "c_birth_year")
  private Long cBirthYear;
  @Column(name = "c_birth_country")
  private String cBirthCountry;
  @Column(name = "c_login")
  private String cLogin;
  @Column(name = "c_email_address")
  private String cEmailAddress;
  @Column(name = "c_last_review_date")
  private String cLastReviewDate;

  @OneToMany(fetch=FetchType.LAZY,mappedBy="srCustomerSk")
  private Set<StoreReturns> storeReturns;
  
  @OneToMany(fetch=FetchType.LAZY)
  @JoinColumn(name = "ss_customer_sk")
  private Set<StoreSales> storeSales;
  
  
  
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

public Long getCCustomerSk() {
    return cCustomerSk;
  }

  public void setCCustomerSk(Long cCustomerSk) {
    this.cCustomerSk = cCustomerSk;
  }


  public String getCCustomerId() {
    return cCustomerId;
  }

  public void setCCustomerId(String cCustomerId) {
    this.cCustomerId = cCustomerId;
  }


  public Long getCCurrentCdemoSk() {
    return cCurrentCdemoSk;
  }

  public void setCCurrentCdemoSk(Long cCurrentCdemoSk) {
    this.cCurrentCdemoSk = cCurrentCdemoSk;
  }


  public Long getCCurrentHdemoSk() {
    return cCurrentHdemoSk;
  }

  public void setCCurrentHdemoSk(Long cCurrentHdemoSk) {
    this.cCurrentHdemoSk = cCurrentHdemoSk;
  }


  public Long getCCurrentAddrSk() {
    return cCurrentAddrSk;
  }

  public void setCCurrentAddrSk(Long cCurrentAddrSk) {
    this.cCurrentAddrSk = cCurrentAddrSk;
  }


  public Long getCFirstShiptoDateSk() {
    return cFirstShiptoDateSk;
  }

  public void setCFirstShiptoDateSk(Long cFirstShiptoDateSk) {
    this.cFirstShiptoDateSk = cFirstShiptoDateSk;
  }


  public Long getCFirstSalesDateSk() {
    return cFirstSalesDateSk;
  }

  public void setCFirstSalesDateSk(Long cFirstSalesDateSk) {
    this.cFirstSalesDateSk = cFirstSalesDateSk;
  }


  public String getCSalutation() {
    return cSalutation;
  }

  public void setCSalutation(String cSalutation) {
    this.cSalutation = cSalutation;
  }


  public String getCFirstName() {
    return cFirstName;
  }

  public void setCFirstName(String cFirstName) {
    this.cFirstName = cFirstName;
  }


  public String getCLastName() {
    return cLastName;
  }

  public void setCLastName(String cLastName) {
    this.cLastName = cLastName;
  }


  public String getCPreferredCustFlag() {
    return cPreferredCustFlag;
  }

  public void setCPreferredCustFlag(String cPreferredCustFlag) {
    this.cPreferredCustFlag = cPreferredCustFlag;
  }


  public Long getCBirthDay() {
    return cBirthDay;
  }

  public void setCBirthDay(Long cBirthDay) {
    this.cBirthDay = cBirthDay;
  }


  public Long getCBirthMonth() {
    return cBirthMonth;
  }

  public void setCBirthMonth(Long cBirthMonth) {
    this.cBirthMonth = cBirthMonth;
  }


  public Long getCBirthYear() {
    return cBirthYear;
  }

  public void setCBirthYear(Long cBirthYear) {
    this.cBirthYear = cBirthYear;
  }


  public String getCBirthCountry() {
    return cBirthCountry;
  }

  public void setCBirthCountry(String cBirthCountry) {
    this.cBirthCountry = cBirthCountry;
  }


  public String getCLogin() {
    return cLogin;
  }

  public void setCLogin(String cLogin) {
    this.cLogin = cLogin;
  }


  public String getCEmailAddress() {
    return cEmailAddress;
  }

  public void setCEmailAddress(String cEmailAddress) {
    this.cEmailAddress = cEmailAddress;
  }


  public String getCLastReviewDate() {
    return cLastReviewDate;
  }

  public void setCLastReviewDate(String cLastReviewDate) {
    this.cLastReviewDate = cLastReviewDate;
  }

}
