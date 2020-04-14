package com.zt.topic.topic02;

import java.util.HashSet;
import java.util.Set;

/**
 * 数组中重复的数字
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，
 * 但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 */
public class main {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 3, 1, 0, 2, 5, 3};
        int length = numbers.length;
        int[] duplication = new int[1];
        System.out.println(duplicate1(numbers, length, duplication));
        System.out.println(duplication[0]);
    }

    /**
     * 解法一
     * 首先对数组排序，遍历数组判断相邻位置是否存在相同元素 时间复杂度O(nlogn)
     */
    public static boolean duplicate1(int numbers[],int length,int [] duplication) {
        if (numbers == null || length <= 0) {
            return false;
        }
        // 快速法排序
        sort(numbers, 0, numbers.length - 1);
        // 遍历数组判断相邻元素是否重复
        for (int i=0; i < numbers.length-1; i++) {
            if (numbers[i] == numbers[i+1]) {
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }

    /**
     * 解法二
     * 利用 HashSet 解决，从头到尾扫描数组，每次扫描到一个数，
     * 判断当前数是否存在 HashSet 中，如果存在，则重复，对 duplication 赋值返回，否则将该数加入到 HashSet 中
     */
    public static boolean duplicate2(int numbers[],int length,int [] duplication) {
        Set set = new HashSet();
        for (int i=0; i < numbers.length; i++) {
            if (set.contains(numbers[i])) {
                duplication[0] = numbers[i];
                return true;
            } else {
                set.add(numbers[i]);
            }
        }
        return false;
    }

    /**
     * 快速法排序
     */
    public static void sort(int[] array, int left, int right) {
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
}
