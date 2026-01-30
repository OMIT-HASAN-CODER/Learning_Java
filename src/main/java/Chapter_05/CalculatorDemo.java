package Chapter_05;

class Calculator {
    public int performAddition(int a, int b) {
        int result = a + b;

        return result;
    }

    public int performSubtraction(int a, int b) {
        int result = a - b;

        return result;
    }

    public int performMultiplication(int a, int b) {
        int result = a * b;

        return result;
    }

    public int performDivision(int a, int b) {
        int result = a / b;

        return result;
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int addition = calculator.performAddition(4, 5);
        int subtraction = calculator.performSubtraction(5, 1);
        int multiplication = calculator.performMultiplication(3, 5);
        int division = calculator.performDivision(9, 3);
        System.out.println("Addition is: " + addition);
        System.out.println("Subtraction is: " + subtraction);
        System.out.println("Multiplication is: " + multiplication);
        System.out.println("Division is: " + division);
    }
}
