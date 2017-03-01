package com.design_patterns;

/**
 * Created by Dillugadu on 01-03-2017.
 */
public class SingleTonWithInnerClass {

    private static SingleTonWithInnerClass singleTonWithInnerClass;

    private SingleTonWithInnerClass(){

    }

    public SingleTonWithInnerClass getInstance(){
        return SingleTonHelper.singleTonObj;
    }

    private static class SingleTonHelper{
        private static final SingleTonWithInnerClass singleTonObj = new SingleTonWithInnerClass();
    }
}
