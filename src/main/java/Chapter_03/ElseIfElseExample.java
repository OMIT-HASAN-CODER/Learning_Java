package Chapter_03;

import java.util.Scanner;

public class ElseIfElseExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 15;

        System.out.println("Guess a number: ");
        int guess = input.nextInt();

        if (guess == number) {
            System.out.println("Congratulations! " + "You guessed the number correctly.");
        } else if (number > guess) {
            System.out.println("The number is greater than " + guess);
        } else {
            System.out.println("The number is less than " + guess);
        }
    }
}
