package matrix;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {
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

    public static String findAndDescribeMaxElement(int[][] matrix, int rows, int cols) {
        int maxElement = matrix[0][0];
        int indexRow = 0;
        int indexColumn = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (maxElement < matrix[i][j]){
                    maxElement = matrix[i][j];
                    indexRow = i;
                    indexColumn = j;
                }
            }
        }
        return  "Максимальное число массива: " + maxElement + "\nИндекс строки: " + indexRow + "\nИндекс столбца: " + indexColumn;
    }

    public static int[] findRowWithMaxSum(int[][] matrix) {

        int maxSum = 0;
        int maxRowIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            int currentRowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                currentRowSum += matrix[i][j];
            }

            if (currentRowSum > maxSum) {
                maxSum = currentRowSum;
                maxRowIndex = i;
            }
        }

        return new int[]{maxRowIndex, maxSum};
    }

    public static int[][] matrixTransposition(int[][] matrix, int rows, int cols) {
        int[][] newMatrix = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                newMatrix[i][j] = matrix[j][i];
            }
        }
        return newMatrix;
    }
}