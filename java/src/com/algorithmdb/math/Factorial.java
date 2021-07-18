package com.algorithmdb.math;


import java.math.BigInteger;
/**
 * Copyright [2021] [Arunan R]
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
 * -----------------------------------------------------------------------------------
 *
 * Algorithm Definition : Find factorial for a given number, used BigInteger to calculate
 *                        factorial for huge numbers. If we use integer or long then the
 *                        result is going to be ZERO because of the overflow.
 *                        Three methods are implemented in this class,
 *                        1. Iterative way of finding out the factorial
 *                        2. Recursive way of finding out the factorial
 *                        3. Find out how many trailing zeros in the result of the factorial
 * ----------------------------------------------------------------------------------
 *
 * @author Arunan R
 * @since  July 18, 2021
 */
public class Factorial {
    public BigInteger iterativeFactorial(int number){
        if (number == 0 || number == 1) return BigInteger.ONE;
        BigInteger total = BigInteger.ONE;
        for(int i=number; i>=1; i--){
            total = total.multiply(BigInteger.valueOf(i));
        }
        return total;
    }

    public BigInteger recursiveFactorial(BigInteger number) {
        if (number.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return number.multiply(recursiveFactorial(number.subtract(BigInteger.ONE)));
    }

    public int countTrailingZeros(int number) {
        BigInteger result = iterativeFactorial(number);
        int numberOfZeros = 0;
        while (result.mod(BigInteger.valueOf(10)).equals(BigInteger.ZERO)) {
            numberOfZeros++;
            result = result.divide(BigInteger.valueOf(10));
        }
        return numberOfZeros;
    }

    public static void main(String[] args) {
        System.out.println(new Factorial().recursiveFactorial(BigInteger.valueOf(4)));
        System.out.println(new Factorial().recursiveFactorial(BigInteger.valueOf(5)));
        System.out.println(new Factorial().iterativeFactorial(4));
        System.out.println(new Factorial().iterativeFactorial(5));
        System.out.println(new Factorial().countTrailingZeros(5));
        System.out.println(new Factorial().countTrailingZeros(10));
        System.out.println(new Factorial().countTrailingZeros(100));
    }
}
