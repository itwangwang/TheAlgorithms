package com.itwang;

public class BSearchTest {
    public static void main(String[] args) {
        int[] R = {1,5,6,2,6,9};
        int i = bSearch(R, 5, 0, 5);
        System.out.println(i);
    }

    private static int bSearch(int[] r, int k, int low ,int high) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (r[mid] == k){
                return mid;
            }else if (r[mid] > k) {
                high = mid -1;
            }else {
                low = mid + 1;
            }
        }
        return 0;
    }
}
