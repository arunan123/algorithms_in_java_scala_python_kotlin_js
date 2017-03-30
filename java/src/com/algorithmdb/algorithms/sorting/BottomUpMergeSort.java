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
 * -----------------------------------------------------------------
 * This is a Non-Recursive Merge sort algorithm
 * -----------------------------------------------------------------
 * 
 * @author Arunan R
 * @date   March 17 2013
 */

public class BottomUpMergeSort<T extends Comparable>
extends Sort<T> {

	T[] aux;

	@Override
	public void sort(T[] a) {
		int N = a.length;
		aux = (T[]) new Comparable[N];
		for (int sz = 1; sz < N; sz = sz+sz)
			for (int lo = 0; lo < N-sz; lo += sz+sz)
				merge(a, lo, lo+sz-1, Math.min(lo+sz+sz-1, N-1));
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
