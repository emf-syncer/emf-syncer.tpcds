package tpcds.domain.lazy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DbgenVersion {

	@Id
  private String dvVersion;
  private java.sql.Date dvCreateDate;
  private java.sql.Time dvCreateTime;
  private String dvCmdlineArgs;


  public String getDvVersion() {
    return dvVersion;
  }

  public void setDvVersion(String dvVersion) {
    this.dvVersion = dvVersion;
  }


  public java.sql.Date getDvCreateDate() {
    return dvCreateDate;
  }

  public void setDvCreateDate(java.sql.Date dvCreateDate) {
    this.dvCreateDate = dvCreateDate;
  }


  public java.sql.Time getDvCreateTime() {
    return dvCreateTime;
  }

  public void setDvCreateTime(java.sql.Time dvCreateTime) {
    this.dvCreateTime = dvCreateTime;
  }


  public String getDvCmdlineArgs() {
    return dvCmdlineArgs;
  }

  public void setDvCmdlineArgs(String dvCmdlineArgs) {
    this.dvCmdlineArgs = dvCmdlineArgs;
  }

}
