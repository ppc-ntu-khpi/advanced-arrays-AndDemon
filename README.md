# Практична робота "Поглиблене використання масивів"
Грисенка Андрія 35 - група

Я обрав завдання №15: У матриці розміром N x M поміняти місцями два вказвні стовпці.
main.java:
```java
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
```
MainTest.java:
```java
package src.test.java;

import src.main.java.Main;

public class MainTest {

    public static void main(String[] args) {
        testSwapColumns();
    }

    private static void testSwapColumns() {

        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Original matrix1:");
        printMatrix(matrix1);
        Main.swapColumns(matrix1, 0, 2);
        System.out.println("Matrix1 after swapping columns 0 and 2:");
        printMatrix(matrix1);
        assert matrix1[0][0] == 3 && matrix1[0][2] == 1 : "Test 1 failed";
        assert matrix1[1][0] == 6 && matrix1[1][2] == 4 : "Test 1 failed";
        assert matrix1[2][0] == 9 && matrix1[2][2] == 7 : "Test 1 failed";


        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Original matrix2:");
        printMatrix(matrix2);
        Main.swapColumns(matrix2, 1, 1);
        System.out.println("Matrix2 after swapping columns 1 and 1 (should be unchanged):");
        printMatrix(matrix2);
        assert matrix2[0][1] == 2 : "Test 2 failed";
        assert matrix2[1][1] == 5 : "Test 2 failed";
        assert matrix2[2][1] == 8 : "Test 2 failed";


        try {
            int[][] matrix3 = {
                {1, 2},
                {3, 4}
            };
            System.out.println("Original matrix3:");
            printMatrix(matrix3);
            Main.swapColumns(matrix3, 0, 2);
            assert false : "Test 3 failed - expected exception";
        } catch (IllegalArgumentException e) {
            System.out.println("Test 3 passed - exception caught as expected");
        }

        System.out.println("All tests passed!");
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

```
