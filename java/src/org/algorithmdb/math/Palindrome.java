package org.algorithmdb.math;

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
 * -------------------------------------------
 * Find if a number is palindrome or not!
 * If the number passed is 1221 - program returns true
 * If the number passed is 12321 - program returns true
 * If the number passed is 21 - program returns false
 * -------------------------------------------
 *
 * @author Arunan Ramanathan
 * @since  July 17 2021
 */

public class Palindrome {
    public boolean isPalindrome(int input) {
        int originalInput = input;
        int totalCount = findTotalDigits(input);
        int reverse = 0;
        for (int i=0; i<totalCount; i++) {
            int lastDigit = input % 10;
            reverse = reverse * 10 + lastDigit;
            input = input/10;
        }
        return originalInput == reverse;
    }

    private int findTotalDigits(int input) {
        int count = 0;
        while (input > 0) {
            count++;
            input = input / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Is palindrome : " + new Palindrome().isPalindrome(1221));
    }
}
