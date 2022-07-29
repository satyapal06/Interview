package com.interview.sorting;

import static com.interview.Utility.printArray;

public class CountSort {
    public static final Integer maximum(Integer[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    public static final void sort(Integer[] arr) {
        Integer maximum = maximum(arr);
        Integer[] countArr = new Integer[maximum + 1];

        // Initialize the array elements to 0
        for (int i = 0; i < countArr.length; i++) {
            countArr[i] = 0;
        }

        // Increment the corresponding index in the count array
        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]] = countArr[arr[i]] + 1;
        }

        Integer j = 0; // counter for given array A
        for (int i = 0; i < countArr.length; i++) {
            while(countArr[i] > 0) {
                arr[j] = i;
                countArr[i] = countArr[i] - 1;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = { 3, 5, 2, 13, 12, 3, 2, 13, 45 };
        System.out.println(printArray(arr));
        sort(arr);
        System.out.println(printArray(arr));
    }
}
