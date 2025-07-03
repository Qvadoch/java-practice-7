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
        System.out.print("Введите длину массива: ");
        int arrayLength = scanner.nextInt();
        if (arrayLength <= 0) {
            System.out.println("Длина массива должна быть положительным числом");
            return;
        }

        Integer[] array = new Integer[arrayLength];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Массив до сортировки: ");
        ArrayUtils.printArray(array);

        QuickSort.sort(array, 0, arrayLength - 1);

        System.out.print("Массив после сортировки: ");
        ArrayUtils.printArray(array);

        MenuUtils.showMenu(scanner, array);
    }
}