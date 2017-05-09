package com.yonglong.thinking.control;

/**
 * @author MaYongLong
 * @date 2017/5/9.
 */
public class ListCharacters {
    public static void main(String[] args){
        for(char c = 0;c < 128; c++){
            if(c != 26){
                System.out.println("value: "+ (int)c +" character: "+ c);
            }
        }
    }
}
