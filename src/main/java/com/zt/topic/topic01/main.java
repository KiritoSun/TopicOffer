package com.zt.topic.topic01;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目：二维数组中的查找
 *
 * 描述：在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class main {
    private static Solution solution = new Solution();
    private final static int target = 1;
    private final static int[][] array = {{1, 3, 8}, {2, 4, 9}, {5, 6, 10}};

    public static void main(String[] args) {
//        System.out.println(solution.myFind(target, array));
//        System.out.println(solution.find1(target, array));
        System.out.println(solution.find2(target, array));
    }

    /**
     * 启动类 - 我的解法
     */
    public static class Solution {
        /**
         * 我的解题思路：
         * 先转换为列表，对列表排序，然后对列表进行查找
         */
        public boolean myFind(int target, int [][] array) {
            // 二维数组转一维数组 时间复杂度O(n^2)
            int[] myArray = new int[array.length * array[0].length];
            int index = 0;
            for (int i=0; i < array.length; i++) {
                for (int j=0; j < array[i].length; j++) {
                    myArray[index++] = array[i][j];
                }
            }
            // 对一维数组排序 时间复杂度O(nlogn)
            sort(myArray, 0, myArray.length - 1);
            // 二分法查询 时间复杂度O(logn)
            return query(myArray, target);
        }

        /**
         * 解题方法一
         * 矩阵是有序的，从左下角来看，向上数字递减，向右数字递增，
         * 因此从左下角开始查找，当要查找数字比左下角数字大时。右移
         * 要查找数字比左下角数字小时，上移
         * 时间复杂度O(n)
         */
        public boolean find1(int target, int [][] array) {
            int x = array.length - 1;
            int y = 0;
            while (x >= 0 && y <= array.length - 1) {
                if (target > array[x][y]) {
                    y++;
                } else if (target < array[x][y]) {
                    x--;
                } else {
                    return true;
                }
            }
            return false;
        }

        /**
         * 解题方法二
         * 对二维数组的每一行进行二分查找 时间复杂度O(nlogn)
         */
        public boolean find2(int target, int[][] array) {
            for (int i = 0; i < array.length; i++) {
                int[] myArray = array[i];
                // 使用二分查找
                int left = 0;
                int right = myArray.length - 1;
                while (left <= right) {
                    int mid = (left + right) / 2;
                    if (target > myArray[mid]) {
                        left = mid + 1;
                    } else if (target < myArray[mid]) {
                        right = mid - 1;
                    } else {
                        return true;
                    }
                }
            }
            return false;
        }

        /**
         * 快速排序
         */
        public void sort(int[] array, int left, int right) {
            if (array == null || array.length < 0) {
                return;
            }
            if (left < right) {
                int i = left, j = right;
                int p = array[left];
                while (i < j) {
                    while (i < j && p < array[j]) {
                        j--;
                    }
                    if (i < j) {
                        array[i] = array[j];
                        i++;
                    }
                    while (i < j && p > array[i]) {
                        i++;
                    }
                    if (i < j) {
                        array[j] = array[i];
                        j--;
                    }
                }
                array[i] = p;
                sort(array, left, i-1);
                sort(array, i+1, right);
            }
        }

        /**
         * 二分法查找
         */
        public boolean query(int[] array, int target) {
            int left = 0;
            int right = array.length - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (target > array[mid]) {
                    left = mid + 1;
                } else if (target < array[mid]) {
                    right = mid - 1;
                } else  {
                    return true;
                }
            }
            return false;
        }
    }

}
