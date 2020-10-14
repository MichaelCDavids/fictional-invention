package net.exceptions;

public class WeirdStatement {
}

class SomeException extends Exception {
    public SomeException(String message) {
        super(message);
    }
}

class Basey {
    protected void m() throws SomeException {
    }
}

//in file B.java
class Subby extends Basey {
    public void m() {
    }
}

//in file TestClass.java
class TestClass {
    public static void main(String[] args) {
        //insert code here. //1
        Basey a = new Subby();
        ( ( Subby) a ).m();
    }
}
