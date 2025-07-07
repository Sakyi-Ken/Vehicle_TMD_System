package models;

public class Vehicle {
  private String registrationNumber;
  private String type;
  private int mileage;
  private double fuelUsage;
  private String driverId;
  // maintenance history should be a map

  public Vehicle(String registrationNumber, String type, int mileage, double fuelUsage, String driverId) {
    this.registrationNumber = registrationNumber;
    this.type = type;
    this.mileage = mileage;
    this.fuelUsage = fuelUsage;
    this.driverId = driverId;
  }

  public String getRegistrationNumber() {
    return registrationNumber;
  }
  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  public int getMileage() {
    return mileage;
  }
  public void setMileage(int mileage) {
    this.mileage = mileage;
  }

  public double getFuelUsage() {
    return fuelUsage;
  }
  public void setFuelUsage(double fuelUsage) {
    this.fuelUsage = fuelUsage;
  }

  public String getDriverId() {
    return driverId;
  }
  public void setDriverId(String driverId) {
    this.driverId = driverId;
  }

  @Override
  public String toString() {
    return 
      "Vehicle{" +
      "registrationNumber='" + registrationNumber + '\'' +
      ", type='" + type + '\'' +
      ", mileage=" + mileage +
      ", fuelUsage=" + fuelUsage +
      ", driverId='" + driverId + '\'' +
      '}';
  }

}