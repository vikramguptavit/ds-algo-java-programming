package com.vikram;

public class Main {

    public static void main(String[] args) {

        //Array to sort in ascending order
        int arr[] = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
        heapSort(arr, arr.length);

        //print sorted array
        System.out.println("Sorted Array is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");
        }
    }

    /*
    When maxHeapify is called with a node at index i, it assumes that the binary trees rooted at LEFT(i)
    and RIGHT(i) are max-heaps, but that arr[i] might be smaller than its children,
    thus violating the max-heap property. The maxHeapify procedure lets the value at index "i" of arr[]
    “float down” in the max-heap so that the subtrees rooted at the index i obey the
    max-heap property.
     */
    public static void maxHeapify(int arr[], int heapSize, int i) {

        int largest = i;//assuming largest at root
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        //If left child larger than root node
        if (left < heapSize && arr[left] > arr[i]) {
            largest = left;
        }

        //If right child larger than root
        if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }

        //If root is not largest
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            //recursively maxHeapify the affected subtree
            maxHeapify(arr, heapSize, largest);
        }
    }

    public static void buildMaxHeap(int arr[], int lengthOfArray){
        /*
        First Build a max heap (here heapSize=lengthOfArray)
        Starting max-heapifying from node i which is (lengthOfArray / 2 - 1)
        as all the nodes from i+1 are basically leaf nodes and hence
        they satisfy max-heap property, so no need to heapify them.
         */
        for (int i = (lengthOfArray / 2 - 1); i >= 0; i--) {
            maxHeapify(arr, lengthOfArray, i);
        }
    }

    public static void heapSort(int arr[], int lengthOfArray) {

        //initially build maxHeap
        buildMaxHeap(arr,lengthOfArray);

        //One by one extract an element from heap and reduce the heapSize
        for (int i = lengthOfArray - 1; i > 0; i--) {
            //swap first(max element) and last element of the heap
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            //call maxHeapify to maintain heap property on reduced heap
            maxHeapify(arr, i, 0);
        }
    }
}
