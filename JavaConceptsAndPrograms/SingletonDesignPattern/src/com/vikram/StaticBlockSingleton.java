package com.vikram;

public class StaticBlockSingleton {
    //private static variable
    private static StaticBlockSingleton theInstance = null;

    //static block to initialize theInstance variable using constructor call
    static {
        try{
            theInstance = new StaticBlockSingleton();
        }catch (Exception exception){
            System.out.println("Exception occurred while creating the instance "+exception);
        }
    }
    //private constructor
    private StaticBlockSingleton(){

    }
    //public static method to get this single instance .
    public static StaticBlockSingleton getInstance(){
        return theInstance;
    }
}

