package net.exceptions;

class MyException extends Exception {
}

public class Apples {
    public static void main(String args[ ] ){
        Object a, b, c ;
        a = new String("A");
        b = new String("B");
        c = a;
        a = b;
        System.out.println(""+c);
    }
}