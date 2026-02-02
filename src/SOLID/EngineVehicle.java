package SOLID;

public class EngineVehicle extends Vehicle{
    private boolean isEngine = false;
    private int wheels;
    public EngineVehicle(int wheels){
        this.wheels = wheels;
    }
    @Override
    public int noOfWheels()
    {
        return wheels;
    }
    public void turnOnEngine(boolean isEngine)
    {
        this.isEngine = isEngine;
    }
    public void turnOffEngine(boolean isEngine)
    {
        this.isEngine = isEngine;
    }


}
