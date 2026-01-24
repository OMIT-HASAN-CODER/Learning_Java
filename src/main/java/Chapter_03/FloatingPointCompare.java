package Chapter_03;

public class FloatingPointCompare {
    public static void main(String[] args) {
        double a = 0.3;
        double b = 0.1 + 0.1 + 0.1;

        double epsilon = 0.0000000000001;
        if (Math.abs(a - b) < epsilon) {
            System.out.println("both of them are equal.");
        } else {
            System.out.println("they are not equal.");
        }
    }
}
