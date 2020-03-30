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
 * @author Arunan R
 * @since   May 28, 2017
 *
 */
public class Fibonacci {

    /**
     * If we give a number N, it will compute the Fibonacci numbers
     * from 0 to N and store it in an array and return back the array.
     *
     * @param N until which number to calculate Fibonacci
     * @return Array of Fibonacci numbers
     */
    public static Long[] fibonacci(int N) {
        Long[] values = new Long[N+1];
        values[0] = 0L;
        values[1] = 1L;
        for (int i=2; i<=N; i++) {
            values[i] = values[i-1] + values[i-2];
        }
        return values;
    }

    public static void main(String...args) {
        int until=50;
        Long[] result = fibonacci(until);
        for (int i=0; i<=until; i++) {
            System.out.println(i+ " " + result[i]);
        }
    }
}
