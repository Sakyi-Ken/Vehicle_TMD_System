package test;

import models.Vehicle;
import modules.VehicleManager;

public class TestVehicleManager {

    public static void main(String[] args) {
        VehicleManager vm = new VehicleManager();

        // 1. Add vehicles
        Vehicle v1 = new Vehicle("GT1000-22", "Truck", 120000, 12.5, "D001");
        Vehicle v2 = new Vehicle("AW2222-23", "Van", 450000, 9.2, "D002");
        Vehicle v3 = new Vehicle("GE7000-20", "Truck", 80000, 11.0, "D003");

        vm.addVehicle(v1);
        vm.addVehicle(v2);
        vm.addVehicle(v3);

        System.out.println(" Added vehicles.");

        // 2. Search for a vehicle
        System.out.println("\n Searching for GT1000-22:");
        Vehicle found = vm.findVehicle("GT1000-22");
        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Vehicle not found.");
        }

        // 3. Remove a vehicle
        System.out.println("\n Removing AW2222-23");
        vm.removeVehicle("AW2222-23");

        // 4. List all remaining vehicles
        System.out.println("\n Current Vehicles:");
        for (Vehicle v : vm.getAllVehicles()) {
            System.out.println(v);
        }
    }
}
