package tpcds.domain.lazy;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class StoreSales implements Serializable {
	@OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "ss_sold_date_sk", referencedColumnName = "d_date_sk")
  private DateDim ssSoldDateSk;
	@Column(name="ss_sold_time_sk")
  private Long ssSoldTimeSk;
	@Column(name="ss_item_sk")
  private Long ssItemSk;
	
  @EmbeddedId
  @MapsId("ss_customer_sk")
  private StoreSalesId ssId;


  @Column(name="ss_cdemo_sk")
  private Long ssCdemoSk;
  @Column(name="ss_hdemo_sk")
  private Long ssHdemoSk;
  @Column(name="ss_addr_sk")
  private Long ssAddrSk;
  
  @ManyToOne(fetch=FetchType.LAZY)
  @JoinColumn(name = "ss_store_sk")
  private Store ssStoreSk;
  
  @Column(name="ss_promo_sk")
  private Long ssPromoSk;
  @Column(name="ss_quantity")
  private Long ssQuantity;
  @Column(name="ss_wholesale_cost")
  private Double ssWholesaleCost;
  @Column(name="ss_list_price")
  private Double ssListPrice;
  @Column(name="ss_sales_price")
  private Double ssSalesPrice;
  @Column(name="ss_ext_discount_amt")
  private Double ssExtDiscountAmt;
  @Column(name="ss_ext_sales_price")
  private Double ssExtSalesPrice;
  @Column(name="ss_ext_wholesale_cost")
  private Double ssExtWholesaleCost;
  @Column(name="ss_ext_list_price")
  private Double ssExtListPrice;
  @Column(name="ss_ext_tax")
  private Double ssExtTax;
  @Column(name="ss_coupon_amt")
  private Double ssCouponAmt;
  @Column(name="ss_net_paid")
  private Double ssNetPaid;
  @Column(name="ss_net_paid_inc_tax")
  private Double ssNetPaidIncTax;
  @Column(name="ss_net_profit")
  private Double ssNetProfit;

  public DateDim getSsSoldDateSk() {
    return ssSoldDateSk;
  }

  public void setSsSoldDateSk(DateDim ssSoldDateSk) {
    this.ssSoldDateSk = ssSoldDateSk;
  }


  public Long getSsSoldTimeSk() {
    return ssSoldTimeSk;
  }

  public void setSsSoldTimeSk(Long ssSoldTimeSk) {
    this.ssSoldTimeSk = ssSoldTimeSk;
  }


  public Long getSsItemSk() {
    return ssItemSk;
  }

  public void setSsItemSk(Long ssItemSk) {
    this.ssItemSk = ssItemSk;
  }


  public StoreSalesId getSsId() {
    return ssId;
  }

  public void setSsId(StoreSalesId ssId) {
    this.ssId = ssId;
  }


  public Long getSsCdemoSk() {
    return ssCdemoSk;
  }

  public void setSsCdemoSk(Long ssCdemoSk) {
    this.ssCdemoSk = ssCdemoSk;
  }


  public Long getSsHdemoSk() {
    return ssHdemoSk;
  }

  public void setSsHdemoSk(Long ssHdemoSk) {
    this.ssHdemoSk = ssHdemoSk;
  }


  public Long getSsAddrSk() {
    return ssAddrSk;
  }

  public void setSsAddrSk(Long ssAddrSk) {
    this.ssAddrSk = ssAddrSk;
  }


  public Store getSsStoreSk() {
    return ssStoreSk;
  }

  public void setSsStoreSk(Store ssStoreSk) {
    this.ssStoreSk = ssStoreSk;
  }


  public Long getSsPromoSk() {
    return ssPromoSk;
  }

  public void setSsPromoSk(Long ssPromoSk) {
    this.ssPromoSk = ssPromoSk;
  }


  public Long getSsQuantity() {
    return ssQuantity;
  }

  public void setSsQuantity(Long ssQuantity) {
    this.ssQuantity = ssQuantity;
  }


  public Double getSsWholesaleCost() {
    return ssWholesaleCost;
  }

  public void setSsWholesaleCost(Double ssWholesaleCost) {
    this.ssWholesaleCost = ssWholesaleCost;
  }


  public Double getSsListPrice() {
    return ssListPrice;
  }

  public void setSsListPrice(Double ssListPrice) {
    this.ssListPrice = ssListPrice;
  }


  public Double getSsSalesPrice() {
    return ssSalesPrice;
  }

  public void setSsSalesPrice(Double ssSalesPrice) {
    this.ssSalesPrice = ssSalesPrice;
  }


  public Double getSsExtDiscountAmt() {
    return ssExtDiscountAmt;
  }

  public void setSsExtDiscountAmt(Double ssExtDiscountAmt) {
    this.ssExtDiscountAmt = ssExtDiscountAmt;
  }


  public Double getSsExtSalesPrice() {
    return ssExtSalesPrice;
  }

  public void setSsExtSalesPrice(Double ssExtSalesPrice) {
    this.ssExtSalesPrice = ssExtSalesPrice;
  }


  public Double getSsExtWholesaleCost() {
    return ssExtWholesaleCost;
  }

  public void setSsExtWholesaleCost(Double ssExtWholesaleCost) {
    this.ssExtWholesaleCost = ssExtWholesaleCost;
  }


  public Double getSsExtListPrice() {
    return ssExtListPrice;
  }

  public void setSsExtListPrice(Double ssExtListPrice) {
    this.ssExtListPrice = ssExtListPrice;
  }


  public Double getSsExtTax() {
    return ssExtTax;
  }

  public void setSsExtTax(Double ssExtTax) {
    this.ssExtTax = ssExtTax;
  }


  public Double getSsCouponAmt() {
    return ssCouponAmt;
  }

  public void setSsCouponAmt(Double ssCouponAmt) {
    this.ssCouponAmt = ssCouponAmt;
  }


  public Double getSsNetPaid() {
    return ssNetPaid;
  }

  public void setSsNetPaid(Double ssNetPaid) {
    this.ssNetPaid = ssNetPaid;
  }


  public Double getSsNetPaidIncTax() {
    return ssNetPaidIncTax;
  }

  public void setSsNetPaidIncTax(Double ssNetPaidIncTax) {
    this.ssNetPaidIncTax = ssNetPaidIncTax;
  }


  public Double getSsNetProfit() {
    return ssNetProfit;
  }

  public void setSsNetProfit(Double ssNetProfit) {
    this.ssNetProfit = ssNetProfit;
  }

}
