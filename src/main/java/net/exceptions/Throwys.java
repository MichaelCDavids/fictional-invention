package net.exceptions;


class SomeThrowableOne extends Throwable { }
class MyThrowableOne extends SomeThrowableOne { }

public class Throwys{
    public static void main(String args[]) throws SomeThrowable{
        try{
            m1();
        }catch(SomeThrowable e){
            throw e;
        }finally{
            System.out.println("Done");
        }
    }
    public static void m1() throws MyThrowable{
        throw new MyThrowable();
    }
}
