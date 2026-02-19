package Chapter_05;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

class CharStack {
    private char[] elements;
    private int count;

    public CharStack() {
        elements = new char[10];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void push(char c) {
        if (isFull()) {
            grow();
        }
        elements[count] = c;
        count++;
    }

    private boolean isFull() {
        return elements.length == count;
    }

    private void grow() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    public char pop() {
        --count;
        return  elements[count];
    }

    public int size() {
        return count;
    }

    public void printElements() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < count; i++) {
            joiner.add(String.valueOf(elements[i]));
        }
        System.out.println(joiner);
    }
}

public class CharStackDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CharStack stack = new CharStack();

        System.out.println("How many character do you want to push?: ");
        int numberOfCharacter = input.nextInt();

        System.out.println("Enter character one by one: ");
        char ch;
        for (int i = 0; i < numberOfCharacter; i++) {
            ch = input.next().charAt(0);
            stack.push(ch);
        }
        stack.printElements();

        System.out.println("How many character do you want to pop?: ");
        int pop = input.nextInt();
        for (int i = 0; i < pop; i++) {
            stack.pop();
        }
        stack.printElements();
    }
}
