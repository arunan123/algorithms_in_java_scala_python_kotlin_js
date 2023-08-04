package org.algorithmdb.datastructures.arrays.arrayscarryforward;

/**
 * Problem Description
 * You have given a string A having Uppercase English letters.
 *
 * You have to find how many times subsequence "AG" is there in the given string.
 *
 * NOTE: Return the answer modulo 109 + 7 as the answer can be very large.
 *
 *
 *
 * Problem Constraints
 * 1 <= length(A) <= 105
 *
 *
 *
 * Input Format
 * First and only argument is a string A.
 *
 *
 *
 * Output Format
 * Return an integer denoting the answer.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = "ABCGAG"
 * Input 2:
 *
 *  A = "GAB"
 *
 *
 * Example Output
 * Output 1:
 *
 *  3
 * Output 2:
 *
 *  0
 */
public class SpecialSubsequences {
    public int solve(String A) {
        char[] arr = new char[A.length()];
        int mod = 1000000000 + 7;
        for (int i=0; i< A.length(); i++) {
            arr[i] = A.charAt(i);
        }
        int ans = 0;
        int cnt_g = 0;
        for (int i= A.length()-1; i>=0; i--) {
            if (arr[i] == 'G') {
                cnt_g++;
            }
            if (arr[i] == 'A') {
                ans = ans + cnt_g;
                ans = ans % mod;
            }
        }
        return ans;
    }
}
