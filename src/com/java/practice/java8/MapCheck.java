package com.java.practice.java8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
        map.put(null, "A");
        map.put(5,null);
        map.put(6,null);
        String snew =map.put(null,"a");
        System.out.println(".."+snew);

        String s4 = map.putIfAbsent(Integer.valueOf(2), "d");
        System.out.println(s4);
        String s5 = map.get(null);
        System.out.println(s5);
        //System.out.println(map);
        HashMap<String,String> myMap = new HashMap<String,String>();
        myMap.put("1", "1");
        myMap.put("2", "1");
        myMap.put("3", "1");
        myMap.put("4", "1");
        myMap.put("5", "1");
        myMap.put("6", "1");
        System.out.println("HashMap before iterator: "+myMap);
        Iterator<String> it1 = myMap.keySet().iterator();

        while(it1.hasNext()){
            String key = it1.next();
            if(key.equals("3")) myMap.put(key, "new3");
        }
        System.out.println("HashMap after iterator: "+myMap);
    }
}
