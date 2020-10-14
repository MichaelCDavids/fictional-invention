package net.inheritance;

import java.io.IOException;

public class Insta {
    public static void main(String[] args) {
        int i = 1234567890;
        float f = i;
        System.out.println(i - (int)f);
    }
}

//interface Automobiles { String describe(); }

class FourWheeler {
    //A method with no access modifier
    // defined in a class
    // can be overridden by a method marked protected (assuming that it is not final) in the sub class.
    String name;
    String describe() throws IOException { return " 4 Wheeler " + name; }
}

 class TwoWheeler extends FourWheeler {
    String name;
//    String describe() throws Exception{ return " 2 Wheeler " + name; }
}
