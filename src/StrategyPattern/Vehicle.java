package StrategyPattern;

public class Vehicle {
     DriveStrategy driveStrategy;
    public Vehicle(DriveStrategy driveStrategy) // constructor Injection
    {
        this.driveStrategy = driveStrategy;
    }

    public Vehicle() {
    }

    public void drive()
    {
        driveStrategy.drive();
    }
}
