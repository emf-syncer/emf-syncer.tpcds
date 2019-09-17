package tpcds.domain.lazy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TimeDim {
@Id
  private Long tTimeSk;
  private String tTimeId;
  private Long tTime;
  private Long tHour;
  private Long tMinute;
  private Long tSecond;
  private String tAmPm;
  private String tShift;
  private String tSubShift;
  private String tMealTime;


  public Long getTTimeSk() {
    return tTimeSk;
  }

  public void setTTimeSk(Long tTimeSk) {
    this.tTimeSk = tTimeSk;
  }


  public String getTTimeId() {
    return tTimeId;
  }

  public void setTTimeId(String tTimeId) {
    this.tTimeId = tTimeId;
  }


  public Long getTTime() {
    return tTime;
  }

  public void setTTime(Long tTime) {
    this.tTime = tTime;
  }


  public Long getTHour() {
    return tHour;
  }

  public void setTHour(Long tHour) {
    this.tHour = tHour;
  }


  public Long getTMinute() {
    return tMinute;
  }

  public void setTMinute(Long tMinute) {
    this.tMinute = tMinute;
  }


  public Long getTSecond() {
    return tSecond;
  }

  public void setTSecond(Long tSecond) {
    this.tSecond = tSecond;
  }


  public String getTAmPm() {
    return tAmPm;
  }

  public void setTAmPm(String tAmPm) {
    this.tAmPm = tAmPm;
  }


  public String getTShift() {
    return tShift;
  }

  public void setTShift(String tShift) {
    this.tShift = tShift;
  }


  public String getTSubShift() {
    return tSubShift;
  }

  public void setTSubShift(String tSubShift) {
    this.tSubShift = tSubShift;
  }


  public String getTMealTime() {
    return tMealTime;
  }

  public void setTMealTime(String tMealTime) {
    this.tMealTime = tMealTime;
  }

}
