package com.vikram;

public class Main {

    public static void main(String[] args) {
        // random array
        int arr[] = {5, 2, 4, 6, 1, 3};

        insertioSort(arr);

        //printing the sorted array
        System.out.println("Sorted array:");
        for (int i=0 ; i< arr.length;i++){
            System.out.print(" "+arr[i]+" ");
        }
    }

    public static void insertioSort(int arr[]) {
        /*
        iterating from index 1 as one element(at index 0) in sorted
        sub-array is already sorted.
         */
        for (int i = 1; i < arr.length; i++) {
             /*
            store the element which needs to be placed at correct
            position in sorted sub-array
             */
            int temp = arr[i];

            int j = i - 1;//last index of the element in the sorted sub-array.

            //comparing temp with each element in sorted sub-array
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];//shift the element to its right
                j--;
            }

            arr[j + 1] = temp;//placing the element at its correct position
        }
    }

}
