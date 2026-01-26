package Chapter_03;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        long number = input.nextLong();

        System.out.println("Prime factors of " + number + " are: ");

        for (long i = 2; i < number / i; i++) {
            while (number % i ==0) {
                System.out.print(i + " ");
                number = number / i;
            }
        }

        if (number > 1) {
            System.out.println(number);
        }
    }
}
