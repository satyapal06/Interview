package com.interview.sorting;

import static com.interview.Utility.printArray;

public class BubbleSort {
    public static final void sort(Integer[] arr) {
        // For number of pass
        for(int i = 0; i < arr.length - 1; i++) {
            System.out.println("Working on pass number " + (i + 1));
            System.out.println(printArray(arr));
            // For comparison in each pass
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    Integer temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println(printArray(arr));
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = { 45, 3, 5, 2, 13, 12, 3, 2, 13 };
        System.out.println(printArray(arr));
        sort(arr);
        System.out.println(printArray(arr));
    }
}
