package com.vikram;


class Main {

    public static void main(String[] args) {

        Machine machine = new Machine();
        machine.start();//This calls the start method of Machine class.
        Laptop laptop = new Laptop();
        laptop.start();
        /*
        This calls the start method of Laptop class because we have
        overridden this method in Laptop class.
         */
        laptop.stop();//This calls the stop method of Laptop class.

        /*
        Down casting is not always safe .
        Here is an example of down casting which explains the valid reason .
         */
        Machine machine3 = new Machine();//machine3 points to object of Machine class.
        if (machine3 instanceof Laptop) {
            Laptop laptop2 = (Laptop) machine3;//here ref. laptop2 points to Machine class
            /*
            This won't give compilation error but it will fail at run time giving an
            exception for classCastException.
            Remember that all machines won't be laptops , they can be CPU or Mobile etc.
             */
        }

    }
}


