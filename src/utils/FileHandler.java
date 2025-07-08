package utils;
import models.Vehicle;
import models.MaintenanceRecord;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
  private static final String VEHICLE_FILE = "C:\\Users\\EMMANUEL\\OneDrive - University of Ghana\\myPros\\Vehicle_TMD_System\\data\\vehicles.txt";

  public static void saveVehicles(List<Vehicle> vehicles) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(VEHICLE_FILE))) {
      //  File folder = new File("data");
      //   if (!folder.exists()) {
      //       folder.mkdirs();
      //   }
      for (Vehicle v : vehicles) {
        StringBuilder sb = new StringBuilder();

        sb.append(v.getRegistrationNumber()).append("|")
          .append(v.getType()).append("|")
          .append(v.getMileage()).append("|")
          .append(v.getFuelUsage()).append("|")
          .append(v.getDriverId()).append("|");

        List<MaintenanceRecord> history = v.getMaintenanceHistory();
        for (int i = 0; i < history.size(); i++) {
          MaintenanceRecord r = history.get(i);
          sb.append(r.getRecordId()).append(",")
            .append(r.getDate()).append(",")
            .append(r.getMileageAtService()).append(",")
            .append(r.getPartsReplaced()).append(",")
            .append(r.getCost()).append(",")
            .append(r.getNotes().replace(",", " ")); // to avoid breaking CSV

          if (i < history.size() - 1) sb.append(";"); // separate records
        }

        writer.write(sb.toString());
        writer.newLine();  
      }
      writer.close();
      System.out.println("Vehicles saved to " + VEHICLE_FILE);
    } catch (IOException e) {
      System.out.println("Error saving vehicles: " + e.getMessage());
    }
  }

  public static List<Vehicle> loadVehicles() {
    List<Vehicle> vehicles = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(VEHICLE_FILE))) {
      String line;

      while ((line = reader.readLine()) != null) {
        String[] parts = line.split("\\|");

        String regNum = parts[0];
        String type = parts[1];
        int mileage = Integer.parseInt(parts[2]);
        double fuelUsage = Double.parseDouble(parts[3]);
        String driverId = parts[4];

        Vehicle vehicle = new Vehicle(regNum, type, mileage, fuelUsage, driverId);

        if (parts.length > 5) {
          String[] records = parts[5].split(";");
          for (String rec : records) {
            String[] recParts = rec.split(",", 6);
            if (recParts.length == 6) {
              MaintenanceRecord mr = new MaintenanceRecord(
                recParts[0], recParts[1],
                Integer.parseInt(recParts[2]),
                recParts[3], Double.parseDouble(recParts[4]),
                recParts[5]
              );
              vehicle.addMaintenanceRecord(mr);
            }
          }
        }
        vehicles.add(vehicle);
      }
      System.out.println("Vehicles loaded from " + VEHICLE_FILE);
    } catch (FileNotFoundException e) {
      System.out.println("No saved vehicle file found yet.");
    } catch (IOException e) {
      System.out.println("Error loading vehicles: " + e.getMessage());
    }
    return vehicles;
  }
}