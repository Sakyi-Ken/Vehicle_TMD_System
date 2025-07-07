package test;

import models.MaintenanceRecord;

public class TestMaintenanceRecord {
  public static void main(String[] args) {
    MaintenanceRecord record = new MaintenanceRecord(
      "MR001",
      "2025-07-06",
      125000,
      "Oil filter, Brake pads",
      850.50,
      "Routine servie and brake adjustmnet"
    );

    System.out.println("\nMaintenance record details");
    System.out.println(record);

    record.setNotes("Replaced air filter too.");

    System.out.println("\nAfter update:");
    System.out.println("Updated notes: " + record.getNotes());
    System.out.println(record);
  }
}