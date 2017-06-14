package com.java.threads;

import java.util.concurrent.Callable;

/**
 * Created by satyat on 20/09/16.
 */
public class CallableThread implements Callable<String> {

    private String name;

    public CallableThread(String name){
        this.name = name;
    }
    @Override
    public String call(){
        return "hey "+this.name;
    }
}
