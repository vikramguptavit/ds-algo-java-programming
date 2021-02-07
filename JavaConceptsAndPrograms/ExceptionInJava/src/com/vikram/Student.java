package com.vikram;

//Student as Java bean class
public class Student {
    //private attributes
    private String name;
    private int registrationNum;

    //No-arg constructor
    public Student() {
    }

    //public getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegistrationNum() {
        return registrationNum;
    }

    public void setRegistrationNum(int registrationNum) {
        this.registrationNum = registrationNum;
    }
}

