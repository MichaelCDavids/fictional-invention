package net.inheritance;

class CorbaComponent {
    String ior;

    CorbaComponent() {
        startUp("IOR");
    }

    void startUp(String s) {
        ior = s;
    }

    void print() {
        System.out.println(ior);
    }
}

class OrderManager extends CorbaComponent {
    OrderManager() {
    }

    void startUp(String s) {
        ior = getIORFromURL(s);
    }

    String getIORFromURL(String s) {
        return "URL://" + s;
    }
}

public class Application {
    public static void main(String args[]) {
//        start(new OrderManager());
//        System.out.println(new Boolean("true"));
//        System.out.println(new Boolean("true"));
//        System.out.println(Boolean.parseBoolean("true"));
        System.out.println(hidePhone("123456789"));

    }

    static void start(CorbaComponent cc) {
        cc.print();
    }

    public static String hidePhone(String fullPhoneNumber){
//        return new StringBuilder(fullPhoneNumber).substring(0, 8)+"xxxx";
//        return new StringBuilder(fullPhoneNumber).replace(8, 12, "xxxx").toString();
//        return new StringBuilder(fullPhoneNumber).append("xxxx", 8, 12).toString();
//        return new StringBuilder("xxxx").append(fullPhoneNumber, 0, 8).toString();
        return new StringBuilder("xxxx").insert(0, fullPhoneNumber, 0, 8).toString();

    }
}


class Base {
    private float f = 1.0f;

    void setF(float f1) {
        this.f = f1;
    }
}

class Base2 extends Base {

    public static void main(String[] args) {

        int x = 1____3;   //1

        long y = 1_3;     //2

        float z = 3.234_567f; //3

        System.out.println(x + " " + y + " " + z);
    }

}