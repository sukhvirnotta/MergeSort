package com.sparta.sn;

import java.util.Arrays;

public class MergeSorter {
    void mergeSortArray(int[] unsortedArray) {
        int length = unsortedArray.length;
        if (length < 2) {
            return;
        }
        int middle = length/2;

        int[] left = Arrays.copyOfRange(unsortedArray, 0, middle);
        int[] right = Arrays.copyOfRange(unsortedArray, middle, length);

        mergeSortArray(left);
        mergeSortArray(right);

        mergeArrays(unsortedArray, left, right);
    }

    private void mergeArrays(int[] originalArray, int[] leftArray, int[] rightArray) {
        int i = 0, j = 0, k = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] < rightArray[j]) {
                originalArray[k] = leftArray[i];
                i++;
            } else {
                originalArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftArray.length) {
            originalArray[k] = leftArray[i];
            k++;
            i++;
        }

        while (j < rightArray.length) {
            originalArray[k] = rightArray[j];
            k++;
            j++;
        }
    }
}
