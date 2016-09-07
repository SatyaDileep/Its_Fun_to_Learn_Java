package com.java.practice.java8.hacker_earth;

import java.util.Scanner;

/**
 * Created by satyat on 07/09/16.
 */
public class ToggleString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the string :");
        String inputString = scanner.nextLine();
        System.out.println("Toggled string is : ");
        System.out.println(toggleString(inputString));
    }

    private static char[] toggleString(String inputString){
        char[] outputCharArray = inputString.toCharArray();
        int iterations = inputString.length();
        for(int i =0; i< iterations; i++){
            char test = outputCharArray[i];
            if(Character.isLowerCase(test))
                outputCharArray[i] = Character.toUpperCase(test);
            else if(Character.isUpperCase(test))
                outputCharArray[i] = Character.toLowerCase(test);
        }
        return outputCharArray;
    }
}
