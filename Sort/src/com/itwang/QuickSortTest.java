package com.itwang;

public class QuickSortTest {
    public static void main(String[] args) {
        int[] R = {1, 5, 6, 2, 6, 9};
        quickSort(R, 0, R.length - 1);
        for (int i : R) {
            System.out.println(i);
        }
    }

    private static void quickSort(int[] R, int low, int hign) {
        int i = low; int j = hign;
        int temp;
        if (low < hign) {
            temp = R[low];
            while(i < j) {

                while (R[j] >= temp && i < j) j--;

                if (i < j) {
                    R[i] = R[j];
                    i++;
                }

                while (R[i] < temp && i <j) i++;

                if (i < j) {
                    R[j] = R[i];
                    j--;
                }
            }
            R[i] = temp;
            quickSort(R, low, i -1);
            quickSort(R,i + 1, hign);
        }
    }
}
