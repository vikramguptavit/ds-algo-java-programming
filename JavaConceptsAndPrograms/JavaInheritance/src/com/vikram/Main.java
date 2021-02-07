package com.vikram;
//parent class
class Person{
    public Person() {
        System.out.println("Parent constructor called!!!");
    }
}
//child class inheriting parent class
class Employee extends Person{
    public Employee() {
        /*
        here super() call is implicit but we can explicitly write it when
        we want to call parent class parameterized constructor using
        super(param).
         */
        System.out.println("Child constructor called!!!");
    }
}
//driver class
class Main {

    public static void main(String args[]) {
        Employee employee = new Employee();
    }
}
