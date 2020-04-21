package org.baha;

public class MyFirstProgramm {

    public static void main(String[] args) {

        Square s = new Square();
        s.l = 6;
        System.out.println(s.l + "=" + area(s));

        Rectangle r = new Rectangle();
        r.a = 12;
        r.b= 3;
        System.out.println( r.a + r.b + "=" + area(r));
    }



    public static double area(Square s) {
        return s.l * s.l;
    }
    public  static double  area(Rectangle r){
        return r.a * r.b;
    }














}