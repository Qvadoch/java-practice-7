import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayAndMatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] productMatrix = new int[0][0];
        System.out.println("Сначала вычисляем произведение двух матриц, а потом сортируем массив.\n");
        multiplyMatrices(scanner, productMatrix);

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
        printArray(array);

        bubbleSort(array);

        System.out.print("Массив после сортировки: ");
        printArray(array);

        showMenu(scanner, array);
        scanner.close();
    }

    private static void bubbleSort(Integer[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void printArray(Integer[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void showMenu(Scanner scanner, Integer[] array) {
        while (true) {
            System.out.print("\n---Меню---\n" +
                    "1 - Поиск числа по индексу\n" +
                    "2 - Сортировка по возрастанию\n" +
                    "3 - Сортировка по убыванию\n" +
                    "4 - Выход\n" +
                    "Выберите действие: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите индекс: ");
                    int index = scanner.nextInt();
                    if (index < 0 || index >= array.length) {
                        System.out.println("Индекс выходит за границы массива");
                    } else {
                        System.out.println("Найденное число: " + array[index]);
                    }
                    break;
                case 2:
                    Arrays.sort(array);
                    System.out.println("По возрастанию: " + Arrays.toString(array));
                    break;
                case 3:
                    Arrays.sort(array, Collections.reverseOrder());
                    System.out.println("По убыванию: " + Arrays.toString(array));
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Нет такой команды");
                    break;
            }
        }
    }

    public static void multiplyMatrices(Scanner scanner, int[][] productMatrix) {
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
            fillMatrix(scanner, firstMatrix, rows, cols, matrixCounter);
            printMatrix(firstMatrix, rows, cols, matrixCounter);

            matrixCounter++;

            System.out.print("Введите количество строк " + matrixCounter + " матрицы: ");
            int rows2 = scanner.nextInt();

            System.out.print("Введите количество столбцов " + matrixCounter + " матрицы: ");
            int cols2 = scanner.nextInt();

            int[][] secondMatrix = new int[rows2][cols2];
            fillMatrix(scanner, secondMatrix, rows2, cols2, matrixCounter);
            printMatrix(secondMatrix, rows2, cols2, matrixCounter);

            if (cols == rows2) {
                productMatrix = new int[rows][cols2];
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols2; j++) {
                        productMatrix[i][j] = 0;
                        for (int k = 0; k < cols; k++) {
                            productMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                        }
                    }
                }
                printMatrix(productMatrix, rows, cols2, 0);
                break;
            } else {
                System.out.println("Ошибка: количество столбцов первой матрицы должно быть равно количеству строк второй матрицы");
                break;
            }
        }
    }

    public static void printMatrix(int[][] matrix, int rows, int cols, int matrixNumber) {
        if (matrixNumber != 0) {
            System.out.println("Вид " + matrixNumber + " матрицы");
        }

        for (int i = 0; i < rows; i++) {
            System.out.print("|");
            for (int j = 0; j < cols; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println();
    }

    public static void fillMatrix(Scanner scanner, int[][] matrix, int rows, int cols, int matrixNumber) {
        System.out.println("\nЗаполнение матрицы " + matrixNumber);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Введите элемент [" + (i + 1) + "][" + (j + 1) + "]: ");
                int number = scanner.nextInt();
                matrix[i][j] = number;
            }
        }
    }
}