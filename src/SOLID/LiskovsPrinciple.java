package SOLID;

public class LiskovsPrinciple {
    public  static void main(String[] args)
    {
    EngineVehicle eng = new MotoBike(4);
    System.out.println(eng.noOfWheels());

    }
}
