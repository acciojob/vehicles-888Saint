package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);

        // Test the functionality of F1 car
        mercedes.move(40, 0);  // Move the car initially
        mercedes.accelerate(20);  // Accelerate the car
        mercedes.accelerate(-60);  // Decelerate the car
    }
}
