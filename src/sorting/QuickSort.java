package sorting;

import utils.ArrayUtils;

public class QuickSort {
    public static void sort(Integer[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            sort(array, low, pivotIndex - 1);
            sort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(Integer[] array, int low, int high) {
        int pivot = array[high];
        int i = low;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                ArrayUtils.swap(array, i, j);
                i++;
            }
        }

        ArrayUtils.swap(array, i, high);
        return i;
    }
}