package com.yonglong.thinking.initialization;

/**
 * @author MaYongLong
 * @date 2017/5/9.
 */
public class SimpleConstructor {
    public static void main(String[] args) {
        for(int i= 0;i<10;i++){
            new Rock(i);
        }
    }
}
class Rock{
//    Rock(){
//        System.out.println("creating Rock");
//    }
    Rock(int i){
        System.out.println("creating Rock number" + i);
    }
}
