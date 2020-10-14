package net.api;

interface Flyer{ }
class Bird implements Flyer { }
class Eagle extends Bird { }
class Bat { }

public class TestClass {
//    public static void main(String args[ ] ){
//        StringBuilder sb = new StringBuilder("12345678");
//        sb.setLength(5);
//        sb.setLength(10);
//        System.out.println(sb.length());
//        TestClass tc = new TestClass();
//        byte a = 1;
//        tc.switchTest(a);

//    }

    public static void main(String[] args) {
        Flyer f = new Eagle();
        Eagle e = new Eagle();
        Bat b = new Bat();

        if(f instanceof Bird) System.out.println("f is a Bird");
        if(e instanceof Flyer) System.out.println("e is a Flyer");
        if(b instanceof Flyer) System.out.println("b is a Flyer");
    }

    public void switchTest(byte x){
        switch(x){
            case 'b':   // 1
            default :   // 2
            case -2:    // 3
            case 80:    // 4
        }
    }
}
