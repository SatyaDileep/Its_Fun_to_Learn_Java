package com.java.practice.java8;

/**
 * Created by satyat on 16/06/16.
 */
public class Design_Pattern_SingleTon {
    static SingleTon s1 = null, s2 = null;
    public static void main(String argsp[]){
        s1 = SingleTon.getInstance();
        s2 = SingleTon.getInstance();
        System.out.println(s1 == s2);
    }
}

class SingleTon{
    private static SingleTon singleTon = null;

    private SingleTon(){

    }

    public static SingleTon getInstance(){
        if(singleTon == null){
            singleTon =  new SingleTon();
            System.out.println("First time.."+singleTon.toString());
        }
        else
            System.out.println(singleTon.toString());
        return singleTon;
    }
}
