package Chapter_03;

import java.util.Scanner;

public class HarmonicSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        double sum = 0.0;

        for (int i = 1; i <= number; i++) {
            sum += 1.0 / i;
        }

        System.out.println("Sum = " + sum);
    }
}
