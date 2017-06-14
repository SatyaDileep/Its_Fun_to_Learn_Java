package com.java.practice.java8.hacker_earth;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by satyat on 07/09/16.
 */
public class DeathMultiverseAndNothing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[10];
        for (int i=0; i<10; i++)
            intArray[i] = scanner.nextInt();
        printNumbers(intArray);
    }
    private static void printNumbers(int[] intArray){
        IntStream.range(1, intArray.length)
                .forEach(i-> System.out.println(intArray[i]-1));
    }
}
