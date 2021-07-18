package org.algorithmdb.interviewproblems;

import org.algorithmdb.datastructures.Stack;

/**
 * Copyright [2020] [Arunan R]
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
 * Balancing parathesis using Dijsktra's two stack algorithm
 * Returns TRUE if input is [()]{}{[()]()}
 * Returns FALSE if input is [(])
 * -------------------------------------------
 *
 * @author Arunan Ramanathan
 * @since  March 30 2020
 */

public class BalancingParathesis {

    public static boolean checkIfBalanced(String input) {
        char[] chars = input.toCharArray();

        Stack<Character> openingParanthesis = new Stack<>(20);

        try {
            for (char c : chars) {
                if (c == '[' || c == '(' || c == '{') {
                    openingParanthesis.push(c);
                } else if (c == ']' || c == ')' || c == '}') {
                    char poppedItem = openingParanthesis.pop();
                    if ((c==']' && poppedItem =='[') || (c == ')' && poppedItem == '(') ||
                                (c == '}' && poppedItem == '{')) {
                        continue;
                    } else {
                        return false;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

//    public static void main(String...args) {
//        System.out.println(BalancingParathesis.checkIfBalanced("[()]{}{[()]()}"));
//        System.out.println(BalancingParathesis.checkIfBalanced("[(])"));
//    }
}
