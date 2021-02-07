package com.vikram;

public class ChildClass implements Interface1,Interface2{

    public void demo(){
        Interface1.super.demo();
        System.out.println("I'm in demo of Child class");
    }
}
