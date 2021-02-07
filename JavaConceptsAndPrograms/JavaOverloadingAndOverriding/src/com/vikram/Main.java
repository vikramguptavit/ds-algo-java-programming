package com.vikram;

class OuterClass {
    //static member of outer class.
    static String stringMsg="OuterClass String Message!!!";

    //static inner class
    static class StaticInnerClass{

        //Non static method of static Inner class
        void displayStringMgs(){
            System.out.println("Message from outer class inside static inner class : "+stringMsg);
            //Here static member of outer class is accessible but if we try to use non static member
            //or instance of Outer class then there will be compilation error .
        }
    }
}

//Driver class 'Main'.
public class Main {

    public static void main(String[] args) {
        /*
        Here we don't need instance of outer class to create instance of inner class
        But for non static inner classes we need instance of outer class to create
        instance of inner class .
         */

        OuterClass.StaticInnerClass instOfStaticInnerClass = new OuterClass.StaticInnerClass();
        //calling instance method /non static method of staticInnerClass
        instOfStaticInnerClass.displayStringMgs();
    }
}

