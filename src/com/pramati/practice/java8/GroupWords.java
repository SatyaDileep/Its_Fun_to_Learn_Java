package com.pramati.practice.java8;

import java.util.*;

/**
 * Created by satyat on 12/07/16.
 */
public class GroupWords {

    public static void main(String[] args) {
        List<String> listOfStrings  = new ArrayList<String>(){{addAll(Arrays.asList("ID", "EncounterID", "CreatedDate",
                "LastModifiedDate", "RenderingProvider", "PostDate", "ServiceDate", "PayerType", "PayerName",
                "ServiceLocation", "PatiendID", "PaymentID", "ChargeID", "ProcedureCode", "Applied", "Refunds"));}};

        Set<Character> setOfStartingCharacters = new HashSet<>();
        listOfStrings.forEach(s -> setOfStartingCharacters.add(s.charAt(0)));
        SortedMap<Character, List<String>> mapOfGroupedWords = new TreeMap<>();

        setOfStartingCharacters.forEach(character -> {
            listOfStrings.forEach(s -> {
                if (s.startsWith(String.valueOf(character))){
                    mapOfGroupedWords.putIfAbsent(character, new ArrayList<>());
                    mapOfGroupedWords.get(character).add(s);
                }
            });
        });
        System.out.println(setOfStartingCharacters);
        System.out.println(mapOfGroupedWords);
    }

}
