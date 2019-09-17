package tpcds.domain.lazy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Promotion {
@Id
  private Long pPromoSk;
  private String pPromoId;
  private Long pStartDateSk;
  private Long pEndDateSk;
  private Long pItemSk;
  private double pCost;
  private Long pResponseTarget;
  private String pPromoName;
  private String pChannelDmail;
  private String pChannelEmail;
  private String pChannelCatalog;
  private String pChannelTv;
  private String pChannelRadio;
  private String pChannelPress;
  private String pChannelEvent;
  private String pChannelDemo;
  private String pChannelDetails;
  private String pPurpose;
  private String pDiscountActive;


  public Long getPPromoSk() {
    return pPromoSk;
  }

  public void setPPromoSk(Long pPromoSk) {
    this.pPromoSk = pPromoSk;
  }


  public String getPPromoId() {
    return pPromoId;
  }

  public void setPPromoId(String pPromoId) {
    this.pPromoId = pPromoId;
  }


  public Long getPStartDateSk() {
    return pStartDateSk;
  }

  public void setPStartDateSk(Long pStartDateSk) {
    this.pStartDateSk = pStartDateSk;
  }


  public Long getPEndDateSk() {
    return pEndDateSk;
  }

  public void setPEndDateSk(Long pEndDateSk) {
    this.pEndDateSk = pEndDateSk;
  }


  public Long getPItemSk() {
    return pItemSk;
  }

  public void setPItemSk(Long pItemSk) {
    this.pItemSk = pItemSk;
  }


  public double getPCost() {
    return pCost;
  }

  public void setPCost(double pCost) {
    this.pCost = pCost;
  }


  public Long getPResponseTarget() {
    return pResponseTarget;
  }

  public void setPResponseTarget(Long pResponseTarget) {
    this.pResponseTarget = pResponseTarget;
  }


  public String getPPromoName() {
    return pPromoName;
  }

  public void setPPromoName(String pPromoName) {
    this.pPromoName = pPromoName;
  }


  public String getPChannelDmail() {
    return pChannelDmail;
  }

  public void setPChannelDmail(String pChannelDmail) {
    this.pChannelDmail = pChannelDmail;
  }


  public String getPChannelEmail() {
    return pChannelEmail;
  }

  public void setPChannelEmail(String pChannelEmail) {
    this.pChannelEmail = pChannelEmail;
  }


  public String getPChannelCatalog() {
    return pChannelCatalog;
  }

  public void setPChannelCatalog(String pChannelCatalog) {
    this.pChannelCatalog = pChannelCatalog;
  }


  public String getPChannelTv() {
    return pChannelTv;
  }

  public void setPChannelTv(String pChannelTv) {
    this.pChannelTv = pChannelTv;
  }


  public String getPChannelRadio() {
    return pChannelRadio;
  }

  public void setPChannelRadio(String pChannelRadio) {
    this.pChannelRadio = pChannelRadio;
  }


  public String getPChannelPress() {
    return pChannelPress;
  }

  public void setPChannelPress(String pChannelPress) {
    this.pChannelPress = pChannelPress;
  }


  public String getPChannelEvent() {
    return pChannelEvent;
  }

  public void setPChannelEvent(String pChannelEvent) {
    this.pChannelEvent = pChannelEvent;
  }


  public String getPChannelDemo() {
    return pChannelDemo;
  }

  public void setPChannelDemo(String pChannelDemo) {
    this.pChannelDemo = pChannelDemo;
  }


  public String getPChannelDetails() {
    return pChannelDetails;
  }

  public void setPChannelDetails(String pChannelDetails) {
    this.pChannelDetails = pChannelDetails;
  }


  public String getPPurpose() {
    return pPurpose;
  }

  public void setPPurpose(String pPurpose) {
    this.pPurpose = pPurpose;
  }


  public String getPDiscountActive() {
    return pDiscountActive;
  }

  public void setPDiscountActive(String pDiscountActive) {
    this.pDiscountActive = pDiscountActive;
  }

}
