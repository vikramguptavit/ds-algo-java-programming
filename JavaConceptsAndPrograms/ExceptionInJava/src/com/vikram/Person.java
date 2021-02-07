package com.vikram;

public class Person {
    //public attribute
    public String name;
    //private attribute
    private int age;

    /*
     public parameterized constructor
     not necessary to include.
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
     below are public getters and setters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

