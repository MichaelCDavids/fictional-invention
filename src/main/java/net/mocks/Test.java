package net.mocks;

class Super {
    static String ID = "QBANK";
}

class Sub extends Super {
    static {
        System.out.print("In Sub");
    }
}

public class Test {
    public static void main(String[] args) {
//        String fullPhoneNumber = "+27731529691";
//        System.out.println(new StringBuilder("XXXX").insert(0, fullPhoneNumber, 0, 8).toString());

//        ifTest(true);

//        System.out.println(null + true); //1
//        System.out.println(true + null); //2
//        System.out.println(null + null); //3


        int k = 1;
        int[] a = { 1 };
        k += (k = 4) * (k + 2);
        a[0] += (a[0] = 4) * (a[0] + 2);
        System.out.println( k + " , " + a[0]);


    }


    public static void ifTest(boolean flag){
        if (flag)   //1
            if (flag)   //2
                System.out.println("True False");
            else        // 3
                System.out.println("True True");
        else        // 4
            System.out.println("False False");
    }

}