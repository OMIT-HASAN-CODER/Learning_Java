package Chapter_04;

import java.util.Scanner;

public class SumAverageMinAndMaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Length of array: ");
        int sizeofArray = input.nextInt();

        int[] numbers = new int[sizeofArray];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i + ": ");
            numbers[i] = input.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
