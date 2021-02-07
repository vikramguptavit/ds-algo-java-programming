package com.vikram;

public class EagerSingleton {
    //Only object created when class is loaded and theInstance is private static var pointing to it.
    private static EagerSingleton theInstance = new EagerSingleton();

    //private constructor
    private EagerSingleton(){

    }
    //public method to return single instance of class .
    public static EagerSingleton getInstance(){
        return theInstance;
    }
}
