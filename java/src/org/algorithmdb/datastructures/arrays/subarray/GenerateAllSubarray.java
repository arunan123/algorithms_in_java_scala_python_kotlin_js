package org.algorithmdb.datastructures.arrays.subarray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * You are given an array A of N integers.
 * Return a 2D array consisting of all the subarrays of the array
 *
 * Note : The order of the subarrays in the resulting 2D array does not matter.
 *
 *
 * Problem Constraints
 * 1 <= N <= 100
 * 1 <= A[i] <= 105
 *
 *
 * Input Format
 * First argument A is an array of integers.
 *
 *
 * Output Format
 * Return a 2D array of integers in any order.
 *
 *
 * Example Input
 * Input 1:
 * A = [1, 2, 3]
 * Input 2:
 * A = [5, 2, 1, 4]
 *
 *
 * Example Output
 * Output 1:
 * [[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]]
 * Output 2:
 * [[1 ], [1 4 ], [2 ], [2 1 ], [2 1 4 ], [4 ], [5 ], [5 2 ], [5 2 1 ], [5 2 1 4 ] ]
 *
 *
 * Example Explanation
 * For Input 1:
 * All the subarrays of the array are returned. There are a total of 6 subarrays.
 * For Input 2:
 * All the subarrays of the array are returned. There are a total of 10 subarrays.
 */
public class GenerateAllSubarray {

    public int[][] solve(int[] A) {
        int totalSubArrays = (A.length * (A.length+1))/2;
        int[][] solution = new int[totalSubArrays][totalSubArrays];
        int j=0;
        for (int s=0; s<A.length; s++) {
            for (int e=s; e<A.length; e++) {
                int[] subArray = null;
                if(s==0 && e==0) {
                    subArray = new int[1];
                } else {
                    subArray = new int[e-s+1];
                }
                int i = 0;
                for (int k=s; k<=e; k++) {
                    System.out.println("s= " + s + "e= " + e + "A[k]" + A[k]);
                    subArray[i] = A[k];
                    i++;
                }
                solution[j] = subArray;
                j++;
            }
        }
        return solution;
    }

    public static void main(String[] args) {
        int[] A = {5, 2, 1, 4};
        int[][] result = new GenerateAllSubarray().solve(A);
        Arrays.stream(result).forEach(t -> {
            System.out.print("[");
            Arrays.stream(t).forEach(v -> System.out.printf(" "+v)
        );System.out.println("]");});
    }
}
