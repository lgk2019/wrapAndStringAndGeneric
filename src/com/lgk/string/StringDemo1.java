package com.lgk.string;

import java.io.UnsupportedEncodingException;

/**
 * @author : lgk
 * @Description :字符串String相关方法测试
 * @ClassName : StringDemo1
 * @date : 2020-8-6 0006
 **/
public class StringDemo1 {
    public static void main(String[] args) {
        //定义一个字符串："Java 编程 基础"
        String str = "Java 编程 基础 ";
        /**
         *打印字符串长度
         * int length()
         * */
        int length = str.length();
        System.out.println("字符串的长度为："+length);
        /**
         * 查找ch子字符在该字符串中第一次出现的位置
         * int indexOf(int ch)
         **/
        int index1 = str.indexOf('a');
        System.out.println(index1);
        /**
         * 查找str子字符串在该字符串中第一次出现的位置
         * int indexOf(String str)
         **/
        int index2 = str.indexOf("编程");
        System.out.println(index2);
        /**
         * 查找ch子字符在该字符串中最后一次出现的位置
         * int lastIndexOf(int ch)
         **/
        int index3 = str.lastIndexOf('a');
        System.out.println(index3);
        /**
         * 查找str子字符串在该字符串中最后一此出现的位置
         * int lastIndexOf(String str)
         **/
        int index4 = str.lastIndexOf("基础");
        System.out.println(index4);
        /**
         * 获取从beginIndex位置开始到结束的子字符串
         * String subString(int beginIndex)
         * 包含beginIndex位置
         **/
        String str1 = str.substring(5);
        System.out.println(str1);
        /**
         * 获取从beginIndex位置开始到endIndex位置的子字符串
         * String subString(int beginIndex，int endIndex)
         * 包含beginIndex位置，不包含endIndex位置
         **/
        String str2 = str.substring(5,7);
        System.out.println(str2);
        /**
         * 返回去除前后空格的字符串
         * String trim()
         **/
        String str3 = str.trim();
        System.out.println(str3);
        /**
         * 将该字符串与指定对象比较，返回false或true
         * boolean equals(Object obj)
         **/
        String string = "JAVA 编程 基础 ";
        boolean flag = str.equals(string);
        System.out.println(flag);
        /**
         * 将字符串转换为小写
         * String toLowerCase()
         **/
        String str4 = str.toLowerCase();
        System.out.println(str4);
        /**
         * 将字符串转换为大写
         * String toUpperCase()
         **/
        String str5 = str.toUpperCase();
        System.out.println(str5);
        /**
         * 获取字符串中指定位置的字符
         * char charAt(int index)
         **/
        char ch = str.charAt(5);
        System.out.println(ch);
        /**
         * 将字符串分割为子字符串，返回字符串数组
         * String[] split(String regex, int limit)
         * String[] split(String regex)是默认limit为0
         * regex：参数为分割的字符串或者正则表达式
         * limit：控制这种分割模式应用的次数
         *****limit为非正整数表示模式被应用尽可能多的次数 比如-1
         * limit =0 表示模式应用尽可能多的次数，数组可以是任意长度，并且结尾空字符串将被丢弃。
         * limit>0时 那么模式将会应用limit-1次 数组长度不会超过limit
         **/
        String strings = "a,b,c,d,e,,,";
        String[] str6 = strings.split(",",10);
        System.out.println(str6.length);
        /**
         * 将该字符串转换为byte数组
         * byte[] getBytes()
         * 在UTF8编码中，一个汉字有三个字节，一个空格一个字节，一个字符一个字节
         **/
        byte[] b = str.getBytes();
        System.out.println(b[5]);
        System.out.println(b.length);
        /**
         * 将byte数组转换为字符串
         * 保持字符串转换为byte数组与byte数组转换为字符串的编码一致
         **/
        String str7 = new String(b);
        System.out.println(str7);
    }
}