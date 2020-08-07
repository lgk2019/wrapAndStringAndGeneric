package com.lgk.generics;

/**
 * @author : lgk
 * @Description :自定义泛型类 -- 泛型类有两个参数 T，E
 * @ClassName : NumGenericDemo2
 * @date : 2020-8-7 0007
 **/
public class DefineGenericClassDemo2<T,E> {
    private T num1;
    private E num2;

    public void genericNum(T num1,E num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public T getNum1() {
        return num1;
    }
    public void setNum1(T num1) {
        this.num1 = num1;
    }
    public E getNum2() {
        return num2;
    }
    public void setNum2(E num2) {
        this.num2 = num2;
    }

    //测试的主方法
    public static void main(String[] args) {

        DefineGenericClassDemo2<Integer,Float> numObj = new DefineGenericClassDemo2<>();
        numObj.genericNum(25,5.0f);
        System.out.println("num1 = "+numObj.getNum1());
        System.out.println("num2 = "+numObj.getNum2());
    }
}