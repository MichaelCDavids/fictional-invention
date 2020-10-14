package net.exceptions;


public class ArrayIndexOOB {
    public static void main(String[] args) {
        try{
            doTest();
        }
        catch(MyExceptionOneTwo me){
            System.out.println(me);
        }
    }

    static void doTest() throws MyExceptionOneTwo{
        int[] array = new int[10];
        array[10] = 1000;
        doAnotherTest();
    }

    static void doAnotherTest() throws MyExceptionOneTwo{
        throw new MyExceptionOneTwo("Exception from doAnotherTest");
    }
}
class MyExceptionOneTwo extends Exception {
    public MyExceptionOneTwo(String msg){
        super(msg);
    }
}
