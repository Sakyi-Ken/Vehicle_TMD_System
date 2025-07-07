package models;

public class Driver {
  private String driverId;
  private String name;
  private int experienceLevel;
  private boolean isAvailable;
  private String contactNumber;
  private String licenseNumber;
  private int infractionCount;

  public Driver(String driverId, String name, int experienceLevel, boolean isAvailable, String contactNumber, String licenseNumber, int infractionCount) {
    this.driverId = driverId;
    this.name = name;
    this.experienceLevel = experienceLevel;
    this.isAvailable = isAvailable;
    this.contactNumber = contactNumber;
    this.licenseNumber = licenseNumber;
    this.infractionCount = infractionCount;
  }
  public String getDriverId() {
    return driverId;
  }
  public void setDriverId(String driverId) {
    this.driverId = driverId;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public int getExperienceLevel() {
    return experienceLevel;
  }
  public void setExperienceLevel(int experienceLevel) {
    this.experienceLevel = experienceLevel;
  }

  public boolean isAvailable() {
    return isAvailable;
  }
  public void setAvailable(boolean available) {
    isAvailable = available;
  }
  
  public String getContactNumber() {
    return contactNumber;
  }
  public void setContactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
  }

  public String getLicenseNumber() {
    return licenseNumber;
  }
  public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
  }

  public int getInfractionCount() {
    return infractionCount;
  }
  public void setInfractionCount(int infractionCount) {
    this.infractionCount = infractionCount;
  }

  @Override
  public String toString() {
    return 
    "Driver {" +
    "driverId='" + driverId + '\'' +
    ", name='" + name + '\'' + 
    ", experienceLevel='" + experienceLevel + 
    ", isAvailable=" + isAvailable +
    ", contactNumber='" + contactNumber + '\'' +
    ", licenseNumber='" + licenseNumber + '\'' +
    ", infractionCount=" + infractionCount +
    '}';
  }
}