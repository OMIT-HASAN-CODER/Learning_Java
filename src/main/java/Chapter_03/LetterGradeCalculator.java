package Chapter_03;

import java.util.Scanner;

public class LetterGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score: ");
        int score = input.nextInt();

        if (score >= 80) {
            System.out.println("You got A+");
        } else {
            if (score >= 70) {
                System.out.println("You got A");
            } else {
                if (score >= 60) {
                    System.out.println("You got A-");
                } else {
                    if (score >= 50) {
                        System.out.println("You got B");
                    } else {
                        if (score >= 40) {
                            System.out.println("You got c");
                        } else {
                            if (score >= 33) {
                                System.out.println("You got D");
                            } else {
                                System.out.println("You got F");
                            }
                        }
                    }
                }
            }
        }
    }
}
