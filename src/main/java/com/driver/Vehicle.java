package com.driver;

public class Vehicle {
    private String name;
    private int currentSpeed;
    private int currentDirection;

    // Constructor
    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;  // initial speed is 0
        this.currentDirection = 0;  // initial direction is 0 (forward)
    }

    // Method to steer the vehicle
    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("steer method called - The direction is changed to: " + this.currentDirection + " degrees");
    }

    // Method to move the vehicle
    public void move(int speed, int direction) {
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println("move method called - The speed is changed to: " + this.currentSpeed + ", and the direction is changed to: " + this.currentDirection + " degrees");
    }

    // Method to stop the vehicle
    public void stop() {
        this.currentSpeed = 0;
        System.out.println("stop method called - The vehicle is stopped");
    }

    // Getters
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
