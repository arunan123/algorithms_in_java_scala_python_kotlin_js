package com.algorithmdb.math;

/** 
 * Copyright [2017] [Arunan R]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * ----------------------------------------------------------------------
 * A class that represents a matrix of MxN size. Has some methods
 * for calculating basic matrix problems.
 * ----------------------------------------------------------------------
 * 
 * @author Cody Long
 * @date Dec 1 2010
 */

public class Matrix {
	private final int N;
	private final int M;
	private final double[][] data;
	
	/** 
	 * 
	 * Makes matrix of size MxN filled with zeros.
	 * 
	 * @param M <int>
	 * @param N <int>
	 */
	public Matrix(int M, int N)
	{
		this.M = M;
		this.N = N;
		data = new double[M][N];
	}
	
	/**
	 * 
	 * Make matrix from 2d array.
	 * 
	 * @param data <double[][]>
	 */
	public Matrix(double[][] data)
	{
		M = data.length;
		N = data[0].length;
		this.data = new double[M][N];
		for(int i = 0; i < M; i++)
		{
			for(int j = 0; j < N; j++)
			{
				this.data[i][j] = data[i][j];
			}
		}
	}
	
	/**
	 * 
	 * Makes a matrix of size MxN filled 
	 * with random 1's and 0's
	 * 
	 * @param M <int>
	 * @param N <int>
	 * 
	 * @return A <Matrix>
	 */
	public static Matrix random(int M, int N)
	{
		Matrix A = new Matrix(M, N);
		for(int i = 0; i < A.M; i++)
		{
			for(int j = 0; j < A.N; j++){
				
				A.data[i][j] = Math.random();
			}
		}
		return A;
	}
	
	/**
	 * 
	 * Returns the 2D array that makes the matrix.
	 * 
	 * @return data <double[][]>
	 */
	public double[][] getData()
	{
		return data;
	}
	
	/**
	 * 
	 * Returns and Identity matrix of size NxN.
	 * 
	 * @param N <int>
	 * 
	 * @return A <Matrix>
	 */
	public static Matrix identity(int N)
	{
		Matrix A = new Matrix(N, N);
		for(int i = 0; i < A.N; i++)
		{
			A.data[i][i] = 1;
		}
		return A;
	}
	
	/**
	 * 
	 * Swaps rows i and j in the matrix.
	 * 
	 * @param i <int>
	 * @param j <int>
	 */
	public void swap(int i, int j){
		double[] temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	
	/**
	 * 
	 * Return a transposed Matrix.
	 * 
	 * @return A <Matrix>
	 */
	public Matrix transpose()
	{
		Matrix A = new Matrix(this.N, this.M);
		for(int i = 0; i < this.M; i++){
			for(int j = 0; j < this.N; j++){
				A.data[j][i] = this.data[i][j];
			}
		}
		return A;
	}
	
	/**
	 * 
	 * Adds Matrix B to Matrix A. Returns Matrix C.
	 * 
	 * @param B <Matrix>
	 * 
	 * @return C <Matrix>
	 */
	public Matrix plus(Matrix B)
	{
		if(this.M != B.N || this.N != B.M) throw new RuntimeException("Martices not the same size!");
		Matrix C = new Matrix(this.M, this.N);
		for(int i = 0; i < C.M; i++)
		{
			for(int j = 0; j < C.N; j++)
			{
				C.data[i][j] = this.data[i][j] + B.data[i][j];
			}
		}
		return C;
	}
	
	/**
	 * 
	 * Subtracts Matrix B from Matrix A. Returns Matrix C.
	 * 
	 * @param B <Matrix>
	 * 
	 * @return C <Matrix>
	 */
	public Matrix minus(Matrix B)
	{
		if(this.M != B.N || this.N != B.M) throw new RuntimeException("Martices not the same size!");
		Matrix C = new Matrix(this.M, this.N);
		for(int i = 0; i < C.M; i++)
		{
			for(int j = 0; j < C.N; j++)
			{
				C.data[i][j] = this.data[i][j] - B.data[i][j];
			}
		}
		return C;
	}
	
	/**
	 * 
	 * Multiplies Matrix A by Matrix B. Returns Matrix C.
	 * 
	 * @param B <Matrix>
	 * 
	 * @return C <Matrix>
	 */
	public Matrix times(Matrix B)
	{
		if (this.N != B.M) throw new RuntimeException("Illegal matrix dimensions.");
        Matrix C = new Matrix(this.M, B.N);
        for (int i = 0; i < C.M; i++)
            for (int j = 0; j < C.N; j++)
                for (int k = 0; k < this.N; k++)
                    C.data[i][j] += (this.data[i][k] * B.data[k][j]);
        return C;
	}
	
	/**
	 * 
	 * Chacks to see if Matrix B is equal to Matrix A.
	 * 
	 * @param B <Matrix>
	 * 
	 * @return boolean
	 */
	public boolean eq(Matrix B)
	{
		if(this.M != B.N || this.N != B.M) throw new RuntimeException("Martices not the same size!");
		for(int i = 0; i < this.M; i++)
		{
			for(int j = 0; j < this.N; j++)
			{
				if(this.data[i][j] != B.data[i][j]) return false;
			}
		}
		return true;
	}
	
	/**
	 * Displays Matrix in console.	
	 */
	public void display(){
		for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) 
                System.out.printf("%9.4f ", data[i][j]);
            System.out.println();
		}
	}
}
