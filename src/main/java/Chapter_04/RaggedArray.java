package Chapter_04;

public class RaggedArray {
    public static void main(String[] args) {
        int[][] array = {
                {5, 2, 3, 4, 5},
                {3, 3, 4, 5},
                {1, 3, 5},
                {4, 5},
                {5}
        };

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }
}
