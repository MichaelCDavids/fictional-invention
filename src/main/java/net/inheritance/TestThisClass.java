package net.inheritance;

import java.io.*;
class Great {
    public void doStuff() throws FileNotFoundException{
    }
}

class Amazing extends Great {
    public void doStuff() throws  IllegalArgumentException{
    }
}

public class TestThisClass {
    public static void main(String[] args) throws IOException{
//        Great g = new Amazing();
//        g.doStuff();
//        ((Amazing) g).doStuff();
        boolean b1 = false;
        boolean b2  = false;
        if (b2 = b1 == false){
            System.out.println("true");
        } else{
            System.out.println("false");
        }

        String s = "blooper";
        StringBuilder sb = new StringBuilder(s);
        sb.append(s.substring(4)).delete(3, 5);
        System.out.println(sb);
    }
}