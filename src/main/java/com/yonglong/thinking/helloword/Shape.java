package com.yonglong.thinking.helloword;

/**
 * @author MaYongLong
 * @date 2017/5/8.
 */
public class Shape {

    /**
     * 颜色
     */
    private String color;

    public void draw(){
        System.out.println("drawing>>>>");
    }
    public void erase(){
        System.out.println("eraseing........");
    }
    public void move(){
        System.out.println("moving.....");
    }


    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public static void doStuff(Shape s){
        s.erase();
        s.draw();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        Shape.doStuff(circle);
        Shape.doStuff(triangle);
        Shape.doStuff(square);
    }
}
