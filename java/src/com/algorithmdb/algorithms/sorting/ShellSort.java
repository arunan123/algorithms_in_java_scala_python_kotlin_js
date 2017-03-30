package com.algorithmdb.algorithms.sorting;

/**
 * 
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
 * -------------------------------------------------------------------------------------------
 * Algorithm Definition :
 * Shell sort is a modified version of Insertion sort. Insertion sort performs well 
 * when the elements are partially sorted. Shell sort's objective is to partially 
 * sort the given elements, filling the gaps in other words.Compares the elements 
 * in the given radix gap and apply insertion sort on that. 
 * 
 * 
 * 
 * This implementation has tested with the following datas
 *    Input                                |    Avg Time taken in MS |  Avg Time taken in NS
 *    ---------------------------------------------------------------------------------------
 *    Sequence no from 1 to 10000          |    5MS                  |  5150009NS
 *    Reverse sequence no from 10000 to 1  |    8MS                  |  7631420NS
 *    10000 Random no                      |    13MS                 |  15924991NS
 *    
 * -----------------------------------------------------------------------------------------
 * 
 * @author Arunan R
 * @date March 16 2013
 */

public class ShellSort<T extends Comparable>
extends Sort<T> {

	@Override
	public void sort(T[] elements) {

		int N = elements.length;
		int h=1;

		while (h < N/3)
			h = 3*h +1;

		while (h >= 1) {
			for (int i=h; i< N; i++) {
				for (int j=i; j>=h && less(elements[j], elements[j-h]); j -= h) 
					exch(elements, j, j-h);
			}
			h = h/3;
		}
	}
}
