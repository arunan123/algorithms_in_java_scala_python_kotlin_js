package org.algorithmdb.datastructures.arrays.arraysprefixsum;

import java.util.Arrays;

public class PrefixSumEvenNumberInRange {
    public int[] solve(int[] A, int[][] B) {
        int i = 0;
        int[] result = new int[B.length];
        int[] pref = new int[A.length];
        if (A[i] % 2 == 0) {
            pref[i] = 1;
        } else {
            pref[i] = 0;
        }
        for (i=1; i<A.length; i++) {
            if (A[i] % 2 == 0) {
                pref[i] = pref[i-1] + 1;
            } else {
                pref[i] = pref[i-1];
            }
        }
        for (int j=0; j<B.length; j++) {
            int l = B[j][0];
            int r = B[j][1];
            if(l == 0) {
                result[j] = pref[r];
            } else {
                result[j] = pref[r] - pref[l-1];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {6,3,3,6,7,8,7,3,7};
        int[][] b = {{2,6},{4,7},{6,7}};
        int[] result = new PrefixSumEvenNumberInRange().solve(a,b);
        System.out.println("\n");
        Arrays.stream(result).forEach(t -> System.out.print(t + " "));
    }
}
