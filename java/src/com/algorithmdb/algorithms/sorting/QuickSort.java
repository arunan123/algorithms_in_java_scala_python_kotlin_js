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
 * ------------------------------------------------------------------------------
 * Algorithm Definition:
 * Quicksort is a sorting Algorithm which will divide an array of elements into two 
 * by choosing an element called pivot; adds the elements less than pivot in one list 
 * and adds the elements greater than pivot on another list;recursively sort the sublist
 * contains the lesser elements and the sublist contains the greater elements will 
 * finally generates a sorted list. 
 *
 * Performance Review :
 * This implementation has tested with the following datas 
 *    Input                                |    Avg Time taken in MS |  Avg Time taken in NS
 *    ---------------------------------------------------------------------------------------
 *    Sequence no from 1 to 10000          |    147 ms               |  153739672 ns
 *    Reverse sequence no from 10000 to 1  |    207 ms               |  186500402 ns
 *    10000 Random no                      |    165 ms               |  156548382 ns
 *    ---------------------------------------------------------------------------------------
 *    
 * @author Arunan R
 * @date   20 Nov, 2010
 * 
 */

@SuppressWarnings("unchecked")
public class QuickSort<T extends Comparable>
extends Sort<T> {

	@Override
	public void sort(Comparable[] input) {
		sort(input, 0, input.length-1);
	}

	private void sort(Comparable[] a, int lo, int hi) {
	    if (hi <= lo) return;
	    int j = partition(a, lo, hi);
	    sort(a, lo, j-1);
	    sort(a, j+1, hi);
    }

    private int partition(Comparable[] a, int lo, int hi) {
	    int i=lo;
	    int j=hi + 1;
	    Comparable v = a[lo];

	    while(true) {
	        while (less(a[++i], v)) if (i == hi) break;
            while (less(v, a[--j])) if (j == lo) break;
            if(i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
	    return j;
    }
}

