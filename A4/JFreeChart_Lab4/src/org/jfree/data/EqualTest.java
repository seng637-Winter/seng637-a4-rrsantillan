package org.jfree.data;

import static org.junit.Assert.*;
import org.junit.Test;

public class EqualTest {

    // Test when both arrays are null.
    @Test
    public void testBothArraysNull() {
        assertTrue(DataUtilities.equal(null, null));
    }

    // Test when one array is null and the other is not null.
    @Test
    public void testOneArrayNull() {
        double[][] a = {{1, 2}, {3, 4}};
        assertFalse(DataUtilities.equal(a, null));
        assertFalse(DataUtilities.equal(null, a));
    }

    // Test the comparison of arrays of different lengths.
    @Test
    public void testDifferentLengths() {
        double[][] a = {{1, 2}, {3, 4}};
        double[][] b = {{1, 2}};
        assertFalse(DataUtilities.equal(a, b));
    }

    // Test when the arrays have different elements.
    @Test
    public void testDifferentElements() {
        double[][] a = {{1, 2}, {3, 4}};
        double[][] b = {{1, 2}, {3, 5}};
        assertFalse(DataUtilities.equal(a, b));
    }

    // Test when the arrays have the same elements.
    @Test
    public void testEqualArrays() {
        double[][] a = {{1, 2}, {3, 4}};
        double[][] b = {{1, 2}, {3, 4}};
        assertTrue(DataUtilities.equal(a, b));
    }
}