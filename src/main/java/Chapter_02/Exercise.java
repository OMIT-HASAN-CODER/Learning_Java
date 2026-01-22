package Chapter_02;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        boolean isDivisibleBy2 = number % 2 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;

        boolean isDivisibleByBoth2And5 = isDivisibleBy2 && isDivisibleBy5;

        if (isDivisibleByBoth2And5) {
            System.out.println(number + " is divisible by both 2 and 5");
        } else {
            System.out.println(number + " is not divisible by 2 and 5");
        }
    }
}
