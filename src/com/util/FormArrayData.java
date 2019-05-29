package com.util;

/**
 * Created by satyat on 22/07/16.
 */
public class FormArrayData {
    public static int[] getArrayData(int size){
        int[] arrayOfIntegers = new int[size];
        for (int i = 0; i < arrayOfIntegers.length ; i++)
        {
            arrayOfIntegers[i] = (int)(Math.random()*100);
        }
        for (int i: arrayOfIntegers
                ) {
            System.out.println(i);
        }
        return arrayOfIntegers;
    }
    public static void main(String a[]) {
    	getArrayData(5);
    }
}
