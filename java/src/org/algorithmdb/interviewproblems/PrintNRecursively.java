package org.algorithmdb.interviewproblems;

public class PrintNRecursively {
    public void print(int a) {
        if (a==0) {
            return;
        }
        System.out.println(a);
        print(a-1);
    }

    public int sum(int n) {
        if (n==0) {
            return 0;
        }
        return sum(n-1) +  n;
    }

    public int sumOfDigits(int n) {
        if(n <= 9) {
            return n;
        }
        return sumOfDigits(n/10) + n % 10;
    }

    public static void main(String[] args) {
        System.out.print(new PrintNRecursively().sumOfDigits(876));
    }
}
