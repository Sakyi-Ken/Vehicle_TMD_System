package test;

import models.Delivery;

public class TestDelivery {
  public static void main(String[] args) {
    Delivery delivery = new Delivery(
      "PKG123",
      "Tema Warehouse",
      "Kumasi Central Market",
      "GE-4321-22",
      "DR202",
      "2025-07-08 15:30",
      "Pending"
    );

    System.out.println("Initial delivery details:");
    System.out.println(delivery);

    delivery.setStatus("In Transit");
    delivery.setEta("2025-07-08 18:00"); // route was delayed

    System.out.println("\nAfter updates:");
    System.out.println("ETA: " + delivery.getEta());
    System.out.println("Status: " + delivery.getStatus());
    System.out.println("Updated delivery info:");
    System.out.println(delivery);
  }
}