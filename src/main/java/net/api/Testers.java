package net.api;

import java.util.ArrayList;

abstract class Vehicle{ }
interface Drivable{ }
class Car extends Vehicle implements Drivable{ }
class SUV extends Car { }

public class Testers {
    public void method(Object o){
        System.out.println("Object Version");
    }
    public void method(java.io.FileNotFoundException s){
        System.out.println("java.io.FileNotFoundException Version");
    }
    public void method(java.io.IOException s){
        System.out.println("IOException Version");
    }
    public static void main(String args[]){
        Testers tc = new Testers();
        tc.method(null);
    }
}
