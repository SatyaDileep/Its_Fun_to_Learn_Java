package com.util;

/**
 * Created by satyat on 27/07/16.
 * Swapping values without using temp variable
 */
public class SwapValues {
    public static void swapValues(int valueOne, int valueTwo){
        valueOne = valueOne+valueTwo - (valueTwo =valueOne);
    }
}
