package org.algorithmdb.datastructures.arrays.arraysprefixsum;

import java.util.Arrays;

/**
 *Problem Description
 * You are given an array A of integers of size N.
 *
 * Your task is to find the equilibrium index of the given array
 *
 * The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
 *
 * If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.
 *
 * Note:
 *
 * Array indexing starts from 0.
 * If there is no equilibrium index then return -1.
 * If there are more than one equilibrium indexes then return the minimum index.
 *
 *
 * Problem Constraints
 * 1 <= N <= 105
 * -105 <= A[i] <= 105
 *
 *
 * Input Format
 * First arugment is an array A .
 *
 *
 * Output Format
 * Return the equilibrium index of the given array. If no such index is found then return -1.
 *
 *
 * Example Input
 * Input 1:
 * A = [-7, 1, 5, 2, -4, 3, 0]
 * Input 2:
 *
 * A = [1, 2, 3]
 *
 *
 * Example Output
 * Output 1:
 * 3
 * Output 2:
 *
 * -1
 */
public class PrefSumFindingEquilibrium {
    public int solve(int[] A) {
        int[] pf = new int[A.length];
        pf[0] = A[0];
        for (int i=1; i<A.length; i++) {
            pf[i] = pf[i-1] + A[i];
        }
        int equilibrium = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i=0; i<A.length;i++) {
            int rightSum = 0;
            int leftSum = 0;
            if (i==0) {
                leftSum = 0;
            } else {
                leftSum = pf[i-1];
            }
            if (i == A.length-1) {
                rightSum = 0;
            } else {
                rightSum = pf[A.length-1] - pf[i];
            }
            if (leftSum == rightSum) {
                minIndex = i;
                if (minIndex < equilibrium && minIndex != -1) {
                    equilibrium = minIndex;
                }
            }
        }
        if(minIndex == -1) {
            return -1;
        }
        return equilibrium;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,7,1,2,3};
        int result = new PrefSumFindingEquilibrium().solve(a);
        System.out.println(result);
//        Arrays.stream(result).forEach(t -> System.out.println(t));
    }
}

