package com.itwang;

public class BubbleSortTest {
    public static void main(String[] args) {
        int[] R = {1,5,6,2,6,9};
        bubbleSort(R,R.length);
        for (int i : R) {
            System.out.println(i);
        }
    }

    private static void bubbleSort(int[] R, int length) {
        for (int i=length -1; i >= 1; i--) {
            int j = 1;
            while(j <= i) {
                int temp;
                if (R[j-1] < R[j]) {
                    temp = R[j];
                    R[j] = R[j-1];
                    R[j-1] = temp;
                }
                j++;
            }
        }
    }
}
