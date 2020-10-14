package net.inheritance.p2;

import net.inheritance.p1.Movable;

public class Donkey implements Movable {

    int location =200;

    public void move(int by) {
        this.location = location+by;
    }

    public void moveBack(int by) {
        this.location = location-by;
    }
}
