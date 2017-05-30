package com.algorithmdb.algorithms.sorting;

import com.algorithmdb.util.StdRandom;

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
 *    10000 Random no                      |    14MS                 |  11815701NS
 *    ---------------------------------------------------------------------------------------
 *    
 * @author Arunan R
 * @date   20 Nov, 2010
 * 
 */

public class QuickSort<T extends Comparable>
extends Sort<T> {

	@Override
	public void sort(Comparable[] input) {
        StdRandom.shuffle(input);
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
	        while (less(a[++i], v)) {
                if (i == hi) break;
            }

            while (less(v, a[--j])) {
                if (j == lo) break;
            }

            if(i >= j) break;

            exch(a, i, j);
        }
        exch(a, lo, j);
	    return j;
    }
}

