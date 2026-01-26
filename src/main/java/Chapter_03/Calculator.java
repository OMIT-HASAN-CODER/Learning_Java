package Chapter_03;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose an operator: +, -, *, or /: ");
        char operator = input.next().charAt(0);
        System.out.println("Enter first number: ");
        int number1 = input.nextInt();
        System.out.println("Enter second number: ");
        int number2 = input.nextInt();

        int result = switch (operator) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            case '/' -> number1 / number2;
            default -> {
                System.out.println("Invalid operator!");
                yield 0;
            }
        };

        System.out.println("Result: " + result);
    }
}
