package org.algorithmdb.datastructures.arrays.arrayscarryforward;

import org.algorithmdb.datastructures.arrays.arraysprefixsum.PrefixSumEvenNumberInRange;

import java.util.Arrays;

/**
 * Problem Description
 * Given an integer array A containing N distinct integers, you have to find all the leaders in array A. An element is a leader if it is strictly greater than all the elements to its right side.
 *
 * NOTE: The rightmost element is always a leader.
 *
 *
 * Problem Constraints
 * 1 <= N <= 105
 * 1 <= A[i] <= 108
 *
 *
 * Input Format
 * There is a single input argument which a integer array A
 *
 *
 * Output Format
 * Return an integer array denoting all the leader elements of the array.
 *
 *
 * Example Input
 * Input 1:
 *  A = [16, 17, 4, 3, 5, 2]
 * Input 2:
 *  A = [5, 4]
 *
 *
 * Example Output
 * Output 1:
 * [17, 2, 5]
 * Output 2:
 * [5, 4]
 */
public class LeadersInArray {
    public int[] solve(int[] A) {
        int[] result = new int[A.length];

        int max = A[A.length-1];
        int j =0;
        result[j] = max;
        j++;
        for (int i=A.length-2; i>=0; i--) {
            if (A[i] > max) {
                result[j] = A[i];
                max = A[i];
                j++;
            }
        }
        int cnt = 0;
        for (int i=0; i<result.length; i++) {
            if (result[i] != 0) {
                cnt++;
            }
        }
        int[] anotherResult = new int[cnt];
        int k = 0;
        for (int i=0; i<result.length; i++) {
            if (result[i] != 0) {
                anotherResult[k] = result[i];
                k++;
            }
        }

        return anotherResult;
    }

    public static void main(String[] args) {
        int[] a = {16, 17, 4, 3, 5, 2};
        int[] result = new LeadersInArray().solve(a);
        System.out.println("\n");
        Arrays.stream(result).forEach(t -> System.out.print(t + " "));
    }
}
