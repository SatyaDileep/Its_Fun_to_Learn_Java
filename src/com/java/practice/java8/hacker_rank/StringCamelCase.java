package com.java.practice.java8.hacker_rank;

import java.util.Scanner;

/**
 * Created by satyad on 07/06/17.
 * https://www.hackerrank.com/challenges/camelcase
 */
public class StringCamelCase {

    static int count = 0;
    public static void main(String[] args) {
        // sample input : saveChangesInTheEditor
        System.out.println("Please enter the string input ");
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        String inputString = scanner.next();
        if(Character.isLowerCase(inputString.charAt(0)))
            count++;
        processInput(inputString);
        System.out.println(count);
    }

    private static void processInput(String inputStr){
        for(Character character : inputStr.substring(1).toCharArray()){
            if(Character.isUpperCase(character))
                count++;
        }
    }
}
