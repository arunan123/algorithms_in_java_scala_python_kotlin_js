package com.algorithmdb.algorithms.math;

import com.algorithmdb.datastructures.Stack;

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

    /**
     * Method to evaluate an expression.
     * Used Dijstra's Two stack algorithm for evaluating an expression.
     *
     * Example expression input = (((2+3)*4)+6)
     * @param expression
     * @return long , value after resolving the expression.
     */
    public static long evaluateExpression(String expression) throws Exception {
        boolean isBalanced = isExpressionBalanced(expression);
        if (!isBalanced) {
            throw new Exception("Expression is not balanced!");
        }

        Stack<Character> operatorStack = new Stack<>(10);
        Stack<Long> valueStack = new Stack<>(10);

        char[] charArray = expression.toCharArray();
        boolean isPrevCharisInteger = false;
        String accumulatedChar = null;
        for (Character c: charArray) {
            if (c == '(')  {
                isPrevCharisInteger = false;
                if(accumulatedChar != null) {
                    valueStack.push(Long.parseLong(accumulatedChar));
                    accumulatedChar = null;
                }
                continue;
            }
            else if (c == '*' || c == '+' || c == '/' || c == '-') {
                isPrevCharisInteger = false;
                operatorStack.push(c);
                if(accumulatedChar != null) {
                    valueStack.push(Long.parseLong(accumulatedChar));
                    accumulatedChar = null;
                }
            }
            else if (c == '0' || c == '1' || c == '2' || c == '3' ||
                    c == '4' || c == '5' || c == '6' || c == '7' ||
                    c == '8' || c == '9') {
                boolean isCurrentCharInteger = true;
                if(isPrevCharisInteger) {
                    accumulatedChar += Character.toString(c);
                } else if (isCurrentCharInteger){
                    accumulatedChar = "";
                    accumulatedChar += Character.toString(c);
                }
                isPrevCharisInteger = true;
            } else if (c == ')') {
                isPrevCharisInteger = false;
                if(accumulatedChar != null) {
                    valueStack.push(Long.parseLong(accumulatedChar));
                    accumulatedChar = null;
                }
                try {
                    Character ch = operatorStack.pop();
                    Long valueOne = valueStack.pop();
                    Long valueTwo = valueStack.pop();
                    if (ch == '+') {
                        valueStack.push(valueTwo + valueOne);
                    } else if (ch == '-') {
                        valueStack.push(valueTwo - valueOne);
                    } else if (ch == '*') {
                        valueStack.push(valueTwo * valueOne);
                    } else if (ch == '/') {
                        valueStack.push(valueTwo / valueOne);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return valueStack.pop();
    }

    private static boolean isExpressionBalanced(String expression) {
        Stack<Character> expressionStack = new Stack<>(10);
        char[] chararray = expression.toCharArray();
        for (Character c : chararray) {
            if (c == '(') {
                expressionStack.push(c);
            } else if (c == ')') {
                try {
                    expressionStack.pop();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (expressionStack.size() == 0) return true;
        else return false;
    }

//    public static void main(String...args) throws Exception {
//        String expression = "(((2+3)*4)+10)";
//        long result = evaluateExpression(expression);
//        System.out.println("Expression evaluated and the result is : " + result);
//    }
}
