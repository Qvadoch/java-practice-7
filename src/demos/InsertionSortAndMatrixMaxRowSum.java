package demos;

import matrix.MatrixAnalyzer;
import matrix.MatrixIO;
import sorting.InsertionSort;
import utils.ArrayUtils;
import utils.MenuUtils;

import java.util.Random;
import java.util.Scanner;

public class InsertionSortAndMatrixMaxRowSum {
    public static void run(Scanner scanner, Random random) {
        maxRowSum(scanner, random);
        sortArray(scanner);
    }

    private static void sortArray(Scanner scanner) {
        int arrayLength = ArrayUtils.getArrayLengthFromUser(scanner);

        Integer[] array = ArrayUtils.createAndFillArray(scanner, arrayLength);

        System.out.print("Массив до сортировки: ");
        ArrayUtils.printArray(array);

        InsertionSort.insertionSort(array);

        System.out.print("Массив после сортировки: ");
        ArrayUtils.printArray(array);

        MenuUtils.showMenu(scanner, array);
    }

    private static void maxRowSum(Scanner scanner, Random random) {
        System.out.print("Введите кол-во строк матрицы: ");
        int rows = scanner.nextInt();

        System.out.print("Введите кол-во столбцов матрицы: ");
        int cols = scanner.nextInt();

        if (rows <= 1 || cols <= 1) {
            System.out.println("Количество строк или столбцов матрицы должно быть больше единицы");
            return;
        }

        int[][] matrix = new int[rows][cols];

        MatrixIO.randomFillMatrix(random, matrix, rows, cols);

        MatrixIO.printMatrix(matrix);

        int[] maxRowInfo = MatrixAnalyzer.findRowWithMaxSum(matrix);
        System.out.println("Строка с максимальной суммой: " + (maxRowInfo[0] + 1));
        System.out.println("Сумма этой строки: " + maxRowInfo[1]);
    }
}
