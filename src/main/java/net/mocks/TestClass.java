package net.mocks;
class X{
    int val = 10;
}

class Y extends X{
    Y val = null; //1
}

public class TestClass extends X{

    public static void main(String[] args){
        boolean b1 = false;
        boolean b2 = false;
        if (b2 != b1 == !b2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}