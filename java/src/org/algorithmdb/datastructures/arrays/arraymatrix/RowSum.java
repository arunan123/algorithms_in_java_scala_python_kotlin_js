package org.algorithmdb.datastructures.arrays.arraymatrix;

/**
 * Problem Constraints
 * 1 <= A.size() <= 103
 *
 * 1 <= A[i].size() <= 103
 *
 * 1 <= A[i][j] <= 103
 *
 *
 *
 * Input Format
 * First argument A is a 2D array of integers.(2D matrix).
 *
 *
 *
 * Output Format
 * Return an array containing row-wise sums of original matrix.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * [1,2,3,4]
 * [5,6,7,8]
 * [9,2,3,4]
 *
 *
 * Example Output
 * Output 1:
 *
 * [10,26,18]
 *
 *
 * Example Explanation
 * Explanation 1
 *
 * Row 1 = 1+2+3+4 = 10
 * Row 2 = 5+6+7+8 = 26
 * Row 3 = 9+2+3+4 = 18
 */

import java.util.Arrays;

public class RowSum {
    public int[] solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        int[] result = new int[N];
        for (int i=0; i<N; i++) {
            int sum = 0;
            for (int j=0; j<M; j++) {
                sum = sum + A[i][j];
            }
            result[i] = sum;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] input = {{1,2,3,4},{5,6,7,8},{9,2,3,4}};
        int[] result = new RowSum().solve(input);
        Arrays.stream(result).forEach(t -> System.out.print(t + " "));
    }
}
