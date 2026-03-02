package Chapter_06.Polymorphism;

public class Coffee extends Liquid {
    @Override
    public void swirl(boolean clockwise) {
        System.out.println("Swirling coffee");
    }
}
