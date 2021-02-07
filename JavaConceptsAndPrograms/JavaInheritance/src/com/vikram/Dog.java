package com.vikram;

public class Dog extends Animal{

    //instance variables of Dog class
    public int legs;
    public String color;

    //parameterized constructor to initialize instance variables
    public Dog(String name, String body, boolean brain, int legs, String color) {
        super(name, body, brain);
        this.legs = legs;
        this.color = color;
    }

    //getters and setters for instance variables
    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getTail() {
        return color;
    }

    public void setTail(String tail) {
        this.color = tail;
    }

    //instance methods of Dog class
    public void run(){
        System.out.println("Dog run() called... ");
    }

    //overriding move method of Animal class in dog class
    @Override
    public void move() {
        System.out.println("Dog move() called... ");
        super.move();//calling move() of Animal class.
    }
}
