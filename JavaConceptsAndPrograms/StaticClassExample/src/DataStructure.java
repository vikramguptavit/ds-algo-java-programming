
public class DataStructure {

    private static final int SIZE = 10;
    private int arr[] = new int[SIZE];

    private DataStructure() {
        for (int i = 0; i < SIZE; i++) {
            arr[i] = i * 10;
        }
    }

    //Creating Inner class
    private class Printer {
        private void printMultipleOfTen() {
            //accessing outer class variables
            for (int i = 0; i < SIZE; i++) {
                if (arr[i] % 10 == 0) {
                    System.out.printf("arr{%d}=%d ", i, arr[i]);
                }
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        //Creating an object of outer class
        DataStructure ds = new DataStructure();
        //Creating an object of inner class within outer class
        Printer printer = ds.new Printer();
        printer.printMultipleOfTen();
    }
}
