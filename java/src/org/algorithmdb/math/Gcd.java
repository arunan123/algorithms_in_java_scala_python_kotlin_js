package org.algorithmdb.math;

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
 * @since   May 29, 2017
 *
 */
public class Gcd {
    /**
     * Implementation of Eclid's algorithm
     *
     * @param p, first number to compute gcd
     * @param q, second number to compute gcd
     * @return gcd
     */
    public int gcd(int p, int q) {
        if (q==0) return p;

        return gcd(q, p % q);
    }

    public int lcm(int p, int q) {
        return (p*q)/gcd(p,q);
    }


    public static void main(String...args) {
        System.out.println(new Gcd().gcd(1111111,1234567));
        System.out.println(new Gcd().lcm(4,6));
    }
}
