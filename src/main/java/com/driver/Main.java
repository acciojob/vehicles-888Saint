package com.driver;

public class Main {
    public static void main(String[] args) {
        // Create an F1 car object
        F1 mercedes = new F1("mercedes", false);
        
        // Test the functionality of F1 car
        mercedes.move(40, 0);  // Move the car initially
        mercedes.accelerate(20);  // Accelerate the car
        mercedes.accelerate(-60);  // Decelerate the car

        // Test the Boat class
        Boat yacht = new Boat("Yacht", 20);
        System.out.println("Boat name: " + yacht.getVehicleName());
        System.out.println("Boat capacity: " + yacht.getVehicleCapacity());
    }
}
