package org.algorithmdb.datastructures.arrays.subarray;

/**
 * Problem Description
 * Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
 * 1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
 * 2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
 * Your task is to find the count of good subarrays in A.
 *
 *
 * Problem Constraints
 * 1 <= len(A) <= 103
 * 1 <= A[i] <= 103
 * 1 <= B <= 107
 *
 *
 * Input Format
 * The first argument given is the integer array A.
 * The second argument given is an integer B.
 *
 *
 * Output Format
 * Return the count of good subarrays in A.
 *
 *
 * Example Input
 * Input 1:
 * A = [1, 2, 3, 4, 5]
 * B = 4
 * Input 2:
 *
 * A = [13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9]
 * B = 65
 *
 *
 * Example Output
 * Output 1:
 * 6
 * Output 2:
 *
 * 36
 *
 *
 * Example Explanation
 * Explanation 1:
 * Even length good subarrays = {1, 2}
 * Odd length good subarrays = {1, 2, 3}, {1, 2, 3, 4, 5}, {2, 3, 4}, {3, 4, 5}, {5}
 * Explanation 1:
 * There are 36 good subarrays
 */
public class GoodSubArrays {
    public int solve(int[] A, int B) {
        int goodSubArrayCount = 0;

        for (int s=0; s<A.length; s++) {
            for (int e=s; e<A.length; e++) {
                int sum = 0;
                int arrLength = 0;
                for (int k=s; k<=e; k++) {
                    sum = sum + A[k];
                    arrLength++;
                }
                if(arrLength % 2 == 0 && sum < B) {
                    goodSubArrayCount++;
                } else if (arrLength % 2 !=0 && sum > B) {
                    goodSubArrayCount++;
                }
            }
        }
        return goodSubArrayCount;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int B = 4;
        int count = new GoodSubArrays().solve(A,B);
        System.out.println(count);
    }
}
