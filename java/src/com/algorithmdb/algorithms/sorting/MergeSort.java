package com.algorithmdb.algorithms.sorting;
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
 * -------------------------------------------------------------------------------------
 * Algorithm Definition:
 * Merge sort is an sorting algorithm, which RECURSIVELY divides the list of 
 * elements into TWO sublists and finally merge the list of elements in the sublists, 
 * by ordering those elements.
 * 
 * Implementation:
 * This Implementation uses an Auxiliary array and solves by Abstract In-place Methodology.
 * This Implementation takes memory proportional to the number of elements.
 * Average time complexity is N(LOG N) for sorting the given list. 
 * 
 * Performance Review :
 * This implementation has tested with the following datas 
 *    Input                                |    Avg Time taken in MS |  Avg Time taken in NS
 *    ---------------------------------------------------------------------------------------
 *    Sequence no from 1 to 10000          |    8MS                  |  9730035NS
 *    Reverse sequence no from 10000 to 1  |    9MS                  |  8458366NS
 *    10000 Random no                      |    11MS                 |  12509893NS
 *    ---------------------------------------------------------------------------------------
 *    
 * @author Arunan
 * @date   21 Nov,2010
 */
@SuppressWarnings("unchecked")
public class MergeSort<T extends Comparable> 
extends Sort<T>{

	T[] aux;
	
	@Override
	public void sort(T[] a) {
		aux = (T[]) new Comparable[a.length];
		sort(a, 0, a.length-1);
	}

	private void sort(T[] a, int lo, int hi) {
		if (hi <= lo) return;
		
		int mid = lo + (hi-lo)/2;
		sort(a, lo, mid);
		sort(a, mid+1, hi);
		merge(a, lo, mid, hi);
	}
	
	private void merge(T[] a, int lo, int mid, int hi) {
		int i = lo;
		int j = mid+1;
		
		for (int k=lo; k<=hi; k++) {
			aux[k] = a[k];
		}

		for (int k=lo; k<=hi; k++) {
			if (i > mid) a[k] = aux[j++];
			else if (j > hi) a[k] = aux[i++];
			else if (less(aux[j], aux[i])) a[k] = aux[j++];
			else a[k] = aux[i++];
		}
	}
}