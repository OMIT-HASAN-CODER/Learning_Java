package Chapter_01;

import java.util.Scanner;

public class EquationSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of x: ");
        double x = input.nextDouble();
        System.out.println("Enter the value of a: ");
        int a = input.nextInt();
        System.out.println("Enter the value of b: ");
        int b = input.nextInt();
        System.out.println("Enter the value of c: ");
        int c = input.nextInt();

        double y = a * x * x + b * x + c;

        System.out.println("Result is: " + y);
    }
}
