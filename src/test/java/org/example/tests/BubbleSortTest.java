package org.example.tests;

import org.example.bubblesort;
import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        int[] arr = {6, 2, 5, 10, 8};
        bubblesort.bubblesort(arr, arr.length);
        int[] expected = {2, 5, 6, 8, 10};
        Assert.assertArrayEquals(expected, arr);
    }
}
