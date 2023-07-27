package org.algorithmdb.datastructures.arrays;

/**
 * Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times
 * towards the right.
 *
 * Problem Constraints
 * 1 <= N <= 10^5
 * 1 <= A[i] <=10^9
 * 1 <= B <= 10^9
 *
 * Input Format
 * The first argument given is the integer array A.
 * The second argument given is the integer B.
 *
 * Output Format
 * Return the array A after rotating it B times to the right
 *
 *
 * Example Input
 * Input 1:
 *
 * A = [1, 2, 3, 4]
 * B = 2
 *
 * Input 2:
 *
 * A = [2, 5, 6]
 * B = 1
 *
 *
 * Example Output
 * Output 1:
 *
 * [3, 4, 1, 2]
 *
 * Output 2:
 *
 * [6, 2, 5]
 */
public class RotateArrayNTimes {
    public int[] rotate(int[] A, int B) {
        int range = 0;
        if (B > A.length-1) {
            range = B % A.length;
        } else {
            range = B;
        }
        reverse(A, 0, A.length-1);
        reverse(A, 0, range-1);
        reverse(A, range, A.length-1);
        return A;
    }

    private void reverse(int[] A, int start, int end) {
        int i = start;
        int j = end;
        while (i < j) {
            swap(A, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
