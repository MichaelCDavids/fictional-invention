package net.exceptions;

public class Outty {
}

class E1 extends Exception{ }
class E2 extends E1 { }
class OuttyTest{
    public static void main(String[] args){
        try{
            throw new E2();
        }
        catch(E1 e){
            System.out.println("E1");
        }
        catch(Exception e){
            System.out.println("E");
        }
        finally{
            System.out.println("Finally");
        }
    }
}
