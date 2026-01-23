package Chapter_02;

import java.util.Scanner;

public class ExpressionSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value of a: ");
        int a = input.nextInt();
        System.out.println("Enter a value of b: ");
        int b = input.nextInt();
        System.out.println("Enter a value of x: ");
        int x = input.nextInt();
        System.out.println("Enter a value of y: ");
        int y = input.nextInt();

        double result = (x - 5) / 2.0 + 2 * ((55 - y) / (double) a - (b + 9) / (double) y) / 2.5 + 42;

        System.out.println("result = " + result);
    }
}
