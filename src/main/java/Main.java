package src.main.java;

public class Main {

    public static void swapColumns(int[][] matrix, int col1, int col2) {
        if (matrix == null || matrix.length == 0 || col1 < 0 || col2 < 0 || col1 >= matrix[0].length || col2 >= matrix[0].length) {
            throw new IllegalArgumentException("matrix is empty");
        }

        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][col1];
            matrix[i][col1] = matrix[i][col2];
            matrix[i][col2] = temp;
        }
    }
}