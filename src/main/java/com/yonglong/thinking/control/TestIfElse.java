package com.yonglong.thinking.control;

/**
 * @author MaYongLong
 * @date 2017/5/9.
 */
public class TestIfElse {
    static int test(int val){
        int result = 0;
        if(val >1){
            result = -1;
        }else if(val <1){
            result = +1;
        }else{
            result = 0;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(test(1));
    }
}
