package com.interview.sorting;

import static com.interview.Utility.printArray;

public class SelectionSort {
    public static final void sort(Integer[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            System.out.println("Working on pass number=========== " + (i + 1));
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    System.out.println(printArray(arr));
                }
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
