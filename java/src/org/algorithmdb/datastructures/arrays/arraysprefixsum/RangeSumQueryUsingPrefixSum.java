package org.algorithmdb.datastructures.arrays.arraysprefixsum;

import org.algorithmdb.datastructures.arrays.RangeSumQuery;

import java.util.Arrays;

/**
 * Problem Description
 *  You are given an integer array A of length N.
 *  You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
 *  For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
 *  More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
 *
 *  Problem Constraints
 *  1 <= N, M <= 103
 *  1 <= A[i] <= 105
 *  0 <= L <= R < N
 *
 *  Input Format
 * The first argument is the integer array A.
 * The second argument is the 2D integer array B.
 *
 *
 * Output Format
 *  Return an integer array of length M where ith element is the answer for ith query in B.
 *
 *  Example Input
 * Input 1:
 * A = [1, 2, 3, 4, 5]
 * B = [[0, 3], [1, 2]]
 * Input 2:
 * A = [2, 2, 2]
 * B = [[0, 0], [1, 2]]
 *
 *
 * Example Output
 * Output 1:
 * [10, 5]
 * Output 2:
 * [2, 4]
 *
 * Example Explanation
 * Explanation 1:
 * The sum of all elements of A[0 ... 3] = 1 + 2 + 3 + 4 = 10.
 * The sum of all elements of A[1 ... 2] = 2 + 3 = 5.
 * Explanation 2:
 *
 * The sum of all elements of A[0 ... 0] = 2 = 2.
 * The sum of all elements of A[1 ... 2] = 2 + 2 = 4.
 *
 */
public class RangeSumQueryUsingPrefixSum {
    public long[] rangeSum(int[] A, int[][] B) {
        //Creating Prefix sum array
        long[] pref = new long[A.length];
        long[] result = new long[B.length];
        for (int i=0; i<A.length; i++) {
            if (i == 0) {
                pref[i] = A[i];
            } else {
                pref[i] = pref[i-1] + A[i];
            }
        }
        for (int j=0; j<B.length; j++) {
            int l = B[j][0];
            int r = B[j][1];
            if (l==0) {
                result[j] = pref[r];
            } else {
                result[j] = pref[r] - pref[l-1];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {6,3,3,6};
        int[][] b = {{0,3},{0,2}};
        long[] result = new RangeSumQueryUsingPrefixSum().rangeSum(a,b);
        Arrays.stream(result).forEach(t -> System.out.println(t));
    }
}
