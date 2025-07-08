import demos.*;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Выберите программу:");
        System.out.println("1 - Поворот матрицы на 90 градусов и быстрая сортировка");
        System.out.println("2 - Умножение матриц и пузырьковая сортировка");
        System.out.println("3 - Поиск максимального числа в матрице и сортировка слиянием");
        System.out.println("4 - Поиск строки с максимальной суммой элементов в матрице и сортировка вставкой");
        System.out.println("5 - Транспонирование матрицы и сортировка выбором");
        System.out.print("Ваш выбор: ");

        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("Сначала поворот матрицы на 90 градусов, а потом реализация быстрой сортировки.");
                QuickSortAnd90DegreeMatrixRotation.run(scanner);
                break;
            case 2:
                System.out.println("Сначала вычисляем произведение двух матриц, а потом реализация пузырьковой сортировки.");
                BubbleSortAndMatrixMultiplication.run(scanner);
                break;
            case 3:
                System.out.println("Сначала находим максимальный элемент матрицы, а потом реализация сортировки слиянием.");
                MergeSortAndMatrixMaxElement.run(scanner, random);
                break;
            case 4:
                System.out.println("Сначала находим строку с максимальной суммой элементов матрицы, а потом реализация сортировки вставкой.");
                InsertionSortAndMatrixMaxRowSum.run(scanner, random);
                break;
            case 5:
                System.out.println("Сначала транспонирование матрицы, а потом реализация сортировки выбором.");
                SelectionSortAndMatrixTransposition.run(scanner);
                break;
            default:
                System.out.println("Такого у нас нет");
                break;
        }
        scanner.close();
    }
}