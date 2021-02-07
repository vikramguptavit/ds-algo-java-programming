package com.vikram;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Interface1 ref = new ChildClass();
        ref.demo();
        Interface2 ref2 = new ChildClass();
        ref2.demo();
        ChildClass ref3=new ChildClass();
        ref3.demo();
    }
}
