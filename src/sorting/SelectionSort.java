package sorting;

import utils.ArrayUtils;

public class SelectionSort {
    public static void selectionSort(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]){
                    minIndex = j;
                }
            }
            ArrayUtils.swap(array, i, minIndex);
        }
    }
}
