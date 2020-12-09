package com.company;

import java.util.Arrays;

public class Main {
    /*
     *  Class serves for working with arrays
     */

    // in the current cell we put the value of the next
    static int[] toLeft(int[] a) {
        int[] m = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                m[i] = 0;
            }
            else {
                m[i] = a[i + 1];
            }
        }
        return m;
    }

    public static void main(String[] args) {
        int[][] multi = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int n = 0; n < 10; n++) {
                multi[i][n] = n + 1;
            }
        }
        System.out.println("2nd grade element: " + Arrays.toString(toLeft(multi[0])));
    }
}
