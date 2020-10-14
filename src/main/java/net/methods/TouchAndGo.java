package net.methods;

public class TouchAndGo {
}

class ChangeTest {

    private int myValue = 0;

    public static void main(String[] args) {
        ChangeTest ct = new ChangeTest();
        ct.showTwo(200);
        System.out.println(ct.myValue);
        ct.showOne(100);
        System.out.println(ct.myValue);
    }

    public void showOne(int myValue) {
        myValue = myValue;
    }

    public void showTwo(int myValue) {
        this.myValue = myValue;
    }
}


class WhyRuntimeExceptionNotChecked {


    public static void main(String[] args) {
        try {
            int i = 1 / 0;
            System.out.println(i);
        } catch (Throwable e) {
           throw new NullPointerException();
        } finally {
           throw new RuntimeException();
        }

    }
}
