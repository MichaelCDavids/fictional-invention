package net.inheritance;



interface Bar{
    default void bar(){

    }
}

abstract class FooBase{

//    public static void bar(){
//        System.out.println("In static bar");
//    }
    //Error
    //java: bar() in net.inheritance.FooBase cannot implement bar() in net.inheritance.Bar
    //  overriding method is static
}

class Foo extends FooBase implements Bar {

    public static void main(String[] args) {

    }

}