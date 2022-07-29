package com.interview.sorting;

import static com.interview.Utility.printArray;

public class AdaptiveBubbleSort {
    public static final void sort(Integer[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            boolean isSorted = true;
            System.out.println("Working on pass number==== " + (i + 1));
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    Integer temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                    System.out.println(printArray(arr));
                }
            }

            if(isSorted) {
                return;
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
