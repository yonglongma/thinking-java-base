package com.yonglong.thinking.arithmetic;

import java.util.Random;

/**
 * @author MaYongLong
 * @date 2017/5/9.
 * 逻辑运算符
 */
public class Bool {
    public static void main(String[] args){
        Random random = new Random();
         int i = random.nextInt() % 100;
         int j = random.nextInt() % 100;
         prt("i="+i);
         prt("j="+j);
         prt("i>j is "+(i>j));
         prt("i<j is "+(i<j));
    }
    static void prt(String s){
        System.out.println(s);
    }
}
