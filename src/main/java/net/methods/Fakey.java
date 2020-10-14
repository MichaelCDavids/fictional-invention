package net.methods;

interface Pow {
    static void wow() {
        System.out.println("In Pow.wow");
    }
}

public class Fakey {
}

class Triangle {
    private final double ANGLE;
    public int base;
    public int height;

    {
        ANGLE = 123.12;
    }

//    public  void setAngle(double a){  ANGLE = a;  }

    public static void main(String[] args) {
        Triangle t = new Triangle();
//        t.setAngle(90);
    }
}

abstract class Wow {

    static void wow() {
        System.out.println("In Wow.wow");
    }
}

class Powwow extends Wow implements Pow {
    public static void main(String[] args) {
        Powwow f = new Powwow();
        (f).wow();
    }
}

class TriangleTwo {
    private static double ANGLE;
    public int base;
    public int height;

    public static double getAngle() {
        return 0;
    }

    public static void Main(String[] args) {
        System.out.println(getAngle());
    }
}


class Whazzup {
    long l1;

    public static void main(String args[]) {
        Whazzup a, b;
        a = new Whazzup();  //(2)
//        b = new Whazzup(5);  //(3)
    }

    public void Whazzup(long pLong) {
        l1 = pLong;
    }  //(1)
}

class Nope{
//    public static void main(String[] args){  sayHello(); }   //1
//    public static void sayHello(){ System.out.println("Static Hello World"); }  //2
//    public void sayHello() { System.out.println("Hello World "); }  //3
}
