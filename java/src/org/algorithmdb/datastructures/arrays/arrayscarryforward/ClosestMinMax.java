package org.algorithmdb.datastructures.arrays.arrayscarryforward;

import java.util.Arrays;

/**
 * Problem Description
 * Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array
 *
 * and at least one occurrence of the minimum value of the array.
 *
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 2000
 *
 *
 *
 * Input Format
 * First and only argument is vector A
 *
 *
 *
 * Output Format
 * Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * A = [1, 3, 2]
 * Input 2:
 *
 * A = [2, 6, 1, 6, 9]
 *
 *
 * Example Output
 * Output 1:
 *
 *  2
 * Output 2:
 *
 *  3
 */
public class ClosestMinMax {
    public int solve(int[] A) {
        int max=A[0],min=A[0];
        for (int i = 0; i< A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
            if (A[i] < min) {
                min = A[i];
            }
        }
        int min_index = -1;
        int max_index = -1;
        int ans = A.length;
        for (int i=A.length-1; i>=0; i--) {
            if (A[i] == min) {
                min_index = i;
                if (max_index != -1) {
                    int length = max_index - i + 1;
                    if (length < ans) {
                        ans = length;
                    }
                }
            }

            if (A[i] == max) {
                max_index = i;
                if (min_index != -1) {
                    int length = min_index - i + 1;
                    if (length < ans) {
                        ans = length;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[] a = {2, 6, 1, 6, 9};
//        int[] a = {343,291,963,165,152};
//        int[] a = {613,116,420,672,426};
        int[] a = {834,563,606,221,165};
        int result = new ClosestMinMax().solve(a);
        System.out.println("result : " + result);
    }
}
