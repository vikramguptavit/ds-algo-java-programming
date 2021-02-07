public class Car {

    public String brandName;
    public String color;
    public Engine engine;
    public String model;

    public Car(String brandName, String color, Engine engine, String model) {
        this.brandName = brandName;
        this.color = color;
        this.engine = engine;
        this.model = model;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                ", model='" + model + '\'' +
                '}';
    }

    
}
