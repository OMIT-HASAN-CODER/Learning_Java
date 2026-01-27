package Chapter_04;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write here: ");
        String value = input.nextLine();
        System.out.println("You wrote: " + value);
    }
}
