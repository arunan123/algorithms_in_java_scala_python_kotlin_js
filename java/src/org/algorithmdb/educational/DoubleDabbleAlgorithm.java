package org.algorithmdb.educational;

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
 * -----------------------------------------------------------------------------------
 * Note : This is NOT a REUSABLE class. 
 *        This can be used for EDUCATIONAL purpose.
 * 
 * Algorithm Definition : Double Dabble Algorithm is used to convert 
 *                        a binary into decimal.
 * 
 * This class implementation contains two 'binary to decimal' conversion techniques. 
 * One is Normal conversion and another one is double dabble conversion technique.
 * ----------------------------------------------------------------------------------
 * 
 * @author Arunan R
 * @date   Nov 19, 2010
 */
public class DoubleDabbleAlgorithm {
	
	/**
	 * This method converts binary into decimal in the following normal way,
	 *            1 0 0 1
	 *            | | | |_ 1 * (2 pow 0) = 1
	 *            | | |___ 0 * (2 pow 1) = 0
	 *            | |_____ 0 * (2 pow 2) = 0      
	 *            |_______ 1 * (2 pow 3) = 8
	 *                                    ----
	 *                                     9
	 *                                    ----    
	 * 
	 * @param binary binary number
	 * @return <int>
	 */
	public int convertBinaryIntoDecimal(String binary) {
		if (binary == null || binary.length() == 0) {
			System.out.println("Enter valid binary number");
			return 0;
		}
		char[] binaryArray = binary.toCharArray();
		int result = 0, temp = 0;

		for (int i=binaryArray.length-1; i >= 0; i--) {
			result +=  Integer.parseInt(binaryArray[i]+"") * pow(2,temp); 
			temp++;
		}
		return result;
	}
	
	/**
	 * Yet to implement :-)
	 * 
	 * @param binary <String>
	 * @return result <int>
	 */
	public int doubleDabbleConversion(String binary) {
		return 0;
	}
	/**
	 * This method is used to find the power of two positive integers
	 * 
	 * @param  a,b two integers
	 * @return
	 */
	public int pow(int a, int b) {
		if (a < 0 || b < 0) {
			System.out.println(" Negative values cannot be taken as input");
			return 0;
		}
		// Anything to the power of 0 is 1
		if (b == 0) { 
			return 1;
		}
		// Anything multiplied by zero is zero
		if (a == 0) {
			return 0;
		}
		int temp = a;
		// Multiply a for b times
		for (int i=1; i<b; i++) {
			a *= temp;
		}
		return a;
	}
}
