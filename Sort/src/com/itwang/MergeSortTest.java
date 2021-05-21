package com.itwang;

public class MergeSortTest {
    public static void main(String[] args) {
        int[] R = {1, 5, 6, 2, 6, 9};
        mergeSort(R, 0, R.length - 1);
        for (int i : R) {
            System.out.println(i);
        }
    }

    private static void mergeSort(int[] R, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(R, low, mid);
            mergeSort(R, mid + 1, high);
            merge(R, low, mid, high);
        }
    }

    private static void merge(int[] R, int low, int mid, int high) {
        int[] temp = new int[high + 1];
        int i = low;
        int j = mid + 1;
        int t = 0;

        while (i <= mid && j <= high) {
            if (R[i] <= R[j]) {
                temp[t] = R[i];
                t++;
                i++;
            } else {
                temp[t] = R[j];
                t++;
                j++;
            }
        }

        while (i <= mid) {
            temp[t] = R[i];
            t++;
            i++;
        }

        while (j <= high) {
            temp[t] = R[j];
            t++;
            j++;
        }

        t = 0;
        int tempLeft = low;
        while (tempLeft <= high) {
            R[tempLeft] = temp[t];
            t++;
            tempLeft++;
        }
    }

}
