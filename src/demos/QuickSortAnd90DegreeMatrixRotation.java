package demos;

import java.util.Scanner;
import matrix.*;
import sorting.*;
import utils.*;

public class QuickSortAnd90DegreeMatrixRotation {
    public static void run(Scanner scanner) {
        rotateMatrix(scanner);
        sortArray(scanner);
    }

    private static void rotateMatrix(Scanner scanner) {
        System.out.print("Введите количество строк матрицы: ");
        int rows = scanner.nextInt();

        System.out.print("Введите количество столбцов матрицы: ");
        int cols = scanner.nextInt();

        if (rows <= 1 || cols <= 1) {
            System.out.println("Количество строк или столбцов матрицы должно быть больше единицы");
            return;
        }

        int[][] matrix = new int[rows][cols];
        MatrixIO.fillMatrixByUser(scanner, matrix, rows, cols);

        System.out.println("Исходная матрица:");
        MatrixIO.printMatrix(matrix);

        int[][] rotatedMatrix = MatrixTransformation.rotate90Degrees(matrix, rows, cols);

        System.out.println("Матрица после поворота на 90 градусов:");
        MatrixIO.printMatrix(rotatedMatrix);
    }

    private static void sortArray(Scanner scanner) {
        int arrayLength = ArrayUtils.getArrayLengthFromUser(scanner);

        Integer[] array = ArrayUtils.createAndFillArray(scanner, arrayLength);

        System.out.print("Массив до сортировки: ");
        ArrayUtils.printArray(array);

        QuickSort.quickSort(array, 0, arrayLength - 1);

        System.out.print("Массив после сортировки: ");
        ArrayUtils.printArray(array);

        MenuUtils.showMenu(scanner, array);
    }
}