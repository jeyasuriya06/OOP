class Vehicle {
    fuelType(): void {
        console.log("Uses generic fuel");
    }
}

class ElectricCar extends Vehicle {
    override fuelType(): void {
        console.log("Uses electricity");
    }
}
