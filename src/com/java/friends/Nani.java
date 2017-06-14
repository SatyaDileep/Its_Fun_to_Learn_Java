package com.java.friends;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by satyat on 15/09/16.
 */
public class Nani {
    public static void main(String[] args) {

        /*
            Design and Code (in Java) which prints a sorted list of every unique word in a
text file, i.e. each unique word should appear only once on the output.
text file : Eggs make ducks, And ducks make eggs,
So ducklings can quack quack! The chicks go peep, Emerged from sleep, Resurfacing out back
         */
        String inputString = "Eggs make ducks, And ducks make eggs,\n" +
                "So ducklings can quack quack! The chicks go peep, Emerged from sleep, Resurfacing out back";

        // make sure the string doesn't have special characters coz quack, quack! are different while comparing
        inputString = inputString.replaceAll("[-+.^:,!]","");
        System.out.println(inputString);

        // Treeset preserves sorting order and Set doesn't allow duplicates
        Set<String> setOfUniqueStrings = new TreeSet<>();
        // split the words into string array, convert them to lowercase{Eggs, eggs are different} and add to the set.
        Arrays.stream(inputString.trim().split("\\s+")).forEach(s -> setOfUniqueStrings.add(s.toLowerCase()));

        System.out.println(setOfUniqueStrings);
    }

    public void readFiles() throws IOException {
        List<String> fileContent = new ArrayList<>();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/satyat/Desktop/CSV/Report_For_AutoComplete_Tasks.csv"))){
            bufferedReader.lines().forEach(s -> {
                fileContent.addAll(Arrays.asList(s.split(",")));
            });
        }
        catch (FileNotFoundException fileNotFound){
            System.out.println(fileNotFound);
        }
        finally {
            System.out.println(fileContent);
        }
    }

}
