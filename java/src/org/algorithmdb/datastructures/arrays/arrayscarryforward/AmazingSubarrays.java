package org.algorithmdb.datastructures.arrays.arrayscarryforward;

/**
 * You are given a string S, and you have to find all the amazing substrings of S.
 *
 * An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
 *
 * Input
 *
 * Only argument given is string S.
 * Output
 *
 * Return a single integer X mod 10003, here X is the number of Amazing Substrings in given the string.
 * Constraints
 *
 * 1 <= length(S) <= 1e6
 * S can have special characters
 * Example
 *
 * Input
 *     ABEC
 *
 * Output
 *     6
 *
 * Explanation
 *     Amazing substrings of given string are :
 *     1. A
 *     2. AB
 *     3. ABE
 *     4. ABEC
 *     5. E
 *     6. EC
 *     here number of substrings are 6 and 6 % 10003 = 6.
 * Expected Output
 * Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
 */
public class AmazingSubarrays {
    public int solve(String A) {
        char[] input = new char[A.length()];
        int N = A.length();
        for (int i=0; i<N; i++) {
            input[i] = A.charAt(i);
        }
        int count=0,vowel=0;
        for (int i=N-1; i>=0; i--) {
            if (input[i] == 'A' || input[i] == 'E' || input[i] == 'I' || input[i] == 'O' || input[i] == 'U'
                    || input[i] == 'a' || input[i] == 'e' || input[i] == 'i' || input[i] == 'o' || input[i] == 'u') {
                count++;
                vowel = vowel + count;
                vowel = vowel % 10003;
            } else {
                count++;
            }
        }
        return vowel;
    }

    public static void main(String[] args) {
        String a = "ABEC";
        int result = new AmazingSubarrays().solve(a);
        System.out.println(result);
    }
}
