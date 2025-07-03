package utils;

import java.util.Arrays;
import java.util.Collections;

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
}