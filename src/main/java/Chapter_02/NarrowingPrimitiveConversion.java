package Chapter_02;

public class NarrowingPrimitiveConversion {
    public static void main(String[] args) {
        double aDouble = 97.04;
        long aLong = (long) aDouble;
        int aInt = (int) aLong;

        System.out.println("Double value " + aDouble);
        System.out.println("Long value " + aLong);
        System.out.println("Int value " + aInt);
    }
}
