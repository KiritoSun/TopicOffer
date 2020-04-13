package com.zt.base.find.find01;

/**
 * 顺序查找法
 * 时间复杂度：O(n)
 */
public class main {
    private static final int[] array = new int[]{3, -2, 7, 0, 1, 9, 4, -4, 8, 12, 10};
    private static final int n = 0;

    public static void main(String[] args) {
        System.out.println(find2(array, n));
    }

    /**
     * 顺序比较数组的每一个元素是否与n相等
     */
    public static boolean find1(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }

    /**
     * 顺序表查找优化
     * 将数组的第一个元素当作哨兵，从最后一个元素开始依次比较
     */
    public static boolean find2(int[] array, int n) {
        int index = array.length - 1;
        if (array[0] == n) {
            return true;
        }
        array[0] = n;
        while (array[index] != n) {
            index --;
        }
        return index != 0 ?  true : false;
    }

}
