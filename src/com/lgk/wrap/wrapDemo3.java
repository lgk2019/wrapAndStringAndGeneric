package com.lgk.wrap;

/**
 * @author : lgk
 * @Description :值比较与对象比较
 * @ClassName : wrapDemo3
 * @date : 2020-8-6 0006
 **/
public class wrapDemo3 {
    public static void main(String[] args) {
        Integer one = new Integer(100);
        Integer two = new Integer(100);
        Integer abc = one;
        System.out.println(abc == one);
        //如果“==”两边放的是对象名，则比的是对象在内存之中的引用，而不仅仅是里面的值
        //new开辟出不同的内存空间
        System.out.println("one == two的结果："+(one == two));//false
        System.out.println("one.equals(two)的结果："+one.equals(two));//true

        Integer three = 100;//自动装箱//相当于Integer three = Integer.valueOf(100)
        //three拆箱之后进行的值比较
        System.out.println("three == 100的结果："+(three == 100));//true//自动拆箱
        System.out.println("three.equals(100)的结果："+three.equals(100));//true

        Integer four = 100;//相当于Integer four = Integer.valueOf(100)
        //在执行valueOf时，会在内存中创建一个缓存区(对象池)
        //当valueOf(参数)中参数在 -128 <= 参数 <= 127 这个范围内，
        // 会直接从缓存区查找是否存在four这个对象
        //如果有，则直接产生，如果没有，就会new Integer()实例化一个four对象
        //因为three已经在缓冲区创建100，所有four不再创建，直接指向同一个空间
        System.out.println("three == four的结果："+(three == four));//true
        System.out.println("three.equals(four)的结果："+three.equals(four));//true

        Integer five = 200;
        //单纯的值比较
        //因为200大于127，所以就会new Integer()实例化一个five对象
        System.out.println("five == 200的结果："+(five == 200));//true
        System.out.println("five.equals(200)的结果："+five.equals(200));//true

        Integer six = 200;
        //因为200大于127，所以就会new Integer()实例化一个six对象
        //指向内存空间不同，引用比较也就不同
        System.out.println("five == six的结果："+(five == six));//false
        System.out.println("five.equals(six)的结果："+five.equals(six));//true

        String str = "1";
        int a=1;
        System.out.println(str.equals(a));//false

    }
}