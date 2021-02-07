package com.vikram;

public class Main {

    public static void bubbleSort(int arr[]) {
        int noOfPasses = arr.length - 1;
        //run the 'for' loop 'noOfPasses' times.
        boolean isSwapped;
        for (int i = 0; i < noOfPasses; i++) {
            //no of comparisons for each pass
            isSwapped=false;
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    //swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {9, 7, 5, 3, 1};
        System.out.println("\nArray elements before sorting: ");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("\nArray elements after sorting: ");
        printArray(arr);
    }
}
