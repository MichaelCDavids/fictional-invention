package net.arraysstuff;

public class FunWithArgs {
    public static void main(String[][] args) {
        System.out.println(args[0][1]);
    }
    public static void main(String args[]){
        String str = "111";
        boolean[] bA = new boolean[1];
        if( bA[0] ) str = "222";
        System.out.println(str);
    }
}