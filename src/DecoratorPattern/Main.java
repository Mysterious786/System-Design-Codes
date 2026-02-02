package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new Mushroom(new ExtraChesse(new Farmhouse()));
        System.out.println(basePizza.cost());
    }
}
