package com.pramati.practice.java8.trickyones;

import java.util.*;

/**
 * Created by satyat on 13/07/16.
 */

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        FirstNonRepeatingCharacter firstNonRepeatingCharacter = new FirstNonRepeatingCharacter();
        System.out.println("Please enter the string for which you would like to find first non-repeating charcater :");
        Scanner s = new Scanner(System.in);
        s.useDelimiter("\\n");
        System.out.println("first non-repeating character is "+firstNonRepeatingCharacter.nonRepeatingCharacter(s.next().toCharArray()));
    }
    private Character nonRepeatingCharacter(char[] input){
        System.out.println("entered at "+new Date(System.currentTimeMillis()));
        Map<Character, Integer> mapWithCountForEachChars = new LinkedHashMap<>();
        for(char c : input){
            if(!(c == ' ')) {
                mapWithCountForEachChars.putIfAbsent(c, 0);
                mapWithCountForEachChars.put(c, mapWithCountForEachChars.get(c) + 1);
            }
        }
        System.out.println(mapWithCountForEachChars);
        final Character[] finalChar = {null};
        mapWithCountForEachChars.entrySet().stream()
                .filter(characterIntegerEntry -> characterIntegerEntry.getValue().equals(1))
                .findFirst().ifPresent(characterIntegerEntry -> {
                    finalChar[0] = characterIntegerEntry.getKey();
                });
        System.out.println("Exited "+new Date(System.currentTimeMillis()));
        return finalChar[0];
    }
}
