package org.algorithmdb.math;

public class Prime {
    /**
     * Method to find whether the given number is Prime or Not!
     *
     * @param number to find out Prime or Not
     * @return boolean, true if Prime, false if Not a Prime.
     */
    public static boolean isPrime(long number) {
        long half = number/2;
        for (long i=2; i<=half; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(11));
    }
}
