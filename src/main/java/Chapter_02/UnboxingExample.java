package Chapter_02;

public class UnboxingExample {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        UnboxingExample example = new UnboxingExample();
        Integer a = 5;
        Integer b = 15;
        int result = example.add(a, b);
        System.out.println(result);
    }
}
