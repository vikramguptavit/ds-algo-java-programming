package com.vikram;

public class Main {

    public static void main(String[] args) {

        /*
        here 'new' operator creates a new Object of type Car in heap ,
        assume at address 1000h . myCar is reference variable of Object
        created by new operator and myCar points this object at 1000h.
         */
        Car myCar = new Car("Honda");
        System.out.println("Car brand is : "+myCar.getBrandName());//prints Honda

        changeCarReference(myCar);
        /*
        This function will not change the address hold by myCar reference .
         */

    }

    public static void changeCarReference(Car carRef){
        /*
        here carRef holds address of Car Object that is 1000h when
        changeCarReference method is called .
         */
        System.out.println("car brand is : "+carRef.getBrandName());
        /*
        This confirms that carRef holds 1000h as address and points to same
        Object as of myCar reference
         */


        carRef.setBrandName("Toyota");
        /*
        This will change the brand name of Car Object at address 1000h in heap
         */

        System.out.println("car brand is : "+carRef.getBrandName());//prints Toyota
        /*
        This confirms that carRef points to 1000h address and points to same Object
        as of myCar reference and changed the brand name of Car Object at 1000h to Toyota
         */



        Car newCar = new Car("Tata");
        /*
        here 'new' operator created a new Object of type Car in heap , assume at
        address 2000h and newCar reference points to 2000h
         */


        carRef = newCar ;//Now carRef points to address of new Car created above that is 2000h.
        System.out.println("car brand is : "+carRef.getBrandName());//prints Tata
        //This confirms that carRef points to object at 2000h as it printed Tata
    }
}

