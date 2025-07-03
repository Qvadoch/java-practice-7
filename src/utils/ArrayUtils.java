package utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayUtils {
    public static void printArray(Integer[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void swap(Integer[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void sortAscending(Integer[] array) {
        Arrays.sort(array);
    }

    public static void sortDescending(Integer[] array) {
        Arrays.sort(array, Collections.reverseOrder());
    }

    public static int getArrayLengthFromUser(Scanner scanner) {
        int length;
        do {
            System.out.print("Введите длину массива (> 0): ");
            length = scanner.nextInt();
        } while (length <= 0);
        return length;
    }

    public static Integer[] createAndFillArray(Scanner scanner) {
        int length = getArrayLengthFromUser(scanner);
        Integer[] array = new Integer[length];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        return array;
    }
}