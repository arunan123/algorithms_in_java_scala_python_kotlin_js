package org.algorithmdb.datastructures.arrays.slidingwindow;
/**
 *
 *  @Author : Arunan Ramanathan
 *  @date : 21 Sep 2023
 *
 * Problem Description
 * Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order and return the generated square matrix.
 *
 *
 *
 * Problem Constraints
 * 1 <= A <= 1000
 *
 *
 *
 * Input Format
 * First and only argument is integer A
 *
 *
 * Output Format
 * Return a 2-D matrix which consists of the elements added in spiral order.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * 1
 * Input 2:
 *
 * 2
 * Input 3:
 *
 * 5
 *
 *
 * Example Output
 * Output 1:
 *
 * [ [1] ]
 * Output 2:
 *
 * [ [1, 2],
 *   [4, 3] ]
 * Output 2:
 *
 * [ [1,   2,  3,  4, 5],
 *   [16, 17, 18, 19, 6],
 *   [15, 24, 25, 20, 7],
 *   [14, 23, 22, 21, 8],
 *   [13, 12, 11, 10, 9] ]
 */

import java.util.Arrays;

public class GenerateMatrix {
    public int[][] generateMatrix(int A) {
        int[][] result = new int[A][A];
        int val = 1;
        int N = A;
        int i=0, j=0;
        while (N > 1) {
            for (int k=0; k<N-1; k++) {
                result[i][j] = val++;
                j++;
            }
            for (int k=0; k<N-1; k++) {
                result[i][j] = val++;
                i++;
            }
            for (int k=0; k<N-1; k++) {
                result[i][j] = val++;
                j--;
            }
            for (int k=0; k<N-1; k++) {
                result[i][j] = val++;
                i--;
            }
            i++;
            j++;
            N = N-2;
        }
        if (N == 1) {
            result[i][j] = val++;
        }

        return result;
    }

    public static void main(String[] args) {
        int A = 5;
        int[][] result = new GenerateMatrix().generateMatrix(A);
        Arrays.stream(result).forEach(t -> {
            System.out.println("[");
            Arrays.stream(t).forEach(a -> System.out.print(a + " "));
            System.out.println("]");
        });
    }
}
