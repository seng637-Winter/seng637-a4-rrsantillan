package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CloneTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCloneNonEmptyArray() {
        double[][] original = {{1.0, 2.0}, {3.0, 4.0}};
        double[][] cloned = DataUtilities.clone(original); // replace YourClassName with the actual class name containing the clone method
        
        assertNotNull("Cloned array should not be null", cloned);
        assertNotSame("Cloned array should not be the same instance as the original", original, cloned);
        assertArrayEquals("First row of cloned array should match the original", original[0], cloned[0], 0.0);
        assertArrayEquals("Second row of cloned array should match the original", original[1], cloned[1], 0.0);
    }

    @Test
    public void testCloneEmptyArray() {
        double[][] original = {};
        double[][] cloned = DataUtilities.clone(original); // replace YourClassName with the actual class name
        
        assertNotNull("Cloned array should not be null", cloned);
        assertEquals("Cloned array should have the same length as the original", 0, cloned.length);
    }

    @Test
    public void testCloneArrayWithNullRows() {
        double[][] original = new double[2][];
        original[0] = null;
        original[1] = new double[]{1.0, 2.0};
        double[][] cloned = DataUtilities.clone(original); // replace YourClassName with the actual class name
        
        assertNotNull("Cloned array should not be null", cloned);
        assertNull("First row of cloned array should be null", cloned[0]);
        assertNotNull("Second row of cloned array should not be null", cloned[1]);
        assertArrayEquals("Second row of cloned array should match the original", original[1], cloned[1], 0.0);
    }

    @Test
    public void testCloneArrayWithEmptyRows() {
        double[][] original = {{}, {1.0}};
        double[][] cloned = DataUtilities.clone(original); // replace YourClassName with the actual class name
        
        assertNotNull("Cloned array should not be null", cloned);
        assertEquals("First row of cloned array should be empty", 0, cloned[0].length);
        assertArrayEquals("Second row of cloned array should match the original", original[1], cloned[1], 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCloneNull() {
        double[][] cloned = DataUtilities.clone(null); // replace YourClassName with the actual class name
        // No need for assertions here, expected exception is declared in @Test
    }

}



