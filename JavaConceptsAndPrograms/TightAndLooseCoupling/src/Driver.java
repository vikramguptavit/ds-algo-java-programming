public class Driver {
    public static void main(String[] args) {

        //Tight coupling
        Machine machine = new Machine();
        //Calling methods on machine reference
        machine.powerOn();
        machine.reboot();
        machine.powerOff();

        //Loose coupling
        IMachine iMachine = new Machine();
        //Calling methods on iMachine reference
        iMachine.powerOn();
        /*
        iMachine reference does not have visibility of reboot() method.
        As it is not a part of IMachine interface.
         */
        //iMachine.reboot();
        iMachine.powerOff();
    }
}
