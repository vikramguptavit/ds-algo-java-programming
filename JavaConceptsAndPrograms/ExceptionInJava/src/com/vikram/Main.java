package com.vikram;

public class Main {

    public static void main(String args[]) {

       Person person = new Person("Vikram",25);
       person.name = "Vikram Gupta" ;//accessed public attribute outside of POJO class
       System.out.println("name : "+person.getName()+" age : "+person.getAge());

    }
}