package com.java.practice.java8;

import com.util.Developer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by satyat on 26/08/16.
 */
public class PolyGlots {
    public static void main(String[] args) {
        List<Developer> teamOfDevelopers = new ArrayList<>();
        Developer developer = new Developer("Satya");
        developer.addSkillSet("Java");
        developer.addSkillSet("JavaScript");

        Developer developer1 = new Developer("Dileep");
        developer1.addSkillSet("Python");
        developer1.addSkillSet("Java");

        teamOfDevelopers.add(developer);
        teamOfDevelopers.add(developer1);

        /*System.out.println(teamOfDevelopers.stream().
                flatMap(eachDeveloper -> eachDeveloper.getSkillSet().stream()).collect(Collectors.toList()));*/

        List<String> listOfSkillSets = teamOfDevelopers.stream().map(everyDeveloper -> everyDeveloper.getSkillSet())
                                    .flatMap(skillSet -> skillSet.stream())
                                    .distinct()
                                    .collect(Collectors.toList());
        System.out.println(listOfSkillSets);
    }
}
