package net.exceptions;

public class ExceptionTest {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        try {
            et.myMethod();
        } catch (MyException | MyException3 me) {
            System.out.println("MyException thrown");
        } finally {
            System.out.println(" Done");
        }
    }

    void myMethod() throws MyException, MyException3 {
        throw new MyException3();
    }
}

class MyExceptionOne extends Throwable {
}

class MyException1 extends MyExceptionOne {
}

class MyException2 extends MyExceptionOne {
}

class MyException3 extends MyException2 {
}

