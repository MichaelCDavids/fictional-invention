package net.exceptions;

public class Nollie{
    int x = 5;
    int getX(){ return x; }

    public static void main(String args[]) throws Exception{
        Nollie tc = new Nollie();
        tc.looper();
        System.out.println(tc.x);
    }

    public void looper(){
        int x = 0;
        while( (x = getX()) != 0 ){
            for(int m = 10; m>=0; m--){
                x = m;
            }
        }

    }
}