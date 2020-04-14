package com.zt.base.find.find02;

/**
 * 折半查找法
 * 时间复杂度：O(logn)
 */
public class main {
    private static final int[] array = new int[]{-2, 0, 3, 6, 8, 9, 11, 16, 20};
    private static final int n = -2;

    public static void main(String[] args) {
//        System.out.println(find(array, n));
        System.out.println(myfind(0, array.length - 1, array, n));
    }

    /**
     * 非递归实现
     */
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

    /**
     * 递归实现
     */
    public static boolean myfind(int low, int high, int[] array, int n) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (n > array[mid]) {
                return myfind(mid + 1, high, array, n);
            } else if (n < array[mid]) {
                return myfind(low, mid - 1, array, n);
            } else {
                return true;
            }
        }
        return false;
    }

}
