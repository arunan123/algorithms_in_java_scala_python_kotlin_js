package org.algorithmdb.math;


public class RootOfEquation {
    public int absolute(int a) {
        return Math.abs(a);
    }

    public void rootOfEquation(int a, int b, int c) {
        int d = (b*b)-4*a*c;
        int root1=0;
        int root2=0;
        if (d < 0) {
            System.out.print("Imaginary");
        } else {
            root1 = (int) Math.floor((-b + Math.sqrt(d))/(2 * a));
            root2 = (int) Math.floor((-b - Math.sqrt(d))/(2 * a));
        }
        System.out.println(root1 + " : " + root2);
    }

    public static void main(String[] args) {
        new RootOfEquation().rootOfEquation(83,720,621);
    }
}
