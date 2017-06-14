package com.java.practice.java8;

import java.util.*;

/**
 * Created by satyat on 12/07/16.
 * Ex. A-{Apple, Ant, Archery}, B-{Bat, Ball, Bike}
 */
public class GroupWords {

    public static void main(String[] args) {
        String test = "Eggs make ducks, And ducks make eggs,\n" +
                "So ducklings can quack quack! The chicks go peep, Emerged from sleep, Resurfacing out back";
        List<String> listOfStrings  = Arrays.asList(test.split("\\s+"));

        SortedMap<Character, List<String>> mapOfGroupedWords = new TreeMap<>();
        listOfStrings.forEach(s -> {
            char character = s.charAt(0);
            mapOfGroupedWords.putIfAbsent(character, new ArrayList<>());
            mapOfGroupedWords.get(character).add(s);

        });
        System.out.println(mapOfGroupedWords);
    }

}
