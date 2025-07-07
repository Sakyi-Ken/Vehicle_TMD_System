package test;

import models.Vehicle;

public class TestVehicle{
  public static void main(String[] args) {
    Vehicle truck = new Vehicle("GE-1234-21", "Truck", 120000, 14.5, "DR101");

    System.out.println("Initial vehicle info:");
    System.out.println(truck);

     truck.setMileage(125000);

    System.out.println("\nUpdated mileage:");
    System.out.println("New mileage: " + truck.getMileage());

    truck.setDriverId("DR102");
    
    System.out.println("\nAfter reassigning driver:");
    System.out.println(truck);
  }
};