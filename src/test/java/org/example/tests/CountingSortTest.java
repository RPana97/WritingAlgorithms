package org.example.tests;

import org.example.CountingSort;
import org.junit.Assert;
import org.junit.Test;

public class CountingSortTest {

    @Test
    public void testCountingSort() {
        String input = "geeksforgeeks";
        String output = CountingSort.countSort(input);
        String expected = "eeeefggkkorss";
        Assert.assertEquals(expected, output);
    }
}
