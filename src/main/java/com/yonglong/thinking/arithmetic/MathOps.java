package com.yonglong.thinking.arithmetic;

import java.util.Random;

/**
 * @author MaYongLong
 * @date 2017/5/9.
 * 基本算术运算符
 */
public class MathOps {
    static void prt(String s){
        System.out.println(s);
    }
    static  void pInt(String s,int i){
        prt(s +"="+i);
    }
    static  void pFlt(String s,float f){
        prt(s + "="+f);
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int i,j,k;
        j = rand.nextInt() % 100;
        k = rand.nextInt() % 100;
        pInt("j",j);pInt("k",k);
        i = j + k;pInt("j+k",i);
        i = k / j;pInt("j/k",i);
        float u,v,w;
        v = rand.nextFloat();
        w = rand.nextFloat();
        pFlt("v",v);pFlt("w",w);
        u = v - w;pFlt("v-w",u);
        u = v * w;pFlt("v*w",u);
    }
}
