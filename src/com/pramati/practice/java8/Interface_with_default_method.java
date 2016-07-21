package com.pramati.practice.java8;

/**
 * Created by satyat on 17/06/16.
 */
public interface Interface_with_default_method {

    void sayHello(String name);
    default String sayHi(String name){
        return "Hi "+name;
    }
}
