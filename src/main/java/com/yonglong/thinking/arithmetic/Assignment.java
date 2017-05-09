package com.yonglong.thinking.arithmetic;

/**
 * @author MaYongLong
 * @date 2017/5/9.
 * 赋值
 * 主数据类型是直接赋值，对象“赋值”的时候，A=B，AB都指向最初只有B才指向的那个对象
 */
public class Assignment {
    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();
        n1.i = 9;
        n2.i = 47;
        System.out.println("1:n1.i"+n1.i + ",n2.i:"+n2.i);// 9,47
        n1 = n2;
        System.out.println("1:n1.i"+n1.i + ",n2.i:"+n2.i);// 47,47
        n1.i = 25;
        System.out.println("1:n1.i"+n1.i + ",n2.i:"+n2.i);// 25,25
    }
}
class Number {
    int i;
}
