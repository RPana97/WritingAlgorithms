package org.example.tests;

import org.example.PatternSearch;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PatternSearchTest {

    @Test
    public void testPatternSearch() {
        String text = "batmanandrobinarebat";
        String pattern = "bat";
        List<Integer> output = PatternSearch.search(text, pattern);
        List<Integer> expected = Arrays.asList(1, 18);
        Assert.assertEquals(expected, output);
    }
}
