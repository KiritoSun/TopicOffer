package com.zt.base.find.find02;

/**
 * 折半查找法
 * 时间复杂度：O(logn)
 */
public class main {
    private static final int[] array = new int[]{-2, 0, 3, 6, 8, 9, 11, 16, 20};
    private static final int n = 18;

    public static void main(String[] args) {
        System.out.println(find(array, n));
    }

    public static boolean find(int[] array, int n) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
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
