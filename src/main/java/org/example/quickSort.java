package org.example;

public class quickSort {

    //function to partition the array using the last element as the pivot
    public static int partition (int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1; // index of smaller element

        for (int j = low; j < high; j++) {
            //if current element is smaller or equal to the pivot
            if (arr[j] <= pivot) {
                i++;

                //swaps arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;

    }

    // The main function that implements QuickSort
    // arr[] --> Array to be sorted,
    // low  --> Starting index,
    // high  --> Ending index
    public static void quickSort (int arr[], int low, int high) {
        if (low < high) {
            //pi is partitioning index, arr[pi] is in correct place
            int pi = partition(arr, low, high);

            //recursively sort elements before partition and after partition
            quickSort (arr, low, pi - 1);
            quickSort (arr, pi + 1, high);
        }
    }

}
