class Vehicle
{
    public virtual void FuelType()
    {
        Console.WriteLine("Uses generic fuel");
    }
}

class ElectricCar : Vehicle
{
    public override void FuelType()
    {
        Console.WriteLine("Uses electricity");
    }
}

