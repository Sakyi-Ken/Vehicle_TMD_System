package test;

import models.Vehicle;
import models.MaintenanceRecord;

public class TestVehicle{
  public static void main(String[] args) {
    Vehicle truck = new Vehicle("GE-1234-21", "Truck", 120000, 14.5, "DR101");
    MaintenanceRecord record1 = new MaintenanceRecord(
      "MR001", "2025-07-06", 12500, "Brake pads, Oil filter", 850.00, "Routine servicing"
    );

    truck.addMaintenanceRecord(record1);

    System.out.println("Initial vehicle info:");
    System.out.println(truck);

     truck.setMileage(125000);

    System.out.println("\nUpdated mileage:");
    System.out.println("New mileage: " + truck.getMileage());

    truck.setDriverId("DR102");

    System.out.println("\nAfter reassigning driver:");
    System.out.println(truck);

    System.out.println("\nMaintenance history:");
    System.out.println("Total records: " + truck.getMaintenanceHistory().size());
    System.out.println("First record:");
    System.out.println(truck.getMaintenanceHistory().get(0));
  }
};