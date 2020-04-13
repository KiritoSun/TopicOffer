package com.zt.topic.topic01;

/**
 * 题目：二维数组中的查找
 *
 * 描述：在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class main {
    private static Solution solution;
    private final static int target = 4;
    private final static int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    public static void main(String[] args) {
        System.out.println(solution.myFind(target, array));
    }

    /**
     * 启动类
     */
    public class Solution {
        /**
         * 我的解题思路：先转换为列表，对列表排序，然后对列表进行查找
         */
        public boolean myFind(int target, int [][] array) {
            return true;
        }
    }

}
