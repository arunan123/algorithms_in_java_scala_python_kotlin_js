package com.algorithmdb.util.math;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.algorithmdb.math.Matrix;

public class MatrixTest {

	@Test
	public void testIdentity() {
		double[][] expected = {{1,0},{0,1}};
		Matrix matrix = Matrix.identity(2);
		double[][] actual = matrix.getData();
		assertArrayEquals(expected, actual);
		
	}
	
	@Test
	public void testSwap()
	{
		double[][] expected = {{1,2,3},{7,8,9},{4,5,6}};
		Matrix matrix = new Matrix(new double[][] {{1,2,3},{4,5,6},{7,8,9}});
		matrix.swap(1, 2);
		double[][] actual = matrix.getData();
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testTranspose()
	{
		double[][] expected = {{1,3},{2,4}};
		Matrix matrix = new Matrix(new double[][] {{1,2},{3,4}});
		Matrix newMatrix = matrix.transpose();
		double[][] actual = newMatrix.getData();
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testPlus()
	{
		Matrix A = new Matrix(new double[][] {{1,2},{3,4}});
		Matrix B = new Matrix(new double[][] {{1,2},{3,4}});
		Matrix C = A.plus(B);
		assertArrayEquals(new double[][]{{2,4},{6,8}}, C.getData());
	}
	
	@Test(expected = RuntimeException.class)
	public void testPlus_withError()
	{
		Matrix A = new Matrix(new double[][] {{1,2},{3,4}});
		Matrix B = new Matrix(new double[][] {{1,2,3},{4,5,6},{7,8,9}});
		@SuppressWarnings("unused")
		Matrix C = A.plus(B);
	}
	
	@Test
	public void testMinus()
	{
		Matrix A = new Matrix(new double[][] {{5,6},{7,8}});
		Matrix B = new Matrix(new double[][] {{1,2},{3,4}});
		Matrix C = A.minus(B);
		assertArrayEquals(new double[][]{{4,4},{4,4}}, C.getData());
	}
	
	@Test(expected = RuntimeException.class)
	public void testMinus_withError()
	{
		Matrix A = new Matrix(new double[][] {{1,2},{3,4}});
		Matrix B = new Matrix(new double[][] {{1,2,3},{4,5,6},{7,8,9}});
		@SuppressWarnings("unused")
		Matrix C = A.minus(B);
	}
	
	@Test
	public void testEqual_true()
	{
		Matrix A = new Matrix(new double[][] {{1,2},{3,4}});
		Matrix B = new Matrix(new double[][] {{1,2},{3,4}});
		
		assertTrue(A.eq(B));
	}
	
	@Test
	public void testEqual_false()
	{
		Matrix A = new Matrix(new double[][] {{1,2},{3,4}});
		Matrix C = new Matrix(new double[][] {{5,6},{7,8}});

		assertFalse(A.eq(C));
	}
	
	@Test(expected = RuntimeException.class)
	public void testEqual_withError()
	{
		Matrix A = new Matrix(new double[][] {{1,2},{3,4}});
		Matrix B = new Matrix(new double[][] {{1,2,3},{4,5,6},{7,8,9}});
		
		@SuppressWarnings("unused")
		boolean a = A.eq(B);
	}
	
	@Test
	public void testTimes()
	{
		Matrix A = new Matrix(new double[][] {{1,2,3},{4,5,6}});
		Matrix B = new Matrix(new double[][] {{1,2},{3,4},{5,6}});
		Matrix C = A.times(B);
		
		assertArrayEquals(new double[][] {{22,28},{49,64}}, C.getData());
	}
	
	@Test(expected = RuntimeException.class)
	public void testTimes_withError()
	{
		Matrix A = new Matrix(new double[][] {{1,2,3},{4,5,6}});
		Matrix B = new Matrix(new double[][] {{1,2},{3,4}});
		@SuppressWarnings("unused")
		Matrix C = A.times(B);
	}
	

}
