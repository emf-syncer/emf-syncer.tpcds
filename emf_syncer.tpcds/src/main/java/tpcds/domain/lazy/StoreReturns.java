package tpcds.domain.lazy;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class StoreReturns {
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "sr_returned_date_sk", referencedColumnName = "d_date_sk")
  private DateDim srReturnedDateSk; // FK
	
  @Column(name = "sr_return_time_sk")
  private Long srReturnTimeSk;
  
  @EmbeddedId
  private StoreReturnsId srId;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "sr_customer_sk")
  private Customer srCustomerSk; // FK

  @Column(name = "sr_cdemo_sk")
  private Long srCdemoSk;
  @Column(name = "sr_hdemo_sk")
  private Long srHdemoSk;
  @Column(name = "sr_addr_sk")
  private Long srAddrSk;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "sr_store_sk", referencedColumnName = "s_store_sk")
  private Store srStoreSk; // FK
  
  @Column(name = "sr_reason_sk")
  private Long srReasonSk;
  @Column(name = "sr_return_quantity")
  private Long srReturnQuantity;
  @Column(name = "sr_return_amt")
  private Double srReturnAmt;
  @Column(name = "sr_return_tax")
  private Double srReturnTax;
  @Column(name = "sr_return_amt_inc_tax")
  private Double srReturnAmtIncTax;
  @Column(name = "sr_fee")
  private Double srFee;
  @Column(name = "sr_return_ship_cost")
  private Double srReturnShipCost;
  @Column(name = "sr_refunded_cash")
  private Double srRefundedCash;
  @Column(name = "sr_reversed_charge")
  private Double srReversedCharge;
  @Column(name = "sr_store_credit")
  private Double srStoreCredit;
  @Column(name = "sr_net_loss")
  private Double srNetLoss;


  public DateDim getSrReturnedDateSk() {
    return srReturnedDateSk;
  }

  public void setSrReturnedDateSk(DateDim srReturnedDateSk) {
    this.srReturnedDateSk = srReturnedDateSk;
  }


  public Long getSrReturnTimeSk() {
    return srReturnTimeSk;
  }

  public void setSrReturnTimeSk(Long srReturnTimeSk) {
    this.srReturnTimeSk = srReturnTimeSk;
  }


  public StoreReturnsId getSrId() {
    return srId;
  }

  public void setSrItemSk(StoreReturnsId srId) {
    this.srId = srId;
  }


  public Customer getSrCustomerSk() {
    return srCustomerSk;
  }

  public void setSrCustomerSk(Customer srCustomerSk) {
    this.srCustomerSk = srCustomerSk;
  }


  public Long getSrCdemoSk() {
    return srCdemoSk;
  }

  public void setSrCdemoSk(Long srCdemoSk) {
    this.srCdemoSk = srCdemoSk;
  }


  public Long getSrHdemoSk() {
    return srHdemoSk;
  }

  public void setSrHdemoSk(Long srHdemoSk) {
    this.srHdemoSk = srHdemoSk;
  }


  public Long getSrAddrSk() {
    return srAddrSk;
  }

  public void setSrAddrSk(Long srAddrSk) {
    this.srAddrSk = srAddrSk;
  }


  public Store getSrStoreSk() {
    return srStoreSk;
  }

  public void setSrStoreSk(Store srStoreSk) {
    this.srStoreSk = srStoreSk;
  }


  public Long getSrReasonSk() {
    return srReasonSk;
  }

  public void setSrReasonSk(Long srReasonSk) {
    this.srReasonSk = srReasonSk;
  }




  public Long getSrReturnQuantity() {
    return srReturnQuantity;
  }

  public void setSrReturnQuantity(Long srReturnQuantity) {
    this.srReturnQuantity = srReturnQuantity;
  }


  public Double getSrReturnAmt() {
    return srReturnAmt;
  }

  public void setSrReturnAmt(Double srReturnAmt) {
    this.srReturnAmt = srReturnAmt;
  }


  public Double getSrReturnTax() {
    return srReturnTax;
  }

  public void setSrReturnTax(Double srReturnTax) {
    this.srReturnTax = srReturnTax;
  }


  public Double getSrReturnAmtIncTax() {
    return srReturnAmtIncTax;
  }

  public void setSrReturnAmtIncTax(Double srReturnAmtIncTax) {
    this.srReturnAmtIncTax = srReturnAmtIncTax;
  }


  public Double getSrFee() {
    return srFee;
  }

  public void setSrFee(Double srFee) {
    this.srFee = srFee;
  }


  public Double getSrReturnShipCost() {
    return srReturnShipCost;
  }

  public void setSrReturnShipCost(Double srReturnShipCost) {
    this.srReturnShipCost = srReturnShipCost;
  }


  public Double getSrRefundedCash() {
    return srRefundedCash;
  }

  public void setSrRefundedCash(Double srRefundedCash) {
    this.srRefundedCash = srRefundedCash;
  }


  public Double getSrReversedCharge() {
    return srReversedCharge;
  }

  public void setSrReversedCharge(Double srReversedCharge) {
    this.srReversedCharge = srReversedCharge;
  }


  public Double getSrStoreCredit() {
    return srStoreCredit;
  }

  public void setSrStoreCredit(Double srStoreCredit) {
    this.srStoreCredit = srStoreCredit;
  }


  public Double getSrNetLoss() {
    return srNetLoss;
  }

  public void setSrNetLoss(Double srNetLoss) {
    this.srNetLoss = srNetLoss;
  }

}
