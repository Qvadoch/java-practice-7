package demos;

import matrix.MatrixOperations;
import sorting.MergeSort;
import utils.ArrayUtils;
import utils.MenuUtils;

import java.util.Random;
import java.util.Scanner;

public class MergeSortAndMatrixMaxElement {
    public static void run(Scanner scanner) {
        searchMaxElementMatrix(scanner);
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

    private static void searchMaxElementMatrix(Scanner scanner) {
        Random random = new Random();

        System.out.print("Введите кол-во строк матрицы: ");
        int row = scanner.nextInt();

        System.out.print("Введите кол-во столбцов матрицы: ");
        int column = scanner.nextInt();

        int[][] matrix = new int[row][column];

        MatrixOperations.randomFillMatrix(random, matrix, row, column);

        System.out.println("Вид матрицы");
        MatrixOperations.printMatrix(matrix);

        String string = MatrixOperations.findAndDescribeMaxElement(matrix, row, column);
        System.out.println(string);
    }
}
