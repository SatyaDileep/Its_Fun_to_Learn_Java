package com.java.practice.java8;

import java.util.*;

/**
 * Created by satyat on 12/07/16.
 * Ex. A-{Apple, Ant, Archery}, B-{Bat, Ball, Bike}
 */
public class GroupWords {

    public static void main(String[] args) {
        List<String> listOfStrings  = Arrays.asList("ID", "EncounterID", "CreatedDate",
                "LastModifiedDate", "RenderingProvider", "PostDate", "ServiceDate", "PayerType", "PayerName",
                "ServiceLocation", "PatiendID", "PaymentID", "ChargeID", "ProcedureCode", "Applied", "Refunds");

        SortedMap<Character, List<String>> mapOfGroupedWords = new TreeMap<>();
        listOfStrings.forEach(s -> {
            char character = s.charAt(0);
            mapOfGroupedWords.putIfAbsent(character, new ArrayList<>());
            mapOfGroupedWords.get(character).add(s);

        });
        System.out.println(mapOfGroupedWords);
    }

}
