package com.zt.base.sort.sort03;

/**
 * 选择法排序
 * 不稳定排序
 * 时间复杂度 最坏最优复杂度均为O(n^2)
 */
public class main {
    public static void main(String[] args) {
        int[] array = new int[]{6, 0, 17, -2, 10, 3, -1, 5, 8, 14};
        sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
    }
}
