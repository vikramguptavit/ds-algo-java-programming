package com.vikram;

public class Main {


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Main class finalize method called.");
    }

    public static void main(String args[]) {
        try {

            Main object = new Main();
            /*
            calls finalize overridden method in Main class but it won't
            destroy object as main method is not yet executed completely
             */
            object.finalize();
            object = null;
            System.gc();/*calls to finalize method*/
            /*
            The above Runs the garbage collector.Calling the gc method suggests
            that the JVM so as to release memory occupied by current objects.
            After the call returns from JVM , it tried to reclaim the the resources
            from all destroyed/discarded objects.
             */
            System.out.println("Main class main() method called."+"ABc".equalsIgnoreCase("abc"));


        } catch (Throwable exception) {
            System.out.println("Exception caught in main method");
        }
    }
}
