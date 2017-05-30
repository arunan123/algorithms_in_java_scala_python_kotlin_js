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
 * @date   May 28, 2017
 *
 */
public class Fibonacci {

    /* Recursive way of solving the Fibonacci, but inefficient.
    public static long F(int N) {
        if (N==0) return 0;
        if (N==1) return 1;
        return F(N-1) + F(N-2);
    }
    public static void main(String[] args) {
        for (int N=0; N<100; N++) {
            System.out.println(N + " " + F(N));
        }
    }
    */

    /**
     * If we give a number N, it will compute the Fibonacci numbers
     * from 0 to N and store it in an array and return back the array.
     *
     * @param N
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
