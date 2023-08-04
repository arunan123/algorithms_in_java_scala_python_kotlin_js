package org.algorithmdb.datastructures.arrays.arraysprefixsum;

import java.util.Arrays;

/**
 *
 */
public class PrefSumFindingEquilibrium {
    public int solve(int[] A) {
        int[] pref = new int[A.length];
        int min = 0;

        for (int i=0; i<A.length; i++) {
            if (i == 0) {
                pref[i] = A[i];
            } else {
                pref[i] = pref[i-1] + A[i];
            }
        }

        for (int i=0; i<A.length; i++) {
            int leftsum = 0;
            int rightsum = 0;
            if (i == 0) {
                leftsum = 0;
            } else {
                leftsum = pref[i-1];
            }
            if (i == A.length-1) {
                rightsum = 0;
            } else {
                rightsum = pref[A.length-1] - pref[i];
            }

            if (rightsum == leftsum) {
                min = i;
                break;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,7,1,2,3};
        int result = new PrefSumFindingEquilibrium().solve(a);
        System.out.println(result);
//        Arrays.stream(result).forEach(t -> System.out.println(t));
    }
}

