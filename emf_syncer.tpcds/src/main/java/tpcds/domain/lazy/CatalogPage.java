package tpcds.domain.lazy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CatalogPage {

	@Id
  private Long cpCatalogPageSk;
  private String cpCatalogPageId;
  private Long cpStartDateSk;
  private Long cpEndDateSk;
  private String cpDepartment;
  private Long cpCatalogNumber;
  private Long cpCatalogPageNumber;
  private String cpDescription;
  private String cpType;


  public Long getCpCatalogPageSk() {
    return cpCatalogPageSk;
  }

  public void setCpCatalogPageSk(Long cpCatalogPageSk) {
    this.cpCatalogPageSk = cpCatalogPageSk;
  }


  public String getCpCatalogPageId() {
    return cpCatalogPageId;
  }

  public void setCpCatalogPageId(String cpCatalogPageId) {
    this.cpCatalogPageId = cpCatalogPageId;
  }


  public Long getCpStartDateSk() {
    return cpStartDateSk;
  }

  public void setCpStartDateSk(Long cpStartDateSk) {
    this.cpStartDateSk = cpStartDateSk;
  }


  public Long getCpEndDateSk() {
    return cpEndDateSk;
  }

  public void setCpEndDateSk(Long cpEndDateSk) {
    this.cpEndDateSk = cpEndDateSk;
  }


  public String getCpDepartment() {
    return cpDepartment;
  }

  public void setCpDepartment(String cpDepartment) {
    this.cpDepartment = cpDepartment;
  }


  public Long getCpCatalogNumber() {
    return cpCatalogNumber;
  }

  public void setCpCatalogNumber(Long cpCatalogNumber) {
    this.cpCatalogNumber = cpCatalogNumber;
  }


  public Long getCpCatalogPageNumber() {
    return cpCatalogPageNumber;
  }

  public void setCpCatalogPageNumber(Long cpCatalogPageNumber) {
    this.cpCatalogPageNumber = cpCatalogPageNumber;
  }


  public String getCpDescription() {
    return cpDescription;
  }

  public void setCpDescription(String cpDescription) {
    this.cpDescription = cpDescription;
  }


  public String getCpType() {
    return cpType;
  }

  public void setCpType(String cpType) {
    this.cpType = cpType;
  }

}
