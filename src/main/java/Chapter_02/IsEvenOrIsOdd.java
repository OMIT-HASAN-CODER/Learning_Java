package Chapter_02;

import java.util.Scanner;

public class IsEvenOrIsOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        boolean isEven = number % 2 == 0;
        System.out.println("Is Even = " + isEven);

        boolean isOdd = number % 2 != 0;
        System.out.println("Is Odd: " + isOdd);
    }
}
