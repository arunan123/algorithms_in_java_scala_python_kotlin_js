package com.algorithmdb.algorithms.searching;

import com.algorithmdb.algorithms.intf.Algorithm;

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
 * An Abstract class where all searching algorithms inherits this 
 * class. It also contains few utility methods which are commonly
 * used by saerching algorithms.
 * 
 * @author Arunan R
 * @date   01 Dec 2010
 */
public abstract class Search 
implements Algorithm {
	/**
	 * This method will search the given number in the list of array.
	 * 
	 * @param numbers <int[]>
	 * @param numberToSearch <int>
	 * @return result <boolean> true if found, false if not found
	 */
	public abstract boolean searchNumber(int[] numbers, int numberToSearch);
}
