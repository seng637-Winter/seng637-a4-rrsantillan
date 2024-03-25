/**
 * UNDER CONSTRUCTION
 */
package org.jfree.data;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test class for verifying the behavior of the intersects method in the Range class.
 */
public class IntersectsTest{
	private Range exampleRange;
    
    /**
     * Initializes the exampleRange with a range from -10.0 to 10.0.
     * BLB = -10.1
     * LB = -10
     * ALB = -9.9
     * NOM = 1
     * BUB = 9.9
     * UB = 10
     * AUB = 10.1
     */
    
    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception { 
    	exampleRange = new Range(-10.0, 10.0);
    }
    
    @Test
    // Tests the scenario where both values are zero.
    public void test0And0() {
        assertTrue(this.exampleRange.intersects(0, 0));
    }

    @Test
    // Test for same number
    public void testSameNumber() {
        assertFalse(this.exampleRange.intersects('5', '5'));
    }

    @Test
    // Test the scenario where the values are in reverse order.
    public void testReverse() {
        assertFalse(this.exampleRange.intersects(-5, -6));
    }

    @Test
    // Tests the scenario where both values are equal and between the lower and upper bounds.
    public void testB1EqualB0AndBetweenLowerAndUpper() {
        assertTrue(this.exampleRange.intersects(-7, -7));
    }

    @Test
    // Tests the scenario where one value is smaller than the other and between the lower and upper bounds.
    public void testB1SmallThanB0AndBetweenLowerAndUpper() {
        assertFalse(this.exampleRange.intersects(-9, -10));
    }
    
    @Test
    // Tests the scenario where the value is below the lower bound and at the lower bound.
    public void testBLBAndLB() {
        assertFalse(this.exampleRange.intersects(-10.1, -10));
    }

    @Test
    // Tests the scenario where the value is below the lower bound and above the lower bound.
    public void testBLBAndALB() {
        assertTrue(this.exampleRange.intersects(-10.1, -9.9));
    }

    @Test
    //  Tests the scenario where the value is below the lower bound and above the upper bound.
    public void testBLBAndAUB() {
        assertTrue(this.exampleRange.intersects(-10.1, 10.1));

    }
    @Test
    // Tests the scenario where the value is at the lower bound and above the lower bound.
    public void testLBAndALB() {
        assertTrue(this.exampleRange.intersects(-10, -9.9));
    }

    @Test
    // Tests the scenario where the value is at the lower bound and at the upper bound.
    public void testLBAndUB() {
        assertTrue(this.exampleRange.intersects(-10, 10));
    }

    @Test
    // Tests the scenario where the value is within the range.
    public void testNOMAndNOM() {
        assertTrue(this.exampleRange.intersects(-1, 1));
    }

    @Test
    // Tests the scenario where the value is below the upper bound and at the upper bound.
    public void testBUBAndUB() {
        assertTrue(this.exampleRange.intersects(9.9, 10));
    }

    @Test
    // Tests the scenario where the value is at the upper bound and above the upper bound.
    public void testUBAndAUB() {
        assertFalse(this.exampleRange.intersects(10, 10.1));
    }

    @Test
    // Tests the scenario where the value is the smallest possible double and above the upper bound.
    public void testMINAndAUB() {
        assertTrue(this.exampleRange.intersects(Double.MIN_VALUE, 10.1));
    }

    @Test
    // Tests the scenario where the value is below the lower bound and the maximum possible double.
    public void testBLBAndMAX() {
        assertTrue(this.exampleRange.intersects(-10.1, Double.MAX_VALUE));
    }

    @Test
    // Tests the scenario where one value is NaN (Not a Number) and the other is a number.
    public void testNaNAnd1() {
        assertFalse(this.exampleRange.intersects(Double.NaN, 1));
    }


    
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}


}
