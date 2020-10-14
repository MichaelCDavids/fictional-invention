package net.packages.b;

import net.packages.a.*;

public class B extends A {
    B(){
        super();
    }
    public void  print(){ System.out.println("B"); }
    public static void main(String[] args){
        new B();
    }
}
