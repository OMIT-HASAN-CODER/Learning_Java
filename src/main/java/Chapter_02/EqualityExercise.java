package Chapter_02;

import java.util.Scanner;

public class EqualityExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = input.nextInt();
        System.out.println("Enter another number: ");
        int b = input.nextInt();

        boolean isAGreaterThanB = a > b;
        if (isAGreaterThanB) {
            System.out.println(a + " is greater than " + b);
        }

        boolean isALessThanB = a < b;
        if (isALessThanB) {
            System.out.println(a + " is less than " + b);
        }

        boolean isAEqualToB = a == b;
        if (isAEqualToB) {
            System.out.println(a + " is equal to " + b);
        }

        boolean isANotEqualToB = a != b;
        if (isANotEqualToB) {
            System.out.println(a + " is not equal to " + b);
        }

        boolean isAGreaterThanOrEqualToB = a >= b;
        if (isAGreaterThanOrEqualToB) {
            System.out.println(a + " is greater than or equal to " + b);
        }

        boolean isALessThanOrEqualToB = a <= b;
        if (isALessThanOrEqualToB) {
            System.out.println(a + " is less than or equal to " + b);
        }
    }
}
