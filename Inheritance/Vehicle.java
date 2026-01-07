package Inheritance;

public class Vehicle {
    void fuelType() {
        System.out.println("Fuel");
    }
}

class ElectricCar extends Vehicle {
    @Override
    void fuelType() {
        System.out.println("Fuel: Electricity");
    }
}
