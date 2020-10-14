package net.exceptions;

class Calculator {
    public void calculate(){

    }
}

abstract class Abstracto {
    public static void main(String[] args) {
        System.out.println("calculating");
        Calculator x = null;
        x.calculate();
    }

    abstract void calculate();
}
