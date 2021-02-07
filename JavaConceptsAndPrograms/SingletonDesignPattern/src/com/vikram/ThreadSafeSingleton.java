package com.vikram;

public class ThreadSafeSingleton {

    //private static variable of same class
    private static ThreadSafeSingleton theInstance = null;

    //private constructor
    private ThreadSafeSingleton(){

    }

    //thread safe public static method to get the singleton object when required
    synchronized public static ThreadSafeSingleton getInstance(){
        if (theInstance == null){
            theInstance = new ThreadSafeSingleton();
        }
        return theInstance;
    }
}
