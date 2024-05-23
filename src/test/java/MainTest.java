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
        Main.swapColumns(matrix1, 0, 2);
        assert matrix1[0][0] == 3 && matrix1[0][2] == 1 : "Тест 1 не пройдено";
        assert matrix1[1][0] == 6 && matrix1[1][2] == 4 : "Тест 1 не пройдено";
        assert matrix1[2][0] == 9 && matrix1[2][2] == 7 : "Тест 1 не пройдено";


        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        Main.swapColumns(matrix2, 1, 1);
        assert matrix2[0][1] == 2 : "Тест 2 не пройдено";
        assert matrix2[1][1] == 5 : "Тест 2 не пройдено";
        assert matrix2[2][1] == 8 : "Тест 2 не пройдено";


        try {
            int[][] matrix3 = {
                {1, 2},
                {3, 4}
            };
            Main.swapColumns(matrix3, 0, 2);
            assert false : "Тест 3 не пройдено - очікувалось виключення";
        } catch (IllegalArgumentException e) {
            assert true : "Тест 3 пройдено";
        }

        System.out.println("Всі тести пройдено!");
    }
}