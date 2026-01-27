package Chapter_04;

public class EnhancedForLoopExample {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 4, 6, -5, 0, 15};
        int sum = 0;

        for (int number : numbers) {
            System.out.print(number + " ");
            sum += number;
        }
        System.out.println();
        System.out.println("Sum = " + sum);
    }
}
