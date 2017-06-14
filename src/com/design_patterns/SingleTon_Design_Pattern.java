package com.design_patterns;

/**
 * Created by Dillugadu on 01-03-2017.
 * This pattern is used when there must be one and only one instance to be created for the application.
 * This is widely used for classes that are costly ex. DB connection
 * Basic rules to follow this pattern are
 * % Constructor must be private % which makes the instantiation impossible from other classes
 * % A private static variable % which is the instance variable of the class.
 * % Public static method to return the instance % this is the global access point to get the instance of the class.
 */
public class SingleTon_Design_Pattern {

    public static void main(String[] args) {
        SingleTon_Design_Pattern singleTon_design_pattern = new SingleTon_Design_Pattern();
    }

    /*
    ====== eager initialization ======
    private static final SingleTon_Design_Pattern singleTonObject = new SingleTon_Design_Pattern();
    =====
    ===== Static block initialization =====
    static {
        try{
            singleTonObject = new SingleTon_Design_Pattern();
        }
        catch (Exception e){
            throw new RuntimeException("bla bla");
        }
    }

    %% both of these initialize the instance even if client uses the get method for instance hence unreliable.
     */
    // private static instance variable
    private static SingleTon_Design_Pattern singleTonObject;

    // Empty private constructor
    private SingleTon_Design_Pattern() {

    }

    // public static method to return instance variable
    public static SingleTon_Design_Pattern getSingleTonObject() {

        // the following code uses Lazy initialization style :
        /*if (singleTonObject == null) {
            System.out.println("// object doesn't exist hence creating one..");
            return new SingleTon_Design_Pattern();
        }
        return singleTonObject;*/
        // but this is not thread safe.. i.e when multiple threads access this class, they can receive different objects as we
        // are not handling thread safety / synchronization which in turn breaks singleton pattern

        // Hence we need to use thread safe code.. for this we can place synchronized keyword in the method signature like :
        // public static synchronized SingleTon_Design_Pattern getSingleTonObject(){}
        // Doing so will ensure thread safety but creates a performance impact incase of multiple threads accessing this class.
        // Which means method gets locking overhead and our focus of synchronizing must shift to the actual block where we are
        // creating single ton object..

        if (singleTonObject == null) {
            synchronized (SingleTon_Design_Pattern.class) {
                System.out.println(" form new object");
                if (singleTonObject == null)
                    return new SingleTon_Design_Pattern();
            }
        }
        return singleTonObject;

    }
}
