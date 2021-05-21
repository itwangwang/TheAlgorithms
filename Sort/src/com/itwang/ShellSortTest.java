package com.itwang;

public class ShellSortTest {
    public static void main(String[] args) {
        int[] R = {1,5,6,2,6,9};
        ShellSort(R, R.length);
        for (int i : R) {
            System.out.println(i);
        }
    }

    private static void ShellSort(int[] r, int length) {
        int temp = 0;
        int count = 0;

        for (int gap = length/2; gap > 0; gap/= 2) {
            for (int i = gap; i < length; i++) {
                for (int j = i-gap; j>=0; j-=gap) {
                    if (r[j] > r[j+gap]) {

                    }
                }
            }
        }
    }
}
