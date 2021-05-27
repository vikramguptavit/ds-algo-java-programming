public class Machine implements IMachine {
    public void powerOn() {
        System.out.printf("Powering on Machine!!!");
    }

    public void powerOff() {
        System.out.println("Powering Off Machine!!!");
    }

    public void reboot() {
        System.out.println("Rebooting Machine!!!");
    }
}
