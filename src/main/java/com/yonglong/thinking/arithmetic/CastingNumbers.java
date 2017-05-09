package com.yonglong.thinking.arithmetic;

/**
 * @author MaYongLong
 * @date 2017/5/9.
 */
public class CastingNumbers {
    public static void main(String[] args) {
        double above = 0.7,below = 0.4;
        System.out.println("above: " + above);
        System.out.println("below: " + below);
        System.out.println("(int)above: " + (int)above);//0
        System.out.println("(int)below: " + (int)below);//0
        System.out.println("(char)('a'+above)" + (char)('a'+above));//a
        System.out.println("(char)('a'+below)" + (char)('a'+below));//a
    }
}
