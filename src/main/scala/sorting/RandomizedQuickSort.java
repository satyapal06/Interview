package com.interview.sorting;

import java.util.Random;

import static com.interview.Utility.printArray;

public class RandomizedQuickSort {
    public static final void sort(Integer[] arr, Integer low, Integer high) {
        if(low < high) {
            Integer pivotIndex = partitionArray(arr, low, high);
            sort(arr, 0, pivotIndex - 1);
            sort(arr, pivotIndex + 1, high);
        }
    }

    static void random(Integer arr[], Integer low, Integer high) {
        Random rand= new Random();
        int pivot = rand.nextInt(high - low) + low;

        Integer temp = arr[pivot];
        arr[pivot] = arr[low];
        arr[low] = temp;
    }

    public static final Integer partitionArray(Integer[] arr, Integer low, Integer high) {
        random(arr, low, high);
        Integer pivot = arr[low];
        int i = low + 1, j = high;
        do {
            // Find greater element
            while(arr[i] <= pivot) {
                i++;
            }

            // Find lower element
            while(arr[j] > pivot) {
                j--;
            }

            System.out.println("Index i is " + i + " Index j is " + j);
            if (i < j) {
                Integer temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            System.out.println(printArray(arr));
        } while(i < j);

        Integer temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        System.out.println(printArray(arr));

        return j;
    }

    public static void main(String[] args) {
        Integer[] arr = { 3, 5, 2, 13, 12, 3, 2, 13, 45 };
        System.out.println(printArray(arr));
        sort(arr, 0, arr.length - 1);
        System.out.println(printArray(arr));
    }
}
