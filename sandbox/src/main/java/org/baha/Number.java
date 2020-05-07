package org.baha;

public class Number {
    public static void main(String[] args) {

        System.out.println(helloWorld(15));
    }
    public static String helloWorld(int num) {
//        if (num % 15 == 0) {
//            return "hello world";
//        } else if (num % 5 == 0) {
//            return "World";
//        } else if  (num % 3 == 0) {
//            return "hello";
//        }
//        return null;
//    }
        return num % 3 == 0 && num % 5 == 0 ? "hello world"
                : num % 5 == 0 ? "world"
                : "hello";
    }
}
