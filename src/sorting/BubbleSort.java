package sorting;

import utils.ArrayUtils;

public class BubbleSort {
    public static void sort(Integer[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    ArrayUtils.swap(array, j, j + 1);
                }
            }
        }
    }
}