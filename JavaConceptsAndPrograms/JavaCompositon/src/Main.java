public class Main {

    public static void main(String args[]){

        Engine engine = new Engine("Petrol",1498,98,200);

        Car car = new Car("Honda","Silver",engine,"2020");

        System.out.println("Car Object is : "+car);
    }
}
