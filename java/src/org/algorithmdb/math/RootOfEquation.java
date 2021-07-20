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
 * -----------------------------------------------------------------------------------
 *
 * Algorithm Definition : Finding the root of the equation.
 * ----------------------------------------------------------------------------------
 *
 * @author Arunan R
 * @since  July 20, 2021
 */
public class RootOfEquation {
    public int absolute(int a) {
        return Math.abs(a);
    }

    public void rootOfEquation(int a, int b, int c) {
        int d = (b*b)-4*a*c;
        int root1=0;
        int root2=0;
        if (d < 0) {
            System.out.print("Imaginary");
        } else {
            root1 = (int) Math.floor((-b + Math.sqrt(d))/(2 * a));
            root2 = (int) Math.floor((-b - Math.sqrt(d))/(2 * a));
        }
        System.out.println(root1 + " : " + root2);
    }

    public static void main(String[] args) {
        new RootOfEquation().rootOfEquation(83,720,621);
    }
}