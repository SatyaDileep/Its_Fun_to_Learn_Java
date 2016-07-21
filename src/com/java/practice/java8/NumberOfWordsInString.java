package com.java.practice.java8;

import java.util.Scanner;

/**
 * Created by satyat on 13/07/16.
 */
public class NumberOfWordsInString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useDelimiter("\\n");
        System.out.println("Please enter the string.. pressing enter would submit your input");
        findNumberOfWords(s.next());
    }

    public static void findNumberOfWords(String s){
        System.out.println("Number of words are : "+s.trim().split("\\s+").length);
    }
}
