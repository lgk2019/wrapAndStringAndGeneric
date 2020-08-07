1、Java数据类型
    * 基本数据类
        * 数值型(Number是数值型的父类)
            * 整数类型(byte、short、int、long)
            * 浮点类型(float、double)
        * 字符型(char)
        * 布尔型(boolean)
        * 基本数据类型与其包装类(包装类都被final修饰)
            * byte -- Byte
            * short -- Short
            * int -- Integer
            * long -- Long
            * float -- Float
            * double -- Double
            * char -- Character
            * boolean -- Boolean
        * 基本数据类型初始值(包装类的默认值为:null)
            * byte -- 0
            * short -- 0
            * int -- 0
            * long -- 0
            * float -- 0.0f
            * double -- 0.0d
            * char -- `\u0000`
            * boolean -- false            
    * 引用数据类型
        * 类(class)
        * 接口(interface)
        * 数组
    * 基本数据类型与其包装类(包装类都被final修饰)
        * byte -- Byte
        * short -- Short
        * int -- Integer
        * long -- Long
        * float -- Float
        * double -- Double
        * char -- Character
        * boolean -- Boolean
        
2、Java包装类常用的方法
    * 装箱与拆箱(自动和手动)
        * 装箱：基本数据类型 -> 包装类
        * 拆箱：包装类 -> 基本数据类型
    * 常用方法
        * 包装类(或包装类对象).基本类型Value() -- 将‘包装类(或包装类对象)’所属类型 转换为‘基本类型Value’所属的基本类型
        * 包装类(或包装类对象).toString() -- 将‘包装类’所属类型 转换为字符串类型
        * 包装类(或包装类对象).parse基本类型() -- 将字符串类型转换为‘包装类’所属基本类型
        * 包装类.valueOf() -- 将包装类型转换为‘包装类’所属基本类型

3、String的常用方法(index值从0开始)
    * int length() -- 返回当前字符串的长度
    * int indexOf(int ch) -- 查找ch子字符在该字符串中第一次出现的位置
    * int indexOf(String str) -- 查找str子字符串在该字符串中第一次出现的位置
    * int lastIndexOf(int ch) -- 查找ch子字符在该字符串中最后一次出现的位置
    * int lastIndexOf(String str) -- 查找str子字符串在该字符串中最后一此出现的位置
    * String subString(int beginIndex) -- 获取从beginIndex位置开始到结束的子字符串
    * String subString(int beginIndex, int endIndex) -- 获取从beginIndex位置开始到endIndex位置的子字符串
    * String trim() -- 返回去除前后空格的字符串
    * boolean equals(Object obj) -- 将该字符串与指定对象比较，返回false或true
    * String toLowerCase() -- 将字符串转换为小写
    * String toUpperCase() -- 将字符串转换为大写
    * char charAt(int index) -- 获取字符串中指定位置的字符
    * String[] split(String regex, int limit) -- 将字符串分割为子字符串，返回字符串数组。
        * regex：参数为分割的字符串或者正则表达式
        * limit：控制这种分割模式应用的次数
            * 非正整数表示模式被应用尽可能多的次数
            * 0：表示这种分割模式应用多次，数组可以是任意长度，若是结尾为空字符串将会被丢弃
            * 大于0：那么这种分割模式将会应用limit-1次 数组长度不会超过limit
    * String[] split(String regex) -- 将字符串分割为子字符串，返回字符串数组，limit默认为0
    * byte[] getBytes() -- 将该字符串转换为byte数组


4、值比较与引用比较
    * 基本数据类型的值比较与对象引用比较
        * 在 8 种基本数据类型对应的包装类里面，除了float和double，其他都可以应用对象常量池概念。
        * 值比较：使用equals()方法进行比较，只要数值相等则返回true
        * 引用比较：== 
            * 若引用指向同一个内存空间，则返回true
            * 对于范围在 -128到127 的数值，数值相等则返回true
            * 对于不在以上范围内的数值，则返回false
    * String类型的值比较与引用比较
        * 值比较：equals
            * 只要数值相等就会返回true，否则false
        * 引用比较：==
            * 若引用指向同一个内存空间，则返回true
        
5、字符串StringBuilder
    * String、StringBuffer和StringBuilder的区别：
        * String被final修饰，具有不可变性，而StringBuffer和StringBuilder具有可变性
        * StringBuffer被synchronized修饰，是线程安全的，而StringBuilder线程不够安全
        * 执行效率上：StringBuilder > StringBuffer > String
        * 当频繁操作字符串或者在单线程环境下，建议使用StringBuilder
    * StringBuilder的容量
        * 无容量参数构造：在创建StringBuilder对象时，默认在内存空间中开辟能容纳16个字符大小的空间
        * 有容量参数构造：在创建StringBuilder对象时，在内存空间中手动开辟指定容量大小的空间
    * StringBuilder的方法
        * StringBuilder append() -- 在字符串的末尾增加新的内容
        * StringBuilder delete(int start, int end) -- 删除从start到end之间的字符串
        * int indexOf(String str) -- 查看子字符串在主字符串的位置
        * int indexOf(String str,int fromIndex) -- 从某一位置开始查看字符串在主字符串的位置
        * StringBuilder insert(int offset,String str) -- 在指定位置处插入内容
        * int length() -- 返回字符串的长度
        * StringBuilder replace(int start, int end, String str) -- 把字符串中某个部分的字符串替换
        * StringBuilder reverse() -- 将字符串反转
        * String subString(int start，int end) -- 获得从start位置开始到end位置的字符串
        * String toString() -- 将StringBuilder的对象转换为String的对象
        
6、泛型
    * 为什么使用泛型
        * 在有泛型之前，泛型程序设计使用继承来实现。
            * 缺点：需要强制转换；可以向集合中添加任意类型的对象，存在风险
    * 泛型的使用
        * Java SE7及之后的版本中，构造方法中可以省略泛型类型
    * 自定义泛型
        * 自定义泛型类
            * 泛型类只有一个参数 T -- 类名<T>
            * 泛型类有两个参数 T，E -- 类名<T,E>
        * 自定义泛型方法
            * 泛型方法不一定写在泛型类里面
            * 修饰符 <T> 返回值类型 方法名(参数) -- 示例：public <T> void demo(){}
    * 泛型的上界与下界
        * 上界：<? extend “界限”> -- 限制 ？ 的类型只能是“界限”的子类
        * 下界：<? super “界限”> -- 限制 ？的类不能是“界限”的子类，但可以是“界限”的所有父类
        