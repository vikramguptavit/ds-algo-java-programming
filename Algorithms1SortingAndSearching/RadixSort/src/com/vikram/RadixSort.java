package com.vikram;

import java.util.Arrays;

public class RadixSort {

    void countingSort(int inputArray[], int size, int place) {
        //find largest element in input array at 'place'(unit,ten's etc)
        int k = ((inputArray[0] / place) % 10);
        for (int i = 1; i < size; i++) {
            if (k < ((inputArray[i] / place) % 10)) {
                k = ((inputArray[i] / place) % 10);
            }
        }
        //initialize the count array of size (k+1) with all elements as 0.
        int count[] = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            count[i] = 0;
        }
        //Count the occurrence of each element of input array based on place value
        //store the count at place value in count array.
        for (int i = 0; i < size; i++) {
            count[((inputArray[i] / place) % 10)]++;
        }
        //find cumulative(increased) sum in count array
        for (int i = 1; i < (k + 1); i++) {
            count[i] += count[i - 1];
        }
        //Store the elements from input array to output array using count array.
        int outputArray[] = new int[size];
        for (int j = (size - 1); j >= 0; j--) {
            outputArray[count[((inputArray[j] / place) % 10)] - 1] = inputArray[j];
            count[(inputArray[j] / place) % 10]--;//decrease count by one.
        }
        for (int i = 0; i < size; i++) {
            inputArray[i] = outputArray[i];//copying output array to input array.
        }
        System.out.println(Arrays.toString(inputArray));
    }

    void radixSort(int inputArray[], int size) {
        //find max element of inputArray
        int max = inputArray[0];
        for (int i = 1; i < size; i++) {
            if (max < inputArray[i]) {
                max = inputArray[i];
            }
        }
        //find number of digits in max element
        int d = 0;
        while (max > 0) {
            d++;
            max /= 10;
        }
        //Use counting cort d no of times
        int place = 1;//unit place
        for (int i = 0; i < d; i++) {
            System.out.print("iteration no = "+(i+1)+" ");
            countingSort(inputArray, size, place);
            place *= 10;//ten's , hundred's place etc
        }
    }

    public static void main(String[] args) {
        int inputArray[] = {10, 21, 17, 34, 44, 11, 654, 123};
        RadixSort radixSort = new RadixSort();
        System.out.println("\n===============Array before sorting=================");
        System.out.println(Arrays.toString(inputArray));
        System.out.println("\n===============Array after  sorting=================");
        radixSort.radixSort(inputArray, inputArray.length);
    }
}
