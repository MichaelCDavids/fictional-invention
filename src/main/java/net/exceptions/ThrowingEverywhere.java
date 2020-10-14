package net.exceptions;


public class ThrowingEverywhere{
    public static void main(String[] args){
        ThrowingEverywhere tc = new ThrowingEverywhere();
        try{
            tc.m1();
        }
        catch (MyException e){
//            tc.m1();
        }
        finally{
            tc.m2();
        }
    }
    public void m1() throws MyException{
        throw new MyException();
    }
    public void m2() throws RuntimeException{
        throw new NullPointerException();
    }
}