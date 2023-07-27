package org.algorithmdb.datastructures.arrays;

/**
 * Given an array A of N integers.
 * Count the number of elements that have at least 1 elements greater than itself.
 *
 * Problem Constraints
 * 1 <= N <= 10^5
 * 1 <= A[i] <= 10^9
 *
 * Input Format
 * First and only argument is an array of integers A.
 *
 * Output Format
 * Return the count of elements.
 *
 * Example Input
 * Input 1:
 * A = [3, 1, 2]
 * Input 2:
 * A = [5, 5, 3]
 *
 *
 * Example Output
 * Output 1:
 * 2
 * Output 2:
 * 1
 *
 *
 */
public class CountArray {
    public int solve(int[] A) {
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }

        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == max) {
                count++;
            }
        }
        return A.length - count;
    }

}
