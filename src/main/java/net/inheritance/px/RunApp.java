package net.inheritance.px;

import net.inheritance.p1.Movable;
import net.inheritance.p2.Donkey;

public class RunApp {
    public static void main(String[] args) {
        Movable  m = new Donkey();
        m.move(10);
        m.moveBack(20);
        System.out.println(m.location);
    }
}
