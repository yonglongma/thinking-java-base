package com.yonglong.thinking.abstracts;

/**
 * @author MaYongLong
 * @date 2017/5/10.
 */
public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper sup = new StaticSub();
        System.out.println(sup.dynamicGet());
    }

}
class StaticSuper{
    public static String staticGet(){
        return "Base staticGet";
    }
    public String dynamicGet(){
        return "Base dynamicGet";
    }

}
class StaticSub extends StaticSuper{
    public static String staticGet(){
        return "Derived staticGet";
    }
    public String dynamicGet(){
        return "Derived dynamicGet";
    }
}
