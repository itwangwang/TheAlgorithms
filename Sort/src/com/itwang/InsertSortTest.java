package com.itwang;

public class InsertSortTest {

    public static void main(String[] args) {
        int[] R = {1,5,6,2,6,9};
        insertSort(R,R.length);
        for (int i : R) {
            System.out.println(i);
        }
    }

    private static void insertSort(int[] R, int n) {
        for (int i=0; i < n; i++){
            int j = i -1;
            int temp = R[i];
            while (j >=0 && temp < R[j]) {
                R[j + 1] = R[j];
                j--;
            }
            R[j + 1] = temp;
        }
    }
}


