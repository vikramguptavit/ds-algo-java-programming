package com.vikram;

public class LazySingleton {

    //private static variable of same class
    private static LazySingleton theInstance = null;

    //private constructor
    private LazySingleton(){

    }

    //public static method to get the singleton object when required
    public static LazySingleton getInstance(){
        if (theInstance == null){
            theInstance = new LazySingleton();
        }
        return theInstance;
    }
}
