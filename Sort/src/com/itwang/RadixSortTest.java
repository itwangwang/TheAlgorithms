package com.itwang;

import com.sun.xml.internal.bind.v2.TODO;

public class RadixSortTest {
    public static void main(String[] args) {
        int[] R = {1,5,6,2,6,9};
        radixSort(R,R.length);
        for (int i : R) {
            System.out.println(i);
        }
    }

    private static void radixSort(int[] R, int length) {
        int max = R[0];
        for (int i = 1; i < R.length; i++) {
            if (R[i] > max) {
                max = R[i];
            }
        }

        int maxLength = (max + "").length();

        int[][] bucket = new int[10][R.length];

        int[] bucketElementCounts = new int[10];

        //TODO
    }
}
