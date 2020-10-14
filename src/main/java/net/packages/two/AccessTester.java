package net.packages.two;

import net.packages.one.AccessTest;

public class AccessTester extends AccessTest {
    static char ch;
    static float f;
    static boolean bool;

    public static void main(String[] args){
        System.out.print(f);
        System.out.print(" ");
        System.out.print(ch);
        System.out.print(" ");
        System.out.print(bool);
    }
}
