package com.vikram;

import java.math.BigInteger;

public class SubSequence {

    void subSequence(int arr[]) {
        int n = arr.length;
        int noOfSubSequences = (int) Math.pow(2, n);

        //Running a loop from 000...0 to 111...1 for finding subSeq
        for (int count = 1; count < noOfSubSequences; count++) {
            //iterate over array
            System.out.print("[");
            for (int i = 0; i < n; i++) {
                //check if ith bit of counter is set
                if (BigInteger.valueOf(count).testBit(i)) {
                    System.out.print("  " + arr[i]);
                }
            }
            System.out.println("  ]");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3};
        SubSequence subSequence = new SubSequence();
        subSequence.subSequence(arr);
    }
}
