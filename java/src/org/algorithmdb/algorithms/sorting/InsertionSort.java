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
 * Algorithm Definition :
 * Insersion sort is a comparison sort, which will take an element and 
 * insert in an appropriate position i,e taking an element X at index n and 
 * comparing the other elements at indexes n-1,n-2.... until it found a place 
 * where X < X[SomeIndexLessThanN]
 * 
 * 
 * Performance Review :
 * Average Time complexity of this Implementation is O(N^2)
 * 
 * This implementation has tested with the following datas
 *    Input                                |    Avg Time taken in MS |  Avg Time taken in NS
 *    ---------------------------------------------------------------------------------------
 *    Sequence no from 1 to 10000          |    81MS                 |  90816223NS
 *    Reverse sequence no from 10000 to 1  |    249MS                |  260549525NS
 *    10000 Random no                      |    220MS                |  226475347NS
 *    ---------------------------------------------------------------------------------------
 * 
 * @author Arunan R
 * @date Nov 20 2010
 */
public class InsertionSort<T extends Comparable> 
extends Sort<T> {

	@Override
	public void sort(T[] input) {
		int N = input.length;
		for (int i=1; i<N; i++) {
			for (int j=i; j>0; j--) {
				if (less(input[j], input[j-1]))
					exch(input, j , j-1);
			}
		}
	}
}
