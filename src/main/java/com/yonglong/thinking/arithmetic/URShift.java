package com.yonglong.thinking.arithmetic;

/**
 * @author MaYongLong
 * @date 2017/5/9.
 * 移位可与等号（<<=或>>=或>>>=)组合使用。
 * 此时运算符左边的值会移动由右边的值指定的位数，再将得到的结果附回左边的值
 */
public class URShift {
    public static void main(String[] args){
        int i = -1;
        i >>>= 10;
        System.out.println(i);
        long l = -1;
        l >>>= 10;
        System.out.println(l);
        short s = -1;
        s >>>= 10;
        System.out.println(s);
        byte b = -1;
        b >>>= 10;
        System.out.println(b);
    }
}
