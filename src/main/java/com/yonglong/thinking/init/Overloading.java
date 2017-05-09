package com.yonglong.thinking.init;

/**
 * @author MaYongLong
 * @date 2017/5/9.
 * 方法过载
 */
public class Overloading {
    public static void main(String[] args) {
        for(int i =0; i < 5; i++){
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        new Tree();
    }
}

class Tree{
    int height;
    Tree(){
        prt("Planting a seedling");
        height = 0;
    }
    Tree(int i){
        prt("creating new Tree that is" + i + "feet tall");
    }
    void info(){
        prt("Tree is" + height + "feet tall");
    }
    void info(String s){
        prt(s + ": Tree is" + height + " feet tall");
    }
    static void prt(String s){
        System.out.println(s);
    }
}
