package com.driver;

public class F1 extends Car {

    // Constructor
    public F1(String name, boolean isManual) {
        // Arbitrary values for wheels, doors, gears, and seats
        super(name, 4, 2, 6, isManual, "Race Car", 2);
    }

    // Accelerate method to change speed and gear based on the rate
    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;  // Calculate the new speed based on rate
        
        if (newSpeed <= 0) {
            stop();
            changeGear(1);  // Set gear to 1 if the car stops
        } else if (newSpeed <= 50) {
            changeGear(1);
        } else if (newSpeed <= 100) {
            changeGear(2);
        } else if (newSpeed <= 150) {
            changeGear(3);
        } else if (newSpeed <= 200) {
            changeGear(4);
        } else if (newSpeed <= 250) {
            changeGear(5);
        } else {
            changeGear(6);  // Gear 6 for speed more than 250
        }

        if (newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
