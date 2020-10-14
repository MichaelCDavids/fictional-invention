package net.inheritance;
//
//class A {
//    public void m1() {
//        System.out.println("A m1()");
//    }
//}
//
//class B extends A {
//    public void m1() {
//        System.out.println("B m1()");
//    }
//}
//
//class C extends B {
//    public void m1() {
//      /*  //1
//      ... lot of code.
//      */
//        System.out.println("C m1()");
//    }
//
//    public static void main(String[] args) {
//
//    }
//}


//class A{
//    public int i = 10;
//    private int j = 20;
//
//}
//
//class B extends A{
//    private int i = 30; //1
//    public int k = 40;
//
//}
//
//class C extends B{
//}
//
// class TestClassy{
//    public static void main(String args[]){
//        C c = new C();
////        System.out.println(c.i); //2
////        System.out.println(c.j); //3
//        System.out.println(c.k);
//    }
//}


class A {
    A() {
        print();
    }

    void print() {
        System.out.println("A");
    }
}

class B extends A {
    int i = 4;

    public static void main(String[] args) {
        A a = new B();
        a.print();
    }

    void print() {
        System.out.println(i);
    }
}
