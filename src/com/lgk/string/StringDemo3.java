package com.lgk.string;

/**
 * @author : lgk
 * @Description :String的不可变性
 * @ClassName : StringDemo3
 * @date : 2020-8-6 0006
 **/
public class StringDemo3 {
    public static void main(String[] args) {
        /**
         * String的不可变性
         * String对象一旦创建后就不能修改
         * 而所谓的修改其实是创建了新的对象
         * 当创建String str = "hello";时，str存放在栈空间，hello存放在常量池中，str指向hello
         * 当进行字符串拼接str = str + " world!";后，会重新在常量池中开辟一块空间存放hello world!
         * 当赋值给str时，此时栈空间中的引用str不再指向hello，而去指向ello world!对应的内存空间
         **/
        String str = "hello";
        str = str+" world!";
        System.out.println(str);
        //下面是在内存堆空间中创建一个hello world! 并且str1指向它
        String str1 = new String("hello world!");
        System.out.println("获取子串："+str1.substring(0,5));
        System.out.println("str1="+str1);
    }
}