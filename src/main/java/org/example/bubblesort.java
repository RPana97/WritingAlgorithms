package org.example;

public class bubblesort {
    public static void bubblesort (int arr[], int n) {
        //loops through the array
        for (int i = 0; i < n - 1; i++) {
            //looks to swap if the first element is greater than the second element
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swaps the greater element to the next element
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
