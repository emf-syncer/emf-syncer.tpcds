package tpcds.domain.lazy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ShipMode {
@Id
  private Long smShipModeSk;
  private String smShipModeId;
  private String smType;
  private String smCode;
  private String smCarrier;
  private String smContract;


  public Long getSmShipModeSk() {
    return smShipModeSk;
  }

  public void setSmShipModeSk(Long smShipModeSk) {
    this.smShipModeSk = smShipModeSk;
  }


  public String getSmShipModeId() {
    return smShipModeId;
  }

  public void setSmShipModeId(String smShipModeId) {
    this.smShipModeId = smShipModeId;
  }


  public String getSmType() {
    return smType;
  }

  public void setSmType(String smType) {
    this.smType = smType;
  }


  public String getSmCode() {
    return smCode;
  }

  public void setSmCode(String smCode) {
    this.smCode = smCode;
  }


  public String getSmCarrier() {
    return smCarrier;
  }

  public void setSmCarrier(String smCarrier) {
    this.smCarrier = smCarrier;
  }


  public String getSmContract() {
    return smContract;
  }

  public void setSmContract(String smContract) {
    this.smContract = smContract;
  }

}
