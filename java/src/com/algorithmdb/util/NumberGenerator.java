package com.algorithmdb.util;
/**
 * Copyright [2017] [Arunan Ramanathan]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * --------------------------------------------------------------------
 * This class is to generate different types of inputs to 
 * test the algorithms
 * --------------------------------------------------------------------
 * 
 * @author Arunan R
 * @date   22 November 2010
 */
public class NumberGenerator {
	/**
	 * This method will return an array of size N and values in a 
	 * sequence from 0...N
	 * 
	 * @param length <int>
	 * @return array <int[]>
	 */
	public static Integer[] getSequenceNumbers(int length) {
		Integer[] array = new Integer[length];
		for (int i=0 ; i<length; i++) {
			array[i] = i;
		}
		return array;
	}
	
	/**
	 * This method will return an array of size N and values in a 
	 * sequence from N...M
	 * 
	 * @param initial <int>
	 * @param finish <int>
	 * @return array <int[]>
	 */
	public static Integer[] getSequenceNumbers(int initial, int finish) {
		Integer[] array = new Integer[(finish+1) - initial];
		for(int i = 0; i < array.length;i++){
			array[i] = initial++;
		}
		return array;
	}
	
	/**
	 * This method will return an array of size N and values in  
	 * reverse sequence from N...0
	 * 
	 * @param length <int>
	 * @return array <int[]>
	 */
	public static Integer[] getReverseSequenceNumbers(int length) {
		Integer[] array = new Integer[length];
		int temp = length;
		for (int i=0 ; i<length; i++) {
			array[i] = temp-1;
			temp--;
		}
		return array;
	}

	/**
	 * This method will return an array of size N and values in  
	 * Random order.
	 * 
	 * @param length <int>
	 * @return array <int[]>
	 */
	public static Integer[] getRandomNumbers(int length) {
		Integer[] array = new Integer[length];
		for (int i=0 ; i<length; i++) {
			array[i] = (int) (Math.random() * 1000000);
		}
		return array;
	}
}
