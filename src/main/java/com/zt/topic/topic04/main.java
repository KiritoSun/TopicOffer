package com.zt.topic.topic04;

/**
 * 替换空格
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class main {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("We Are Happy");
        System.out.println(replaceSpace(str));
    }

    /**
     * 我的解法
     * 字符串转换为字符数组，遇到空格则替换
     */
    public static String replaceSpace(StringBuffer str) {
        char[] array = str.toString().toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                stringBuffer.append("%20");
            } else {
                stringBuffer.append(array[i]);
            }
        }
        return stringBuffer.toString();
    }

//    public static String replaceSpace1(StringBuffer str) {
//
//    }

}
