package com.algorithmdb.algorithms.math.test;

import static org.junit.Assert.*;

import org.junit.Test;

import static com.algorithmdb.algorithms.math.Algebra.*;

import com.algorithmdb.util.math.exceptions.ImaginaryNumberException;

/**
 * 
 * @author Cody Long
 * @date Dec 18 2010
 * 
 * A class to test the Algebra class.
 * 
 */
public class AlgebraTest {

	@Test
	public void testGreatestCommonDivisor() {
		int expected = 1;
		int actual = greatestCommonDivisor(5, 6);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testExtended_greatestCommonDivisor() {
		int[] expected = {1, -1, 1};
		int[] test = extended_greatestCommonDivisor(5, 6);
		for(int i = 0; i < test.length; i++)
		assertArrayEquals(expected, test);
	}
	
	@Test
	public void testQuadEq_twoAnswers()
	{
		double[] answers = null;
		try
		{
			answers = quadEq(2,4,-30);
			//assertArrayEquals(new double[] {3,-5}, answers,3);
		}
		catch(ImaginaryNumberException e)
		{e.printStackTrace();}
		
	}
	
	@Test
	public void testQuadEq_oneAnswer()
	{
		double[] answers = null;
		try
		{
			answers = quadEq(1,4,4);
			//assertArrayEquals(new double[] {-2,-2}, answers,3);
		}
		catch(ImaginaryNumberException e)
		{e.printStackTrace();}
	}
	
	@Test
	public void testQuadEq_imaginaryAnswers() throws ImaginaryNumberException
	{
		double[] answers = quadEq(1,2,4);
	}

}
