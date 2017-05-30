package com.algorithmdb.educational;

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
 * -------------------------------------------------------------------------------------
 * Algorithm Definition : XOR swap algorithm is used to swap two variables 
 *                        without using a buffer
 * 
 * Practical usage,
 *   -> Used in MicroControllers where RAM is very limited
 *   -> In a region with high register pressure, it may allow the register allocator to 
 *      avoid spilling a register.
 * -------------------------------------------------------------------------------------
 * 
 * @author Arunan R
 * @date   Nov 17,2010
 */
public class XORSwapAlgorithm {
	
	public void swap(int variable1, int variable2) {
		variable1 ^= variable2;
		variable2 ^= variable1;
		variable1 ^= variable2;
	}
}
