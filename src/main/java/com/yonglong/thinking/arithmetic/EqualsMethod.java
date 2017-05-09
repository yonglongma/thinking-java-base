package com.yonglong.thinking.arithmetic;

/**
 * @author MaYongLong
 * @date 2017/5/9.
 */
public class EqualsMethod {
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1.equals(n2)); //true

        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2)); //false
    }

}
class Value{
    int i;
}
