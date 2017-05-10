package com.yonglong.thinking.initialization;

/**
 * @author MaYongLong
 * @date 2017/5/10.
 */
public class OrderOfInitialzation {
    public static void main(String[] args) {
        Card t = new Card();
        t.f();
    }
}
class Tag{
    Tag(int marker){
        System.out.println("Tag(" +marker + ")");
    }
}
class Card{
    Tag t1 = new Tag(1);
    Card(){
        System.out.println("Card()");
        t3 = new Tag(33);
    }
    Tag t2 = new Tag(2);
    void f(){
        System.out.println("f()");
    }
    Tag t3 = new Tag(3);
}
//    Tag(1)
//    Tag(2)
//    Tag(3)
//    Card()
//    Tag(33)
//    f()