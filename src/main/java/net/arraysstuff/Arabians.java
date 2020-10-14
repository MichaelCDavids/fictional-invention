package net.arraysstuff;

import java.util.ArrayList;
import java.util.List;

public class Arabians {
    public static void main(String[] args) {
//        int size = 10;
//        int[] arr = new int[size];
//        for (int i = 0 ; i < size ; ++i) System.out.println(arr[i]);
        List list = new ArrayList();
        list.add("val1"); //1
        list.add(2, "val2"); //2
        list.add(1, "val3"); //3
        System.out.println(list);
    }
}
