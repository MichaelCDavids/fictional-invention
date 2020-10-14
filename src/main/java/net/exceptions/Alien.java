package net.exceptions;

public class Alien {

    public static void main(String[] args) {
        A a = null;
        AA aa = null;

        a = (AA)aa;
        a = new AA();
//        aa = new A();
        aa = (AA) a;
//        aa = a;
        ((AA)a).doStuff();

    }
}

class A {
    public int getCode(){ return 2;}
}

class AA extends A {
    public void doStuff() {
    }
}


