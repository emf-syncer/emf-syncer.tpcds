package tpcds.domain.lazy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DateDim {
  @Id
  @Column(name = "d_date_sk")
  private Long dDateSk;
  @Column(name = "d_date_id")
  private String dDateId;
  @Column(name = "d_date")
  private java.sql.Date dDate;
  @Column(name = "d_month_seq")
  private Long dMonthSeq;
  @Column(name = "d_week_seq")
  private Long dWeekSeq;
  @Column(name = "d_quarter_seq")
  private Long dQuarterSeq;
  @Column(name = "d_year")
  private Long dYear;
  @Column(name = "d_dow")
  private Long dDow;
  @Column(name = "d_moy")
  private Long dMoy;
  @Column(name = "d_dom")
  private Long dDom;
  @Column(name = "d_qoy")
  private Long dQoy;
  @Column(name = "d_fy_year")
  private Long dFyYear;
  @Column(name = "d_fy_quarter_seq")
  private Long dFyQuarterSeq;
  @Column(name = "d_fy_week_seq")
  private Long dFyWeekSeq;
  @Column(name = "d_day_name")
  private String dDayName;
  @Column(name = "d_quarter_name")
  private String dQuarterName;
  @Column(name = "d_holiday")
  private String dHoliday;
  @Column(name = "d_weekend")
  private String dWeekend;
  @Column(name = "d_following_holiday")
  private String dFollowingHoliday;
  @Column(name = "d_first_dom")
  private Long dFirstDom;
  @Column(name = "d_last_dom")
  private Long dLastDom;
  @Column(name = "d_same_day_ly")
  private Long dSameDayLy;
  @Column(name = "d_same_day_lq")
  private Long dSameDayLq;
  @Column(name = "d_current_day")
  private String dCurrentDay;
  @Column(name = "d_current_week")
  private String dCurrentWeek;
  @Column(name = "d_current_month")
  private String dCurrentMonth;
  @Column(name = "d_current_quarter")
  private String dCurrentQuarter;
  @Column(name = "d_current_year")
  private String dCurrentYear;


  public Long getDDateSk() {
    return dDateSk;
  }

  public void setDDateSk(Long dDateSk) {
    this.dDateSk = dDateSk;
  }


  public String getDDateId() {
    return dDateId;
  }

  public void setDDateId(String dDateId) {
    this.dDateId = dDateId;
  }


  public java.sql.Date getDDate() {
    return dDate;
  }

  public void setDDate(java.sql.Date dDate) {
    this.dDate = dDate;
  }


  public Long getDMonthSeq() {
    return dMonthSeq;
  }

  public void setDMonthSeq(Long dMonthSeq) {
    this.dMonthSeq = dMonthSeq;
  }


  public Long getDWeekSeq() {
    return dWeekSeq;
  }

  public void setDWeekSeq(Long dWeekSeq) {
    this.dWeekSeq = dWeekSeq;
  }


  public Long getDQuarterSeq() {
    return dQuarterSeq;
  }

  public void setDQuarterSeq(Long dQuarterSeq) {
    this.dQuarterSeq = dQuarterSeq;
  }


  public Long getDYear() {
    return dYear;
  }

  public void setDYear(Long dYear) {
    this.dYear = dYear;
  }


  public Long getDDow() {
    return dDow;
  }

  public void setDDow(Long dDow) {
    this.dDow = dDow;
  }


  public Long getDMoy() {
    return dMoy;
  }

  public void setDMoy(Long dMoy) {
    this.dMoy = dMoy;
  }


  public Long getDDom() {
    return dDom;
  }

  public void setDDom(Long dDom) {
    this.dDom = dDom;
  }


  public Long getDQoy() {
    return dQoy;
  }

  public void setDQoy(Long dQoy) {
    this.dQoy = dQoy;
  }


  public Long getDFyYear() {
    return dFyYear;
  }

  public void setDFyYear(Long dFyYear) {
    this.dFyYear = dFyYear;
  }


  public Long getDFyQuarterSeq() {
    return dFyQuarterSeq;
  }

  public void setDFyQuarterSeq(Long dFyQuarterSeq) {
    this.dFyQuarterSeq = dFyQuarterSeq;
  }


  public Long getDFyWeekSeq() {
    return dFyWeekSeq;
  }

  public void setDFyWeekSeq(Long dFyWeekSeq) {
    this.dFyWeekSeq = dFyWeekSeq;
  }


  public String getDDayName() {
    return dDayName;
  }

  public void setDDayName(String dDayName) {
    this.dDayName = dDayName;
  }


  public String getDQuarterName() {
    return dQuarterName;
  }

  public void setDQuarterName(String dQuarterName) {
    this.dQuarterName = dQuarterName;
  }


  public String getDHoliday() {
    return dHoliday;
  }

  public void setDHoliday(String dHoliday) {
    this.dHoliday = dHoliday;
  }


  public String getDWeekend() {
    return dWeekend;
  }

  public void setDWeekend(String dWeekend) {
    this.dWeekend = dWeekend;
  }


  public String getDFollowingHoliday() {
    return dFollowingHoliday;
  }

  public void setDFollowingHoliday(String dFollowingHoliday) {
    this.dFollowingHoliday = dFollowingHoliday;
  }


  public Long getDFirstDom() {
    return dFirstDom;
  }

  public void setDFirstDom(Long dFirstDom) {
    this.dFirstDom = dFirstDom;
  }


  public Long getDLastDom() {
    return dLastDom;
  }

  public void setDLastDom(Long dLastDom) {
    this.dLastDom = dLastDom;
  }


  public Long getDSameDayLy() {
    return dSameDayLy;
  }

  public void setDSameDayLy(Long dSameDayLy) {
    this.dSameDayLy = dSameDayLy;
  }


  public Long getDSameDayLq() {
    return dSameDayLq;
  }

  public void setDSameDayLq(Long dSameDayLq) {
    this.dSameDayLq = dSameDayLq;
  }


  public String getDCurrentDay() {
    return dCurrentDay;
  }

  public void setDCurrentDay(String dCurrentDay) {
    this.dCurrentDay = dCurrentDay;
  }


  public String getDCurrentWeek() {
    return dCurrentWeek;
  }

  public void setDCurrentWeek(String dCurrentWeek) {
    this.dCurrentWeek = dCurrentWeek;
  }


  public String getDCurrentMonth() {
    return dCurrentMonth;
  }

  public void setDCurrentMonth(String dCurrentMonth) {
    this.dCurrentMonth = dCurrentMonth;
  }


  public String getDCurrentQuarter() {
    return dCurrentQuarter;
  }

  public void setDCurrentQuarter(String dCurrentQuarter) {
    this.dCurrentQuarter = dCurrentQuarter;
  }


  public String getDCurrentYear() {
    return dCurrentYear;
  }

  public void setDCurrentYear(String dCurrentYear) {
    this.dCurrentYear = dCurrentYear;
  }

}
