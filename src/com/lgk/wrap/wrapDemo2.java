package com.lgk.wrap;

/**
 * @author : lgk
 * @Description :基本数据类型与字符串之间的转换
 * @ClassName : wrapDemo2
 * @date : 2020-8-6 0006
 **/
public class wrapDemo2 {

    public static void main(String[] args) {
        /**
         * 基本数据类型转换为字符串
         **/
        int t1 = 2;
        Integer a = new Integer(t1);
        //先装箱再调用toString()方法
        String str = Integer.toString(t1);
        String str1 = a.toString();
        //测试
        System.out.println("int类型转换为String类型对象str="+str);
        System.out.println("int类型转换为String类型对象str1="+str1);
        System.out.println("================================");
        /**
         * 字符串转换为基本数据类型
         **/
        //包装类的parse
        int t3 = Integer.parseInt(str);
        String str3 = "7";
        double t = Double.parseDouble(str3);
        //包装类valueOf 先将字符串转化为包装类，再通过自动拆箱完成基本类型转换
        int t4 = Integer.valueOf(str);
        System.out.println("String类型转换为int类型变量t3="+t3);
        System.out.println("String类型转换为int类型变量t4="+t4);
        System.out.println("String类型转换为int类型变量t="+t);
    }
}