package com.vikram;

public class SubArray {

    static int noOfSubArrays=0;
    //find and print all sub arrays
    void subArrays(int arr[]) {
        //'i' as starting index of subArray
        for (int i = 0; i < arr.length; i++) {
            //'j' as ending index of subArray
            for (int j = i; j < arr.length; j++) {
                //print sub array from start to end
                printSubArray(arr, i, j);
            }
        }
    }

    void printSubArray(int arr[], int start, int end) {
        noOfSubArrays++;
        System.out.print("Sub-Array "+noOfSubArrays+"  [");
        for (int k = start; k <= end; k++) {
            System.out.print("\t" + arr[k]);
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        SubArray subArray = new SubArray();
        subArray.subArrays(arr);
    }
}
