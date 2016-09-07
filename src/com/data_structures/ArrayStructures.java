package com.data_structures;

import com.sorting_algorithms.BubbleSort;
import com.sorting_algorithms.InsertionSort;
import com.util.FormArrayData;

import java.util.Scanner;

/**
 * Created by satyat on 26/07/16.
 */
public class ArrayStructures {

    private int[] ourArray;
    private int arraySize;

    private void printArray(){
        System.out.println("--------");
        for (int i = 0; i < arraySize; i++) {
            System.out.println(i+" | " + ourArray[i] + " | ");
            System.out.println("--------");
        }
    }

    private void printHorizontal(){
        for (int i = 0; i < arraySize; i++) {
            System.out.print("----------");
        }
        System.out.println();
        for (int i = 0; i < arraySize; i++) {
            System.out.print("|\t"+i+"\t");
        }
        System.out.println();
        for (int i = 0; i < arraySize; i++) {
            System.out.print("----------");
        }
        System.out.println();
        for (int i = 0; i < arraySize; i++) {
            System.out.print("|\t"+ourArray[i]+"\t");
        }
        System.out.println();
        for (int i = 0; i < arraySize; i++) {
            System.out.print("----------");
        }
    }

    private int getElementAtIndex(int index){
        return (index < ourArray.length) ? ourArray[index] : -1;
    }

    //Just the same logic as Linear Search
    private int containsValue(int value){
        for(int i =0; i<ourArray.length; i++){
            if(ourArray[i] == value){
                return i;
            }
        }
        return -1;
    }

    private void deleteValueFromIndex(int index){
        int arrayLength = ourArray.length;
        if(index <= arrayLength){
            for(int i=index; i< arrayLength-1 ; i++){
                ourArray[i] = ourArray[i+1];
            }
            arraySize--;
        }
    }

    private void insertValue(int value){
        System.out.println(arraySize+" -- "+ourArray.length);
        ourArray[arraySize] = value;
        arraySize++;
    }

    public static void main(String[] args) {
        ArrayStructures arrayStructures = new ArrayStructures();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array to be formed");
        arrayStructures.arraySize = 5;//s.nextInt();
        // form the array data
        arrayStructures.ourArray = FormArrayData.getArrayData(arrayStructures.arraySize);
        // display the array
        //arrayStructures.printArray();
        // find the element at desired index
        /*System.out.println("Enter the index from which element has to be retrieved :");
        int index = s.nextInt();
        int elementAtIndex = arrayStructures.getElementAtIndex(index);
        System.out.println(elementAtIndex > 0 ? "Element is "+elementAtIndex : "Index is out of arrays length");

        // find the index of value
        System.out.println("Enter the value to be searched for :");
        int valueToSearch = s.nextInt();
        int foundIndex = arrayStructures.containsValue(valueToSearch);
        System.out.println(foundIndex > 0 ? valueToSearch+" found at index "+foundIndex : valueToSearch+" is not found");*/
        /*arrayStructures.deleteValueFromIndex(2);
        arrayStructures.printArray();

        System.out.println("Enter the value to be inserted");
        arrayStructures.insertValue(s.nextInt());
        arrayStructures.printArray();*/
        arrayStructures.printHorizontal();
        //BubbleSort.bubbleSort(arrayStructures.ourArray);
        InsertionSort.insertionSort(arrayStructures.ourArray);
        arrayStructures.printHorizontal();
    }
}
