package org.algorithmdb.datastructures.arrays.slidingwindow;

/**
 *
 * @Author : Arunan Ramanathan
 * @date : 21 Sep 2023
 *
 * Problem Description
 * Given an array A of length N. Also given are integers B and C.
 *
 * Return 1 if there exists a subarray with length B having sum C and 0 otherwise
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 105
 *
 * 1 <= A[i] <= 104
 *
 * 1 <= B <= N
 *
 * 1 <= C <= 109
 *
 *
 *
 * Input Format
 * First argument A is an array of integers.
 *
 * The remaining arguments B and C are integers
 *
 *
 *
 * Output Format
 * Return 1 if such a subarray exist and 0 otherwise
 *
 *
 * Example Input
 * Input 1:
 * A = [4, 3, 2, 6, 1]
 * B = 3
 * C = 11
 * Input 2:
 *
 * A = [4, 2, 2, 5, 1]
 * B = 4
 * C = 6
 *
 *
 * Example Output
 * Output 1:
 * 1
 * Output 2:
 *
 * 0
 *
 *
 * Example Explanation
 * Explanation 1:
 * The subarray [3, 2, 6] is of length 3 and sum 11.
 * Explanation 2:
 * There are no such subarray.
 */
public class SubArraySumWithLength {
    public int solve(int[] A, int B, int C) {
        int initialSum = 0;
        for (int i=0; i<B; i++) {
            initialSum = initialSum + A[i];
        }
        int initialIndex = 1;
        int lastIndex = B;
        while(lastIndex < A.length) {
            initialSum = initialSum - A[initialIndex-1] + A[lastIndex];
            if (initialSum == C) {
                return 1;
            }
            initialIndex++;
            lastIndex++;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] A = {6,3,3,6,7,8,7,3,7};
        int B = 2;
        int C = 10;
        int result = new SubArraySumWithLength().solve(A, B, C);
        System.out.println(result);
    }
}
