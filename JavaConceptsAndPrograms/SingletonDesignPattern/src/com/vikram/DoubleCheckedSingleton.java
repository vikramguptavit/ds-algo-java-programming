package com.vikram;

public class DoubleCheckedSingleton {

    //private static variable of same class
    private static DoubleCheckedSingleton theInstance = null;

    //private constructor
    private DoubleCheckedSingleton(){

    }

    //thread safe public static method to get the singleton object when required
    public static DoubleCheckedSingleton getInstance(){
        if (theInstance == null){
            synchronized(DoubleCheckedSingleton.class){
                //only one thread will be able to access this block.
                if (theInstance == null){
                    //once the object is created by one thread , for other threads this if condition will be false.
                    theInstance = new DoubleCheckedSingleton();
                }
            }
        }
        return theInstance;
    }
}
