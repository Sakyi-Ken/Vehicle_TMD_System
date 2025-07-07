package models;

public class MaintenanceRecord {
  private String recordId;
  private String date;
  private int mileageAtService;
  private String partsReplaced;
  private double cost;
  private String notes;

  public MaintenanceRecord(String recordId, String date, int mileageAtService, String partsReplaced, double cost, String notes) {
    this.recordId = recordId;
    this.date = date;
    this.mileageAtService = mileageAtService;
    this.partsReplaced = partsReplaced;
    this.cost = cost;
    this.notes = notes;
  }

  public String getRecordId() {
    return recordId;
  }
  public void setRecordId(String recordId) {
    this.recordId = recordId;
  }

  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }

  public int getMileageAtService() {
    return mileageAtService;
  }
  public void setMileageAtService(int mileageAtService) {
    this.mileageAtService = mileageAtService;
  }

  public String getPartsReplaced() {
    return partsReplaced;
  }
  public void setPartsReplaced(String partsReplaced) {
    this.partsReplaced = partsReplaced;
  }

  public double getCost() {
    return cost;
  }
  public void setCost(double cost) {
    this.cost = cost;
  }

  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  @Override 
  public String toString() {
    return 
      "MaintenanceRecord{" + 
      "recordId='" + recordId + '\'' + 
      ", date='" + date + '\'' + 
      ", mileageAtService=" + mileageAtService + 
      ", partsReplaced='" + partsReplaced + '\'' +
      ", cost=" + cost +
      ", notes='" + notes + '\'' +
      "}";
  }
}