package com.sorting_algorithms;

/**
 * Created by satyat on 27/07/16.
 * Insertion sort basically takes 2nd element as the key to start comparison.
 * All comparisions are done on previous elements in the array starting from the key index
 */
public class InsertionSort {
    public static int[] insertionSort(int[] arrayToSort){
        int endIndex = arrayToSort.length, key, j;
        for(int i =1; i< endIndex; i++){
            key = arrayToSort[i];
            j = i;
            while(j >0 && arrayToSort[j-1] > key){
                // since we have the key with us, replace the key'th index value with previous element value
                arrayToSort[j] = arrayToSort[j-1];
                j--;
            }
            // we compared till " key is greater than its previous element "
            arrayToSort[j] = key;
        }
        return arrayToSort;
    }
}
