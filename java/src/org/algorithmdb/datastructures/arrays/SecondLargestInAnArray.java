package org.algorithmdb.datastructures.arrays;

public class SecondLargestInAnArray {
    public int solve(int[] A) {
        int max = A[0];
        int maxIndex = 0;
        for (int i=0; i< A.length; i++) {
            if (A[i] > A[maxIndex]) {
                maxIndex = i;
            }
        }
        int ans = -1;
        for (int i=0; i< A.length; i++) {
            if (A[i] != A[maxIndex]) {
                ans = Math.max(ans, A[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, -2, 1, 4, 3, 3, 8};

        int result = new SecondLargestInAnArray().solve(arr);
        System.out.println(result);
    }
}
