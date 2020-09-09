package net.warmup;

public class Reflection{
    public static void main(String[] args) {
        Three instanceOfThree = new Three();

        InterfaceOne castedInstanceOfThree = (InterfaceOne) instanceOfThree;

        castedInstanceOfThree.setValueOne(17);
        castedInstanceOfThree.setValueTwo(3);

        InterfaceTwo interfaceTwoInstanceOfThree = (InterfaceTwo) castedInstanceOfThree;

        System.out.println(instanceOfThree.calculate());

    }
}