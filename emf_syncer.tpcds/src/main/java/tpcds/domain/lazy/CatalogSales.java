package tpcds.domain.lazy;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class CatalogSales {

  private Long csSoldDateSk;
  private Long csSoldTimeSk;
  private Long csShipDateSk;
  private Long csBillCustomerSk;
  private Long csBillCdemoSk;
  private Long csBillHdemoSk;
  private Long csBillAddrSk;
  private Long csShipCustomerSk;
  private Long csShipCdemoSk;
  private Long csShipHdemoSk;
  private Long csShipAddrSk;
  private Long csCallCenterSk;
  private Long csCatalogPageSk;
  private Long csShipModeSk;
  private Long csWarehouseSk;
  @EmbeddedId
  private CatalogSalesId csId;
  private Long csPromoSk;
  private Long csQuantity;
  private double csWholesaleCost;
  private double csListPrice;
  private double csSalesPrice;
  private double csExtDiscountAmt;
  private double csExtSalesPrice;
  private double csExtWholesaleCost;
  private double csExtListPrice;
  private double csExtTax;
  private double csCouponAmt;
  private double csExtShipCost;
  private double csNetPaid;
  private double csNetPaidIncTax;
  private double csNetPaidIncShip;
  private double csNetPaidIncShipTax;
  private double csNetProfit;


  public Long getCsSoldDateSk() {
    return csSoldDateSk;
  }

  public void setCsSoldDateSk(Long csSoldDateSk) {
    this.csSoldDateSk = csSoldDateSk;
  }


  public Long getCsSoldTimeSk() {
    return csSoldTimeSk;
  }

  public void setCsSoldTimeSk(Long csSoldTimeSk) {
    this.csSoldTimeSk = csSoldTimeSk;
  }


  public Long getCsShipDateSk() {
    return csShipDateSk;
  }

  public void setCsShipDateSk(Long csShipDateSk) {
    this.csShipDateSk = csShipDateSk;
  }


  public Long getCsBillCustomerSk() {
    return csBillCustomerSk;
  }

  public void setCsBillCustomerSk(Long csBillCustomerSk) {
    this.csBillCustomerSk = csBillCustomerSk;
  }


  public Long getCsBillCdemoSk() {
    return csBillCdemoSk;
  }

  public void setCsBillCdemoSk(Long csBillCdemoSk) {
    this.csBillCdemoSk = csBillCdemoSk;
  }


  public Long getCsBillHdemoSk() {
    return csBillHdemoSk;
  }

  public void setCsBillHdemoSk(Long csBillHdemoSk) {
    this.csBillHdemoSk = csBillHdemoSk;
  }


  public Long getCsBillAddrSk() {
    return csBillAddrSk;
  }

  public void setCsBillAddrSk(Long csBillAddrSk) {
    this.csBillAddrSk = csBillAddrSk;
  }


  public Long getCsShipCustomerSk() {
    return csShipCustomerSk;
  }

  public void setCsShipCustomerSk(Long csShipCustomerSk) {
    this.csShipCustomerSk = csShipCustomerSk;
  }


  public Long getCsShipCdemoSk() {
    return csShipCdemoSk;
  }

  public void setCsShipCdemoSk(Long csShipCdemoSk) {
    this.csShipCdemoSk = csShipCdemoSk;
  }


  public Long getCsShipHdemoSk() {
    return csShipHdemoSk;
  }

  public void setCsShipHdemoSk(Long csShipHdemoSk) {
    this.csShipHdemoSk = csShipHdemoSk;
  }


  public Long getCsShipAddrSk() {
    return csShipAddrSk;
  }

  public void setCsShipAddrSk(Long csShipAddrSk) {
    this.csShipAddrSk = csShipAddrSk;
  }


  public Long getCsCallCenterSk() {
    return csCallCenterSk;
  }

  public void setCsCallCenterSk(Long csCallCenterSk) {
    this.csCallCenterSk = csCallCenterSk;
  }


  public Long getCsCatalogPageSk() {
    return csCatalogPageSk;
  }

  public void setCsCatalogPageSk(Long csCatalogPageSk) {
    this.csCatalogPageSk = csCatalogPageSk;
  }


  public Long getCsShipModeSk() {
    return csShipModeSk;
  }

  public void setCsShipModeSk(Long csShipModeSk) {
    this.csShipModeSk = csShipModeSk;
  }


  public Long getCsWarehouseSk() {
    return csWarehouseSk;
  }

  public void setCsWarehouseSk(Long csWarehouseSk) {
    this.csWarehouseSk = csWarehouseSk;
  }


  public CatalogSalesId getCsId() {
    return csId;
  }

  public void setCsItemSk(CatalogSalesId csId) {
    this.csId = csId;
  }


  public Long getCsPromoSk() {
    return csPromoSk;
  }

  public void setCsPromoSk(Long csPromoSk) {
    this.csPromoSk = csPromoSk;
  }


  public Long getCsQuantity() {
    return csQuantity;
  }

  public void setCsQuantity(Long csQuantity) {
    this.csQuantity = csQuantity;
  }


  public double getCsWholesaleCost() {
    return csWholesaleCost;
  }

  public void setCsWholesaleCost(double csWholesaleCost) {
    this.csWholesaleCost = csWholesaleCost;
  }


  public double getCsListPrice() {
    return csListPrice;
  }

  public void setCsListPrice(double csListPrice) {
    this.csListPrice = csListPrice;
  }


  public double getCsSalesPrice() {
    return csSalesPrice;
  }

  public void setCsSalesPrice(double csSalesPrice) {
    this.csSalesPrice = csSalesPrice;
  }


  public double getCsExtDiscountAmt() {
    return csExtDiscountAmt;
  }

  public void setCsExtDiscountAmt(double csExtDiscountAmt) {
    this.csExtDiscountAmt = csExtDiscountAmt;
  }


  public double getCsExtSalesPrice() {
    return csExtSalesPrice;
  }

  public void setCsExtSalesPrice(double csExtSalesPrice) {
    this.csExtSalesPrice = csExtSalesPrice;
  }


  public double getCsExtWholesaleCost() {
    return csExtWholesaleCost;
  }

  public void setCsExtWholesaleCost(double csExtWholesaleCost) {
    this.csExtWholesaleCost = csExtWholesaleCost;
  }


  public double getCsExtListPrice() {
    return csExtListPrice;
  }

  public void setCsExtListPrice(double csExtListPrice) {
    this.csExtListPrice = csExtListPrice;
  }


  public double getCsExtTax() {
    return csExtTax;
  }

  public void setCsExtTax(double csExtTax) {
    this.csExtTax = csExtTax;
  }


  public double getCsCouponAmt() {
    return csCouponAmt;
  }

  public void setCsCouponAmt(double csCouponAmt) {
    this.csCouponAmt = csCouponAmt;
  }


  public double getCsExtShipCost() {
    return csExtShipCost;
  }

  public void setCsExtShipCost(double csExtShipCost) {
    this.csExtShipCost = csExtShipCost;
  }


  public double getCsNetPaid() {
    return csNetPaid;
  }

  public void setCsNetPaid(double csNetPaid) {
    this.csNetPaid = csNetPaid;
  }


  public double getCsNetPaidIncTax() {
    return csNetPaidIncTax;
  }

  public void setCsNetPaidIncTax(double csNetPaidIncTax) {
    this.csNetPaidIncTax = csNetPaidIncTax;
  }


  public double getCsNetPaidIncShip() {
    return csNetPaidIncShip;
  }

  public void setCsNetPaidIncShip(double csNetPaidIncShip) {
    this.csNetPaidIncShip = csNetPaidIncShip;
  }


  public double getCsNetPaidIncShipTax() {
    return csNetPaidIncShipTax;
  }

  public void setCsNetPaidIncShipTax(double csNetPaidIncShipTax) {
    this.csNetPaidIncShipTax = csNetPaidIncShipTax;
  }


  public double getCsNetProfit() {
    return csNetProfit;
  }

  public void setCsNetProfit(double csNetProfit) {
    this.csNetProfit = csNetProfit;
  }

}
