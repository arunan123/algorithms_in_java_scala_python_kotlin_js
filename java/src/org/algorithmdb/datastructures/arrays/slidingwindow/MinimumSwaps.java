package org.algorithmdb.datastructures.arrays.slidingwindow;

public class MinimumSwaps {
    public int solve(int[] A, int B) {
        int k = 0;
        for (int i=0; i<A.length; i++) {
            if (A[i] <= B) {
                k++;
            }
        }
        int count = 0;
        for (int i=0; i<k; i++) {
            if(A[i] > B) {
                count++;
            }
        }
        int ans = count;
        int s=1, e=k;
        while (e < A.length) {
            if(A[s-1] > B) {
                count--;
            }
            if (A[e] > B) {
                count++;
            }
            ans = Math.min(ans,count);
            s++;
            e++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {52,7,93,47,68,26,51,44,5,41,88,19,78,38,17,13,24,74,92,5,84
                ,27,48,49,37,59,3,56,79,26,55,60,16,83,63,40,55,9,96,29,7,22,27
                ,74,78,38,11,65,29,52,36,21,94,46,52,47,87,33,87,70};
        int B = 19;
        int result = new MinimumSwaps().solve(A,B);
        System.out.println(result);
    }
}
