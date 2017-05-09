package com.yonglong.thinking.arithmetic;

/**
 * @author MaYongLong
 * @date 2017/5/9.
 * 自动递增和递减
 */
public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        prt("i:"+ i);//1
        prt("++i:"+ ++i);//2
        prt("i++:"+ i++);//2
        prt("i:"+ i);//3
        prt("--i:"+ --i);//2
        prt("i--:"+ i--);//2
        prt("i:"+ i);//1
    }
    static void prt(String s){
        System.out.println(s);
    }
}
