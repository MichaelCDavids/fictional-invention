package net.datatypes;

public class Prims {
    public static void main(String args[]) {

        int x = 0;

        labelA:
        for (int i = 10; i < 0; i--) {
            int j = 0;
            labelB:
            while (j < 10) {
                if (j > i) break labelB;
                if (i == j) {
                    x++;
                    continue labelA;
                }
                j++;
            }
            x--;
        }

        System.out.println(x);
    }
}

class SomeOneClass {
    String local;
    String s1 = "green mile";   // 0

    public void generateReport(int n) {
        // 1
        if (n > 0) local = "good";   //2
        System.out.println(s1 + " = " + local);   //3
    }
}