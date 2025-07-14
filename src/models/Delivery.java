package models;

public class Delivery {
  private String packageId;
  private String origin;
  private String destination;
  private String assignedVehicleId;
  private String assignedDriverId;
  private String eta;
  // Future implementation will be using Java Date and Time library
  private String status;

  public Delivery(String packageId, String origin, String destination, String assignedVehicleId, String assignedDriverId, String eta, String status) {
    this.packageId = packageId;
    this.origin = origin;
    this.destination = destination;
    this.assignedVehicleId = assignedVehicleId;
    this.assignedDriverId = assignedDriverId;
    this.eta = eta;
    this.status = status;
  }

    public Delivery() {
    }

  public String getPackageId() {
    return packageId;
  } 
  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }

  public String getOrigin() {
    return origin;
  }
  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public String getDestination() {
    return destination;
  }
  public void setDestination(String destination) {
    this.destination = destination;
  }

  public String getAssignedVehicleId() {
    return assignedVehicleId;
  }
  public void setAssignedVehicleId(String assignedVehicleId) {
    this.assignedVehicleId = assignedVehicleId;
  }

  public String getEta() {
    return eta;
  }
  public void setEta(String eta) {
    this.eta = eta;
  }

  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return 
      "Delivery{" +
      "packageId='" + packageId + '\'' +
      ", origin='" + origin + '\'' +
      ", destination='" + destination + '\'' +
      ", assignedVehicleId='" + assignedVehicleId + '\'' +
      ", assignedDriverId='" + assignedDriverId + '\'' +
      " eta='" + eta + '\'' +
      ", status='" + status + '\'' +
      '}';
  }
}