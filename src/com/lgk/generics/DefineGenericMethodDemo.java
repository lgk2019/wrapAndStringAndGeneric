package com.lgk.generics;

/**
 * @author : lgk
 * @Description :自定义泛型方法
 * @ClassName : defineGenericMethodDemo
 * @date : 2020-8-7 0007
 **/
public class DefineGenericMethodDemo {
    //定义泛型方法
    public <T> void printValue(T t){
        System.out.println("传入的参数为： " + t);
    }

    //主方法
    public static void main(String[] args) {
        DefineGenericMethodDemo dgm = new DefineGenericMethodDemo();
        dgm.printValue("hello world!");
        dgm.printValue(123);
        dgm.printValue(5.5f);
    }
}