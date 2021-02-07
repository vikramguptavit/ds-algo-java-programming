package com.vikram;

public class CountingSort {

    public void countingSort(int inputArray[]) {
        //find max value of inputArray
        int max = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (max < inputArray[i]) {
                max = inputArray[i];
            }
        }

        //initialize count array with length=(max+1) and all elements as 0
        int countArray[] = new int[max + 1];
        for (int i = 0; i < countArray.length; i++) {
            countArray[i] = 0;
        }

        //find the no of occurrences of each unique element and store
        //in count array at their respective indices.
        for (int i = 0; i < inputArray.length; i++) {
            countArray[inputArray[i]]++;
        }

        //find cumulative sum in the count array. This will be used to store
        //the elements from input array to output array at correct position
        for (int i = 1; i <= max; i++) {
            countArray[i] += countArray[i - 1];
        }

        int outputArray[] = new int[inputArray.length];
        //store the elements from input array to output array using cumulative index
        for (int j = (inputArray.length - 1); j >= 0; j--) {
            outputArray[countArray[inputArray[j]] - 1] = inputArray[j];
            countArray[inputArray[j]]--;
        }
        System.out.println("\n=============Sorted Array=============");
        printArray(outputArray);
    }

    public  void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t" + array[i]);
        }
    }

    public static void main(String[] args) {
        int inputArray[] = {2, 5, 3, 0, 2, 3, 0, 3};
        CountingSort countingSort= new CountingSort();
        System.out.println("============Unsorted Array============");
        countingSort.printArray(inputArray);
        countingSort.countingSort(inputArray);
    }
}
