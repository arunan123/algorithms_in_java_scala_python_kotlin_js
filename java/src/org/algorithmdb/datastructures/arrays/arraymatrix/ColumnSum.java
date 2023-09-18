package org.algorithmdb.datastructures.arrays.arraymatrix;

import java.util.Arrays;

/**
 * Problem Description
 * You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.
 *
 *
 *
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
 * First argument is a 2D array of integers.(2D matrix).
 *
 *
 *
 * Output Format
 * Return an array containing column-wise sums of original matrix.
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
 * {15,10,13,16}
 *
 *
 * Example Explanation
 * Explanation 1
 *
 * Column 1 = 1+5+9 = 15
 * Column 2 = 2+6+2 = 10
 * Column 3 = 3+7+3 = 13
 * Column 4 = 4+8+4 = 16
 */
public class ColumnSum {
    public int[] solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        int[] result = new int[M];
        for (int i=0; i<M; i++) {
            int sum = 0;
            for (int j=0; j<N; j++) {
                sum = sum+ A[j][i];
            }
            result[i] = sum;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] input = {{1,2,3,4},{5,6,7,8},{9,2,3,4}};
        int[] result = new ColumnSum().solve(input);
        Arrays.stream(result).forEach(t -> System.out.print(t + " "));
    }
}
