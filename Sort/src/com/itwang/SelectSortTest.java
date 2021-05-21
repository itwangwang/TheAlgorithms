package com.itwang;

public class SelectSortTest {
    public static void main(String[] args) {
        int[] R = {1,5,6,2,6,9};
        selectSort(R, R.length);
        for (int i : R) {
            System.out.println(i);
        }
    }

    private static void selectSort(int[] R, int length) {
        for (int i =0; i < length - 1; i ++) {
            int max = i;
            for (int j = i+1; j < length; j++) {
                if (R[max] < R[j]) {
                    max = j;
                }
            }
            int temp = R[i];
            R[i] = R[max];
            R[max] = temp;
        }
    }
}
