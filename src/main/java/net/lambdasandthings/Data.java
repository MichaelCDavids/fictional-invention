package net.lambdasandthings;

import java.util.Arrays;
import java.util.List;

public class Data{
    int value;
    Data(int value){
        this.value = value;
    }
    public String toString(){ return ""+value; }

    public static void main(String[] args) {
//        Data[] dataArr = new Data[]{ new Data(1), new Data(2), new Data(3), new Data(4) };
//
//        List<Data> dataList = Arrays.asList(dataArr); //1
//
//        for(Data element :  dataList){
//
//            dataList.removeIf( (Data d) -> { return d.value%2 ==  0; } );  //2
//
//            System.out.println("Removed "+d+", "); //3
//        }

        String a = "java";
        char[] b = { 'j', 'a', 'v', 'a' };
        String c = new String(b);
        String d = a;
        System.out.println((a == d));
//        System.out.println((b == d));
        System.out.println((a == "java"));
        System.out.println(a.equals(c));


    }
}

class Apples{
    public int i = 10;
    private int j = 20;

}

class B extends Apples{
    private int i = 30; //1
    public int k = 40;

}

class C extends B{
}

 class TestClass{
    public static void main(String args[]){
        Integer i1 = 1;
        Integer i2 = new Integer(1);
        int i3 = 1;
        Byte b1 = 1;
        Long g1 = 1L;


        System.out.println(i1 == i2);
        System.out.println(i1 == i3);
        System.out.println(i1.equals(i2));
        System.out.println(i1.equals(g1));
        System.out.println(i1.equals(b1));

    }
}