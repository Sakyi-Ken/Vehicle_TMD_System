package test;

import models.Driver;

public class TestDriver {
  public static void main(String[] args) {
    Driver driver = new Driver("DR101", "Kwame Boateng", 5, true, "03039445", "AGEeE223333", 1);

    System.out.println("Initial driver details:");
    System.out.println(driver);

    driver.setAvailable(false);
    driver.setInfractionCount(driver.getInfractionCount() + 1);

    System.out.println("\nAfter update:");
    System.out.println("Is available? " + driver.isAvailable());
    System.out.println("Infractions: " + driver.getInfractionCount());
    System.out.println("Updated driver info:");
    System.out.println(driver);
  }
}