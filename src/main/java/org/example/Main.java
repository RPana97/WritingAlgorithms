package org.example;

import java.util.List;

public class Main {
    public static void main(String args[]) {
        // Quick Sort Example
        int arr[] = {4, 1, 3, 9, 7};
        int N = arr.length;

        // Call the quickSort method from QuickSort class
        quickSort.quickSort(arr, 0 , N-1);
        // Print the sorted array
        System.out.println("Quick Sorted array: ");
        printArray(arr, N);

        // Bubble Sort Example
        int array[] = {6, 2, 5, 10, 8};
        int x = array.length;

        // Call the bubblesort method from BubbleSort class
        bubblesort.bubblesort(array, x);

        // Print the sorted array
        System.out.println("Bubble Sorted array: ");
        printArray(array, x);

        // Counting Sort Example
        String s = "geeksforgeeks";
        String sortedString = CountingSort.countSort(s);

        // Print the sorted string
        System.out.println("Counting Sorted string: " + sortedString);

        // Pattern Search Example
        String text = "batmanandrobinarebat";
        String pattern = "bat";
        List<Integer> result = PatternSearch.search(text, pattern);

        // Print the indices where pattern is found
        System.out.println("Pattern found at indices: " + result);

        // Merge Sort Example
        int mergeArr[] = {12, 11, 13, 5, 6, 7};
        int mergeN = mergeArr.length;

        MergeSort.mergeSort(mergeArr, 0, mergeN - 1);
        System.out.println("Merge Sorted array: ");
        printArray(mergeArr, mergeN);
    }

    // Function to print the array
    public static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
