package com.zt.base.find.find03;

/**
 * 插值查找
 * 折半查找的衍生
 * mid = (low+high)/2 = low + (high-low)/2
 * mid = low + ((key - a[low])/(a[high] - a[low]))(high - low)
 */
public class main {
    private static final int[] array = new int[]{-2, 0, 3, 6, 8, 9, 11, 16, 20};
    private static final int n = -2;

    public static void main(String[] args) {
        System.out.println(find(array, n));
    }

    public static boolean find(int[] array, int n) {
        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            int mid = low + (high - low) * (n - array[low]) / (array[high] - array[low]);
            if (n > array[mid]) {
                low = mid + 1;
            } else if (n < array[mid]) {
                high = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
