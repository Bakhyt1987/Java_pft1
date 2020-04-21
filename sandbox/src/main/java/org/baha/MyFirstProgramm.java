package org.baha;

public class MyFirstProgramm {

    public static void main(String[] args) {
        hello("world");
        double g = 6;
        System.out.println(g + "=" + area(g));

        double a = 12;
        double b = 3;
        System.out.println( a + b + "=" + area(a,b));
    }

    public static void hello(String somebody) {
        System.out.println("hello world");
    }

    public static double area(double g) {
        return g * g;
    }
    public  static double  area(double a,double b){
        return a / b;
    }
}