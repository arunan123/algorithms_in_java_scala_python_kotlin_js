package com.algorithmdb.algorithms.searching;


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
 * This algorithm function only in arrays sorted. It find a number with
 * successive divisions by 2 in other words divide the size of array by
 * half. Your performance can be displayed by function
 * f(x)=(sizeOfArray/2)^x
 * 
 * Example:
 * 
 *       Wished number: 6 Sequence: 0-1-2-3-4-5-6-7-8-9-10 
 *       										|
 *       										| 
 *       										6-7-8-9-10 
 *       										| 
 *       									   |6|-7
 * 
 * 
 * Performance Review :
 * This implementation has tested with the following datas
 * Input                                         |    Average Time taken in Milliseconds |  Average Time taken in Nanoseconds
 * -----------------------------------------------------------------------------------------------------------------------
 * Sequence numbers from 1 to 10000(find :1)     |    0 ms                               |  1988242 ns
 * Sequence numbers from 1 to 10000(find :5000)  |    0 ms                               |  1935441 ns
 * Sequence numbers from 1 to 10000(find :9999)  |    0 ms                               |  2108089 ns
 *   
 * @author Ivan Rodrigues
 * @date 26-Nov-2010
 */
public class BinarySearch 
extends Search {

	/**
	 * @param numbers<int[]>
	 * @param number<int>
	 * @return callback <boolean>
	 */
	@Override
	public boolean searchNumber(int[] numbers, int number) {
		boolean callback = false;

		if (number > numbers[numbers.length - 1] || number < numbers[0])
			return false;

		// Verify if the number is equals zero
		int pivot = numbers.length % 2 != 0 ? numbers.length / 2 : numbers.length / 2 - 1;

		if (numbers[pivot] == number)
			return true;

		if (number < numbers[pivot])
			numbers = this.getNumbers(numbers, pivot,true);
		else
			numbers = this.getNumbers(numbers, pivot,false);
		// if the number not find then do call recursive
		if (!callback)
			callback = searchNumber(numbers, number);

		return callback;
	}
	
	
	/**
	 * Return a new array of int without numbers that was cut by binary search.
	 * If order it's true cut the array of position 0 to pivot -1. If false
	 * cut the array of position pivot + 1 to numbers.length -1 
	 * 
	 * @param numbers<int[]>
	 * @param pivot<int>
	 * @param cut <boolean> 
	 * 
	 * @return callback<int[]>
	 */
	private int[] getNumbers(int[] numbers, int pivot, boolean cut){
		int[] callback = null;
		if(cut){
			callback = new int[pivot];
			for(int i = 0; i < callback.length; i++){
				callback[i] = numbers[i];
			}
		}
		else{
			callback = new int[(numbers.length -1) - pivot];
			for(int i = 0; i < callback.length; i++){
				callback[i] = numbers[pivot++ + 1];
			}
		}
		return callback;
	}
}