package com.sorting_algorithms;

/**
 * Created by satyat on 27/07/16.
 * Compares every 2 elements starting from the index 0.
 * For instance if a[1] < a[0] then they need to be swapped { for ascending order }
 * This needs to be done as long as there are no swaps to be made
 */
public class BubbleSort {
    public static int[] bubbleSort(int[] arrayToSort){
        int endIndex = arrayToSort.length-1;
        // take a flag to track swaps
        boolean swapMade = true;
        while (swapMade) {
            swapMade = false;
            for (int i = 0; i < endIndex; i++) {
                if (arrayToSort[i] > arrayToSort[i + 1]) {
                    // swap logic without temp variable { refer operator precedence wrt paranthesis }
                    arrayToSort[i] = arrayToSort[i] + arrayToSort[i + 1] - (arrayToSort[i + 1] = arrayToSort[i]);
                    swapMade = true;
                }
            }
        }
        return arrayToSort;
    }
}
