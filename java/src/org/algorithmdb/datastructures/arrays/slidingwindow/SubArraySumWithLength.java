package org.algorithmdb.datastructures.arrays.slidingwindow;

public class SubArraySumWithLength {
    public int solve(int[] A, int B, int C) {
        int initialSum = 0;
        for (int i=0; i<B; i++) {
            initialSum = initialSum + A[i];
        }
        int initialIndex = 1;
        int lastIndex = B;
        while(lastIndex < A.length) {
            initialSum = initialSum - A[initialIndex-1] + A[lastIndex];
            if (initialSum == C) {
                return 1;
            }
            initialIndex++;
            lastIndex++;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] A = {6,3,3,6,7,8,7,3,7};
        int B = 2;
        int C = 10;
        int result = new SubArraySumWithLength().solve(A, B, C);
        System.out.println(result);
    }
}
