package com.vikram;

class Animal{

    public boolean canWalk;

    public String name;

    //constructor to initialize object fields
    public Animal(boolean canWalk , String name) {
        this.canWalk = canWalk;
        this.name = name;
    }

    /*
     This is an instance method
     */
    public void walk(){

        System.out.println("Can animal walk : "+canWalk);//accessed canWalk field of Instance which called this method

        //calling static method
        displayAnimalName(this);

    }

    public static void displayAnimalName(Animal animal){

        System.out.println("Name of Animal is : "+animal.name);

    }
}

public class Main {

    public static void main(String[] args) {
        //Creating an instance of class Animal
        Animal animal = new Animal(true,"Elephant");
        //Using animal instance , we are calling instance method walk() .
        animal.walk();
    }
}

