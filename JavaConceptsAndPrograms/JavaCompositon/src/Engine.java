public class Engine {

    public String fuelType;
    public int cc;
    public int maxTorque;
    public int maxPower;

    public Engine(String fuelType, int cc, int maxTorque, int maxPower) {
        this.fuelType = fuelType;
        this.cc = cc;
        this.maxTorque = maxTorque;
        this.maxPower = maxPower;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getMaxTorque() {
        return maxTorque;
    }

    public void setMaxTorque(int maxTorque) {
        this.maxTorque = maxTorque;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "fuelType='" + fuelType + '\'' +
                ", cc=" + cc +
                ", maxTorque=" + maxTorque +
                ", maxPower=" + maxPower +
                '}';
    }
}
