package org.algorithmdb.math;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

/**
 * 
 * @author Cody Long
 * @since  Dec 16 2010
 * 
 * A class which tests the abstract class Statistics.
 *
 */
public class StatisticsTest {

	@Test
	public void testStandardDeviationIntArray() {
		double expected = Math.sqrt(42);
		double actual = Statistics.standardDeviation(new int[]{1, 3, 4, 6, 9, 19});
		assertEquals(expected, actual, 0);
	}

	@Test
	public void testStandardDeviationArrayListOfInteger() {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(3);
		a.add(4);
		a.add(6);
		a.add(9);
		a.add(19);
		double expected = Math.sqrt(42);
		double actual = Statistics.standardDeviation(a);
		assertEquals(expected, actual, 0);
	}

}
