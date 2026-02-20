package Chapter_05;

class Circle {
    private static final double PI = 3.1416;
    private static int numberOfObjectCreated = 0;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
        numberOfObjectCreated++;
    }

    public int getNumberOfObjectCreated() {
        return numberOfObjectCreated;
    }

    public double getArea() {
        return radius * radius *PI;
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(15);
        Circle circle3 = new Circle(20);

        System.out.println("Area of circle1 is: " + circle1.getArea());
        System.out.println("Area of circle2 is: " + circle2.getArea());
        System.out.println("Area of circle3 is: " + circle3.getArea());

        System.out.println();
        System.out.println("Total object created-");
        System.out.println("circle1: " + circle1.getNumberOfObjectCreated());
        System.out.println("circle2: " + circle2.getNumberOfObjectCreated());
        System.out.println("circle3: " + circle3.getNumberOfObjectCreated());
    }
}
