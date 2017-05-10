package com.yonglong.thinking.abstracts;

/**
 * @author MaYongLong
 * @date 2017/5/10.
 */
public class Parcell {
    class Contents{
        private int i= 11;
        public int value(){
            return i;
        }
    }
    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel(){
            return label;
        }
    }
    public void ship(String dest){
        Contents c =new Contents();
        Destination d = new Destination(dest);
    }

    public static void main(String[] args) {
        Parcell p = new Parcell();
        p.ship("Tanzania");
    }
}
