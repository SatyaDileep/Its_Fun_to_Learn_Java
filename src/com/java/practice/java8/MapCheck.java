package com.java.practice.java8;

import java.util.*;

/**
 * Created by satyat on 21/07/16.
 */
public class MapCheck {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        String s =map.put(Integer.valueOf(1), "a");
        System.out.println(s);
        String s1 = map.put(Integer.valueOf(2), "b");
        System.out.println(s1);
        String s3 = map.put(Integer.valueOf(1), "c");
        System.out.println(s3);
        System.out.println(map);
        map.put(null, "A");
        map.put(5,null);
        map.put(6,null);
        String snew =map.put(null,"a");
        System.out.println("prints prev val.."+snew);

        String s4 = map.putIfAbsent(Integer.valueOf(2), "d");
        System.out.println(s4);
        String s5 = map.get(null);
        System.out.println(s5);
        System.out.println(map);
        HashMap<String,String> myMap = new HashMap<String,String>();
        myMap.put("1", "1");
        myMap.put("2", "1");
        myMap.put("3", "1");
        myMap.put("4", "1");
        myMap.put("5", "1");
        myMap.put("6", "1");
        System.out.println("HashMap before iterator: "+myMap);
        Iterator<String> it1 = myMap.keySet().iterator();

        /*while(it1.hasNext()){
            String key = it1.next();
            if(key.equals("3")) //myMap.put(key, "new3");
            myMap.remove(key);
        }*/

        Map<String, List<String>> testMap = new HashMap<>();

        char[] alphabets = new char[]{'a', 'b','c','d','e','f', 'a', 'c'};
        for(char c : alphabets){

            if(testMap.containsKey(String.valueOf(c))){
                testMap.get(String.valueOf(c)).add(c+" //");
            }
            else{
                List<String> ourList = new ArrayList<>();
                ourList.add(c+" ///");
                testMap.put(String.valueOf(c), ourList);
            }
        }
        System.out.println(testMap);


    }
}
