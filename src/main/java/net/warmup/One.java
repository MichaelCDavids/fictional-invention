package net.warmup;

public class One {

    public static void main(String[] args) {
        One ocawu = new One();
        System.out.println(ocawu.m3(100,100));
    }

    public int m1(int paramOne) {
        return 200 + paramOne;
    }

    public int m2(int paramOne) {
        return paramOne * 100;
    }

    public int m3(int a, int b) {
        int result = m1(a) * m2(b);
        return result;
    }
}

