package com.vikram;

public class Main {

    //Merge the two sub-arrays arr[l..m] and arr[m+1,r] of the array arr[]
    public static void merge(int arr[], int l, int m, int r) {
        int sizeOfFirstSubArray = m - l + 1;
        int sizeOfSecondSubArray = r - m;

        //Creating two temp arrays
        int leftArr[] = new int[sizeOfFirstSubArray];
        int rightArr[] = new int[sizeOfSecondSubArray];

        //Copying data to these two temp arrays
        int i = 0, j = 0;//starting indices for two temp arrays
        for (i = 0; i < sizeOfFirstSubArray; i++) {
            leftArr[i] = arr[l + i];
        }
        for (j = 0; j < sizeOfSecondSubArray; j++) {
            rightArr[j] = arr[m + j + 1];
        }

        i = 0;
        j = 0;//re-setting starting indices of temp arrays
        int k = l;//starting index of merged sub-array (arr[])

        //Merging these two temp arrays
        while (i < sizeOfFirstSubArray && j < sizeOfSecondSubArray) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        //copying remaining elements from leftArr
        for (; i < sizeOfFirstSubArray; i++) {
            arr[k++] = leftArr[i];
        }
        //copying remaining elements from rightArr
        for (; j < sizeOfSecondSubArray; j++) {
            arr[k++] = rightArr[j];
        }

        printArray(arr, l, r);
    }



    public static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void printArray(int arr[],int l, int r){
        //Printing sorted sub-array
        System.out.println("\n------------ Merged sub-array : ------------");
        for (int i = l; i < r + 1; i++) {
            System.out.print("\t" + arr[i]);
        }
        System.out.println("\n--------------------------------------------");
    }

    public static void main(String[] args) {
        int arr[] = {5, 2, 4, 7, 1, 3, 2, 6};
        mergeSort(arr, 0, arr.length - 1);
    }
}
