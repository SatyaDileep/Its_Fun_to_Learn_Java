package com.java.practice.java8.trickyones;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by satyat on 21/07/16.
 *
 * An anagram is a word or a phrase made by transposing the letters of another word or phrase;
 * for example, "parliament" is an anagram of "partial men," and "software" is an anagram of "swear oft."
 */
public class AnagramProgram {

    public static void main(String[] args) {
        System.out.println("Please enter 2 strings separated by new line { pressing enter }");
        Scanner s = new Scanner(System.in);
        s.useDelimiter("\\n");
        // scan 2 strings
        String string1 = s.next();
        String string2 = s.next();
        System.out.println(checkForAnagram(string1, string2) ? "the strings are anagrams" : "nope, they are not..!");

    }

    private static boolean checkForAnagram(String string1, String string2){
        // clean the strings, sort them and compare
        return sortString(removeJunkCharacters(string1)).equals(sortString(removeJunkCharacters(string2)));
    }

    private static String sortString(String string){
        char[] characterArray = string.toCharArray();
        Arrays.sort(characterArray);
        return new String(characterArray);
    }

    private static String removeJunkCharacters(String str){
        StringBuilder stringBuilder = new StringBuilder(str.length());
        for(char ch : str.toCharArray()){
            if (Character.isLetter(ch)){
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }
}
