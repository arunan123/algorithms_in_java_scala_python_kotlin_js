package com.algorithmdb.algorithms.sorting;

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
 * Algorithm :
 * Bubble Sort is a simple sorting algorithm, which will steep through a list 
 * of elements and compares two elements and swaps them if they are not in order,
 * until no further swaps needed.
 * 
 * NOTE : Bubble sort is Practically not in use for large scale sorting because of its time complexity.
 *        [This Algorithm can be effectively used to find whether a list is ALREADY SORTED or NOT] 
 * 
 * Performance Review :
 * O(N) Performance
 * 
 * This implementation has tested with the following datas
 *    Input                                       |    Average Time taken in Milliseconds |  Average Time taken in Nanoseconds
 *    -----------------------------------------------------------------------------------------------------------------------
 *    Sorted list from 1 to 10000                 |    1MS                                |  1258359NS
 *    Reverse sequence numbers from 10000 to 1    |    353MS                              |  338455804NS
 *    10000 Random numbers                        |    453MS                              |  431879431NS
 *    
 * @author Arunan R
 * @date   Nov 19 2010
 */
public class BubbleSort<T extends Comparable>
extends Sort<T> {

	@SuppressWarnings("unchecked")
	@Override
	public void sort(T[] input) {
		// To determine whether a swap happened or not!
		boolean isSwapped = false;
		int count = 1;
		do {
			// Reset the flag for each and every iteration
			isSwapped = false;
			// Count is introduced to optimize the performance.Once an iteration went
			// fine then we can conclude that the last value will be greater then other 
			// values. So in the next iteration we can eliminate verifying the last 
			// element.
			for (int i=0; i< input.length-count; i++) {
				if (i == input.length) {
					break;
				}
				if (input[i].compareTo((T) input[i+1]) > 0) {
					swap(i, i+1, input);
					isSwapped = true;
				}
			}
			count++;
		} while (isSwapped);
	}
}
