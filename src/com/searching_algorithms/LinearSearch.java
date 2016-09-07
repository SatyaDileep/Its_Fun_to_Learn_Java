package com.searching_algorithms;

import com.util.FormArrayData;

import java.util.Scanner;

/**
 * Created by satyat on 22/07/16.
 *
 * Linear search is the most basic searching algorithm.
 *  i.e., start from the leftmost element of arr[] and one by one compare x with each element of arr[],
 *  if x matches with an element, return the index. If x doesn’t match with any of elements, return -1.
 */
public class LinearSearch {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] formedArray = FormArrayData.getArrayData(100);
        System.out.println("Enter the element to find");
        Scanner s = new Scanner(System.in);
        int numberToFind = s.nextInt();
        int foundIndex = linearSearchImplementation(formedArray, numberToFind);
        System.out.println(foundIndex > 0 ? "Number found at index "+foundIndex : "not found");
        System.out.println("time taken --> "+(System.currentTimeMillis() - startTime)/1000 +" seconds");
    }

    private static int linearSearchImplementation(int[] integerArray, int numberToFind){
        int lengthOfArray = integerArray.length;
        for (int i=0;i<lengthOfArray;i++){
            if(integerArray[i] == numberToFind){
                return i;
            }
        }
        return -1;
    }

}
