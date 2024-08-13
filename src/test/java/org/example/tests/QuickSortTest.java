package org.example.tests;

import org.example.quickSort;
import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {

    @Test
    public void testQuickSort() {
        int[] arr = {4, 1, 3, 9, 7};
        quickSort.quickSort(arr, 0, arr.length - 1);
        int[] expected = {1, 3, 4, 7, 9};
        Assert.assertArrayEquals(expected, arr);
    }
}
