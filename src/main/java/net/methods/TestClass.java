package net.methods;

public class TestClass{
    public void method(Object o){
        System.out.println("Object Version");
    }
//    public void method(java.io.FileNotFoundException s){
//        System.out.println("java.io.FileNotFoundException Version");
//    }
    public void method(java.io.IOException s){
        System.out.println("IOException Version");
    }
    public static void main(String args[]){
//        TestClass tc = new TestClass();
//        tc.method(null);
        int i1 = 1, i2 = 2, i3 = 3;
        int i4 = i1 + (i2=i3 );
        System.out.println(i4);
    }
}