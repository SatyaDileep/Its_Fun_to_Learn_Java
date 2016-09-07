package com.util;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by satyat on 26/08/16.
 */
public class Developer {
    private String developerName;
    private Set<String> skillSet;

    public Developer(String developerName){
        this.skillSet = new TreeSet<>();
        this.developerName = developerName;
    }
    public void addSkillSet(String skillSet){
        this.skillSet.add(skillSet);
    }

    public Set<String> getSkillSet(){
        return this.skillSet;
    }
}
