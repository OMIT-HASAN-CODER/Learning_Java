package Chapter_02;

import java.util.Scanner;

public class LengthConversationCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a length in inch: ");
        double inch = input.nextDouble();

        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");
    }
}
