package Chapter_04;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrixOne = new int[3][3];
        int[][] matrixTwo = new int[3][3];

        System.out.println("Enter matrix 1: ");
        for (int row = 0; row < matrixOne.length; row++) {
            for (int column = 0; column < matrixOne[row].length; column++) {
                System.out.printf("[%d][%d]: ", row, column);
                matrixOne[row][column] = input.nextInt();
            }
        }
        System.out.println();

        System.out.println("Enter matrix 2: ");
        for (int row = 0; row < matrixTwo.length; row++) {
            for (int column = 0; column < matrixTwo[row].length; column++) {
                System.out.printf("[%d][%d]: ", row, column);
                matrixTwo[row][column] = input.nextInt();
            }
        }

        int[][] sum = new int[3][3];
        for (int row = 0; row < sum.length; row++) {
            for (int column = 0; column < sum[row].length; column++) {
                sum[row][column] = matrixOne[row][column] + matrixTwo[row][column];
            }
        }

        int[][] subtraction = new int[3][3];
        for (int row = 0; row < subtraction.length; row++) {
            for (int column = 0; column < subtraction[row].length; column++) {
                subtraction[row][column] = matrixOne[row][column] - matrixTwo[row][column];
            }
        }

        int[][] product = new int[3][3];
        for (int row = 0; row < product.length; row++) {
            for (int column = 0; column < product[row].length; column++) {
                product[row][column] = matrixOne[row][column] * matrixTwo[row][column];
            }
        }
        System.out.println();

        System.out.println("Sum: ");
        for (int[] row : sum) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();

        System.out.println("Subtraction: ");
        for (int[] row : subtraction) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();

        System.out.println("Product: ");
        for (int[] row : product) {
            System.out.println(Arrays.toString(row));
        }
    }
}
