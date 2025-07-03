import demos.BubbleSortAndMatrixMultiplication;
import demos.QuickSortAnd90DegreeMatrixRotation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите программу:");
        System.out.println("1 - Поворот матрицы и быстрая сортировка");
        System.out.println("2 - Умножение матриц и пузырьковая сортировка");
        System.out.print("Ваш выбор: ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            runMatrixRotationAndQuickSort(scanner);
        } else if (choice == 2) {
            runMatrixMultiplicationAndBubbleSort(scanner);
        } else {
            System.out.println("Неверный выбор");
        }

        scanner.close();
    }

    private static void runMatrixRotationAndQuickSort(Scanner scanner) {
        System.out.println("Сначала поворот матрицы на 90 градусов, а потом реализация быстрой сортировки.");
        QuickSortAnd90DegreeMatrixRotation.run(scanner);
    }

    private static void runMatrixMultiplicationAndBubbleSort(Scanner scanner) {
        System.out.println("Сначала вычисляем произведение двух матриц, а потом реализация пузырьковой сортировки.");
        BubbleSortAndMatrixMultiplication.run(scanner);
    }
}