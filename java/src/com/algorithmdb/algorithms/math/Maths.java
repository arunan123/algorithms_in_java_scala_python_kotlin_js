package com.algorithmdb.algorithms.math;

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
 * A class that contains basic mathematical operations
 *
 * @author Arunan Ramanathan
 * @date May 30 2017
 */
public class Maths {

    /**
     * Method to find whether the given number is Prime or Not!
     *
     * @param number to find out Prime or Not
     * @return boolean, true if Prime, false if Not a Prime.
     */
    public static boolean isPrime(long number) {
        long half = number/2;
        for (long i=2; i<=half; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
