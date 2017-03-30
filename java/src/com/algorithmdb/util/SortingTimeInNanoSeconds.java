package com.algorithmdb.util;

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
 * --------------------------------------------------------------------
 * Implementation of <SortingTime> for Nanoseconds
 * --------------------------------------------------------------------
 * 
 * @author Arunan R
 * @date   20 January 2017
 */

import com.algorithmdb.algorithms.sorting.Sort;

public class SortingTimeInNanoSeconds 
implements SortingTime {

	@Override
	public long sortingTime(Sort algorithm, Comparable[] input) {
		long totalTime = 0;
		long startTime = System.nanoTime();
		((Sort)algorithm).sort(input);
		long endTime = System.nanoTime();
		totalTime = endTime - startTime;
		return totalTime;
	}
}
