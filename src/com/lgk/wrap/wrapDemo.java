package com.lgk.wrap;

/**
 * @author : lgk
 * @Description :装箱与拆箱
 * @ClassName : wrapDemo
 * @date : 2020-8-6 0006
 **/
public class wrapDemo {

    public static void main(String[] args) {
        /**
         * 装箱：把基本数据类型转换成包装类
         * 1、自动装箱
         * 2、手动装箱
         **/

        int t1 = 2;

        //自动装箱
        Integer t2 = t1;

        //手动装箱
        Integer t3 = new Integer(t1);

        //测试
        System.out.println("int类型变量t1="+t1);
        System.out.println("Integer类型对象t2="+t2);
        System.out.println("Integer类型对象t3="+t3);
        System.out.println("==============================");
        /**
         * 拆箱：把包装类转换成基本数据类型
         * 1、自动拆箱
         * 2、手动拆箱
         **/
        //自动拆箱
        int t4 = t2;
        //手动拆箱
        int t5 = t2.intValue();
        int t6 = Integer.valueOf(t2);
        //测试
        Double d = 5.2;
        int a = d.intValue();
        System.out.println("Integer类型对象t2="+t2);
        System.out.println("自动拆箱后，int类型变量t4="+t4);
        System.out.println("手动拆箱后，int类型变量t5="+t5);
        System.out.println("手动拆箱后，int类型变量a="+a);
        System.out.println("手动拆箱后，int类型变量t6="+t6);
    }
}