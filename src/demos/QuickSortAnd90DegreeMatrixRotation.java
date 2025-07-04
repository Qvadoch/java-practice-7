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

        if (rows != cols) {
            System.out.println("Матрица должна быть квадратной для поворота на 90 градусов");
            return;
        }

        int[][] matrix = new int[rows][cols];
        MatrixOperations.fillMatrix(scanner, matrix, rows, cols);

        System.out.println("Исходная матрица:");
        MatrixOperations.printMatrix(matrix);

        int[][] rotatedMatrix = MatrixRotation.rotate90Degrees(matrix, rows, cols);

        System.out.println("Матрица после поворота на 90 градусов:");
        MatrixOperations.printMatrix(rotatedMatrix);
    }

    private static void sortArray(Scanner scanner) {
        int arrayLength = ArrayUtils.getArrayLengthFromUser(scanner);

        Integer[] array = ArrayUtils.createAndFillArray(scanner);

        System.out.print("Массив до сортировки: ");
        ArrayUtils.printArray(array);

        QuickSort.sort(array, 0, arrayLength - 1);

        System.out.print("Массив после сортировки: ");
        ArrayUtils.printArray(array);

        MenuUtils.showMenu(scanner, array);
    }
}