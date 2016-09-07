package com.java.practice.java8;

/**
 * Created by satyat on 16/06/16.
 */
public class Design_Pattern_SingleTon {
    private static SingleTon s1 = null, s2 = null;
    public static void main(String argsp[]){
        s1 = SingleTon.getSingleTonInstance();
        s2 = SingleTon.getSingleTonInstance();
        System.out.println(s1 == s2);
    }
}

class SingleTon{
    private static SingleTon singleTonInstance = null;

    private SingleTon(){

    }
    public static SingleTon getSingleTonInstance(){
        if (singleTonInstance == null){
            synchronized (SingleTon.class){
                singleTonInstance = new SingleTon();
            }
        }
        return singleTonInstance;
    }
}
