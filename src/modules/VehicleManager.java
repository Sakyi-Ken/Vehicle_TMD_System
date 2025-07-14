package modules;

// import java.util.ArrayList;
import java.util.List;
import models.Vehicle;
import structures.CustomHashTable;

public class VehicleManager {

    private final CustomHashTable<String, Vehicle> vehicleTable;

    public VehicleManager() {
        vehicleTable = new CustomHashTable<>();
    }

    // Add a vehicle
    public void addVehicle(Vehicle vehicle) {
        vehicleTable.put(vehicle.getRegistrationNumber(), vehicle);
    }

// Remove a vehicle
    public void removeVehicle(String registrationNumber) {
        vehicleTable.remove(registrationNumber);
    }

// Find a vehicle
    public Vehicle findVehicle(String registrationNumber) {
        return vehicleTable.get(registrationNumber);
    }

// Check if vehicle exists
    public boolean containsVehicle(String registrationNumber) {
        return vehicleTable.containsKey(registrationNumber);
    }

// Return all vehicles in the system (for listing or saving)
    public List<Vehicle> getAllVehicles() {
        // Removed unused variable 'vehicles'

        // Manually iterate through hash table buckets
        // for (int i = 0; i < 16; i++) {
        //     var bucket = vehicleTable.getBucket(i);
        //     if (bucket != null) {
        //         for (var entry : bucket) {
        //             vehicles.add(entry.value); // add the Vehicle object
        //         }
        //     }
        // }
        // return vehicles;
        // Use the getAllValues method from CustomHashTable
        return vehicleTable.getAllValues();
    }

}
