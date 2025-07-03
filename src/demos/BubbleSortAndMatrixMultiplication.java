package demos;

import java.util.Scanner;
import matrix.*;
import sorting.*;
import utils.*;

public class BubbleSortAndMatrixMultiplication {
    public static void run(Scanner scanner) {
        multiplyMatrices(scanner);
        sortArray(scanner);
    }

    private static void multiplyMatrices(Scanner scanner) {
        int[][] productMatrix = new int[0][0];
        while (true) {
            int matrixCounter = 1;
            System.out.print("Введите количество строк " + matrixCounter + " матрицы: ");
            int rows = scanner.nextInt();
            System.out.print("Введите количество столбцов " + matrixCounter + " матрицы: ");
            int cols = scanner.nextInt();

            if (rows <= 1 || cols <= 1) {
                System.out.println("Количество строк или столбцов матрицы должно быть больше единицы");
                continue;
            }

            int[][] firstMatrix = new int[rows][cols];
            MatrixOperations.fillMatrix(scanner, firstMatrix, rows, cols);
            System.out.println("Вид 1 матрицы");
            MatrixOperations.printMatrix(firstMatrix);

            matrixCounter++;

            System.out.print("Введите количество строк " + matrixCounter + " матрицы: ");
            int rows2 = scanner.nextInt();
            System.out.print("Введите количество столбцов " + matrixCounter + " матрицы: ");
            int cols2 = scanner.nextInt();

            int[][] secondMatrix = new int[rows2][cols2];
            MatrixOperations.fillMatrix(scanner, secondMatrix, rows2, cols2);
            System.out.println("Вид 2 матрицы");
            MatrixOperations.printMatrix(secondMatrix);

            if (cols == rows2) {
                productMatrix = MatrixMultiplication.multiply(firstMatrix, secondMatrix, rows, cols, cols2);
                System.out.println("Результат умножения:");
                MatrixOperations.printMatrix(productMatrix);
            } else {
                System.out.println("Ошибка: количество столбцов первой матрицы должно быть равно количеству строк второй матрицы");
            }
            break;
        }
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
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        BubbleSort.sort(array);

        System.out.print("Массив после сортировки: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        MenuUtils.showMenu(scanner, array);
    }
}