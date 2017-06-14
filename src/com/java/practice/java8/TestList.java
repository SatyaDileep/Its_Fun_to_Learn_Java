package com.java.practice.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by satyat on 23/08/16.
 */
public class TestList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c");
        List<String> clone = new ArrayList<>(list);
        System.out.println(list+" --original");
        System.out.println(clone+" --clone");
        clone.add("d");
        System.out.println(clone);
        clone.remove(1);
        System.out.println(list+" - - "+clone);


        String s = "Bill with EIN";
        System.out.println(s.contains("EIN"));
        List<String> list0 = Arrays.asList("603","604","605");
        List<String> list1 = Arrays.asList("603","604","605","607","867");
        List<String> finalList = new ArrayList<>();
        list1.forEach(s1 -> {
            if(!list0.contains(s1)) {
                System.out.println(s1 + " is not present in list0");
                finalList.add(s1);
            }
        });
        System.out.println(finalList);
        System.out.println(testMethod());

    }
    public static String testMethod(){
        try{
            System.out.println(1/0);
            System.exit(0);
            //return "b";
        }
        /*catch (Exception e){

        }*/
        finally {
            return "a";
        }
    }
}
