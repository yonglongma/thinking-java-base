package com.yonglong.thinking.arithmetic;

/**
 * @author MaYongLong
 * @date 2017/5/9.
 * 方法调用中的别名处理
 */
public class PassObject {
    static void f(Letter y){
        y.c = 'z';
    }
    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1:x.c:"+x.c);//a
        f(x);
        System.out.println("1:x.c:"+x.c);//z
    }
}
class Letter{
    char c;
}
