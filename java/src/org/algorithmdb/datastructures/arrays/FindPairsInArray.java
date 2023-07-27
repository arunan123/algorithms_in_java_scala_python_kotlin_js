package org.algorithmdb.datastructures.arrays;

/**
 * Given N array elements , check if there exists a pair i,j
 * such that arr[i] + arr[j] = K & i != j
 */
public class FindPairsInArray {
    boolean isPairAvailable(int[] A, int B) {
        for (int i=0; i < A.length; i++) {
            for (int j=0; j < A.length; j++) {
                if (i == j) {
                    continue;
                }
                if (A[i] + A[j] == B) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, -2, 1, 4, 3, 3, 8};

        boolean result = new FindPairsInArray().isPairAvailable(arr, 10);
        System.out.println(result);
    }
}
