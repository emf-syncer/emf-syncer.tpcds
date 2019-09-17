package tpcds.domain.lazy;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class WebReturns implements Serializable {
  private Long wrReturnedDateSk;
  private Long wrReturnedTimeSk;
  @EmbeddedId
  private WebReturnsId wrId;
  private Long wrRefundedCustomerSk;
  private Long wrRefundedCdemoSk;
  private Long wrRefundedHdemoSk;
  private Long wrRefundedAddrSk;
  private Long wrReturningCustomerSk;
  private Long wrReturningCdemoSk;
  private Long wrReturningHdemoSk;
  private Long wrReturningAddrSk;
  private Long wrWebPageSk;
  private Long wrReasonSk;
  private Long wrReturnQuantity;
  private double wrReturnAmt;
  private double wrReturnTax;
  private double wrReturnAmtIncTax;
  private double wrFee;
  private double wrReturnShipCost;
  private double wrRefundedCash;
  private double wrReversedCharge;
  private double wrAccountCredit;
  private double wrNetLoss;


  public Long getWrReturnedDateSk() {
    return wrReturnedDateSk;
  }

  public void setWrReturnedDateSk(Long wrReturnedDateSk) {
    this.wrReturnedDateSk = wrReturnedDateSk;
  }


  public Long getWrReturnedTimeSk() {
    return wrReturnedTimeSk;
  }

  public void setWrReturnedTimeSk(Long wrReturnedTimeSk) {
    this.wrReturnedTimeSk = wrReturnedTimeSk;
  }


  public WebReturnsId getWrId() {
    return wrId;
  }

  public void setWrId(WebReturnsId wrId) {
    this.wrId = wrId;
  }


  public Long getWrRefundedCustomerSk() {
    return wrRefundedCustomerSk;
  }

  public void setWrRefundedCustomerSk(Long wrRefundedCustomerSk) {
    this.wrRefundedCustomerSk = wrRefundedCustomerSk;
  }


  public Long getWrRefundedCdemoSk() {
    return wrRefundedCdemoSk;
  }

  public void setWrRefundedCdemoSk(Long wrRefundedCdemoSk) {
    this.wrRefundedCdemoSk = wrRefundedCdemoSk;
  }


  public Long getWrRefundedHdemoSk() {
    return wrRefundedHdemoSk;
  }

  public void setWrRefundedHdemoSk(Long wrRefundedHdemoSk) {
    this.wrRefundedHdemoSk = wrRefundedHdemoSk;
  }


  public Long getWrRefundedAddrSk() {
    return wrRefundedAddrSk;
  }

  public void setWrRefundedAddrSk(Long wrRefundedAddrSk) {
    this.wrRefundedAddrSk = wrRefundedAddrSk;
  }


  public Long getWrReturningCustomerSk() {
    return wrReturningCustomerSk;
  }

  public void setWrReturningCustomerSk(Long wrReturningCustomerSk) {
    this.wrReturningCustomerSk = wrReturningCustomerSk;
  }


  public Long getWrReturningCdemoSk() {
    return wrReturningCdemoSk;
  }

  public void setWrReturningCdemoSk(Long wrReturningCdemoSk) {
    this.wrReturningCdemoSk = wrReturningCdemoSk;
  }


  public Long getWrReturningHdemoSk() {
    return wrReturningHdemoSk;
  }

  public void setWrReturningHdemoSk(Long wrReturningHdemoSk) {
    this.wrReturningHdemoSk = wrReturningHdemoSk;
  }


  public Long getWrReturningAddrSk() {
    return wrReturningAddrSk;
  }

  public void setWrReturningAddrSk(Long wrReturningAddrSk) {
    this.wrReturningAddrSk = wrReturningAddrSk;
  }


  public Long getWrWebPageSk() {
    return wrWebPageSk;
  }

  public void setWrWebPageSk(Long wrWebPageSk) {
    this.wrWebPageSk = wrWebPageSk;
  }


  public Long getWrReasonSk() {
    return wrReasonSk;
  }

  public void setWrReasonSk(Long wrReasonSk) {
    this.wrReasonSk = wrReasonSk;
  }


  public Long getWrReturnQuantity() {
    return wrReturnQuantity;
  }

  public void setWrReturnQuantity(Long wrReturnQuantity) {
    this.wrReturnQuantity = wrReturnQuantity;
  }


  public double getWrReturnAmt() {
    return wrReturnAmt;
  }

  public void setWrReturnAmt(double wrReturnAmt) {
    this.wrReturnAmt = wrReturnAmt;
  }


  public double getWrReturnTax() {
    return wrReturnTax;
  }

  public void setWrReturnTax(double wrReturnTax) {
    this.wrReturnTax = wrReturnTax;
  }


  public double getWrReturnAmtIncTax() {
    return wrReturnAmtIncTax;
  }

  public void setWrReturnAmtIncTax(double wrReturnAmtIncTax) {
    this.wrReturnAmtIncTax = wrReturnAmtIncTax;
  }


  public double getWrFee() {
    return wrFee;
  }

  public void setWrFee(double wrFee) {
    this.wrFee = wrFee;
  }


  public double getWrReturnShipCost() {
    return wrReturnShipCost;
  }

  public void setWrReturnShipCost(double wrReturnShipCost) {
    this.wrReturnShipCost = wrReturnShipCost;
  }


  public double getWrRefundedCash() {
    return wrRefundedCash;
  }

  public void setWrRefundedCash(double wrRefundedCash) {
    this.wrRefundedCash = wrRefundedCash;
  }


  public double getWrReversedCharge() {
    return wrReversedCharge;
  }

  public void setWrReversedCharge(double wrReversedCharge) {
    this.wrReversedCharge = wrReversedCharge;
  }


  public double getWrAccountCredit() {
    return wrAccountCredit;
  }

  public void setWrAccountCredit(double wrAccountCredit) {
    this.wrAccountCredit = wrAccountCredit;
  }


  public double getWrNetLoss() {
    return wrNetLoss;
  }

  public void setWrNetLoss(double wrNetLoss) {
    this.wrNetLoss = wrNetLoss;
  }

}
