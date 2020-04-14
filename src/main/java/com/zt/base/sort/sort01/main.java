package com.zt.base.sort.sort01;

/**
 * 插入法排序
 * 稳定排序
 * 时间复杂度 最坏复杂度 O(n^2) 最优均为O(n)
 */
public class main {
    public static void main(String[] args) {
        int[] array = new int[]{6, 0, 17, -2, 10, 3, -1, 5, 8, 14};
        insertSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int insert = array[i];
            int j = i - 1;
            while (j >= 0 && insert < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = insert;
        }
    }
}
