package sorting;

import java.util.Arrays;

public class MergeSort {
    public static Integer[] mergeSort(Integer[] array) {
        if (array.length <= 1){
            return array;
        }

        int midIndex = array.length / 2;

        Integer[] left = Arrays.copyOfRange(array, 0, midIndex);
        Integer[] right = Arrays.copyOfRange(array, midIndex, array.length);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    public static Integer[] merge(Integer[] left, Integer[] right) {
        int i = 0; int j = 0; int k = 0;
        Integer[] result = new Integer[left.length + right.length];

        while(i < left.length && j < right.length){
            if (left[i] <= right[j]){
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while(i < left.length){
            result[k++] = left[i++];
        }

        while(j < right.length){
            result[k++] = right[j++];
        }

        return result;
    }
}