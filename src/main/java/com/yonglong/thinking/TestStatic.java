package com.yonglong.thinking;

/**
 * @author MaYongLong
 * @date 2017/5/8.
 */
public class TestStatic {

    /**
     * static关键字修饰的成员变量及方法外部可以不创建对象也能调用
     * 修饰的静态代码块只在程序启动时初始化一次
     */
    static  int i = 57;

    public static void main(String[] args) {
        TestStatic testStatic = new TestStatic();
        TestStatic testStatic1 = new TestStatic();
        System.out.println(testStatic.i == testStatic1.i);
    }
}
