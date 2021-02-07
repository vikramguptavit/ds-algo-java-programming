package com.vikram;

public class Main {

    public static void selectionSort(int arr[]) {
        int minIndex;
        //iterate over array
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            //find min index by comparing with other elements
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            //swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {9, 7, 5, 3, 1};
        System.out.println("Array before sorting: ");
        printArray(arr);
        selectionSort(arr);
        System.out.println("\nArray after sorting: ");
        printArray(arr);
    }
}
