package org.algorithmdb.algorithms.searching;


import org.algorithmdb.intf.Algorithm;

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
 * Algorithm Definition:
 * This algorithm function only in arrays sorted. It find a number with
 * successive divisions by 2 in other words divide the size of array by
 * half. Your performance can be displayed by function
 * f(x)=(sizeOfArray/2)^x
 * 
 * Example:
 * 
 *      number to find: 6 |Sequence:0-1-2-3-4-5-6-7-8-9-10
 *       										|
 *       										| 
 *       										6-7-8-9-10 
 *       										| 
 *       									   |6|-7
 * 
 * 
 * Performance Review :
 * This implementation has tested with the following datas
 * Input                                         |    Average Time taken in Milliseconds |  Average Time taken in Nanoseconds
 * -----------------------------------------------------------------------------------------------------------------------
 * Sequence numbers from 1 to 10000(find :1)     |    0 ms                               |  1988242 ns
 * Sequence numbers from 1 to 10000(find :5000)  |    0 ms                               |  1935441 ns
 * Sequence numbers from 1 to 10000(find :9999)  |    0 ms                               |  2108089 ns
 *   
 * @author Ivan Rodrigues
 * @date 26-Nov-2010
 */
public class BinarySearch
implements Algorithm {

	/**
	 * @param input int[]
	 * @param key int
	 * @return index of the key, if found or -1 if not found
	 */
	public static int rank(int key, int[] input) {
	    return rank(key, input, 0, input.length-1);
    }

    private static int rank(int key, int[] input, int lo, int hi) {
	    if (lo > hi) return -1;

	    int mid = lo + (hi-lo)/2;

	    if (key < input[mid]) return rank(key, input, lo,mid-1);
	    else if (key > input[mid]) return rank(key, input, mid+1, hi);
	    else return mid;
    }

    /*
    public static void main(String...args) {
	    int[] input = {1,3,5,11,15,16,17,18,19,20,26,29,30,32};
	    int keyfound = rank(10,input);

	    if (keyfound == -1) {
	        System.out.println("Key not found");
        } else {
	        System.out.println(input[keyfound] + " is found");
        }
    }
    */
}