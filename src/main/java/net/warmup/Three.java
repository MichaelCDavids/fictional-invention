package net.warmup;

interface InterfaceOne {
    void setValueOne(int one);

    void setValueTwo(int two);
}

interface InterfaceTwo {
    int calculate();
}

public class Three implements InterfaceOne, InterfaceTwo {
    int firstValue;
    int secondValue;

    public static void main(String[] args) {
        Three three = new Three();
        three.setValueOne(17);
        three.setValueTwo(3);
        System.out.println(three.calculate());
    }

    public void setValueOne(int a) {
        this.firstValue = a;
    }

    public void setValueTwo(int b) {
        this.secondValue = b;
    }

    public int calculate() {
        return (200 + firstValue) * (100 * secondValue);
    }
}
