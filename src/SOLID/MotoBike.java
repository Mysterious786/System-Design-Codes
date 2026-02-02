package SOLID;

public class MotoBike extends EngineVehicle{
    private boolean isEngine = false;
    private int wheels;

    public MotoBike(int wheels) {
        super(wheels);
    }

    @Override
    public int noOfWheels()
    {
        return wheels;
    }
    @Override
    public void turnOnEngine(boolean isEngine)
    {
        this.isEngine = isEngine;
    }
    @Override
    public void turnOffEngine(boolean isEngine)
    {
        this.isEngine = isEngine;
    }


}
