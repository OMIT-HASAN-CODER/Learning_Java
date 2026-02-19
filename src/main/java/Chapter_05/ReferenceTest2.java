package Chapter_05;

import java.awt.Point;

public class ReferenceTest2 {
    public static void main(String[] args) {
        Point a = new Point(100, 100);
        Point b = new Point(10, 10);

        b.x = 200;
        b.y = 200;

        System.out.println("a: " + a.x + ", " + a.y);
        System.out.println("b: " + b.x + ", " + b.y);
    }
}
