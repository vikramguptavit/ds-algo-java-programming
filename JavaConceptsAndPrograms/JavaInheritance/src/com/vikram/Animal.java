package com.vikram;

public class Animal {

    //instance variables of Animal class
    public String name;
    public String body;
    public boolean brain;

    //parameterized constructor to initialized instance variables
    public Animal(String name, String body, boolean brain) {
        this.name = name;
        this.body = body;
        this.brain = brain;
    }

    //public getters and setters for instance variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean getBrain() {
        return brain;
    }

    public void setBrain(boolean brain) {
        this.brain = brain;
    }

    //instance methods of Animal class
    public void move() {
        System.out.println("Animal move() called...");
    }

    public void eat() {
        System.out.println("Animal eat() called...");
    }
}
