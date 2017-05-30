package com.algorithmdb.algorithms.math;

import com.algorithmdb.intf.MathAlgorithm;

import static java.lang.Math.*;

import com.algorithmdb.util.math.exceptions.ImaginaryNumberException;

/**
 *
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
 * Algorithm Definition:
 * A class that contains algorithms 
 * to calculate algebraic equations.
 * 
 * @author Cody Long
 * @date Dec 18 2010
 */

public class Algebra 
implements MathAlgorithm{
	
	/**
	 * Implementation of Euclid algorithm to 
	 * find the greatest common divisor
	 * 
	 * @param p
	 * @param q
	 * @return y <int>
	 */
	public static int gcd(int p, int q) {
		if (q==0) return p;

		int r = p % q;
		return gcd(q, r);
	}
	
	/**
	 * Implementation of Extended Euclid algorithm.
	 * Returns int[] {d, a, b}: 
	 * where x(a) + y(b) = d
	 * 
	 * @param x
	 * @param y
	 * @return <int[]>
	 */
	public static int[] extended_greatestCommonDivisor(int x, int y)
	{
		      if (y == 0)
		         return new int[] { x, 1, 0 };

		      int[] vals = extended_greatestCommonDivisor(y, x % y);
		      int d = vals[0];
		      int a = vals[2];
		      int b = vals[1] - (x / y) * vals[2];
		      return new int[] { d, a, b };
	}

	/**
	 * 
	 * Calculates the quadratic equation.
	 * 
	 * @param a <double>
	 * @param b <double>
	 * @param c <double>
	 * 
	 * @return <double[]>
	 * 
	 * @throws ImaginaryNumberException
	 */
	public static double[] quadEq(double a, double b, double c) 
	throws ImaginaryNumberException{
		
		double discrement, root1, root2;
		
		discrement = sqrt(pow(b,2) - (4*a*c));
		
		if(discrement > 0)
		{
			root1 = ((-b + discrement)/(2*a));
			root2 = ((-b - discrement)/(2*a));
			return new double[] {root1,root2};
		}
		else if(discrement < 0)
		{
			throw new ImaginaryNumberException();
		}
		else if(discrement == 0)
		{
			root1 = ((-b + discrement)/(2*a));
			return new double[] {root1, root1};
		}
		
		return null;
	}
	
}
