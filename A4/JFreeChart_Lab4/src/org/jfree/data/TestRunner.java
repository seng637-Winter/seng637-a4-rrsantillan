package org.jfree.data;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		// DataUtilities Tests
		CalculateCumulativePercentagesTest.class,
		CreateNumberArrayTest.class,
		DataUtilititesCalculateColumnTotalTest.class,
		CalculateRowTotalTest.class,
		CreateNumberArray2DTest.class,
		CloneTest.class,
		EqualTest.class,
		// Range Tests
		RangeContainsTest.class,
		ExpandToIncludeTest.class,
		EqualsTest.class,
		GetLowerBoundTest.class,
		CombineTest.class,
		ExpandTest.class,
		IntersectsTest.class,
		
})

public class TestRunner {

}
