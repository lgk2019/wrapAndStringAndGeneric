package com.lgk.string;

/**
 * @author : lgk
 * @Description :==和equals方法的区别
 * @ClassName : StringDemo
 * @date : 2020-8-6 0006
 **/
public class StringDemo2 {
    public static void main(String[] args) {
        //定义四个字符串
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");
        //打印输出
        //内容比较
        System.out.println("str1和str2的内容是否相同："+(str1.equals(str2)));//true
        System.out.println("str1和str3的内容是否相同："+(str1.equals(str3)));//true
        System.out.println("str3和str4的内容是否相同："+(str3.equals(str4)));//true
        //引用地址比较
        System.out.println("str1和str2的引用地址是否相同："+(str1 == str2));//true
        System.out.println("str1和str3的引用地址是否相同："+(str1 == str3));//false
        System.out.println("str3和str4的引用地址是否相同："+(str3 == str4));//false
    }
}