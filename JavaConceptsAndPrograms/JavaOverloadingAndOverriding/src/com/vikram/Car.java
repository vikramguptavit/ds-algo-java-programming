package com.vikram;

public class Car extends Vehicle{

    @Override
    /*
    Here we have defined honk method which is already defined in parent class.
    This method has same name , same no of arguments/parameters(zero in this case)
    as of parent class .
     */
    public void honk() {
        super.honk();//here we have called parent honk method using super keyword.
    }
}
