package com.yonglong.thinking.control;

/**
 * @author MaYongLong
 * @date 2017/5/9.
 */
public class BreakAndContinue {
    public static void main(String[] args){
        for(int i = 0; i < 100; i++){
            if(i == 74){
                break;
            }
            if(i % 9 != 0){
                continue;
            }
            System.out.println(i);
        }
        int j = 0;
        while(true){
            j++;
            int k = j * 27;
            if(k == 1269){
                break;
            }
            if(j % 10 != 0){
                continue;
            }
            System.out.println(j);
        }
    }
}
