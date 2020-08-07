package com.lgk.string;

/**
 * @author : lgk
 * @Description :
 * @ClassName : StringBuilderDemo
 * @date : 2020-8-6 0006
 **/
public class StringBuilderDemo {
    public static void main(String[] args) {
        //定义一个字符串
        StringBuilder str = new StringBuilder("你好啊");
        /**
         * 在StrB后面添加字符串
         * StringBuilder append()
         **/
        //str.append(',');
        //str.append("world!");
        str.append(',').append("welcome");
        str.append(" ").append("to");
        str.append(" ").append("java");
        str.append(" ").append("world!");
        System.out.println("在StrB后面添加字符串："+str);
        /**
         * 删除从start到end之间的字符串
         * StringBuilder delete(int start, int end)
         **/
        str = str.delete(2, 3);
        System.out.println("删除字符串："+str);
        /**
         * 查看子字符串在主字符串的位置
         * int indexOf(String str)
         **/
        int index1 = str.indexOf("world");
        System.out.println("子字符串在主字符串的位置为："+index1);
        /**
         * 从某一位置开始查看字符串在主字符串的位置
         * int indexOf(String str,int fromIndex)
         **/
        int index2 = str.indexOf("o",8);
        System.out.println("从某一位置开始查看字符串在主字符串的位置："+index2);
        /**
         * 在指定位置处插入内容
         * StringBuilder insert(int offset,String str)
         **/
        str = str.insert(3,"aaa! ");
        System.out.println("在指定位置处插入内容："+str);
        /**
         * 返回字符串的长度
         * int length()
         **/
        int length = str.length();
        System.out.println("返回字符串的长度："+length);
        /**
         * 把字符串中某个部分的字符串替换
         * StringBuilder replace(int start, int end, String str)
         **/
        str = str.replace(8,15,"WELCOME");
        System.out.println("把字符串中某个部分的字符串替换："+str);
        /**
         * 将字符串反转
         * StringBuilder reverse()
         **/
        str = str.reverse();
        System.out.println("将字符串反转:"+str);
        str = str.reverse();
        /**
         * 获得从start位置开始到end位置的字符串
         * String subString(int start，int end)
         **/
        String str1 = str.substring(8);
        System.out.println("获得从start位置开始到end位置的字符串:"+str1);
        /**
         * 将StringBuilder的对象转换为String的对象
         * String toString()
         **/
        String str2 = str.toString();
        System.out.println("将StringBuilder的对象转换为String的对象:"+str2);
    }
}