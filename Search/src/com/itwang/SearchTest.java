package com.itwang;

public class SearchTest {
    public static void main(String[] args) {
        int[] R = {1,5,6,2,6,9};
        int i = search(R, R.length, 5);
        System.out.println(R[i]);
    }

    private static int search(int[] R, int length, int k) {
        for (int i=0; i < length; i++) {
            if (R[i] == k)
                return i;
        }
        return 0;
    }
}


