package com.interview.sorting;

import static com.interview.Utility.printArray;

public class MergeSort {
    public static final void merge(Integer[] arr, Integer low, Integer mid, Integer high) {
        Integer i = low;
        Integer j = mid + 1;
        Integer k = low;
        Integer[] interMediateArr = new Integer[high + 1];

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                interMediateArr[k] = arr[i];
                i++;
            } else {
                interMediateArr[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            interMediateArr[k] = arr[i];
            k++;
            i++;
        }

        while (j <= high) {
            interMediateArr[k] = arr[j];
            k++;
            j++;
        }

        for (int m = low; m <= high; m++) {
            arr[m] = interMediateArr[m];
        }
    }

    public static final void sort(Integer[] arr, Integer low, Integer high) {
        if(low < high) {
            Integer mid = (low + high) / 2;
            sort(arr, low, mid);
            sort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = { 3, 5, 2, 13, 12, 3, 2, 13, 45 };
        System.out.println(printArray(arr));
        sort(arr, 0, arr.length - 1);
        System.out.println(printArray(arr));
    }
}
