package Chapter_02;

import java.util.Scanner;

public class NumberSystemConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        String binary = Integer.toBinaryString(number);
        String hex = Integer.toHexString(number);
        String octal = Integer.toOctalString(number);

        System.out.println("Binary: " + binary);
        System.out.println("Hex: " + hex);
        System.out.println("Octal: " + octal);
    }
}
