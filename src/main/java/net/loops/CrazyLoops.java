package net.loops;

public class CrazyLoops {

    static void crazyLoop(){
        int c = 0;
        JACK: while (c < 8){
            JILL: System.out.println(c);
            if (c > 3) break JACK; else c++;
        }
    }

    public static void main(String[] args) {
        crazyLoop();
    }
}

