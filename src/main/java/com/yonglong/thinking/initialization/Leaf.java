package com.yonglong.thinking.initialization;

/**
 * @author MaYongLong
 * @date 2017/5/9.
 */
public class Leaf {
    private int i = 0;
    Leaf increment(){
        i++;
        return this;
    }
    void print(){
        System.out.println("i="+i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
}
