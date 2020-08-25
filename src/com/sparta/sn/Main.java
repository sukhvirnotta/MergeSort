package com.sparta.sn;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 7, 82, 10};
        new MergeSorter().mergeSortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
