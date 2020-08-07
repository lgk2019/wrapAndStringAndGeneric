package com.lgk.generics;

/**
 * @author : lgk
 * @Description :自定义泛型类 -- 泛型类只有一个参数 T
 * @ClassName : NumGenericDemo
 * @date : 2020-8-7 0007
 **/
public class DefineGenericClassDemo<T> {
    private T num;
    public T getNum(){
        return num;
    }
    public void setNum(T num){
        this.num = num;
    }

    //测试的主方法
    public static void main(String[] args) {
        //Integer类型
        DefineGenericClassDemo<Integer> intNum = new DefineGenericClassDemo<>();
        intNum.setNum(10);
        System.out.println("传入泛型类型为Integer："+intNum.getNum());
        //Float类型
        DefineGenericClassDemo<Float> floatNum = new DefineGenericClassDemo<>();
        floatNum.setNum(5.1f);
        System.out.println("传入泛型类型为Float："+floatNum.getNum());
    }
}