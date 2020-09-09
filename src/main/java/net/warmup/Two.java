package net.warmup;

public class Two {

    int paramOne;
    int paramTwo;

    public Two(int paramOne, int paramTwo) {
        this.paramOne =paramOne;
        this.paramTwo = paramTwo;
    }

    public static void main(String[] args) {
//        new Two(17, 3);
    }

    public int methodForTwo() {
        return (200 + paramOne) * (paramTwo * 100);
    }
}
