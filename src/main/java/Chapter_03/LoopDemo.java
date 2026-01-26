package Chapter_03;

public class LoopDemo {
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 100) {
            System.out.println("I love Java Programming.");
            counter ++;
        }
        System.out.println();

        for (int i = 0; i < 100; i++) {
            System.out.println("I love Java Programming.");
        }
    }
}
