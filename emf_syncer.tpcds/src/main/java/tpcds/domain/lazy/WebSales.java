package tpcds.domain.lazy;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class WebSales {

  private Long wsSoldDateSk;
  private Long wsSoldTimeSk;
  private Long wsShipDateSk;
  @EmbeddedId
  private WebSalesId wsId;
  private Long wsBillCustomerSk;
  private Long wsBillCdemoSk;
  private Long wsBillHdemoSk;
  private Long wsBillAddrSk;
  private Long wsShipCustomerSk;
  private Long wsShipCdemoSk;
  private Long wsShipHdemoSk;
  private Long wsShipAddrSk;
  private Long wsWebPageSk;
  private Long wsWebSiteSk;
  private Long wsShipModeSk;
  private Long wsWarehouseSk;
  private Long wsPromoSk;
  private Long wsQuantity;
  private Double wsWholesaleCost;
  private Double wsListPrice;
  private Double wsSalesPrice;
  private Double wsExtDiscountAmt;
  private Double wsExtSalesPrice;
  private Double wsExtWholesaleCost;
  private Double wsExtListPrice;
  private Double wsExtTax;
  private Double wsCouponAmt;
  private Double wsExtShipCost;
  private Double wsNetPaid;
  private Double wsNetPaidIncTax;
  private Double wsNetPaidIncShip;
  private Double wsNetPaidIncShipTax;
  private Double wsNetProfit;


  public Long getWsSoldDateSk() {
    return wsSoldDateSk;
  }

  public void setWsSoldDateSk(Long wsSoldDateSk) {
    this.wsSoldDateSk = wsSoldDateSk;
  }


  public Long getWsSoldTimeSk() {
    return wsSoldTimeSk;
  }

  public void setWsSoldTimeSk(Long wsSoldTimeSk) {
    this.wsSoldTimeSk = wsSoldTimeSk;
  }


  public Long getWsShipDateSk() {
    return wsShipDateSk;
  }

  public void setWsShipDateSk(Long wsShipDateSk) {
    this.wsShipDateSk = wsShipDateSk;
  }


  public Long getWsBillCustomerSk() {
    return wsBillCustomerSk;
  }

  public void setWsBillCustomerSk(Long wsBillCustomerSk) {
    this.wsBillCustomerSk = wsBillCustomerSk;
  }


  public Long getWsBillCdemoSk() {
    return wsBillCdemoSk;
  }

  public void setWsBillCdemoSk(Long wsBillCdemoSk) {
    this.wsBillCdemoSk = wsBillCdemoSk;
  }


  public Long getWsBillHdemoSk() {
    return wsBillHdemoSk;
  }

  public void setWsBillHdemoSk(Long wsBillHdemoSk) {
    this.wsBillHdemoSk = wsBillHdemoSk;
  }


  public Long getWsBillAddrSk() {
    return wsBillAddrSk;
  }

  public void setWsBillAddrSk(Long wsBillAddrSk) {
    this.wsBillAddrSk = wsBillAddrSk;
  }


  public Long getWsShipCustomerSk() {
    return wsShipCustomerSk;
  }

  public void setWsShipCustomerSk(Long wsShipCustomerSk) {
    this.wsShipCustomerSk = wsShipCustomerSk;
  }


  public Long getWsShipCdemoSk() {
    return wsShipCdemoSk;
  }

  public void setWsShipCdemoSk(Long wsShipCdemoSk) {
    this.wsShipCdemoSk = wsShipCdemoSk;
  }


  public Long getWsShipHdemoSk() {
    return wsShipHdemoSk;
  }

  public void setWsShipHdemoSk(Long wsShipHdemoSk) {
    this.wsShipHdemoSk = wsShipHdemoSk;
  }


  public Long getWsShipAddrSk() {
    return wsShipAddrSk;
  }

  public void setWsShipAddrSk(Long wsShipAddrSk) {
    this.wsShipAddrSk = wsShipAddrSk;
  }


  public Long getWsWebPageSk() {
    return wsWebPageSk;
  }

  public void setWsWebPageSk(Long wsWebPageSk) {
    this.wsWebPageSk = wsWebPageSk;
  }


  public Long getWsWebSiteSk() {
    return wsWebSiteSk;
  }

  public void setWsWebSiteSk(Long wsWebSiteSk) {
    this.wsWebSiteSk = wsWebSiteSk;
  }


  public Long getWsShipModeSk() {
    return wsShipModeSk;
  }

  public void setWsShipModeSk(Long wsShipModeSk) {
    this.wsShipModeSk = wsShipModeSk;
  }


  public Long getWsWarehouseSk() {
    return wsWarehouseSk;
  }

  public void setWsWarehouseSk(Long wsWarehouseSk) {
    this.wsWarehouseSk = wsWarehouseSk;
  }


  public Long getWsPromoSk() {
    return wsPromoSk;
  }

  public void setWsPromoSk(Long wsPromoSk) {
    this.wsPromoSk = wsPromoSk;
  }


  public WebSalesId getWsId() {
	return wsId;
}

public void setWsId(WebSalesId wsId) {
	this.wsId = wsId;
}

public Long getWsQuantity() {
    return wsQuantity;
  }

  public void setWsQuantity(Long wsQuantity) {
    this.wsQuantity = wsQuantity;
  }


  public Double getWsWholesaleCost() {
    return wsWholesaleCost;
  }

  public void setWsWholesaleCost(Double wsWholesaleCost) {
    this.wsWholesaleCost = wsWholesaleCost;
  }


  public Double getWsListPrice() {
    return wsListPrice;
  }

  public void setWsListPrice(Double wsListPrice) {
    this.wsListPrice = wsListPrice;
  }


  public Double getWsSalesPrice() {
    return wsSalesPrice;
  }

  public void setWsSalesPrice(Double wsSalesPrice) {
    this.wsSalesPrice = wsSalesPrice;
  }


  public Double getWsExtDiscountAmt() {
    return wsExtDiscountAmt;
  }

  public void setWsExtDiscountAmt(Double wsExtDiscountAmt) {
    this.wsExtDiscountAmt = wsExtDiscountAmt;
  }


  public Double getWsExtSalesPrice() {
    return wsExtSalesPrice;
  }

  public void setWsExtSalesPrice(Double wsExtSalesPrice) {
    this.wsExtSalesPrice = wsExtSalesPrice;
  }


  public Double getWsExtWholesaleCost() {
    return wsExtWholesaleCost;
  }

  public void setWsExtWholesaleCost(Double wsExtWholesaleCost) {
    this.wsExtWholesaleCost = wsExtWholesaleCost;
  }


  public Double getWsExtListPrice() {
    return wsExtListPrice;
  }

  public void setWsExtListPrice(Double wsExtListPrice) {
    this.wsExtListPrice = wsExtListPrice;
  }


  public Double getWsExtTax() {
    return wsExtTax;
  }

  public void setWsExtTax(Double wsExtTax) {
    this.wsExtTax = wsExtTax;
  }


  public Double getWsCouponAmt() {
    return wsCouponAmt;
  }

  public void setWsCouponAmt(Double wsCouponAmt) {
    this.wsCouponAmt = wsCouponAmt;
  }


  public Double getWsExtShipCost() {
    return wsExtShipCost;
  }

  public void setWsExtShipCost(Double wsExtShipCost) {
    this.wsExtShipCost = wsExtShipCost;
  }


  public Double getWsNetPaid() {
    return wsNetPaid;
  }

  public void setWsNetPaid(Double wsNetPaid) {
    this.wsNetPaid = wsNetPaid;
  }


  public Double getWsNetPaidIncTax() {
    return wsNetPaidIncTax;
  }

  public void setWsNetPaidIncTax(Double wsNetPaidIncTax) {
    this.wsNetPaidIncTax = wsNetPaidIncTax;
  }


  public Double getWsNetPaidIncShip() {
    return wsNetPaidIncShip;
  }

  public void setWsNetPaidIncShip(Double wsNetPaidIncShip) {
    this.wsNetPaidIncShip = wsNetPaidIncShip;
  }


  public Double getWsNetPaidIncShipTax() {
    return wsNetPaidIncShipTax;
  }

  public void setWsNetPaidIncShipTax(Double wsNetPaidIncShipTax) {
    this.wsNetPaidIncShipTax = wsNetPaidIncShipTax;
  }


  public Double getWsNetProfit() {
    return wsNetProfit;
  }

  public void setWsNetProfit(Double wsNetProfit) {
    this.wsNetProfit = wsNetProfit;
  }

}
