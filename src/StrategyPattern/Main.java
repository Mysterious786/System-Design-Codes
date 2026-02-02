package StrategyPattern;

public class Main {
    public static void main(String[] args) {
    Vehicle vehicle = new OffRoadVehicle();
    Vehicle vehicle1 = new NormalVehicle();
    vehicle1.drive();
    vehicle.drive();
    }
}
