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
    }
}
