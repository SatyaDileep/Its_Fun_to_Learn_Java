package com.pramati.practice.java8;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by satyat on 13/07/16.
 */
public class NumberOfWordsInString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useDelimiter("\\n");
        System.out.println("Please enter the string.. pressing enter would submit your input");
        findWords(s.next());
    }

    public static void findWords(String s){
        System.out.println(""+s.trim().split("\\s+").length);
    }
}
