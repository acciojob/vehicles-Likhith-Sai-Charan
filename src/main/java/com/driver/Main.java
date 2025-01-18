package com.driver;

public class Main {
    public static void main(String[] args) {
        // F1 Car Instance
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60); // Now correctly reduces speed instead of setting it to -60

        // Boat Instance
        Boat myBoat = new Boat("Sea Explorer", 10);
        System.out.println("Boat Name: " + myBoat.getVehicleName());
        System.out.println("Boat Capacity: " + myBoat.getVehicleCapacity());
    }
}
