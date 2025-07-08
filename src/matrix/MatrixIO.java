package matrix;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatrixIO {
    public static void fillMatrixByUser(Scanner scanner, int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Введите элемент [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static void randomFillMatrix(Random random, int[][] matrix, int rows, int cols) {
        System.out.println("Заполнение матрицы числами от 1 до 100");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(100) + 1;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}