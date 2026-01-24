package Chapter_03;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your yearly income :");
        double income = input.nextDouble();

        double taxableIncome = income - 300_000;

        double tax;
        if (taxableIncome <= 100_000) {
            tax = taxableIncome * 0.05;
        } else if (taxableIncome <= (100_000 + 300_000)) {
            tax = (100_000 * 0.05) + ((taxableIncome - 100_000) * 0.10);
        } else if (taxableIncome <= (100_000 + 300_000 + 400_000)) {
            tax = (100_000 * 0.05) + (300_000 * 0.10) + ((taxableIncome - (100_000 + 300_000)) * 0.15);
        } else if (taxableIncome <= (100_000 + 300_000 + 400_000 + 500_000)) {
            tax = (100_000 * 0.05) + (300_000 * 0.10) + (400_000 * 0.15) + ((taxableIncome - (100_000 + 300_000 + 400_000)) * 0.20);
        } else {
            tax = (100_000 * 0.05) + (300_000 * 0.10) + (400_000 * 0.15) + (500_000 * 0.20) + ((taxableIncome - (100_000 + 300_000 + 400_000 + 500_000)) * 0.25);
        }

        System.out.println("Your tax is: " + tax);
    }
}
