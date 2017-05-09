package com.yonglong.thinking.control;

/**
 * @author MaYongLong
 * @date 2017/5/9.
 * 逗号运算符
 */
public class CommaOperator {
    public static void main(String[] args){
        for(int i = 1,j = i + 10; i < 5; i++, j = i*2){
            System.out.println("i=" +i +"   j="+j);
        }
    }
}
