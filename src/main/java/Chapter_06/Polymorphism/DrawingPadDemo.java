package Chapter_06.Polymorphism;

public class DrawingPadDemo {
    public static void main(String[] args) {
        DrawingPad pad = new DrawingPad();
        Circle circle = new Circle();
        Square square = new Square();

        pad.draw(circle);
        pad.draw(square);
    }
}
