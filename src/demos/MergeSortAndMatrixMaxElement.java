package demos;

import matrix.MatrixAnalyzer;
import matrix.MatrixIO;
import sorting.MergeSort;
import utils.ArrayUtils;
import utils.MenuUtils;

import java.util.Random;
import java.util.Scanner;

public class MergeSortAndMatrixMaxElement {
    public static void run(Scanner scanner, Random random) {
        searchMaxElementMatrix(scanner, random);
        sortArray(scanner);
    }

    public static void sortArray(Scanner scanner) {
        int arrayLength = ArrayUtils.getArrayLengthFromUser(scanner);

        Integer[] array = ArrayUtils.createAndFillArray(scanner, arrayLength);

        System.out.print("Массив до сортировки: ");
        ArrayUtils.printArray(array);

        array = MergeSort.mergeSort(array);

        System.out.print("Массив после сортировки: ");
        ArrayUtils.printArray(array);

        MenuUtils.showMenu(scanner, array);
    }

    private static void searchMaxElementMatrix(Scanner scanner, Random random) {

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

        System.out.println("Вид матрицы");
        MatrixIO.printMatrix(matrix);

        String string = MatrixAnalyzer.findAndDescribeMaxElement(matrix, rows, cols);
        System.out.println(string);
    }
}
