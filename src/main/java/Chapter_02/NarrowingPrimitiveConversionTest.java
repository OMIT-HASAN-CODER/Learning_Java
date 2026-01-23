package Chapter_02;

public class NarrowingPrimitiveConversionTest {
    public static void main(String[] args) {
        long y = 1_233_720_377_5807L;
        System.out.println("Long Value: " + y);
        int x = (int) y;
        System.out.println("After Narrowing Primitive Conversion : " + x);
    }
}
