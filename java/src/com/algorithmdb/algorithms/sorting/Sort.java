package com.algorithmdb.algorithms.sorting;

import com.algorithmdb.algorithms.intf.Algorithm;


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
 * ------------------------------------------------------------------------
 * An Abstract class where all sorting algorithms inherits this 
 * class. It also contains few utility methods which are commonly
 * used by sorting algorithms.
 * ------------------------------------------------------------------------
 *
 * @author Arunan R
 * @date   19 Nov 2010
 */
public abstract class Sort<T extends Comparable> 
implements Algorithm {
	/** 
	 * This method will sort the integers in the given Array
	 * 
	 * @param input <T[]>
	 * @return result <T[]>
	 */
	public abstract void sort(T[] input);

	public static boolean less (Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}

	public static void exch(Comparable[] array, int i, int j) {
		Comparable temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	/**
	 * This method is to swap two int variables in a given Array
	 * 
	 * @param indexA <int> From index
	 * @param indexB <int> To index
	 * @param input <int[]> Array contains the elements
	 */
	public void swap(int indexA, int indexB, int[] input) {
		input[indexA] ^= input[indexB];
		input[indexB] ^= input[indexA];
		input[indexA] ^= input[indexB];
	}
	
	/**
	 * This method is to swap two String variables in a given Array
	 * 
	 * @param indexA <int> From index
	 * @param indexB <int> To index
	 * @param input <Object[]> Array contains the elements
	 */
	public void swap(int indexA, int indexB, Object[] input) {
		Object temp = input[indexA];
		input[indexA] = input[indexB];
		input[indexB] = temp;
	}
	
	/**
	 * This method will remove the null values in the given String Object Array
	 * 
	 * @param array <String[]>
	 * @return result <String[]>
	 */
	public String[] removeNullValuesInArray(String[] array) {
		int count = 0;
		for (String element : array) {
			if (element != null) {
				count = count + 1;
			}
		}
		String[] result = new String[count];
		int i = 0;
		for (String element : array) {
			if (element != null) {
				result[i] = element;
				i = i + 1;
			}
		}
		return result;
	}
	
	/**
	 * This method will remove the first index in the given int array
	 * 
	 * @param array <int[]>
	 * @return result <int[]>
	 */
	public int[] removeFirstElement(int[] array) {
		int[] result = new int[array.length - 1];
		int count = 0;
		for (int i=0; i<array.length; i++) {
			if (i==0) {
				continue;
			}
			result[count++] = array[i];
		}
		return result;
	}
	
	/**
	 * This method will remove the first index in the given String array
	 * 
	 * @param array <String[]>
	 * @return result <String[]>
	 */
	public String[] removeFirstElement(String[] array) {
		String[] result = new String[array.length - 1];
		int count = 0;
		for (int i=0; i<array.length; i++) {
			if (i==0) {
				continue;
			}
			result[count++] = array[i];
		}
		return result;
	}
}
