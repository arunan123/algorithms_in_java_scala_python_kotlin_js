package org.algorithmdb.datastructures.arrays.slidingwindow;

public class SubArrayWithLeastAverage {

    public int solve(int[] A, int B) {
        float leastAverage = 0;
        float sum = 0;
        int leastAverageIndex = 0;
        for (int i=0; i<B; i++) {
            sum = sum + A[i];
        }
        leastAverage = sum/B;
        int s = 1, e=B;
        while (e < A.length) {
            sum = sum - A[s-1] + A[e];
            float avg = sum/B;
            if (avg < leastAverage) {
                leastAverage = avg;
                leastAverageIndex = s;
            }
            s++;
            e++;
        }
        return leastAverageIndex;
    }

    public static void main(String[] args) {
        int[] A = {20,3,13,5,10,14,8,5,11,9,1,11};
        int result = new SubArrayWithLeastAverage().solve(A, 9);
        System.out.println(result);

//        int[] B = {15,7,11,7,9,8,18,1,16,18,6,1,1,4,18};
//        int result1 = new SubArrayWithLeastAverage().solve(B,6);
//        System.out.println(result1);
    }
}
