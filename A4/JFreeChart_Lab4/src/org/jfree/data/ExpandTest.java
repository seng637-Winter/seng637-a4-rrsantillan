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
 * 
 */
public class ExpandTest{
    private Range exampleRange;
    
    /**
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
    
    // A range of -10 to 10, with lower margin 0.01 and upper margin of 0.01 should expand to a range of -10.2, 10.2
    @Test
    public void expandWithPositiveLowerMarginandUpperMargin() {
        assertEquals(new Range(-10.2, 10.2), Range.expand(this.exampleRange, 0.01, 0.01));
    }

    // A range of -10 to 10, with lower margin 0.01 and upper margin of -0.01 should expand to a range of -10.2, 9.8
    @Test
    public void expandWithPositiveLMandNegativeUM() {
        assertEquals(new Range(-10.2, 9.8), Range.expand(this.exampleRange, 0.01, -0.01));
    }

    // A range of -10 to 10, with lower margin 0 and upper margin of 0 should expand to a range of 10, 10
    @Test
    public void expandWithZeroLMandUM() {
        assertEquals(new Range(-10, 10), Range.expand(this.exampleRange, 0, 0));
    }

    // A range of -10 to 10, with lower margin -0.01 and upper margin of 0.01 should expand to a range of -9.8, 10.2
    @Test
    public void expandWithNegativeLMandPositiveUM() {
        assertEquals(new Range(-9.8, 10.2), Range.expand(this.exampleRange, -0.01, 0.01));
    }

    // A range of -10 to 10, with lower margin -0.01 and upper margin of -0.01 should expand to a range of -9.8, 9.8
    @Test
    public void expandWithNegativeLMandNegativeUM() {
        assertEquals(new Range(-9.8, 9.8), Range.expand(this.exampleRange, -0.01, -0.01));
    }

    // A range of -10 to 10, with lower margin -2 and upper margin of 0 should expand to a range of 20, 20
    @Test
    public void expandWithLargeNegativeLMandZeroUM() {
        assertEquals(new Range(20, 20), Range.expand(this.exampleRange, -2, 0));
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
