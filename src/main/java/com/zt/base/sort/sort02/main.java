package com.zt.base.sort.sort02;

/**
 * 冒泡法排序
 * 不稳定排序
 * 时间复杂度 最坏复杂度 O(n^2) 最优均为O(n)
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
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i -1; j++) {
                if (array[j+1] < array[j]) {
                    int t = array[j+1];
                    array[j+1] = array[j];
                    array[j] = t;
                }
            }
        }
    }

}
