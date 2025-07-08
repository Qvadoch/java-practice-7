package demos;

import matrix.MatrixOperations;
import sorting.SelectionSort;
import utils.ArrayUtils;
import utils.MenuUtils;

import java.util.Scanner;

public class SelectionSortAndMatrixTransposition {
    public static void run(Scanner scanner) {
        transporitoinMatrix(scanner);
        sortArray(scanner);
    }

    private static void transporitoinMatrix(Scanner scanner) {
        System.out.print("Введите количество строк матрицы: ");
        int rows = scanner.nextInt();

        System.out.print("Введите количество столбцов матрицы: ");
        int cols = scanner.nextInt();

        if (rows <= 1 || cols <= 1) {
            System.out.println("Количество строк или столбцов матрицы должно быть больше единицы");
            return;
        }

        int[][] matrix = new int[rows][cols];
        MatrixOperations.fillMatrixByUser(scanner, matrix, rows, cols);

        System.out.println("Исходная матрица:");
        MatrixOperations.printMatrix(matrix);

        int[][] newMatrix = MatrixOperations.matrixTransposition(matrix, rows, cols);

        System.out.println("Матрица после поворота на 90 градусов:");
        MatrixOperations.printMatrix(newMatrix);
    }

    private static void sortArray(Scanner scanner) {
        int arrayLength = ArrayUtils.getArrayLengthFromUser(scanner);

        Integer[] array = ArrayUtils.createAndFillArray(scanner, arrayLength);

        System.out.print("Массив до сортировки: ");
        ArrayUtils.printArray(array);

        SelectionSort.selectionSort(array);

        System.out.print("Массив после сортировки: ");
        ArrayUtils.printArray(array);

        MenuUtils.showMenu(scanner, array);
    }
}
