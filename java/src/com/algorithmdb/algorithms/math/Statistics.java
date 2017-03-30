package com.algorithmdb.algorithms.math;

import java.util.ArrayList;

import com.algorithmdb.algorithms.intf.MathAlgorithm;


/**
 * Copyright [2010] [Arunan R]
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
 * Algorithm Definition:
 * An Abstract class that holds algorithms for various statistical operations.
 * 
 * @author Cody Long
 * @date Dec 16 2010
 */


public abstract class Statistics implements MathAlgorithm{
	
	/**
	 * 
	 * Calculates and returns the Standard deviation of a set of numbers. 
	 * 
	 * Uses arrays.
	 * 
	 * @param a <int[]>
	 * @return <int>
	 */
	public static double standardDeviation(int[] a)
	{
		double sum = 0;
		double mean;
		double[] deviations = new double[a.length];
		double[] deviationsSquared = new double[a.length];
		double sumDeviations = 0;
		double finalDeviation;
		
		for(int i =0; i < a.length; i++)
		{
			sum += a[i];
		}
		mean = sum / a.length;
		
		for(int i = 0; i < a.length; i++)
		{
			deviations[i] = a[i] - mean;
		}
		for(int i = 0; i < a.length; i++)
		{
			deviationsSquared[i] = Math.pow(deviations[i], 2);
		}
		for(int i = 0; i < a.length; i++)
		{
			sumDeviations += deviationsSquared[i];
		}
		finalDeviation = Math.sqrt(sumDeviations / (a.length - 1));
			
		return finalDeviation;
	}
	
	
	/**
	 * 
	 * Calculates and returns the Standard deviation of a set of numbers. 
	 * 
	 * uses ArrayLists
	 * 
	 * @param a <ArrayList<Integer>>
	 * @return
	 */
	public static double standardDeviation(ArrayList<Integer> a)
	{
		double sum = 0;
		double mean;
		ArrayList<Double> deviations = new ArrayList<Double>(a.size());
		ArrayList<Double> deviationsSquared = new ArrayList<Double>(a.size());
		double sumDeviations = 0;
		double finalDeviation;
		
		for(int i =0; i < a.size(); i++)
		{
			sum += a.get(i);
		}
		mean = sum / a.size();
		
		for(int i = 0; i < a.size(); i++)
		{
			deviations.add(a.get(i) - mean);
		}
		for(int i = 0; i < a.size(); i++)
		{
			deviationsSquared.add(Math.pow(deviations.get(i), 2));
		}
		for(int i = 0; i < a.size(); i++)
		{
			sumDeviations += deviationsSquared.get(i);
		}
		finalDeviation = Math.sqrt(sumDeviations / (a.size() - 1));
		
		return finalDeviation;
		
	}

}
