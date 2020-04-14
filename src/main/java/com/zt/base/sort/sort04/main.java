package com.zt.base.sort.sort04;

/**
 * 快速法排序
 * 时间复杂度O(nlogn)
 */
public class main {
    public static void main(String[] args) {
        int[] array = new int[]{6, 0, 17, -2, 10, 3, -1, 5, 8, 14};
        sort(0, array.length - 1, array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void sort(int left, int right, int[] array) {
        if (array == null || array.length < 0) {
            return;
        }
        if (left < right) {
            int i = left, j = right;
            int p = array[left];
            while (i < j) {
                while (i < j && array[j] > p) {
                    j--;
                }
                if (i < j) {
                    array[i] = array[j];
                    i++;
                }
                while (i < j && array[i] < p) {
                    i++;
                }
                if (i < j) {
                    array[j] = array[i];
                    j--;
                }
            }
            array[i] = p;
            sort(left, i-1, array);
            sort(i+1, right, array);
        }
    }
}
