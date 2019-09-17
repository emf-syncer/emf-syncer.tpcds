package tpcds.domain.lazy;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class CatalogReturns{

  private Long crReturnedDateSk;
  private Long crReturnedTimeSk;
  @EmbeddedId
  private CatalogReturnsId crId;
  private Long crRefundedCustomerSk;
  private Long crRefundedCdemoSk;
  private Long crRefundedHdemoSk;
  private Long crRefundedAddrSk;
  private Long crReturningCustomerSk;
  private Long crReturningCdemoSk;
  private Long crReturningHdemoSk;
  private Long crReturningAddrSk;
  private Long crCallCenterSk;
  private Long crCatalogPageSk;
  private Long crShipModeSk;
  private Long crWarehouseSk;
  private Long crReasonSk;
  private Long crReturnQuantity;
  private double crReturnAmount;
  private double crReturnTax;
  private double crReturnAmtIncTax;
  private double crFee;
  private double crReturnShipCost;
  private double crRefundedCash;
  private double crReversedCharge;
  private double crStoreCredit;
  private double crNetLoss;


  public Long getCrReturnedDateSk() {
    return crReturnedDateSk;
  }

  public void setCrReturnedDateSk(Long crReturnedDateSk) {
    this.crReturnedDateSk = crReturnedDateSk;
  }


  public Long getCrReturnedTimeSk() {
    return crReturnedTimeSk;
  }

  public void setCrReturnedTimeSk(Long crReturnedTimeSk) {
    this.crReturnedTimeSk = crReturnedTimeSk;
  }


  public CatalogReturnsId getCrId() {
    return crId;
  }

  public void setCrId(CatalogReturnsId crId) {
    this.crId = crId;
  }


  public Long getCrRefundedCustomerSk() {
    return crRefundedCustomerSk;
  }

  public void setCrRefundedCustomerSk(Long crRefundedCustomerSk) {
    this.crRefundedCustomerSk = crRefundedCustomerSk;
  }


  public Long getCrRefundedCdemoSk() {
    return crRefundedCdemoSk;
  }

  public void setCrRefundedCdemoSk(Long crRefundedCdemoSk) {
    this.crRefundedCdemoSk = crRefundedCdemoSk;
  }


  public Long getCrRefundedHdemoSk() {
    return crRefundedHdemoSk;
  }

  public void setCrRefundedHdemoSk(Long crRefundedHdemoSk) {
    this.crRefundedHdemoSk = crRefundedHdemoSk;
  }


  public Long getCrRefundedAddrSk() {
    return crRefundedAddrSk;
  }

  public void setCrRefundedAddrSk(Long crRefundedAddrSk) {
    this.crRefundedAddrSk = crRefundedAddrSk;
  }


  public Long getCrReturningCustomerSk() {
    return crReturningCustomerSk;
  }

  public void setCrReturningCustomerSk(Long crReturningCustomerSk) {
    this.crReturningCustomerSk = crReturningCustomerSk;
  }


  public Long getCrReturningCdemoSk() {
    return crReturningCdemoSk;
  }

  public void setCrReturningCdemoSk(Long crReturningCdemoSk) {
    this.crReturningCdemoSk = crReturningCdemoSk;
  }


  public Long getCrReturningHdemoSk() {
    return crReturningHdemoSk;
  }

  public void setCrReturningHdemoSk(Long crReturningHdemoSk) {
    this.crReturningHdemoSk = crReturningHdemoSk;
  }


  public Long getCrReturningAddrSk() {
    return crReturningAddrSk;
  }

  public void setCrReturningAddrSk(Long crReturningAddrSk) {
    this.crReturningAddrSk = crReturningAddrSk;
  }


  public Long getCrCallCenterSk() {
    return crCallCenterSk;
  }

  public void setCrCallCenterSk(Long crCallCenterSk) {
    this.crCallCenterSk = crCallCenterSk;
  }


  public Long getCrCatalogPageSk() {
    return crCatalogPageSk;
  }

  public void setCrCatalogPageSk(Long crCatalogPageSk) {
    this.crCatalogPageSk = crCatalogPageSk;
  }


  public Long getCrShipModeSk() {
    return crShipModeSk;
  }

  public void setCrShipModeSk(Long crShipModeSk) {
    this.crShipModeSk = crShipModeSk;
  }


  public Long getCrWarehouseSk() {
    return crWarehouseSk;
  }

  public void setCrWarehouseSk(Long crWarehouseSk) {
    this.crWarehouseSk = crWarehouseSk;
  }


  public Long getCrReasonSk() {
    return crReasonSk;
  }

  public void setCrReasonSk(Long crReasonSk) {
    this.crReasonSk = crReasonSk;
  }



  public Long getCrReturnQuantity() {
    return crReturnQuantity;
  }

  public void setCrReturnQuantity(Long crReturnQuantity) {
    this.crReturnQuantity = crReturnQuantity;
  }


  public double getCrReturnAmount() {
    return crReturnAmount;
  }

  public void setCrReturnAmount(double crReturnAmount) {
    this.crReturnAmount = crReturnAmount;
  }


  public double getCrReturnTax() {
    return crReturnTax;
  }

  public void setCrReturnTax(double crReturnTax) {
    this.crReturnTax = crReturnTax;
  }


  public double getCrReturnAmtIncTax() {
    return crReturnAmtIncTax;
  }

  public void setCrReturnAmtIncTax(double crReturnAmtIncTax) {
    this.crReturnAmtIncTax = crReturnAmtIncTax;
  }


  public double getCrFee() {
    return crFee;
  }

  public void setCrFee(double crFee) {
    this.crFee = crFee;
  }


  public double getCrReturnShipCost() {
    return crReturnShipCost;
  }

  public void setCrReturnShipCost(double crReturnShipCost) {
    this.crReturnShipCost = crReturnShipCost;
  }


  public double getCrRefundedCash() {
    return crRefundedCash;
  }

  public void setCrRefundedCash(double crRefundedCash) {
    this.crRefundedCash = crRefundedCash;
  }


  public double getCrReversedCharge() {
    return crReversedCharge;
  }

  public void setCrReversedCharge(double crReversedCharge) {
    this.crReversedCharge = crReversedCharge;
  }


  public double getCrStoreCredit() {
    return crStoreCredit;
  }

  public void setCrStoreCredit(double crStoreCredit) {
    this.crStoreCredit = crStoreCredit;
  }


  public double getCrNetLoss() {
    return crNetLoss;
  }

  public void setCrNetLoss(double crNetLoss) {
    this.crNetLoss = crNetLoss;
  }

}
