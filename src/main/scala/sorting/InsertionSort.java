package com.interview.sorting;

import static com.interview.Utility.printArray;

public class InsertionSort {
    public static final void sort(Integer[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            System.out.println("Working on pass number=========== " + (i + 1));
            System.out.println(printArray(arr));
            int key = arr[i];
            int j = i - 1;
            System.out.println("Key:::: " + key);
            System.out.println("J :::: " + j);
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
            System.out.println(printArray(arr));
        }
    }

    public static void main(String[] args) {
        Integer[] arr = { 3, 5, 2, 13, 12, 3, 2, 13, 45 };
        System.out.println(printArray(arr));
        sort(arr);
        System.out.println(printArray(arr));
    }
}
