package org.algorithmdb.algorithms.sorting;

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
 * --------------------------------------------------------------------------------------
 * 
 * 
 * Performance Review :
 * Average Time complexity of this Implementation is O(N^2)
 * 
 * This implementation has tested with the following datas
 *    Input                                |    Avg Time taken in MS |  Avg Time taken in NS
 *    ---------------------------------------------------------------------------------------
 *    Sequence no from 1 to 10000          |    67MS                 |  66037555NS
 *    Reverse sequence no from 10000 to 1  |    102MS                |  98701583NS
 *    10000 Random no                      |    124MS                |  173942971NS
 *    ---------------------------------------------------------------------------------------
 * 
 * @author Arunan R
 * @date Jan 20 2017
 */

public class SelectionSort<T extends Comparable> 
extends Sort<T> {

	public void sort (T[] array) {
		int N = array.length;
		for (int i=0; i<N; i++) {
			int min = i;
			for (int j = i+1; j<N; j++) {
				if (less(array[j], array[min])) 
					min = j;
			}
			exch(array, i, min);
		}
	}
}
