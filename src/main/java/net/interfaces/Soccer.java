package net.interfaces;


class Game{
    public void play() throws Exception{
        System.out.println("Playing...");
    }
}

public class Soccer extends Game{
    public void play(){
        System.out.println("Playing Soccer...");
    }
    public static void main(String[] args) throws Exception{
        Game g = new Soccer();
        g.play();
    }
}


