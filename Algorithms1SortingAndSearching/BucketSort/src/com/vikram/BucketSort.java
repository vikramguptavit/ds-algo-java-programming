package com.vikram;


import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    public void bucketSort(float[] inputArr, int n) {

        if (n <= 0)
            return;

        ArrayList<Float>[] bucket = new ArrayList[n];

        //Create 'n' empty buckets
        for (int i = 0; i < n; i++)
            bucket[i] = new ArrayList<Float>();

        //Add the elements into the buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) inputArr[i] * n;
            bucket[bucketIndex].add(inputArr[i]);
        }

        //Sort the elements of each bucket one by one
        for (int i = 0; i < n; i++) {
            Collections.sort((bucket[i]));
        }

        //Get back the sorted array
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0, size = bucket[i].size(); j < size; j++) {
                inputArr[index++] = bucket[i].get(j);
            }
        }
    }

    //Main as driver method
    public static void main(String[] args) {
        BucketSort b = new BucketSort();
        float[] arr = { (float) 0.42, (float) 0.32, (float) 0.33, (float) 0.52, (float) 0.37, (float) 0.47,
                (float) 0.51 };
        b.bucketSort(arr, 7);

        System.out.println("Sorted Array : ");
        for (float i : arr)
            System.out.print(i + "  ");
    }
}