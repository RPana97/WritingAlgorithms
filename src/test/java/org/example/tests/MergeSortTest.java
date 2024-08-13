package org.example.tests;

import org.example.MergeSort;
import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {

    @Test
    public void testMergeSort() {
        int[] arr = {12, 11, 13, 5, 6, 7};
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        int[] expected = {5, 6, 7, 11, 12, 13};
        Assert.assertArrayEquals(expected, arr);
    }
}
