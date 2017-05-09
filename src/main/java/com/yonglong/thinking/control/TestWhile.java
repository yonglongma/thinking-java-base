package com.yonglong.thinking.control;

/**
 * @author MaYongLong
 * @date 2017/5/9.
 */
public class TestWhile {
    public static void main(String[] args){
        double r = 0;
        while(r < 0.99d){
            r = Math.random();//随机产生[0,1)之间的double值
            System.out.println(r);
        }
    }
}
