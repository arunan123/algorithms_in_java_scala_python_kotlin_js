package com.algorithmdb.math;

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
 * Algorithm Definition : Count the number of digits in a given number
 *
 * ----------------------------------------------------------------------------------
 *
 * @author Arunan R
 * @since  July 17, 2021
 */
public class CountDigit {
    public int countDigits(int number) {
        int numberCounter = 0;
        while (number > 0) {
            numberCounter ++;
            number = number / 10;
        }
        return numberCounter;
    }

    public static void main(String[] args) {
        int a = 1111;
        System.out.println(new CountDigit().countDigits(a));
    }
}
