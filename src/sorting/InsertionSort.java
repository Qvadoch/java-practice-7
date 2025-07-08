package sorting;


import utils.ArrayUtils;

public class InsertionSort {
    public static void insertionSort(Integer[] array) {
        for (int i = 1; i < array.length; i++) {
            int sorted = i - 1;

            while(sorted > -1 && array[sorted] > array[sorted + 1] ){
                ArrayUtils.swap(array, sorted, sorted + 1);
                sorted--;
            }
        }
    }
}
