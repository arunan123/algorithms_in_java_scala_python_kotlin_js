package com.algorithmdb.util;

import com.algorithmdb.intf.AlgorithmConstants;
import com.algorithmdb.algorithms.sorting.QuickSort;
import com.algorithmdb.algorithms.sorting.Sort;

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
 * 
 * @author Arunan Ramanathan
 * @date   20 Jan 2017
 *
 * This class is to find the efficiency of the Algorithms. 
 * Statistics differs based on the underlying Hardware
 */

public class EfficiencyFinder 
implements AlgorithmConstants {
	/**
	 * This method will measure the efficiency of the given sorting algorithm
	 * and prints the result in the stdout.
	 * 
	 * @param algorithm <Algorithm> the sort algorithm object to measure the 
	 * 		  performance
	 * @param time <SortingTime> either a SortingTimeInMilliseconds or 
	 * 		  SortingTimeInNanoSeconds
	 * @param input <Comparable[]> array of comparable objects
	 * @throws Exception 
	 */
	public static void printEfficiencyOfSortingAlgorithm(Sort algorithm,
							SortingTime time, Comparable[] input) throws Exception {
		
		if (algorithm == null || input == null) {
			throw new IllegalArgumentException("NULL algorithm Object or NULL input value!");
		}
		
		long totalTime = time.sortingTime(algorithm, input);
		
		boolean isSorted = SortUtil.isSorted(input);
		if (!isSorted) {
			throw new Exception("Not sorted");
		}
		System.out.println("Time taken to sort " +input.length+ 
									" number of elements : " + totalTime + 
									(time instanceof SortingTimeInMilliSeconds? "MS": "NS"));
	}

	public static void main(String[] args) {
		try {
			EfficiencyFinder.printEfficiencyOfSortingAlgorithm(new QuickSort(),
					new SortingTimeInMilliSeconds(), NumberGenerator.getRandomNumbers(10000));
		} catch (Exception e) {
			e.printStackTrace();
			e.printStackTrace();
		}
	}
}
