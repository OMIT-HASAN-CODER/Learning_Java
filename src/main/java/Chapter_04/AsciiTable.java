package Chapter_04;

import java.util.Scanner;

public class AsciiTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char character = input.next().charAt(0);
        int asciiValue = (int) character;
        System.out.println("ASCII value of " + "'" + character + "'" + " is: " + asciiValue);
    }
}
