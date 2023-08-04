package org.algorithmdb.datastructures.arrays.arraysprefixsum;

import java.util.Arrays;

/**
 * Given an array of integers A, find and return the product array of the same size where the ith element of the
 * product array will be equal to the product of all the elements divided by the ith element of the array.
 *
 * Note: It is always possible to form the product array with integer (32 bit) values. Solve it without using the
 * division operator.
 *
 *
 * Input Format
 *
 * The only argument given is the integer array A.
 * Output Format
 *
 * Return the product array.
 * Constraints
 *
 * 2 <= length of the array <= 1000
 * 1 <= A[i] <= 10
 * For Example
 *
 * Input 1:
 *     A = [1, 2, 3, 4, 5]
 * Output 1:
 *     [120, 60, 40, 30, 24]
 *
 * Input 2:
 *     A = [5, 1, 10, 1]
 * Output 2:
 *     [10, 50, 5, 50]
 */
public class ProductArrayPuzzle {
    public int[] solve(int[] A) {
        int[] pref = new int[A.length];
        int[] suff = new int[A.length];
        int[] ans = new int[A.length];

        //Build Prefix
        for (int i=0; i<A.length; i++) {
            if(i == 0) {
                pref[i] = A[i];
            } else {
                pref[i] = pref[i-1] * A[i];
            }
        }
        //Build suffix
        for (int i=A.length-1; i>=0; i--) {
            if (i == A.length-1) {
                suff[i] = A[i];
            } else {
                suff[i] = suff[i+1] * A[i];
            }
        }

        for (int i=0; i<A.length; i++) {
            if (i == 0) {
                ans[i] = suff[i+1];
            } else if (i == A.length-1) {
                ans[i] = pref[i-1];
            } else {
                ans[i] = pref[i-1] * suff[i+1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] result = new ProductArrayPuzzle().solve(a);
        Arrays.stream(result).forEach(t -> System.out.print(t + " "));
    }
}
