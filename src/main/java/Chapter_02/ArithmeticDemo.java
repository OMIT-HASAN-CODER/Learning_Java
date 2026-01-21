package Chapter_02;

public class ArithmeticDemo {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int result2 = result;

        result = result - 1;
        System.out.println(result2 + " - 1 = " + result);
        result2 = result;

        result = result * 2;
        System.out.println(result2 + " * 2 = " + result);
        result2 = result;

        result = result / 2;
        System.out.println(result2 + " / 2 = " + result);
        result2 = result;

        result = result +8;
        System.out.println(result2 + " + 8 = " + result);
        result2 = result;

        result = result % 7;
        System.out.println(result2 + " % 7 = " + result);
    }
}
