package org.algorithmdb.datastructures.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseArray {
    /**
     * Reverse entire Array
     * @param A
     * @return
     */
    int[] reverse(int[] A) {
        int i=0;
        int j=A.length-1;
        while (i <= j) {
            swap(A, i, j);
            i++;
            j--;
        }
        return A;
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Reverse Array only from Bth index until Cth index
     * @param A
     * @param B [STARTING INDEX]
     * @param C [ENDING INDEX]
     */
    public int[] reverseRange(int[] A, int B, int C) {
        int i=B;
        int j=C;
        while (i <= j) {
            swap(A, i, j);
            i++;
            j--;
        }
        return A;
    }

    public static void main(String[] args) {
        int[] arr = {3, -2, 1, 4, 3, 3, 8};
        IntStream value = Arrays.stream(arr);
        value.forEach(t -> System.out.print(t+ " ") );
        int[] reverse = new ReverseArray().reverse(arr);
        IntStream result = Arrays.stream(reverse);
        System.out.println("\n");
        result.forEach(t -> System.out.print(t+ " "));
    }
}
