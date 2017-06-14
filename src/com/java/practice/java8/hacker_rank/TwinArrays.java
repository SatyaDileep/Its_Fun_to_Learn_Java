package com.java.practice.java8.hacker_rank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by satyad on 14/06/17.
 * https://www.hackerrank.com/contests/w33/challenges/twin-arrays
 */
public class TwinArrays {

    static int twinArrays(int[] ar1, int[] ar2){
        // Complete this function
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Enter size of arrays : ");
        Scanner in = new Scanner(System.in);
        int sizeOfArrays = in.nextInt();
        int[] array1 = new int[sizeOfArrays];
        for(int array1Index = 0; array1Index < sizeOfArrays; array1Index++){
            array1[array1Index] = in.nextInt();
        }
        int[] array2 = new int[sizeOfArrays];
        for(int array2Index = 0; array2Index < sizeOfArrays; array2Index++){
            array2[array2Index] = in.nextInt();
        }
        int result = twinArrays(array1, array2);

        TwinArrays twinArrays = new TwinArrays();
        twinArrays.iterateArray(array1);
    }

    private void iterateArray(int[] arrayInput){
        Arrays.stream(arrayInput).forEach(i-> System.out.println(i));
    }
}

