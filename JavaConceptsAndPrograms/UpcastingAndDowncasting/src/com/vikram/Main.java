package com.vikram;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Honda");//here new created a new Object of type Car in heap , assume at address 1000h
        //car is reference of Object created by new operator and car points to address of 1000h.
        System.out.println("Car brand is : "+car.getBrandName());//It will print Honda

        changeCarReference(car);//This function will not change the address hold by car reference .

    }

    public static void changeCarReference(Car carRef){
        //here carRef holds address of car Object that is 1000h when changeCarReference method is called .
        System.out.println("car brand is : "+carRef.getBrandName());
        //This confirms that carRef holds 1000h as address and points to same Object as of car reference

        carRef.setBrandName("Toyota");//This will change the brand name of Car Object created at address 1000h in heap
        System.out.println("car brand is : "+carRef.getBrandName());//It will print Toyota
        //This confirms that carRef points to 1000h address and points to same Object as of car reference and changed the
        //brand name of Car Object at 1000h to Toyota


        Car newCar = new Car("Tata");//here new created a new Object of type Car in heap , assume at address 2000h
        //and newCar reference points to 2000h
        carRef = newCar ;//Now carRef points to address of new Car created above that is 2000h.
        System.out.println("car brand is : "+carRef.getBrandName());//It will print Tata
        //This confirms that carRef points to 2000h address as it printed Tata
    }
}

