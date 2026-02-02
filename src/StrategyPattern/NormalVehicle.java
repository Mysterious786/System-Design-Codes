package StrategyPattern;

public class NormalVehicle extends Vehicle{
    public NormalVehicle()
    {
        super(new NormalDriveStrategy());
    }
}
